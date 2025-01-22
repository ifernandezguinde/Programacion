/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author ivan
 */
public class Student extends Person implements Speaker {
    
    private String career, course;

    /**
     * dalle un valor as variables
     * @param career
     * @param course
     * @param name
     * @param age 
     */
    public Student(String career, String course, String name, int age) {
        super(name, age);
        this.career = career;
        this.course = course;
    }

    /**
     * devolve o valor de career
     * @return 
     */
    public String getCareer() {
        return career;
    }

    /**import speaker.Speaker;
     * modifica o valor de career
     * @param career 
     */
    public void setCareer(String career) {
        this.career = career;
    }

    /**
     * devolve o valor de course
     * @return 
     */
    public String getCourse() {
        return course;
    }

    /**
     * modifica o valor de course
     * @param course 
     */
    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public void speak() {
        System.out.println("Ola, son un estudante e sei falar");
        System.out.println();
        System.out.println("Nome: " + this.getName());
        System.out.println("    ");
        System.out.println("Idade: " + this.getAge());
        System.out.println();
        System.out.println("Carreira: " + this.getCareer());
        System.out.println("    ");
        System.out.println("Curso: " + this.getCourse());
        
    }
    
    
}
