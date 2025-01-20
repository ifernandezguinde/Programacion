/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persoas;

import persoas.Device;

/**
 *
 * @author ivan
 */
public class WashingMachine extends Device {
    
    private int height, width;

    /**
     * dalle un valor as variables
     * @param height
     * @param width
     * @param consumption
     * @param price 
     */
    public WashingMachine(int height, int width, int consumption, int price) {
        super(consumption, price);
        this.height = height;
        this.width = width;
    }

    /**
     * devolve o valor de height
     * @return 
     */
    public int getHeight() {
        return height;
    }

    /**
     * modifica o valor de height
     * @param height 
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * devolve o valor de width
     * @return 
     */
    public int getWidth() {
        return width;
    }

    /**
     * modifica o valor de width
     * @param width 
     */
    public void setWidth(int width) {
        this.width = width;
    }
    
    
    
}
