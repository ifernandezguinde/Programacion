/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package year;
import java.util.Scanner;

/**
 * mostra os días que ten un mes dependendo de se o ano é ou non bisiesto
 * @author ivan.fernandezguinde
 */
public class Year {
    private boolean leapYear;

    /**
     * dalle un valor a leapYear
     * @param leapYear 
     */
    public Year(boolean leapYear) {
        this.leapYear = leapYear;
    }

    /**
     * devolve o valor de leapYear
     * @return 
     */
    public boolean isLeapYear() {
        return leapYear;
    }

    /**
     * modifica o valor de leapYear
     * @param leapYear 
     */
    public void setLeapYear(boolean leapYear) {
        this.leapYear = leapYear;
    }

   

       
    
    
    public void showDaysOfMonth(int month) {
        // facemos que solo sirvan os meses entre 1 e 12
        if (month <= 0 || month > 12){
            System.out.println("este mes e incorrecto");
            return;
        }
            // facemos que segundo o numero do mes nos de diferentes valores
            switch (month){
                case 1,3,5,7,8,10,12:
                    System.out.println("este mes ten 31 días");
                    break;
                case 2:
                    if (leapYear){
                        System.out.println("este mes ten 29 días");
                    } else {
                        System.out.println("este mes ten 28 días");
                    }
                    break;
                default:
                    System.out.println("este mes ten 30 días");
            } 
    }
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("introduce se o ano é bisiesto: ");
        boolean leapYear = scan.nextBoolean();
        
        System.out.println("introduce o mes: ");
        int month = scan.nextInt();
        
        Year year1 = new Year(leapYear);
        year1.showDaysOfMonth(month);
    }
    
}
