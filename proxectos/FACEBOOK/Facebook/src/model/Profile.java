/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ivan.fernandezguinde
 */
public class Profile {
    public String name, pasword, status;
    private ArrayList<Post> posts;
    private ArrayList<Message> receivedMessages;
    private ArrayList<Message> sentMessages;
    private ArrayList<Profile> friends;
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
        this.posts = new ArrayList<>();
        this.receivedMessages = new ArrayList<>();
        this.sentMessages = new ArrayList<>();
        this.friends = new ArrayList<>();
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

    /**
     * devolve o valor do array posts
     * @return 
     */
    public ArrayList<Post> getPosts() {
        return posts;
    }

    /**
     * modifica o valor do array posts
     * @param posts 
     */
    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    /**
     * devolve o valor do array recivedMessages
     * @return 
     */
    public ArrayList<Message> getReceivedMessages() {
        return receivedMessages;
    }

    /**
     * modifica o valor do array recivedMessages
     * @param receivedMessages 
     */
    public void setReceivedMessages(ArrayList<Message> receivedMessages) {
        this.receivedMessages = receivedMessages;
    }

    /**
     * devolve o valor do array sentMessages
     * @return 
     */
    public ArrayList<Message> getSentMessages() {
        return sentMessages;
    }

    /**
     * modifica o valor do array sentMessages
     * @param sentMessages 
     */
    public void setSentMessages(ArrayList<Message> sentMessages) {
        this.sentMessages = sentMessages;
    }

    /**
     * devolve o valor do array friends
     * @return 
     */
    public ArrayList<Profile> getFriends() {
        return friends;
    }

    /**
     *  modifica o valor do array friends
     * @param friends 
     */
    public void setFriends(ArrayList<Profile> friends) {
        this.friends = friends;
    }
    
    
    
    
    /**
     * añade un post ao array posts
     * @param post 
     */
    public void addPost(Post post) {
        posts.add(post);
    }
    
   
    
    
}
