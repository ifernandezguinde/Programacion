/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ivan
 */
public class Device {
    
    private int consumption, price;
 /**
  * dalle un valor as variables
  * @param consumption
  * @param price 
  */
    public Device(int consumption, int price) {
        this.consumption = consumption;
        this.price = price;
    }

    /**
     * devolve o valor de consumption
     * @return 
     */
    public int getConsumption() {
        return consumption;
    }

    /**
     * modifica o valor de consumption
     * @param consumption 
     */
    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    /**
     * devolve o valor de price
     * @return 
     */
    public int getPrice() {
        return price;
    }

    /**
     * modifica o valor de price
     * @param price 
     */
    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
}
