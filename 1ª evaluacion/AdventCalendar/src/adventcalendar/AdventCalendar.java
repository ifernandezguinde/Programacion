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
    private int [][] days = new int[6][4];

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
    
    private boolean repeatValue(int value) {
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 4; j++) {
                if (days[i][j] == value) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private void fill() {
        int value;
        // enche a matriz con valores aleatorios entre 1 e 24 sin que se repitan
        // nin se introduzan nunha posicion do array que esté ocupada
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                do {
                    value = new java.util.Random().nextInt(MAX) + 1;
                } while (repeatValue(value));
                    days[i][j] = value;
            }
        }
    }

    private void Show() {
        // mostra a matriz por pantalla
        for (int[] day : days) {
            for (int j = 0; j < 4; j++) {
                System.out.print(day[j] + " ");
            }
            System.out.println();
        }
    }

    
    
    private void eat() {
        
        // come un elemento convertindo o seu valor a 0 no elemento da matriz
        // que teña o menor número e mostra o array por pantalla ata que todas
        // as posicións do array sexan 0
        if (christmasIsHere() == false) {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 4; j++) {
                   if (days[i][j] < days[i][j]) {
                       days[i][j] = 0;
                   }
                }
            }        
            Show();
        } else {
            System.out.println("XA CHEGOU A NAVIDADE!!");
        }
    }
    
    
    private boolean christmasIsHere() {
        // comprova se todas as posicións do array son 0 e devolve true ou false 
        for (int i = 0; i < 6; i++) {
            for (int j= 0; j < 4; j++) {
                if (days[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AdventCalendar advent = new AdventCalendar();
        
        advent.fill();
        advent.Show();
        advent.eat();
    }

}
