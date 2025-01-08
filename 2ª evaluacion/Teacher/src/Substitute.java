/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import teacher.Teacher;
import java.util.Date;

/**
 *
 * @author ivan.fernandezguinde
 */
public class Substitute extends Teacher {
    private double displacement;
    private Date initDate;

    public Substitute(double displacement, Date initDate, String name, String surname, String address, double baseSalary, double salary) {
        super(name, surname, address, baseSalary, salary);
        this.displacement = displacement;
        this.initDate = initDate;
    }

    
    /**
     * devolve o valor de displacement
     * @return 
     */
    public double getDisplacement() {
        return displacement;
    }

    /**
     * modifica o valor de displacement
     * @param displacement 
     */
    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    /**
     * devolve o valor de initDate
     * @return 
     */
    public Date getInitDate() {
        return initDate;
    }

    /**
     * modifica o valor de initDate
     * @param initDate 
     */
    public void setInitDate(Date initDate) {
        this.initDate = initDate;
    }
    
    
    
    

    /**
     * calcula a nómina sumando baseSalary e displacement
     */
    @Override
    public void generatePayroll() {
        salary = baseSalary + displacement;
    }

    /**
     * modifica o método teach da clase Teacher para mostrar por pantalla unha 
     * mensaxe diferente a orixinal
     */
    @Override
    public void teach() {
        System.out.println("Substitúo unha clase de programación en Java");
    }
    
    
    
    
    
}
