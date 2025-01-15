/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teacher;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ivan.fernandezguinde
 */
public class HighSchool {
    
    private String name;
    private ArrayList<Teacher> teachers;

    /**
     * dalle un valor a name
     * @param name
     */
    public HighSchool(String name) {
        this.name = name;
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
    
    
    /**
     * recorremos o ArrayList comparando os salarios e gardamos o maior para
     * devolver o profesor con máis salario 
     * @return 
     */
    public Teacher mostPaid() {
        
        Teacher mostPaid = teachers.get(0);
        for (Teacher teacher : teachers) {
            if (teacher.getSalary() > mostPaid.getSalary()) {
                mostPaid = teacher;
            }
        }
        return mostPaid;
    }
    /**
     * recorremos o ArrayList comparando os salarios e gardamos o menor para
     * devolver o profesor con menos salario 
     * @return 
     */
    public Teacher leastPaid() {
        
        Teacher leastPaid = teachers.get(0);
        for (Teacher teacher : teachers) {
            if (teacher.getSalary() < leastPaid.getSalary()) {
                leastPaid = teacher;
            }
        }
        return leastPaid;
    }
    
     /**
     * recorremos o ArrayList sumando os salarios de todos os profesores para
     * devolver a cantidade total 
     * @return 
     */
    public double SalaryCosts() {
        // recorremos o ArrayList e sumamos os salarios de todos
        double total = 0;
        for (Teacher teacher : teachers) {
            total += teacher.getSalary();
        }
        return total;
    }
    
    /**
     * devolve a media dos salarios de todos os profesores
     * @return 
     */
    public double SalaryAverage() {
        
        return this.SalaryCosts() / teachers.size();
    }
    
    
    public static void main(String[] args) {
        // creamos un instituto
        HighSchool highSchool = new HighSchool("As Neves");
        
        // creamos un obxecto de cada subclase pasándolle os parámetros
        Teacher of1 = new CareerOfficer(200.23, 2005, "Santiago", "pepe", 
        "fernandez", "tui", 1800.00);
        Teacher subs1 = new Substitute(150.22, new Date(), "pablo", "costas", 
        "pamplona", 1800.00);
        Teacher int1 = new Interim(80.15, "pontevedra", "marcos", "alvarez", 
        "ponteareas", 1800.00);
        
        // creamos un bucle para que xere a nómina a todos os profesores
        for (Teacher t: highSchool.getTeachers()) {
            t.generatePayroll();
        }
        
        // engadimos os profesores ao ArrayList
        highSchool.getTeachers().add(of1);
        highSchool.getTeachers().add(subs1);
        highSchool.getTeachers().add(int1);
        
        // invocamos os métodos creados e móstraos por pantalla
        System.out.println(highSchool.mostPaid().getName());
        System.out.println(highSchool.leastPaid().getName());
        System.out.println(highSchool.SalaryCosts());
        System.out.println(highSchool.SalaryAverage());
        
    } 
}
