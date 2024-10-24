/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segundos;

/**
 *
 * @author ivan.fernandezguinde
 */
public class Segundos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaramos as variables
        int totalSeconds = 150000;
        //calculamos as horas que hay en "total seconds"
        int hours = totalSeconds/3600;
        //calculamos os minutos dividindo entre 60 o "resto" das horas
        int minutes = (totalSeconds%3600)/60;
        //calculamos os segundos co "resto" de dividir entre 60 o "resto" dos minutos
        int seconds = (totalSeconds%3600)%60;
        //mostramos por pantalla o texto co resultado
        System.out.println(totalSeconds + " segundos son "+ hours + " horas " + minutes + " minutos " + seconds + " segundos");
    }
    
}
