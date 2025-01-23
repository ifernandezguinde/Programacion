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
    private Speaker things [];
    
    public static void main(String[] Args) {
        
        Speaker[] things = new Speaker[7];
        
        // creamos os obxectos
        Speaker p1 = new Parrot("Europa", "Azul", "Macho", 2);
        Speaker t1 = new Tweety(10, "Na Ducha", "Macho", 6);
        Speaker s1 = new Student("Informaatica", 3, "Marta", 22);
        Speaker te1 = new Teacher("555-D", "txus@iesteis.es", "Jesus", 35);
        Speaker c1 = new Concierge("Tarde", 10, "Dani", 40);
        Speaker tv1 = new Tv(28, true, 100, 30000);
        Speaker rad1 = new Radio(2, false, 50, 15000);

        
        // engadimos os obxectos ao Array
        things[0] = p1;
        things[1] = t1;
        things[2] = s1;
        things[3] = te1;
        things[4] = c1;
        things[5] = tv1;
        things[6] = rad1;
        
        

        // facemos un bucle para que nos mostre todo por pantalla invocando o 
        // método speak()
        for (Speaker speaker : things) {
            speaker.speak();
            System.out.println();
        }

    }
    
}
