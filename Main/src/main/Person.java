/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

        
/**
 *
 * @author ivan.fernandezguinde
 */
public class Person {

    private String name;
    private int birthYear;

    /**
     * asigna un valor a "name" e a "birthYear"
     * @param name
     * @param birthYear 
     */
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
  
    
    /**
     * devolve o valor "name"
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * modifica o valor "name"
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    

    /**
     * devolve o valor "birthYear"
     * @return 
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * modifica o valor "birthYear"
     * @param birthYear 
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    
    /**
     * mostra por pantalla: son "name" e no ano 2030 terei "n" anos
     */
    public void future() {
        System.out.println("son " +name + " e no ano 2030 terei " +(2030 - birthYear) + " anos"); 
    }  
}
