/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author ivan
 */
public class Person {
    
    private String name;
    private int age;

    /**
     * dalle un valor as variables
     * @param name
     * @param age 
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * devolve o valor de name
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * modifica o valor de name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * devolve o valor de age
     * @return 
     */
    public int getAge() {
        return age;
    }

    /**
     * modifica o valor de age
     * @param age 
     */
    public void setAge(int age) {
        this.age = age;
    }
    
}
