/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alertas;

/**
 * A partir dunha humidade e unha temperatura móstranos diferentes alertas
 * dependendo se si superan ou non os valores máximos
 * @author ivan.fernandezguinde
 */
public class Alertas {

    public static final int MAX_HUM = 50;
    public static final int MAX_TEMP = 24;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos as variables
        int hum, temp;
        hum= 40;
        temp= 20;

        // indicamos as condicións para que se cumplan ou non os diferentes tipos
        // de alertas
        if(hum>MAX_HUM && temp>MAX_TEMP){
            System.out.println("Alerta vermella");
        } else if (hum>MAX_HUM|temp>MAX_TEMP){
            System.out.println("Alerta amarerela");
        } else {
            System.out.println("Alerta verde");
        }
        
    }
    
}