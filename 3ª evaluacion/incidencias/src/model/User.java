/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ivan.fernandezguinde
 */
public class User {
    public final static int USER=0;
    public final static int ADMIN=1;
    
    private String username;
    private String password;
    private String name;
    private String surname;
    private int type;

    /**
     * constructor da clase que recibe e asigna os parámetros as variables
     * @param username
     * @param password
     * @param name
     * @param surname
     * @param type 
     */
    public User(String username, String password, String name, String surname, int type) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.type = type;
    }

    /**
     * devolve o valor de username
     * @return 
     */
    public String getUsername() {
        return username;
    }

    /**
     * modifica o valor de username
     * @param username 
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * devolve o valor de password
     * @return 
     */
    public String getPassword() {
        return password;
    }

    /**
     * modifica o valor de password
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password;
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

    /**
     * devolve o valor de type
     * @return 
     */
    public int getType() {
        return type;
    }

    /**
     * modifica o valor de type
     * @param type 
     */
    public void setType(int type) {
        this.type = type;
    }
    
    
    
    
    
    
}
