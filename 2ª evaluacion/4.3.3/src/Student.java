/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author ivan
 */
public class Student extends Person implements Speaker {
    
    private String career;
    private int course;

    /**
     * dalle un valor as variables
     * @param career
     * @param course
     * @param name
     * @param age 
     */
    public Student(String career, int course, String name, int age) {
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
    public int getCourse() {
        return course;
    }

    /**
     * modifica o valor de course
     * @param course 
     */
    public void setCourse(int course) {
        this.course = course;
    }

    
    /**
     * mostra por pantalla todos os atributos
     */
    @Override
    public void speak() {
        System.out.println("Ola, son un estudante e sei falar");
        System.out.println();
        System.out.println("Nome: " + this.getName() +
                "     Idade: " + this.getAge());
        System.out.println();
        System.out.println("Carreira: " + this.getCareer() +
                "     Curso: " + this.getCourse());
        System.out.println();
        System.out.println();
        
    }
    
    
}
