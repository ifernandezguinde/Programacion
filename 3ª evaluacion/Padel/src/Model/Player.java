/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ivan.fernandezguinde
 */
public class Player {
    private String id, pasword, name;
    private double score, balance;

    /**
     * constructor da clase que lle asigna as variables os valores recibidos
     * @param id
     * @param pasword
     * @param name
     * @param score
     * @param balance 
     */
    public Player(String id, String pasword, String name, double score, double balance) {
        this.id = id;
        this.pasword = pasword;
        this.name = name;
        this.score = score;
        this.balance = balance;
    }

    /**
     * devolve o valor de id
     * @return 
     */
    public String getId() {
        return id;
    }

    /**
     * modifica o valor de id
     * @param id 
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * devolve o valor de pasword
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
     * devolve o valor de score
     * @return 
     */
    public double getScore() {
        return score;
    }

    /**
     * modifica o valor de score
     * @param score 
     */
    public void setScore(double score) {
        this.score = score;
    }

    /**
     * devolve o valor de balance
     * @return 
     */
    public double getBalance() {
        return balance;
    }

    /**
     * modifica o valor de balance
     * @param balance 
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
    
    
    
    
    
}
