/*
 * Copyright (C) 2019 Antonio de Andrés Lema
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package model;

import view.MainWindow;
import java.util.HashMap;

/**
 * Clase que implementa o comportamento do xogo do Tetris
 *
 * @author Profe de Programación
 */
public class Game {

    /**
     * Constante que define o tamaño en pixels do lado dun cadrado
     */
    public final static int SQUARE_SIDE = 20;
    
    
    /**
     * Constante que define o valor máximo da coordenada x no panel de cadrados
     */
    public final static int MAX_X = 200;
    // original 160 // modificado 200
    
    
    /**
     * Constante que define o valor máximo da coordenada y no panel de cadrados
     */
    public final static int MAX_Y = 240;
    // original 200 // modificado 240

    
    /**
     * Referenza á peza actual do xogo, que é a única que se pode mover
     */
    private Piece currentPiece;

    /**
     * Referenza á ventá principal do xogo
     */
    private MainWindow mainWindow;

    /**
     * Flag que indica se o xogo está en pausa ou non
     */
    private boolean paused = false;

    /**
     * Número de liñas feitas no xogo
     */
    private int numberOfLines = 0;

    /**
     * Hash map para as pezas que están no chan
     */
    private HashMap<String, Square> groundSquares;

    /**
     * @return Referenza á ventá principal do xogo
     */
    public MainWindow getMainWindow() {
        return mainWindow;
    }

    /**
     * @param mainWindow Ventá principal do xogo a establecer
     */
    public void setMainWindow(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    /**
     * @return O estado de pausa do xogo
     */
    public boolean isPaused() {
        return paused;
    }

    /**
     * @param paused O estado de pausa a establecer
     */
    public void setPaused(boolean paused) {
        this.paused = paused;
    }

    /**
     * @return Número de liñas feitas no xogo
     */
    public int getNumberOfLines() {
        return numberOfLines;
    }

    /**
     * @param numberOfLines O número de liñas feitas no xogo
     */
    public void setNumberOfLines(int numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    /**
     * Construtor da clase, que crea unha primeira peza
     *
     * @param mainWindow Referenza á ventá principal do xogo
     */
    public Game(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        this.createNewPiece();
        this.groundSquares = new HashMap<>();

    }

    /**
     * Move a ficha actual á dereita, se o xogo non está pausado
     */
    public void movePieceRight() {
        if (!paused) {
            currentPiece.moveRight();
        }
    }

    /**
     * Move a ficha actual á esquerda, se o xogo non está pausado
     */
    public void movePieceLeft() {
        if (!paused) {
            currentPiece.moveLeft();
        }
    }

    /**
     * Rota a ficha actual, se o xogo non está pausado
     */
    public void rotatePiece() {
        if (!paused) {
            currentPiece.rotate();
        }
    }

    /**
     * Move a peza actual abaixo, se o xogo non está pausado Se a peza choca con
     * algo e xa non pode baixar, pasa a formar parte do chan e créase unha nova
     * peza
     */
    public void movePieceDown() {
        if ((!paused) && (!currentPiece.moveDown())) {
            this.addPieceToGround();
            this.createNewPiece();
            if (this.hitPieceTheGround()) {
                this.mainWindow.showGameOver();
            }
        }
    }

    /**
     * Método que permite saber se unha posición x,y é válida para un cadrado
     *
     * @param x Coordenada x
     * @param y Coordenada y
     * @return true se esa posición é válida, se non false
     */
    public boolean isValidPosition(int x, int y) {
        String position = x + "," + y;
        if ((x == MAX_X) || (x < 0) || (y == MAX_Y) || (y < 0)) {
            return false;
        } else if (groundSquares.containsKey(position)) {
            return false;
        }
        return true;
    }

    /**
     * Crea unha nova peza e a establece como peza actual do xogo
     */
    private void createNewPiece() {
        
        // creamos un número aleatorio segundo as pezas que temos, neste caso dúas
        int pieceType = new java.util.Random().nextInt(2); 
        
        switch (pieceType) {
        case 0:
            currentPiece = new SquarePiece(this); // crea unha peza cadrada se o 
                                              // número aleatorio é o 0
            break;
        case 1:
            currentPiece = new BarPiece(this); // crea unha peza tipo barra se o 
                                         // número aleatorio é o 1
            break;
        }

    }

    /**
     * Engade unha peza ao chan
     */
    private void addPieceToGround() {
        // Engadimos os cadrados da peza ao chan
        for (Square sq : currentPiece.getSquares()) {
            // garda as coordenadas do cadrado
            String positionkey = sq.getCoordinates();
            //añade o cadrado ao hashmap
            groundSquares.put(positionkey, sq);
        }

        // Chamamos ao método que borra as liñas do chan que estean completas
        this.deleteCompletedLines();
    }

    /**
     * comproba se unha liña está chea de cadrados
     *
     * @param y
     * @return
     */
    private boolean isLineComplete(int y) {
        // Recorremos todas as posicions x na altura y
        for (int x = 0; x < MAX_X; x += SQUARE_SIDE) {
            // Se non existe un cuadrado nesta posición, a liña non está completa
            if (!groundSquares.containsKey(x + "," + y)) {
                return false;
            }
        }
        return true;
    }

    /**
     * este método move as liñas cara abaixo cando eliminamos unha
     *
     * @param y
     */
    private void moveLinesDown(int y) {
        // Recorremos todas las filas por encima de la línea eliminada
        for (int currentY = y - SQUARE_SIDE; currentY >= 0; currentY -= SQUARE_SIDE) {
            for (int x = 0; x < MAX_X; x += SQUARE_SIDE) {
                String currentPosition = x + "," + currentY;
                String newPosition = x + "," + (currentY + SQUARE_SIDE);

                // Si hay un cuadrado en la posición actual, lo movemos hacia abajo
                if (groundSquares.containsKey(currentPosition)) {
                    Square sq = groundSquares.get(currentPosition);

                    // Actualizamos la posición en el objeto Square
                    sq.setY(currentY + SQUARE_SIDE);

                    // Actualizamos la posición en el HashMap
                    groundSquares.remove(currentPosition);
                    groundSquares.put(newPosition, sq);
                }
            }
        }
    }

    /**
     * Se os cadrados que están forman unha liña completa, bórranse eses
     * cadrados do chan e súmase unha nova liña no número de liñas realizadas
     */
    private void deleteCompletedLines() {
        // Recorremos todas as liñas do tableiro de abaixo para arriba
        for (int y = 0; y < MAX_Y; y += SQUARE_SIDE) {
            // Verificamos si a liña está completa e eliminámola
            if (isLineComplete(y)) {
                this.deleteLine(y);
            }
        }
    }

    /**
     * Borra todos os cadrados que se atopan na liña indicada pola coordenada y,
     * e baixa todos os cadrados que estean situados por enriba unha posición
     * cara abaixo
     *
     * @param y Coordenada y da liña a borrar
     */
    private void deleteLine(int y) {
        //recorremos o hashmap na posicion y que está completa
        for (int x = 0; x < MAX_X; x += SQUARE_SIDE) {

            // obtenemos o cadrado
            String position = x + "," + y;
            // recuperamos o cadrado de hashmap e chamamos a venta principal
            // para que borre ese cadrado
            Square sq = groundSquares.get(position);
            mainWindow.deleteSquare(sq.getLblSquare());
            // eliminamos ese cadrado do hashmap
            groundSquares.remove(position);
        }
        this.moveLinesDown(y);
        
        // Incrementamos o número de liñas eliminadas
        numberOfLines++;
        // Mostrar o número de liñaas na interfaz gráfica
        mainWindow.showNumberOfLines(numberOfLines);
    }

    /**
     * Comproba se a peza actual choca cos cadrados do chan
     *
     * @return true se a peza actual choca cos cadrados do chan; se non false
     */
    private boolean hitPieceTheGround() {
        // Recorremos os cadrados da peza actual
        for (Square sq : currentPiece.getSquares()) {
            int x = sq.getX();
            int y = sq.getY();

            // Comprobamos se choca co chan
            if (y >= MAX_Y - SQUARE_SIDE) {
                return true;
            }
        }
        return false;
    }
    
    
}
