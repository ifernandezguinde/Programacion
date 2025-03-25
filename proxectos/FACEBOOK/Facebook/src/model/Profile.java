/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ivan.fernandezguinde
 */
public class Profile {
    public String name, pasword, status;
/**
 * constructor da clase que recibe parámetros e llos asigna as variables
 * @param name
 * @param pasword
 * @param status 
 */
    public Profile(String name, String pasword, String status) {
        this.name = name;
        this.pasword = pasword;
        this.status = status;
    }

    /**
     * devolve o vlaro de name
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
     * devolve o vlaro de pasword
     * @return 
     */
    public String getPasword() {
        return pasword;
    }

    /**
     * modifica o valor de pasword
     * @param pasword 
     */
    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    /**
     * devolve o vlaro de status
     * @return 
     */
    public String getStatus() {
        return status;
    }

    /**
     * modifica o valor de status
     * @param status 
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
}
