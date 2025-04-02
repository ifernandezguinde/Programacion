/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ivan.fernandezguinde
 */
public class Teacher extends HogwartsCharacter {
    private String cv;

    /**
     * constructor da clase que lle asigna valores as variables
     * @param cv
     * @param nome
     * @param caracteristicas
     * @param codigo
     * @param casa
     * @param pet 
     */
    public Teacher(String cv, String nome, String caracteristicas, String codigo, String casa, Pet pet) {
        super(nome, caracteristicas, codigo, casa, pet);
        this.cv = cv;
    }

    /**
     * devolve o valor de cv
     * @return 
     */
    public String getCv() {
        return cv;
    }

    /**
     * modifica o valor de cv
     * @param cv 
     */
    public void setCv(String cv) {
        this.cv = cv;
    }
    
    
    
    
}
