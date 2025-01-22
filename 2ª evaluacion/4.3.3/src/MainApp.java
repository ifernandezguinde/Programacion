/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 * Crea un array de 7 posicións que permita almacenar unicamente obxectos coa capacidade de falar.
 * Crea os seguintes obxectos: un Parrot, un Tweety, un Student, un Teacher, 
 * un Concierge, unha TV e unha Radio. Asignar valores aos atributos 
 * destes obxectos.
 * introduce os obxectos no array.
 * invoca o método speak sobre cada un dos obxectos introducidos no Array

 * @author ivan.fernandezguinde
 */
public class MainApp {
    // creamos un array
    private Speaker things [] = new Speaker [7];
    
    public static void main(String[] Args) {
        // creamos os obxectos
        Speaker p1 = new Parrot(Europa, Azul, Macho, 2);
        Speaker t1 = new Tweety();
        Speaker s1 = new Student();
        Speaker te1 = new Teacher();
        Speaker c1 = new Concierge();
        Speaker tv1 = new Tv();
        Speaker rad1 = new Radio();


    }
    
}
