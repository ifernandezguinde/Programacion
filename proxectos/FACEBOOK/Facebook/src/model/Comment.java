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
public class Comment {
    private int id;
    private Date date;
    private String text;
    private Profile author;
    private Post post;


    /**
     * constructor da clase que recibe parámetros e llos asigna as variables
     * @param id
     * @param date
     * @param text 
     * @param author 
     * @param post 
     */
    public Comment(int id, Date date, String text, Profile author, Post post, String text) {
        this.id = id;
        this.date = date;
        this.text = text;
        this.author = author;
        this.post = post;
        post.addComment(this);
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
    
    
    
}
