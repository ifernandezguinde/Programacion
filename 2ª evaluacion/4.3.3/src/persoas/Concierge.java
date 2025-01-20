/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persoas;

/**
 *
 * @author ivan
 */
public class Concierge extends Person implements Speaker {
    
    private String office, email;

    /**
     * dalle un valor as variables
     * @param office
     * @param email
     * @param name
     * @param age 
     */
    public Concierge(String office, String email, String name, int age) {
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
     * modifica o vlaor de email
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
    
    @Override
    public void speak() {
        System.out.println("Ola, son un bedel e sei falar");
    }
    
    
    
}
