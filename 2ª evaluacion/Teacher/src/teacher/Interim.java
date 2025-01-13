/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teacher;

/**
 *
 * @author ivan.fernandezguinde
 */
public class Interim extends Teacher{
    private double interimComplement;
    private String destination;

    /**
     * dalle un valor as variables
     * @param interimComplement
     * @param destination
     * @param name
     * @param surname
     * @param address
     * @param baseSalary 
     */
    public Interim(double interimComplement, String destination, String name, 
    String surname, String address, double baseSalary) {
        super(name, surname, address, baseSalary);
        this.interimComplement = interimComplement;
        this.destination = destination;
    }

    

    /**
     * devolve o valor de interimComplement
     * @return 
     */
    public double getInterimComplement() {
        return interimComplement;
    }

    /**
     * modifica o valor de interimComplement
     * @param interimComplement 
     */
    public void setInterimComplement(double interimComplement) {
        this.interimComplement = interimComplement;
    }

    /**
     * devolve o valor de destination
     * @return 
     */
    public String getDestination() {
        return destination;
    }

    /**
     * modifica o valor de destination
     * @param destination 
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    
    
    

    /**
     * calcula a nómina sumando baseSalary e interimComplement
     */
    @Override
    public void generatePayroll() {
        salary = baseSalary + interimComplement;
    }
}
