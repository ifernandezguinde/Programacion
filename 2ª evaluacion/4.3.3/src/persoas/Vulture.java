/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persoas;

import persoas.Bird;

/**
 *
 * @author ivan
 */
public class Vulture extends Bird {
    
    private int flightSpeed, weight;

    /**
     * dalñe un valor as variables
     * @param flightSpeed
     * @param weight
     * @param sex
     * @param age 
     */
    public Vulture(int flightSpeed, int weight, String sex, int age) {
        super(sex, age);
        this.flightSpeed = flightSpeed;
        this.weight = weight;
    }

    /**
     * devolve o valor de flightSpeed
     * @return 
     */
    public int getFlightSpeed() {
        return flightSpeed;
    }

    /**
     * modifica o valor de flightSpeed
     * @param flightSpeed 
     */
    public void setFlightSpeed(int flightSpeed) {
        this.flightSpeed = flightSpeed;
    }

    /**
     * devolve o valor de weight
     * @return 
     */
    public int getWeight() {
        return weight;
    }

    /**
     * modifica o valor de weight
     * @param weight 
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    
    
}
