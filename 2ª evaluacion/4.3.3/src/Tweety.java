/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author ivan
 */
public class Tweety extends Canary implements Speaker {
    
    private int numberOfFilms;

    /**
     * dalle un valor as variables
     * @param numberOfFilms
     * @param sing
     * @param sex
     * @param age 
     */
    public Tweety(int numberOfFilms, String sing, String sex, int age) {
        super(sing, sex, age);
        this.numberOfFilms = numberOfFilms;
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

    
    
    /**
     * mostra por pantalla todos os atributos
     */
    @Override
    public void speak() {
        System.out.println("Ola, son piolin e sei falar");
        System.out.println();
        System.out.println("Sexo: " + this.getSex() +
                "     Idade: " + this.getAge());
        System.out.println("Canta: " + this.getSing() +
                "     Peliculas: " + this.getNumberOfFilms());
        System.out.println();
        System.out.println();
        
    }
    
    
    
}
