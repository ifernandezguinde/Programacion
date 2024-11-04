/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package table;
import java.util.Scanner;

/**
 * mostra por pantalla a tabla de muntiplicar do 1 o 9 que se lle indique
 * por teclado
 * @author ivan
 */
public class Table {
    
    private int number;

    // dalle un valor a number
    public Table(int number) {
        this.number = number;
    }

    //devolve o valor de number
    public int getNumber() {
        return number;
    }

    // modifica o valor de number
    public void setNumber(int number) {
        this.number = number;
    }
    
    
    
    public void show() {
    
        //facemos que nos mostre a tabla indicada se está entre 1 e 9
        if (number<=9 && number>=1) {
            int resultado;
            System.out.println("a tabla do " +number+ " é: ");

            for (int i = 0; i <= 10; i++) {
                resultado = number*i;
                System.out.println(+number+ " x " +i+ " = " +resultado);
            }
        } else {
            System.out.println("introduce unha tabla entre 1 e 9");
        }
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //pedimoslle que nos indique o número da tabla que quere saber
        System.out.println("introduce a tabla que queiras saber: ");
        int number = scan.nextInt();
        
        //chamamos ao método show para que nos mostre a tabla por pantalla
        Table table = new Table(number);
        table.show();
    }
    
}
