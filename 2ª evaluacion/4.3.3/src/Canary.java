/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author ivan
 */
public class Canary extends Bird {
    
    private String sing;

    /**
     * dalle un valor as variables
     * @param sing
     * @param sex
     * @param age 
     */
    public Canary(String sing, String sex, int age) {
        super(sex, age);
        this.sing = sing;
    }

    /**
     * devolve o valor de sing
     * @return 
     */
    public String getSing() {
        return sing;
    }

    /**
     * modifica o valor de sing
     * @param sing 
     */
    public void setSing(String sing) {
        this.sing = sing;
    }
    
    
    
}
