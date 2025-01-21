/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paxaros;

import speaker.Speaker;
import paxaros.Canary;

/**
 *
 * @author ivan
 */
public class Tweety extends Canary implements Speaker {
    
    private String sing;
    private int numberOfFilms;

    /**
     * dalle un valor as variables
     * @param sing
     * @param numberOfFilms
     * @param sex
     * @param age 
     */
    public Tweety(String sing, int numberOfFilms, String sex, int age) {
        super(sex, age);
        this.sing = sing;
        this.numberOfFilms = numberOfFilms;
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

    /**
     * devolve o valor de numberOfFilms
     * @return 
     */
    public int getNumberOfFilms() {
        return numberOfFilms;
    }

    /**
     * modifica o valor de numberOfFilms
     * @param numberOfFilms 
     */
    public void setNumberOfFilms(int numberOfFilms) {
        this.numberOfFilms = numberOfFilms;
    }

    
    
    
    @Override
    public void speak() {
        System.out.println("Ola, son piolin e sei falar");
    }
    
    
    
}
