/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ivan.fernandezguinde
 */
public class Subject {
    private String codigo, nome;
    private int curso;
    private Teacher profesor;

    /**
     * constructor da clase que lle da un valor as variables
     * @param codigo
     * @param nome
     * @param curso
     * @param profesor 
     */
    public Subject(String codigo, String nome, int curso, Teacher profesor) {
        this.codigo = codigo;
        this.nome = nome;
        this.curso = curso;
        this.profesor = profesor;
    }

    /**
     * devolve o valor de codigo
     * @return 
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * modifica o valor de codigo
     * @param codigo 
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * devolve o valor de nome
     * @return 
     */
    public String getNome() {
        return nome;
    }

    /**
     * modifica o valor de nome
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
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

    /**
     * devolve o valor de profesor
     * @return 
     */
    public Teacher getProfesor() {
        return profesor;
    }

    /**
     * modifica o valor de profesor
     * @param profesor 
     */
    public void setProfesor(Teacher profesor) {
        this.profesor = profesor;
    }

    public Object getStudents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
