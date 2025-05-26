/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ivan.fernandezguinde
 */
public class OrderItem {
    private MenuItem elemento;
    private int cantidade;

    /**
     * constructor da clase que da valor as variables
     * @param elemento
     * @param cantidade 
     */
    public OrderItem(MenuItem elemento, int cantidade) {
        this.elemento = elemento;
        this.cantidade = cantidade;
    }

    /**
     * devolve o valor de elemento
     * @return 
     */
    public MenuItem getElemento() {
        return elemento;
    }

    /**
     * modifica o valor de elemento
     * @param elemento 
     */
    public void setElemento(MenuItem elemento) {
        this.elemento = elemento;
    }

    /**
     * devolve o valor de cantidade
     * @return 
     */
    public int getCantidade() {
        return cantidade;
    }

    /**
     * modifica o valor de cantidade
     * @param cantidade 
     */
    public void setCantidade(int cantidade) {
        this.cantidade = cantidade;
    }
    
    
    
    public double getPrice () {
        double price;
        
        price = elemento.getPrezo() * cantidade;
        
        return price;
    }
    
    
}
