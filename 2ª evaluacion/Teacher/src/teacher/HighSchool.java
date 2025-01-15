/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teacher;

import java.util.ArrayList;

/**
 *
 * @author ivan.fernandezguinde
 */
public class HighSchool {
    
    private String name;
    private ArrayList<Teacher> teachers;

    /**
     * da un valor as variables
     * @param name
     * @param teachers 
     */
    public HighSchool(String name, ArrayList<Teacher> teachers) {
        this.name = name;
        this.teachers = teachers;
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
     * devolve o valor do ArrayList
     * @return 
     */
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

        /**
         * modifica o valor do ArrayList
         * @param teachers 
         */
    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }
    
    
    
    
    
    
    
    public Teacher TeacherMostPaid() {
        
        Teacher mostPaid = teachers.get(0);
        for (Teacher teacher : teachers) {
            if (teacher.getSalary() > mostPaid.getSalary()) {
                mostPaid = teacher;
            }
        }
        return mostPaid;
    }
    
    public Teacher TeacherLeastPaid() {
        
        Teacher leastPaid = teachers.get(0);
        for (Teacher teacher : teachers) {
            if (teacher.getSalary() < leastPaid.getSalary()) {
                leastPaid = teacher;
            }
        }
        return leastPaid;
    }
    
    public double SalaryCosts() {
        
        double total = 0;
        for (Teacher teacher : teachers) {
            total += teacher.getSalary();
        }
        return total;
    }
    
    public double SalaryAverage() {
        
        return this.SalaryCosts() / teachers.size();
    }
    
    
    public static void main(String[] args) {
        HighSchool highSchool = new HighSchool("Instituto Montealto");
    }
    
    
}
