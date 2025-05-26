/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ivan.fernandezguinde
 */
public class Order {
    private int mesa;
    private ArrayList<OrderItem> orders;

    /**
     * constructor da clase que da valores as variables
     * @param mesa
     * @param orders 
     */
    public Order(int mesa, ArrayList<OrderItem> orders) {
        this.mesa = mesa;
        this.orders = new ArrayList();
    }
    

    /**
     * devolve o valor de mesa
     * @return 
     */
    public int getMesa() {
        return mesa;
    }

    /**
     * modifica o valor de mesa
     * @param mesa 
     */
    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    /**
     * devolve o valor do ArrayList orders
     * @return 
     */
    public ArrayList<OrderItem> getOrders() {
        return orders;
    }

    /**
     * modifica o valor do ArrayList orders
     * @param orders 
     */
    public void setOrders(ArrayList<OrderItem> orders) {
        this.orders = orders;
    }
    
    
    public double getPrice() {
        double price = 0;
        
        for (OrderItem order : orders) {
            price = + orders.get(mesa).getPrice();
        }
                
        return price;
    }
    
    
}
