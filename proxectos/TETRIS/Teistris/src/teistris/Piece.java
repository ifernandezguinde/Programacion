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
     * Construtor da clase, que crea os catro cadrados que forman a peza
     */
    private int [] squares = new int [4];

    //añadir o array no método right, left, down
    /**
     * Construtor da clase, que crea os catro cadrados que forman a peza
     * @param game 
     */
    public Piece(Game game) {
        this.game = game;
        //a = new Square(Game.MAX_X / 2 - Game.SQUARE_SIDE, 0, Color.BLUE, game);
        //b = new Square(Game.MAX_X / 2, 0, Color.BLUE, game);
        //c = new Square(Game.MAX_X / 2 - Game.SQUARE_SIDE, Game.SQUARE_SIDE,
          //  Color.BLUE, game);
        //d = new Square(Game.MAX_X / 2, Game.SQUARE_SIDE, Color.BLUE, game);
    }

    public int[] getSquares() {
        return squares;
    }
 

    /**
     * Move a ficha a dereita se é posible
     *
     * @return true se o movemento da ficha é posible, se non false
     */
    public boolean moveRight() {
        
        // condicións para que a peza se poida mover a dereita
        if ( game.isValidPosition(squares[2].getX() + Game.SQUARE_SIDE, squares[2].getY())) {
            
            if ( game.isValidPosition(squares[3].getX() + Game.SQUARE_SIDE, squares[3].getY())) {
            
                a.setX(a.getX() + Game.SQUARE_SIDE);
                b.setX(b.getX() + Game.SQUARE_SIDE);
                c.setX(c.getX() + Game.SQUARE_SIDE);
                d.setX(d.getX() + Game.SQUARE_SIDE);
                
                return true;
            }
        }
       return false;
    }

    /**
     * Move a ficha a esquerda se é posible
     *
     * @return true se o movemento da ficha é posible, se non false
     */
    public boolean moveLeft() {
        
        // condicións para que a peza se poida mover a esquerda
        if ( game.isValidPosition(c.getX() - Game.SQUARE_SIDE, c.getY())) {
            
            if ( game.isValidPosition(d.getX() - Game.SQUARE_SIDE, d.getY())) {
            
                // facemos que a peza se mova toda a esquerda
                a.setX(a.getX() - Game.SQUARE_SIDE);
                b.setX(b.getX() - Game.SQUARE_SIDE);
                c.setX(c.getX() - Game.SQUARE_SIDE);
                d.setX(d.getX() - Game.SQUARE_SIDE);
                
                return true;
            }
        }
       return false;
    }

    /**
     * Move a ficha a abaixo se é posible
     *
     * @return true se o movemento da ficha é posible, se non false
     */
    public boolean moveDown() {
        
        // condicións para que a peza se poida mover para abaixo
        if ( game.isValidPosition(c.getX(), c.getY() + Game.SQUARE_SIDE)) {
            
            if ( game.isValidPosition(d.getX(), d.getY() + Game.SQUARE_SIDE)) {
            
                a.setY(a.getY() + Game.SQUARE_SIDE);
                b.setY(b.getY() + Game.SQUARE_SIDE);
                c.setY(c.getY() + Game.SQUARE_SIDE);
                d.setY(d.getY() + Game.SQUARE_SIDE);
                
                return true;
            }
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