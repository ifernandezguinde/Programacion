/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author ivan.fernandezguinde
 */
public class PaintingSession {
    
    public static void main(String[] Args) {
        
        Board board = new Board();
        
        // creamos varias pezas diferentes
        Shape cad1 = new Square();
        Shape cir1 = new Circle();
        Shape tr1 = new Triangle();
        Shape tr2 = new Triangle();
        Shape cad2 = new Square();
        
        
        //engadímolas ao encerado
        board.addShape(cad1);
        board.addShape(cir1);
        board.addShape(tr1);
        board.addShape(tr2);
        board.addShape(cad2);
        
        // borramos todas as figuras
        board.eraseAllSchapes();
        
    }
    
}
