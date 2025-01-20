/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

import java.util.ArrayList;

/**
 * engade e borra figuras ao ArrayLList
 * @author ivan.fernandezguinde
 */
public class Board {
    private ArrayList<Shape> shapes = new ArrayList();

    /**
     * devolve o valor do ArrayList
     * @return
     */
    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    /**
     * modifica o valor do ArrayList
     * @param shapes
     */
    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }
    
    
    
    /**
     * engade figuras ao ArrayList
     * @param shape
     */
    public void addShape(Shape shape) {
        // engadimos a figura ao ArrayList e invocamos o método draw
        shapes.add(shape);
        shape.draw();
        
    }
    
    /**
     * borra todas as figuras do ArrayList
     */
    public void eraseAllSchapes() {
        
        for (Shape shape: shapes) {
            shape.erase();
        }
        
        shapes.clear();
        
    }
    
}
