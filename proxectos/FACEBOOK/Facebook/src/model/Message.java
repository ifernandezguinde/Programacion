/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author ivan.fernandezguinde
 */
public class Message {
    public int id;
    public Date date;
    public String text;
    public boolean read;

    /**
     * constructor da clase que recibe parámetros e llos asigna as variables
     * @param id
     * @param date
     * @param text
     * @param read 
     */
    public Message(int id, Date date, String text, boolean read) {
        this.id = id;
        this.date = date;
        this.text = text;
        this.read = read;
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
     * devolve o valor de date
     * @return 
     */
    public Date getDate() {
        return date;
    }

    /**
     * modifica o valor de date
     * @param date 
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * devolve o valor de text
     * @return 
     */
    public String getText() {
        return text;
    }

    /**
     * modifica o valor de text
     * @param text 
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * devolve o valor de read
     * @return 
     */
    public boolean isRead() {
        return read;
    }

    /**
     * modifica o valor de read
     * @param read 
     */
    public void setRead(boolean read) {
        this.read = read;
    }
    
    
    
    
}
