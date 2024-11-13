/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adventcalendar;

/**
 *
 * @author ivan.fernandezguinde
 */
public class AdventCalendar {
    // valor máximo do número máximo que pediremos despois para encher o array
    static final int MAX = 24;
    // declaramos o array
    private int [][] days= new int[4][6];

    /**
     * da un valor a days
     */
    public AdventCalendar() {
    }

    /**
     * devolde o valor de days
     * @return 
     */
    public int[][] getDays() {
        return days;
    }

    /**
     * modifica o valor de days
     * @param days 
     */
    public void setDays(int[][] days) {
        this.days = days;
    }
    
    private void fill() {
        // enche a matriz con valores aleatorios entre 1 e 24 sin que se repitan
        // nin se introduzan nunha posicion do array que esté ocupada
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                int value = new java.util.Random().nextInt(MAX);
                // to do
                if () {
                    j = value; 
                }
            }
        }
    }

    private void Show() {
        // mostra a matriz por pantalla
        for (int[] day : days) {
            for (int j = 0; j < days.length; j++) {
                System.out.print(day[j] + " ");
            }
            System.out.println();
        }
    }

    
    
    private void eat() {
        
        // come un elemento convertindo o seu valor a 0 no elemento da matriz
        // que teña o menor número
        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days.length; j++) {
                if (days[j] < days) {
                    int min = j;
                }
            }
        }
    }
    
    
    private boolean christmasIsHere() {
        // saca por pantalla unha mensaxe cando a matriz queda baleira (todos os
        // numeros a 0). devolve true ou false
        // chamar o método show cada vez que coma un día
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
