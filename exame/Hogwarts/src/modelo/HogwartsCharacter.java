/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ivan.fernandezguinde
 */
public abstract class HogwartsCharacter {
    protected String nome, caracteristicas, codigo, casa;
    protected Pet pet = null;

    /**
     * constructor da clase que inicializa o valor das variables
     * @param nome
     * @param caracteristicas
     * @param codigo
     * @param casa
     * @param pet 
     */
    public HogwartsCharacter(String nome, String caracteristicas, String codigo, String casa, Pet pet) {
        this.nome = nome;
        this.caracteristicas = caracteristicas;
        this.codigo = codigo;
        this.casa = casa;
        this.pet = pet;
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
     * devolve o valor de caracteristicas
     * @return 
     */
    public String getCaracteristicas() {
        return caracteristicas;
    }

    /**
     * modifica o valor de caracteristicas
     * @param caracteristicas 
     */
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
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
     * devolve o valor de casa
     * @return 
     */
    public String getCasa() {
        return casa;
    }

    /**
     * modifica o valor de casa
     * @param casa 
     */
    public void setCasa(String casa) {
        this.casa = casa;
    }

    /**
     * devolve o valor de pet
     * @return 
     */
    public Pet getPet() {
        return pet;
    }

    /**
     * modifica o valor de pet
     * @param pet 
     */
    public void setPet(Pet pet) {
        this.pet = pet;
    }
    
    
    
    
    
    
}
