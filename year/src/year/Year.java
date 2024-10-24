/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package year;

import java.util.Scanner;

/**
 *
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
    
   
        
        


    }

    public void showDaysOfMonth() {

        if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            return leapYear = true;
        } else if ((year % ==0) && (year % 400 == 0)) {
            return leapYear = true;
        } else {
            return leapYear = false;
        }

        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        
        int dias;

        do {
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
        } while (month >= 1 || month <= 12);
     
        return "este mes ten " +dias+ " días";
    }
    

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("introduce o ano ");
        int year = scan.nextInt();
        
    }

}
