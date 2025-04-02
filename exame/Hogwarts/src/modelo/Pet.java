/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelo;

/**
 * Implementa unha mascota que pode ter unha personaxe de Hogwarts 
 * (xa sexa alumno ou profesor)
 * @author ivan.fernandezguinde
 */
public class Pet {
    private String animal, name;
    private int age;

    /**
     * constructor da clase que inicializa os valores das variables
     * @param animal
     * @param name
     * @param age 
     */
    public Pet(String animal, String name, int age) {
        this.animal = animal;
        this.name = name;
        this.age = age;
    }

    

    /**
     * devolve o valor de animal
     * @return 
     */
    public String getAnimal() {
        return animal;
    }

    /**
     * modifica o valor de animal
     * @param animal 
     */
    public void setAnimal(String animal) {
        this.animal = animal;
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
