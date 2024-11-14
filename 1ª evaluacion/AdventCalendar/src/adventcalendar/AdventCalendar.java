/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adventcalendar;

/**
 * crea un array de 4x6 que enche de numeros creados aleatoriamente sen que se
 * repitan e móstraa por pantalla, despois vai poñendo o número mais pequeño a 0
 * ata que todas as posicións do array sexan 0 e entón mostra por pantalla unha
 * mensaxe
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
        // calcula se o número aleatorio "value" xa está no array
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
        System.out.println();
    }

    
    
    private void eat() {
        
        boolean allZero;
        // bucle que "come" un elemento convertindo o seu valor a 0 no elemento
        // da matriz que teña o menor número e mostra o array por pantalla ata
        // que todas as posicións do array sexan 0
        do {
            // Encuentra el valor mínimo en la matriz
            int minValue = MAX +1;

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 4; j++) {
                    if (days[i][j] != 0 && days[i][j] < minValue) {
                        minValue = days[i][j];
                    }
                }
            }

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 4; j++) {
                    if (days[i][j] == minValue) {
                        days[i][j] = 0;
                    }
                }
            }
            // mostra o array por pantalla cos números que se "comeron"
            Show();
                
            // comprobamos si todos os valores son 0 para deter o bucle
            allZero = true;
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 4; j++) {
                    if (days[i][j] != 0) {
                        allZero = false;
                    }
                }
            }
        } while (allZero == false);
    }
    
    
    private boolean christmasIsHere() {
        // comprova se todas as posicións do array son 0 e devolve true ou false 
        for (int i = 0; i < 6; i++) {
            for (int j= 0; j < 4; j++) {
                if (days[i][j] == 0) {
                    System.out.println("XA CHEGOU A NAVIDADE!!!");
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
        advent.christmasIsHere();
    }

}