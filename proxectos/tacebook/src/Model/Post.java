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
public class Post {

    private int id;
    private Date date;
    private String text;

    /**
     * Constructor da clase que lle da valores as variables
     * @param id
     * @param date
     * @param text 
     */
    public Post(int id, Date date, String text) {
        this.id = id;
        this.date = date;
        this.text = text;
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
    
    
    
    
    
}
