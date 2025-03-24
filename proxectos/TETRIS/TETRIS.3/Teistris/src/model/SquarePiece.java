/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.awt.Color;

/**
 * peza cadrada
 * @author ivan.fernandezguinde
 */
public class SquarePiece extends Piece {

    /**
     * constructor que crea os cadrados que forman a peza
     * @param game 
     */
    public SquarePiece(Game game) {
        this.game = game;
        
        squares[0] = new Square(Game.MAX_X / 2 - Game.SQUARE_SIDE, 0, Color.BLUE, game);
        squares[1] = new Square(Game.MAX_X / 2, 0, Color.BLUE, game);
        squares[2] = new Square(Game.MAX_X / 2 - Game.SQUARE_SIDE, Game.SQUARE_SIDE,
                Color.BLUE, game);
        squares[3] = new Square(Game.MAX_X / 2, Game.SQUARE_SIDE, Color.BLUE, game);
    }

    

    @Override
    /**
     * Rota a ficha se é posible
     */
    public boolean rotate() {
        // A rotación da ficha cadrada non supón ningunha variación na ficha,
        // por iso simplemente devolvemos true
        return true;
    }
    
}
