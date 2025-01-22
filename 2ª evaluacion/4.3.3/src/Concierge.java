/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author ivan
 */
public class Concierge extends Person implements Speaker {
    
    private String turn;
    private int seniority;

    /**
     * dalle un valor as variables
     * @param turn
     * @param seniority
     * @param name
     * @param age 
     */
    public Concierge(String turn, int seniority, String name, int age) {
        super(name, age);
        this.turn = turn;
        this.seniority = seniority;
    }

    /**
     * devolve o valor de turn
     * @return 
     */
    public String getTurn() {
        return turn;
    }

    /**
     * modifica o valor de turn
     * @param turn 
     */
    public void setTurn(String turn) {
        this.turn = turn;
    }

    /**
     * devolve o valor de seniority
     * @return 
     */
    public int getSeniority() {
        return seniority;
    }

    /**
     * modifica o valor de seniority
     * @param seniority 
     */
    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    

    
    
    @Override
    public void speak() {
        System.out.println("Ola, son un bedel e sei falar");
        System.out.println();
        System.out.println("Nome: " + this.getName());
        System.out.println("    ");
        System.out.println("Idade: " + this.getAge());
        System.out.println();
        System.out.println("Turno: " + this.getTurn());
        System.out.println("    ");
        System.out.println("Antiguedad: " + this.getSeniority());
    }
    
    
    
}
