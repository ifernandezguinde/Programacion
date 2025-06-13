/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author ivan
 */
public class Message {
    private int id;
    private String text;
    private Date date;
    private boolean read;

    /**
     * constructor da clase que da valores as variables
     * @param id
     * @param text
     * @param date
     * @param read 
     */
    public Message(int id, String text, Date date, boolean read) {
        this.id = id;
        this.text = text;
        this.date = date;
        this.read = read;
    }

    /**
     * devolve o valor de id
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * modifica o valor de id
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * devolve o valor de text
     *
     * @return
     */
    public String getText() {
        return text;
    }

    /**
     * modifica o valor de text
     *
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * devolve o valor de date
     *
     * @return
     */
    public Date getDate() {
        return date;
    }

    /**
     * modifica o valor de date
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * devolve o valor de read
     *
     * @return
     */
    public boolean isRead() {
        return read;
    }

    /**
     * modifica o valor de read
     *
     * @param read
     */
    public void setRead(boolean read) {
        this.read = read;
    }
    
    
    
}
