/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paxaros;

/**
 *
 * @author ivan
 */
public class Bird {
    
    private String sex;
    private int age;

    /**
     * dalle un valor as variables
     * @param sex
     * @param age 
     */
    public Bird(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    /**
     * devolve o valor de sex
     * @return 
     */
    public String getSex() {
        return sex;
    }

    /**
     * modifica o valor de sex
     * @param sex 
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * devolve o valor de age
     * @return 
     */
    public int getAge() {
        return age;
    }

    /**
     * modifica o valor de age
     * @param age 
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    
    
}
