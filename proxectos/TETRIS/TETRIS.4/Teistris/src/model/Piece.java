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



/**
 * Clase contén os movementos que pode facer
 *
 * @author Profe de Programación
 */
public abstract class Piece {

    /**
     * Referenza ao obxecto xogo
     */
    protected Game game;

    /**
     * Referenzas aos catro cadrados que forman a peza
     */
    protected Square a, b, c, d;

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

    protected Square[] squares = new Square[4];

    

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
    public abstract boolean rotate();

}
