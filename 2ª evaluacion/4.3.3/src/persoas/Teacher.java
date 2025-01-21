/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persoas;

import speaker.Speaker;

/**
 *
 * @author ivan
 */
public class Teacher extends Person implements Speaker {
    
    private String office, email;

    /**
     * dalle un valor as variables
     * @param office
     * @param email
     * @param name
     * @param age 
     */
    public Teacher(String office, String email, String name, int age) {
        super(name, age);
        this.office = office;
        this.email = email;
    }

    /**
     * devolve o valor de office
     * @return 
     */
    public String getOffice() {
        return office;
    }

    /**
     * modifica o valor de office
     * @param office 
     */
    public void setOffice(String office) {
        this.office = office;
    }

    /**
     * devolve o valor de email
     * @return 
     */
    public String getEmail() {
        return email;
    }

    /**
     * modifica o valor de email
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
    
    @Override
    public void speak() {
        System.out.println("Ola, son un profesor e sei falar");
        System.out.println();
        System.out.println("Nome: " + this.getName());
        System.out.println("    ");
        System.out.println("Idade: " + this.getAge());
        System.out.println();
        System.out.println("Despacho: " + this.getOffice());
        System.out.println("    ");
        System.out.println("E-mail: " + this.getEmail());
        
    }
    
    
}
