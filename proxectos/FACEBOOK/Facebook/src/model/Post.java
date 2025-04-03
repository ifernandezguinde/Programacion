/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ivan.fernandezguinde
 */
public class Post {
    private int id;
    private Date date;
    private String text;
    private Profile author;
    private ArrayList<Comment> comments;

    /**
     * constructor da clase que recibe parámetros e llos asigna as variables
     * @param id
     * @param date
     * @param text 
     */
    public Post(int id, Date date, String text) {
        this.id = id;
        this.date = date;
        this.text = text;
        this.comments = new ArrayList<>();
        author.addPost(this);
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
     * devolve o valor de author
     * @return 
     */
    public Profile getAuthor() {
        return author;
    }

    /**
     * modifica o valor de author
     * @param author 
     */
    public void setAuthor(Profile author) {
        this.author = author;
    }

    /**
     * devolve o valor do array comments
     * @return 
     */
    public ArrayList<Comment> getComments() {
        return comments;
    }

    /**
     * modifica o valor do array comments
     * @param comments 
     */
    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }
    
    
    
    
    /**
     * añade o comentario ao array comments
     * @param comment 
     */
    public void addComment(Comment comment) {
        comments.add(comment);
    }
    
}
