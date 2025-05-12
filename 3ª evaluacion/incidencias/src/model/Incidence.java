/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ivan.fernandezguinde
 */
public class Incidence {
    public final static int STATUS_UNSOLVED=0;
    public final static int STATUS_PENDING=1;
    public final static int STATUS_SOLVED=2;
    
    private int id;
    private String description;
    private String computer;
    private String resolution;
    private int status;
    private User sender;

    /**
     * constructor da clase recibe e asigna os valores as variables
     * @param id
     * @param description
     * @param computer
     * @param resolution
     * @param status
     * @param sender 
     */
    public Incidence(int id, String description, String computer, String resolution, int status, User sender) {
        this.id = id;
        this.description = description;
        this.computer = computer;
        this.resolution = resolution;
        this.status = status;
        this.sender = sender;
    }

    /**
     * devolve o valor de id
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * modifica o valor de id
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * devolve o valor de description
     * @return 
     */
    public String getDescription() {
        return description;
    }

    /**
     * modifica o valor de description
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * devolve o valor de computer
     * @return 
     */
    public String getComputer() {
        return computer;
    }

    /**
     * modifica o valor de computer
     * @param computer 
     */
    public void setComputer(String computer) {
        this.computer = computer;
    }

    /**
     * devolve o valor de resolution
     * @return 
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * modifica o valor de resolution
     * @param resolution 
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * devolve o valor de status
     * @return 
     */
    public int getStatus() {
        return status;
    }

    /**
     * modifica o valor de status
     * @param status 
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * devolve o valor de sender
     * @return 
     */
    public User getSender() {
        return sender;
    }

    /**
     * modifica o valor de sender
     * @param sender 
     */
    public void setSender(User sender) {
        this.sender = sender;
    }

    
    
    
    
    
}
