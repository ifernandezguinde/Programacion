/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import teacher.Teacher;

/**
 *
 * @author ivan.fernandezguinde
 */
public class CareerOfficer extends Teacher {
    private double officerComplement;
    private int oppositionYear;
    private String oppositionPlace;

    public CareerOfficer(double officerComplement, int oppositionYear, String oppositionPlace, String name, String surname, String address, double baseSalary, double salary) {
        super(name, surname, address, baseSalary, salary);
        this.officerComplement = officerComplement;
        this.oppositionYear = oppositionYear;
        this.oppositionPlace = oppositionPlace;
    }

    
    
    /**
     * devolve o valor de officerComplement
     * @return 
     */
    public double getOfficerComplement() {
        return officerComplement;
    }

    /**
     * modifica o valor de officerComplement
     * @param officerComplement 
     */
    public void setOfficerComplement(double officerComplement) {
        this.officerComplement = officerComplement;
    }

    /**
     * devolve o valor de oppositionYear
     * @return 
     */
    public int getOppositionYear() {
        return oppositionYear;
    }

    /**
     * modifica o valor de oppositionYear
     * @param oppositionYear 
     */
    public void setOppositionYear(int oppositionYear) {
        this.oppositionYear = oppositionYear;
    }

    /**
     * devolve o valor de oppositionPlace
     * @return 
     */
    public String getOppositionPlace() {
        return oppositionPlace;
    }

    /**
     * modifica o valor de oppositionPlace
     * @param oppositionPlace 
     */
    public void setOppositionPlace(String oppositionPlace) {
        this.oppositionPlace = oppositionPlace;
    }
    
    
    /**
     * calcula a nómina sumando baseSalary e officerComplement
     */
    @Override
    public void generatePayroll() {
        salary = baseSalary + officerComplement;
    }
    
    
}
