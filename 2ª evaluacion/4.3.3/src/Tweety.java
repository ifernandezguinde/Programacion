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

    
    
    
    @Override
    public void speak() {
        System.out.println("Ola, son piolin e sei falar");
        System.out.println();
        System.out.println("Sexo: " + this.getSex());
        System.out.println("    ");
        System.out.println("Idade: " + this.getAge());
        System.out.println();
        System.out.println("Canta: " + this.getSing());
        System.out.println("    ");
        System.out.println("Peliculas: " + this.getNumberOfFilms());
    }
    
    
    
}
