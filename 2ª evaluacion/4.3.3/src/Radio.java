/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ivan
 */
public class Radio extends Device implements Speaker {
    
    private int power;
    private boolean casette;

    /**
     * dalle un valor as variables
     * @param power
     * @param casette
     * @param consumption
     * @param price 
     */
    public Radio(int power, boolean casette, int consumption, int price) {
        super(consumption, price);
        this.power = power;
        this.casette = casette;
    }

    /**
     * devolve o valor de power
     * @return 
     */
    public int getPower() {
        return power;
    }

    /**
     * modifica o valor de power
     * @param power 
     */
    public void setPower(int power) {
        this.power = power;
    }

    /**
     * devolve o valor de casette
     * @return 
     */
    public boolean isCasette() {
        return casette;
    }

    /**
     * modifica o valor de casette
     * @param casette 
     */
    public void setCasette(boolean casette) {
        this.casette = casette;
    }

    
    
    @Override
    public void speak() {
        System.out.println("Ola, son unha radio e sei falar");
        System.out.println();
        System.out.println("Consumo: " + this.getConsumption());
        System.out.println("    ");
        System.out.println("Prezo: " + this.getPrice());
        System.out.println();
        System.out.println("Casette: " + this.isCasette());
        System.out.println("    ");
        System.out.println("Potencia: " + this.getPower());
    }
    
    
    
}
