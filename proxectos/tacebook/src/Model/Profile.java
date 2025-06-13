/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ivan
 */
public class Profile {
    private String name, password, status;

    /**
     * constructor da clase que da valor as variables
     * @param name
     * @param password
     * @param status 
     */
    public Profile(String name, String password, String status) {
        this.name = name;
        this.password = password;
        this.status = status;
    }

    /**
     * devolve o valor de name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * modifica o valor de name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * devolve o valor de password
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * modifica o valor de password
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * devolve o valor de status
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * modifica o valor de status
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
}
