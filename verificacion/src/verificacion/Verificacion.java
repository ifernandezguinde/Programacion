/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificacion;

/**
 * A partir dun número dinos si se cumpre ou non a condición de que sexa maior
 * que 100 ou sexa impar
 * @author ivan.fernandezguinde
 */
public class Verificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos a variable
        int a = 105;
        
        //creamos as condicións para que nos mostre por pantalla si cumpre ou 
        //non a condición
        if (a<100|a%2==0){
            System.out.println("o número " +a+ " non cumpre a condición");
        } else {
            System.out.println("o número " +a+ " cumpre a condición");
        }
    }
    
}
