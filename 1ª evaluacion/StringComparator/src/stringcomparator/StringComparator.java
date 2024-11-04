/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringcomparator;
import java.util.Scanner;

/**
 * mostra por pantalla que palabra das tres que lle indiquemos é máis longa
 * @author ivan
 */
public class StringComparator {
    //declaramos os atributos
    private String a, b, c;
    

    /**
     * dalle un valor a cada atributo
     * @param a
     * @param b
     * @param c 
     */
    public StringComparator(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * devolde o valor de a
     * @return 
     */
    public String getA() {
        return a;
    }

    /**
     * modifica o valor de a
     * @param a 
     */
    public void setA(String a) {
        this.a = a;
    }

    /**
     * devolde o valor de b
     * @return 
     */
    public String getB() {
        return b;
    }

    /**
     * modifica o valor de b
     * @param b
     */
    public void setB(String b) {
        this.b = b;
    }

    /**
     * devolde o valor de c
     * @return 
     */
    public String getC() {
        return c;
    }

    /**
     * modifica o valor de c
     * @param c
     */
    public void setC(String c) {
        this.c = c;
    }
    
    
    
    /**
     * este método calcula a palabra mais longa das tres
     * @return max
     */
    public String getBigger() {
        
        
       //facemos que compare a lonxitude das palabras 
       String max = a;
       
       if (b.length() > max.length()) {
            max = b;
        }
        if (c.length() > max.length()) {
            max = c;
        }

        return max;
       
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //pedimos a primeira palabra
        System.out.println("escribe a primeira palabra: ");
        String palabra1 = scan.nextLine();
        
        //pedimos a segunda palabra
        System.out.println("escribe a segunda palabra: ");
        String palabra2 = scan.nextLine();
        
        //pedimos a terceira palabra
        System.out.println("escribe a terceira palabra: ");
        String palabra3 = scan.nextLine();
        
        //creamos unha nova clase stringComparator
        StringComparator case1 = new StringComparator(palabra1, palabra2, palabra3);
        
        // chamamos o método getBigger
        System.out.println("a palabra mais longa é " +case1.getBigger());
         
    }
    
}
