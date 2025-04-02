/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ivan.fernandezguinde
 */
public class Student extends HogwartsCharacter {
    private String quidditch;
    private int curso;

    /**
     * constructor da clase que lle da un valor aos atributos
     * @param quidditch
     * @param curso
     * @param nome
     * @param caracteristicas
     * @param codigo
     * @param casa
     * @param pet 
     */
    public Student(String quidditch, String nome, String caracteristicas, String codigo, Pet pet, String casa, int curso) {
        super(nome, caracteristicas, codigo, casa, pet);
        this.quidditch = quidditch;
        this.curso = curso;
    }

    /**
     * devolve o valor de quidditch
     * @return 
     */
    public String getQuidditch() {
        return quidditch;
    }

    /**
     * modifica o valor de quidditch
     * @param quidditch 
     */
    public void setQuidditch(String quidditch) {
        this.quidditch = quidditch;
    }

    /**
     * devolve o valor de curso
     * @return 
     */
    public int getCurso() {
        return curso;
    }

    /**
     * modifica o valor de curso
     * @param curso 
     */
    public void setCurso(int curso) {
        this.curso = curso;
    }
    
    
    
    
    
    
    
}
