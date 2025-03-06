/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teistris;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author ivan.fernandezguinde
 */
public class BarPiece extends Piece {
    
    public BarPiece(Game game) {
        super(game);
        
        // añadimos o constructor do array e quitámolo da clase Piece para 
        // facela abstracta
        squares[0] = new SquarePiece(Game.MAX_X / 2 - 2*(Game.SQUARE_SIDE), 0, 
                Color.YELLOW, game);
        squares[1] = new SquarePiece(Game.MAX_X / 2 - Game.SQUARE_SIDE, 0, 
                Color.YELLOW, game);
        squares[2] = new SquarePiece(Game.MAX_X / 2 + Game.SQUARE_SIDE, 0, 
                Color.YELLOW, game);
        squares[3] = new SquarePiece(Game.MAX_X / 2 + 2*(Game.SQUARE_SIDE), 0, 
                Color.YELLOW, game);
        
        // Creamos a etiqueta e establecemos a cor de fondo, coordenadas, 
        // e atributos para que se vexa no panel do xogo
        lblSquare = new JLabel();
        lblSquare.setBackground(fillColor);
        lblSquare.setBounds(x, y, Game.SQUARE_SIDE, Game.SQUARE_SIDE);
        lblSquare.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        lblSquare.setVisible(true);
        lblSquare.setOpaque(true);

        // Chamamos á ventá principal do xogo para pintar o cadrado no panel
        game.getMainWindow().drawSquare(this.lblSquare);
    }

    @Override
    public boolean rotate() {
        
        return true;
    }
    
}
