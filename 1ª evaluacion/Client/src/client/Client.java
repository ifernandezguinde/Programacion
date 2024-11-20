/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package client;

/**
 * Clase Client que recibe tres variables de tipo String (nif, name e surname)
 * @author ivan
 */
public class Client {
    
    private String nif, name, surname;

    public Client(String nif, String name, String surname) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
    }


    /**
     * devolve o valor de nif
     * @return 
     */
    public String getNif() {
        return nif;
    }

    /**
     * modifica o valor de nif
     * @param nif 
     */
    public void setNif(String nif) {
        this.nif = nif;
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
     * devolve o valor de surname
     * @return 
     */
    public String getSurname() {
        return surname;
    }

    /**
     * modifica o valor de surname
     * @param surname 
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
    


    
}
