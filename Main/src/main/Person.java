/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.Scanner;

/**
 *
 * @author ivan.fernandezguinde
 */
public class Person {
    Scanner name1 = new Scanner(System.in);
    private String name;{
        name = name1.nextLine();
    }


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    Scanner  year = new Scanner(System.in);
    private int birthYear;{
        birthYear = year.nextInt();
    }

    public Person(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    
    
    public void future(int birthYear) {
        int 2030 -= birthYear;
        System.out.println("son" +name + "e no ano 2030 terei" +n + "anos"); 
    }
    
    
}
