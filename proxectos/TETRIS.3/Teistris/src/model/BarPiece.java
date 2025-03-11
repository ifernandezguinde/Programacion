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

    public BarPiece() {
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
