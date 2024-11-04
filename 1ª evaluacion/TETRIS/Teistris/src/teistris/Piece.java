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
     * devolve o valor de game
     * @return 
     */
    public Game getGame() {
        return game;
    }

    /**
     * modifica o valor de game
     * @param game 
     */
    public void setGame(Game game) {
        this.game = game;
    }
    
    

    /**
     * Referenzas aos catro cadrados que forman a peza
     */
    private Square a, b, c, d;

    /**
     * devolve o valor de a
     * @return 
     */
    public Square getA() {
        return a;
    }

    /**
     * modifica o valor de a
     * @param a 
     */
    public void setA(Square a) {
        this.a = a;
    }

    /**
     * devolve o valor de b
     * @return 
     */
    public Square getB() {
        return b;
    }

    /**
     * modifica o valor de b
     * @param b 
     */
    public void setB(Square b) {
        this.b = b;
    }

    /**
     * devolve o valor de c
     * @return 
     */
    public Square getC() {
        return c;
    }

    /**
     * modifica o valor de c
     * @param c 
     */
    public void setC(Square c) {
        this.c = c;
    }

    /**
     * devolve o valor de d
     * @return 
     */
    public Square getD() {
        return d;
    }

    /**
     * modifica o valor de d
     * @param d 
     */
    public void setD(Square d) {
        this.d = d;
    }

    /**
     * Construtor da clase, que crea os catro cadrados que forman a peza
     */
    public Piece(Game game) {
        this.game = game;

        a = new Square(Game.MAX_X / 2 - Game.SQUARE_SIDE, 0, Color.BLUE, game);
        b = new Square(Game.MAX_X / 2, 0, Color.BLUE, game);
        c = new Square(Game.MAX_X / 2 - Game.SQUARE_SIDE, Game.SQUARE_SIDE, 
                Color.BLUE, game);
        d = new Square(Game.MAX_X / 2, Game.SQUARE_SIDE, Color.BLUE, game);
    }

    /**
     * Move a ficha á dereita se é posible
     *
     * @return true se o movemento da ficha é posible, se non false
     */
    public boolean moveRight() {

        return true;
    }

    /**
     * Move a ficha á esquerda se é posible
     *
     * @return true se o movemento da ficha é posible, se non false
     */
    public boolean moveLeft() {

        return true;
    }

    /**
     * Move a ficha a abaixo se é posible
     *
     * @return true se o movemento da ficha é posible, se non false
     */
    public boolean moveDown() { //to do
        if (game.isValidPosition(0, 0)) {
        return true;
        }
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
