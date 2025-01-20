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
public class Parrot extends Bird implements Speaker {
    
    private String region, color;

    /**
     * dalle un valor as variables
     * @param region
     * @param color
     * @param sex
     * @param age 
     */
    public Parrot(String region, String color, String sex, int age) {
        super(sex, age);
        this.region = region;
        this.color = color;
    }

    /**
     * devolve o valor de region
     * @return 
     */
    public String getRegion() {
        return region;
    }

    /**
     * modifica o valor de region
     * @param region 
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * devolve o valor de color
     * @return 
     */
    public String getColor() {
        return color;
    }

    /**
     * modifica o valor de color
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    
    

    @Override
    public void speak() {
        System.out.println("Ola, son un loro e sei falar");
    }
    
    
    
}
