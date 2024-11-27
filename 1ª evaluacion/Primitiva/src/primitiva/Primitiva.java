/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primitiva;
import java.util.Scanner;

/**
 * mostra o resultado dun sorteo da primitiva
 * @author ivan.fernandezguinde
 */
public class Primitiva {
    public static final int TOTAL_NUMBERS = 6;
    public static final int MAX_NUMBERS = 49;
    public static final int MAX_REFOUND_NUMBERS = 9;
    
    private int day, month, year, winnerComplement, refoundNumber;
    private int winnerNumbers[];

    
    /**
     * da un valor para day, month, year, winerComplement e refoundNumber
     * @param day
     * @param month
     * @param year
     * @param winnerComplement
     * @param refoundNumber 
     */
    public Primitiva(int day, int month, int year, int winnerComplement, int refoundNumber) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.winnerComplement = winnerComplement;
        this.refoundNumber = refoundNumber;
    }

    /**
     * devolve o valor de day
     * @return 
     */
    public int getDay() {
        return day;
    }

    /**
     * modifica o valor de day
     * @param day 
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * devolve o valor de month
     * @return 
     */
    public int getMonth() {
        return month;
    }

    /**
     * modifica o valor de month
     * @param month 
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * devolve o valor de year
     * @return 
     */
    public int getYear() {
        return year;
    }

    /**
     * modifica o valor de year
     * @param year 
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * devolve o valor de refoundNumber
     * @return 
     */
    public int getRefoundNumber() {
        return refoundNumber;
    }

    /**
     * modifica o valor de refoundNumber
     * @param refoundNumber 
     */
    public void setRefoundNumber(int refoundNumber) {
        this.refoundNumber = refoundNumber;
    }

    /**
     * devolve o valor de winnerNumbers
     * @return 
     */
    public int[] getWinnerNumbers() {
        return winnerNumbers;
    }

    /**
     * modifica o valor de winnernumbers
     * @param winnerNumbers 
     */
    public void setWinnerNumbers(int[] winnerNumbers) {
        this.winnerNumbers = winnerNumbers;
    }
    
    /**
     * mostra o dia, mes e ano do sorteo, os números premiados, o número 
     * complementario e o reintegro
     */
    public void showResult() {
        System.out.println("o resultado do sorteo realizado o " + day + " do " + month + " do " + year + " foi o seguinte: ");
        System.out.println();
        System.out.println("Numeros premiados: " + winnerNumbers);
        System.out.println();
        System.out.println("Complementario: " + winnerComplement);
        System.out.println();
        System.out.println("Reintegro: " + refoundNumber);
        System.out.println();
    }
    
    /**
     * pide por teclado un número do 1 ao 49 para encher cada unha das 6 
     * posicións do array e tamen pide o reintegro e con iso crea un ticket
     * @return 
     */
    public PrimitivaTicket generateTicket() {
        Scanner scan = new Scanner(System.in);
        
        int numbers[] = new int [TOTAL_NUMBERS];
        
        // creamos o bucle para encher o array
        for (int i = 0; i < TOTAL_NUMBERS; i++) {
            System.out.println("introduce o " + (i+1) + " número: ");
            numbers[i] = scan.nextInt();
        }
        
        System.out.println("indica o reintegro que queres: ");
        refoundNumber = scan.nextInt();
        
        PrimitivaTicket ticket = new PrimitivaTicket(numbers, refoundNumber);
        
        return ticket;
        
    }

    /**
     * segundo os números do ticket que coincidan cos números gañadores saca unha mensaxe por pantalla
     * @param ticket 
     */
    public void showPrize(PrimitivaTicket ticket) {
        if (ticket == winnerNumbers) {
            System.out.println("6 acertos. Premio de 500000€!");
        }
        if ()
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos e inicializamos o array
        int winnerNumbers[] = new int[];
        winnerNumbers[] {
            {7,9,2,24,40,37}
        }  
                
        // creamos unha nova clase Primitiva
        Primitiva primitiva = new Primitiva(1, 2, 1995, 7, 4);
        
        // invocamos o método showResult que nos mostra o resultado do sorteo
        primitiva.showResult();
        
        // creamos un boleto
        primitiva.generateTicket();
        
        // mostramos si está premiado
        primitiva.showPrize(ticket);
        
        
    }
    
}
