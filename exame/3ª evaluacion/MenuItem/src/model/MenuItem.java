/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author ivan.fernandezguinde
 */
public class MenuItem {
    private int id;
    private String descricion;
    private double prezo;

    /**
     * constructor da clase que da valor as variables
     * @param id
     * @param descricion
     * @param prezo 
     */
    public MenuItem(int id, String descricion, double prezo) {
        this.id = id;
        this.descricion = descricion;
        this.prezo = prezo;
    }

    /**
     * devolve o valor de id
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * modifica o valor de id
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * devolve o valor de descricion
     * @return 
     */
    public String getDescricion() {
        return descricion;
    }

    /**
     * modifica o valor de descricion
     * @param descricion 
     */
    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }

    /**
     * devolve o valor de prezo
     * @return 
     */
    public double getPrezo() {
        return prezo;
    }

    /**
     * modifica o valor de prezo
     * @param prezo 
     */
    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
