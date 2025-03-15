/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.awt.Color;

/**
 * peza barra
 * @author ivan.fernandezguinde
 */
public class BarPiece extends Piece {

    /**
     * constructor da clase que crea unha peza de tipo barra
     * @param game 
     */
    public BarPiece(Game game) {
        this.game = game;
        
        squares[0] = new Square(Game.MAX_X / 2, 0, Color.YELLOW, game);
        squares[1] = new Square(Game.MAX_X / 2, Game.SQUARE_SIDE, Color.YELLOW, game);
        squares[2] = new Square(Game.MAX_X / 2, 2*Game.SQUARE_SIDE,
                Color.YELLOW, game);
        squares[3] = new Square(Game.MAX_X / 2, 3*Game.SQUARE_SIDE, Color.YELLOW, game);
    }

    
    
    @Override
    /**
     * Rota a ficha se é posible
     */
    public boolean rotate() {
        // Usamos el segundo cuadrado como pivote
        Square centerPiece = squares[1]; 
        int pivotX = centerPiece.getX();
        int pivotY = centerPiece.getY();

        // Comprobamos si está en posición vertical       
        if (squares[0].getX() == squares[1].getX()) { 
            // se sae dos límites devolveos false
            if (pivotX - Game.SQUARE_SIDE < 0 || pivotX + 2 * Game.SQUARE_SIDE 
                    >= Game.MAX_X) {
                return false; 
            }
            
            //rotamos a peza a posición horizontal
            squares[0].setX(pivotX - Game.SQUARE_SIDE);
            squares[0].setY(pivotY);
            squares[2].setX(pivotX + Game.SQUARE_SIDE);
            squares[2].setY(pivotY);
            squares[3].setX(pivotX + 2 * Game.SQUARE_SIDE);
            squares[3].setY(pivotY);
        } 
        // Se está en posición horizontal, pasamos a vertical
        else { 
            // se sae dos límites devolveos false
            if (pivotY - Game.SQUARE_SIDE < 0 || pivotY + 2 * Game.SQUARE_SIDE 
                    >= Game.MAX_Y) {
                return false; 
            }

            //rotamos a peza a posición vertical
            squares[0].setX(pivotX);
            squares[0].setY(pivotY - Game.SQUARE_SIDE);
            squares[2].setX(pivotX);
            squares[2].setY(pivotY + Game.SQUARE_SIDE);
            squares[3].setX(pivotX);
            squares[3].setY(pivotY + 2 * Game.SQUARE_SIDE);
        }

        return true;
    }
    
    
}