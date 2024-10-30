/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarot;

import java.util.Scanner;

/**
 * calcula o número de tarot a partir do día, més e ano introducidos
 * @author ivan
 */
public class Tarot {

    /**
     *  calcula se o ano é bisiesto
     * @param year
     * @return se o ano é bisiesto 
     */
    public boolean isLeapYear(int year) {

        // mandámoslle calcular se o ano é bisiesto
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    /**
     * calcula se o dís, més e ano son correctos dependendo tamén de se e 
     * ano bisiesto ou non
     * @param day
     * @param month
     * @param year
     * @return se o día, més e ano son válidos
     */
    public boolean checkDate(int day, int month, int year) {
        if (year < 1 || month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }

        // define os días que pode ter un més
        int daysmonth;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                daysmonth = 31;
                break;
            case 4, 6, 9, 11:
                daysmonth = 30;
                break;
            case 2:
                if (isLeapYear(year)) {
                    daysmonth = 29;
                } else {
                    daysmonth = 28;
                }
                break;
            default:
                return false;
        }
        return day <= daysmonth;
    }

    /**
     * calcula o número de tarot que é a suma do día, més e ano de nacemento 
     * ata que solo quede unha cifra
     * @param day
     * @param month
     * @param year
     * @return 
     */
    public int calculateTarot(int day, int month, int year) {
        int number, numbertarot, cifra;
        number = 0;
        numbertarot = 0;

        // sumamos día, més e ano
        if (checkDate(day, month, year)) {
            number = day + month + year;
        }
        
        // facemos que sume todas as cifras ata que solo quede unha
        while (number != 0 && numbertarot < 10) {
            cifra = number % 10;
            numbertarot = numbertarot + cifra;
            number = number / 10;
            numbertarot = numbertarot / 10 + numbertarot % 10;
        }
        return numbertarot;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int day, month, year;

        Scanner scan = new Scanner(System.in);

        //mandámoslle poñer o día do seu nacemento
        System.out.println("introduce o dia do teu nacemento: ");
        day = scan.nextInt();

        //mandámoslle poñer o més do seu nacemento
        System.out.println("introduce o mes do teu nacemento: ");
        month = scan.nextInt();

        //mandámoslle introducir o ano do seu nacemento
        System.out.println("introduce o ano do teu nacemento: ");
        year = scan.nextInt();

        //chamamos a todos os métodos
        Tarot tarot1 = new Tarot();
        tarot1.isLeapYear(year);
        if (tarot1.checkDate(day, month, year)) {
            System.out.println("o teu número de tarot é: " + tarot1.calculateTarot(day, month, year));
        } else {
            System.out.println("erro");
        }
    }

}