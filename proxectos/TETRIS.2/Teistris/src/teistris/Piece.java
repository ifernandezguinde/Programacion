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
package teistris;

import java.awt.Color;

/**
 * Clase que implementa a peza cadrada do xogo do Tetris
 *
 * @author Profe de Programación
 */
public class Piece {

    /**
     * Referenza ao obxecto xogo
     */
    private Game game;

    /**
     * Referenzas aos catro cadrados que forman a peza
     */
    private Square a, b, c, d;

    /**
     * devolve o valor de game
     *
     * @return
     */
    public Game getGame() {
        return game;
    }

    /**
     * modifica o valor de game
     *
     * @param game
     */
    public void setGame(Game game) {
        this.game = game;
    }

    private Square[] squares = new Square[4];

    /**
     * Construtor da clase, que crea os catro cadrados que forman a peza
     *
     * @param game
     */
    public Piece(Game game) {
        this.game = game;
        squares[0] = new Square(Game.MAX_X / 2 - Game.SQUARE_SIDE, 0, Color.BLUE, game);
        squares[1] = new Square(Game.MAX_X / 2, 0, Color.BLUE, game);
        squares[2] = new Square(Game.MAX_X / 2 - Game.SQUARE_SIDE, Game.SQUARE_SIDE,
                Color.BLUE, game);
        squares[3] = new Square(Game.MAX_X / 2, Game.SQUARE_SIDE, Color.BLUE, game);
    }

    /**
     * devolve o valor do Array
     *
     * @return
     */
    public Square[] getSquares() {
        return squares;
    }

    /**
     * Move a ficha a dereita se é posible
     *
     * @return true se o movemento da ficha é posible, se non false
     */
    public boolean moveRight() {
        boolean isValidMovement = true;

        // condicións para que a peza se poida mover a dereita
        for (Square sq : squares) {
            if (!game.isValidPosition(sq.getX() + Game.SQUARE_SIDE, sq.getY())) {
                isValidMovement = false;
            }
        }

        // movemos a peza cara a dereita se é posible
        if (isValidMovement) {
            for (int i = 0; i < 4; i++) {
                squares[i].setX(squares[i].getX() + Game.SQUARE_SIDE);
            }
            return true;
        }
        return false;

    }

    /**
     * Move a ficha a esquerda se é posible
     *
     * @return true se o movemento da ficha é posible, se non false
     */
    public boolean moveLeft() {
        boolean isValidMovement = true;

        // condicións para que a peza se poida mover a dereita
        for (Square sq : squares) {
            if (!game.isValidPosition(sq.getX() - Game.SQUARE_SIDE, sq.getY())) {
                isValidMovement = false;
            }
        }

        // movemos a peza cara a dereita se é posible
        if (isValidMovement) {
            for (int i = 0; i < 4; i++) {
                squares[i].setX(squares[i].getX() - Game.SQUARE_SIDE);
            }
            return true;
        }
        return false;
    }

    /**
     * Move a ficha a abaixo se é posible
     *
     * @return true se o movemento da ficha é posible, se non false
     */
    public boolean moveDown() {
        boolean isValidMovement = true;
        
        // condicións para que a peza se poida mover a dereita
        for (Square sq : squares) {
            if (!game.isValidPosition(sq.getX(), sq.getY() + Game.SQUARE_SIDE)) {
                isValidMovement = false;
            }
        }

        // movemos a peza cara a dereita se é posible
        if (isValidMovement) {
            for (int i = 0; i < 4; i++) {
                squares[i].setY(squares[i].getY() + Game.SQUARE_SIDE);
            }
            return true;
        }
        return false;
    }

    /**
     * Rota a ficha se é posible
     *
     * @return true se o movemento da ficha é posible, se non false
     */
    public boolean rotate() {
        // A rotación da ficha cadrada non supón ningunha variación na ficha,
        // por iso simplemente devolvemos true
        return true;
    }

}
