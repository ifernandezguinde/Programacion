/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teacher;

/**
 *
 * @author ivan.fernandezguinde
 */
public abstract class Teacher {

    protected String name, surname, address;
    protected double baseSalary, salary;
    

    /**
     * dalle un valor as variables
     * @param name
     * @param surname
     * @param address
     * @param baseSalary
     * @param salary 
     */
    public Teacher(String name, String surname, String address, double baseSalary, double salary) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.baseSalary = baseSalary;
        this.salary = salary;
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
     * devolve o valor de surname
     * @return 
     */
    public String getSurname() {
        return surname;
    }

    /**
     * modifica o valor de surname
     * @param surname 
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * devolve o valor de address
     * @return 
     */
    public String getAddress() {
        return address;
    }

    /**
     * moidifica o valor de address
     * @param address 
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * devolve o valor de baseSalary
     * @return 
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * modifica o valor de baseSalary
     * @param baseSalary 
     */
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * devolve o valor de salary
     * @return 
     */
    public double getSalary() {
        return salary;
    }

    /**
     * modifica o valor de salary
     * @param salary 
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    /**
     * mostra unha mensaxe por pantalla
     */
    public void teach() {
        System.out.println("Dou unha clase de programación en Java");
    }

    /**
     * calcula unha nómina
     */
    public abstract void generatePayroll();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
