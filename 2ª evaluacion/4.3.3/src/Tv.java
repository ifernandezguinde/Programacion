/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author ivan
 */
public class Tv extends Device implements Speaker {
    
    private int inches;
    private boolean teletext;

    /**
     * dalle un valor as variables
     * @param inches
     * @param teletext
     * @param consumption
     * @param price 
     */
    public Tv(int inches, boolean teletext, int consumption, int price) {
        super(consumption, price);
        this.inches = inches;
        this.teletext = teletext;
    }

    /**
     * devolve o valor de inches
     * @return 
     */
    public int getInches() {
        return inches;
    }

    /**
     * modifica o valor de inches
     * @param inches 
     */
    public void setInches(int inches) {
        this.inches = inches;
    }

    /**
     * devolve o valor de teletexto
     * @return 
     */
    public boolean isTeletext() {
        return teletext;
    }

    /**
     * modifica o valor de teletexto
     * @param teletext 
     */
    public void setTeletext(boolean teletext) {
        this.teletext = teletext;
    }

    /**
     * mostra por pantalla todos os atributos
     */
    @Override
    public void speak() {
        System.out.println("Ola, son unha tv e sei falar");
        System.out.println();
        System.out.println("Consumo: " + this.getConsumption() +
                "     Prezo: " + this.getPrice());
        System.out.println();
        System.out.println("Teletexto: " + (this.isTeletext() ? "Si" : "No") +
                "     Pulgadas: " + this.getInches());
        System.out.println();
        System.out.println();
        
    }
    
    
}
