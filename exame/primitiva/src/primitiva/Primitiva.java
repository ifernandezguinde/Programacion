/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primitiva;

import java.util.Scanner;

/**
 *
 * @author ivan.fernandezguinde
 */
public class Primitiva {

    /**
     * Constante que define o cantos números son os premiados
     */
    public final static int TOTAL_NUMBERS = 6;

    /**
     * Constante que define o valor máximo de calquera número
     */
    public final static int MAX_NUMBER = 49;

    /**
     * Constante que define o valor máximo do número do reintegro
     */
    public final static int MAX_REFUND_NUMBER = 9;

    /**
     * Data do sorteo
     */
    private int day, month, year;

    /**
     * Números premiados no sorteo
     */
    private int[] winnerNumbers = new int[TOTAL_NUMBERS];

    /**
     * Número complementario do sorteo
     */
    private int winnerComplement;

    /**
     * Número do reintegro do sorteo
     */
    private int refundNumber;

    /**
     * Obtén o día do sorteo
     *
     * @return Día do sorteo
     */
    public int getDay() {
        return day;
    }

    /**
     * Establece o día do sorteo
     *
     * @param day Día para o sorteo
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * Obtén o mes do sorteo
     *
     * @return Mes do sorteo
     */
    public int getMonth() {
        return month;
    }

    /**
     * Establece o mes do sorteo
     *
     * @param month Mes para o sorteo
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * Obtén o ano do sorteo
     *
     * @return Ano do sorteo
     */
    public int getYear() {
        return year;
    }

    /**
     * Establece o ano do sorteo
     *
     * @param year Ano para o sorteo
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Obtén os números premiados no sorteo
     *
     * @return Array cos números premiados no sorteo
     */
    public int[] getWinnerNumbers() {
        return winnerNumbers;
    }

    /**
     * Establece os números premiados no sorteo
     *
     * @param winnerNumbers Array cos números premiados
     */
    public void setWinnerNumbers(int[] winnerNumbers) {
        this.winnerNumbers = winnerNumbers;
    }

    /**
     * Obtén o número complementario
     *
     * @return Número complementario
     */
    public int getWinnerComplement() {
        return winnerComplement;
    }

    /**
     * Establece o número complementario
     *
     * @param winnerComplement Número complementario
     */
    public void setWinnerComplement(int winnerComplement) {
        this.winnerComplement = winnerComplement;
    }

    /**
     * Obtén o número complementario
     *
     * @return Número complementario
     */
    public int getRefundNumber() {
        return refundNumber;
    }

    /**
     * Establece o número complementario
     *
     * @param refundNumber Valor para o número complementario
     */
    public void setRefundNumber(int refundNumber) {
        this.refundNumber = refundNumber;
    }

    /**
     * Crea un obxecto para un sorteo da Primitiva, cunha data concreta
     *
     * @param day Día do sorteo
     * @param month Mes do sorteo
     * @param year Ano do sorteo
     */
    public Primitiva(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Mostra por pantalla o resultado do sorteo
     */
    public void showResult() {
        System.out.println("O resultado do sorteo realizado o " + day + " do "
                + month + " do " + year + " foi o seguinte: ");
        System.out.print("Numeros premiados: ");
        for (int number : winnerNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.print("Complementario:");
        System.out.println(winnerComplement);
        System.out.print("Reintegro:");
        System.out.println(refundNumber);
    }
    
    /**
     * Fai o sorteo, asignado valores aleatorios aos números premiados, o número
     * complementario e o reintegro
     */
    public void makeDraw() {
        // Contador da cantidade de números xerados
        int generatedNumbers = 0;
        // Xeramos números mentres non estean xerados todos os números e o
        // complementario
        while (generatedNumbers <= TOTAL_NUMBERS) {
            // Xeramos un número entre 1 e o máximo establecido na constante
            int generatedNumber = new java.util.Random().nextInt(MAX_NUMBER) + 1;
            // Comprobamos se o número non estea xa entre os números xerados
            boolean numberExists = false;
            for (int i = 0; (i < generatedNumbers) && (!numberExists); i++) {
                if (winnerNumbers[i] == generatedNumber) {
                    numberExists = true;
                }
            }
            // Se o número non foi xerado, gardámolo como número premiado ou
            // como complementario se é o último
            if (!numberExists) {
                if (generatedNumbers == TOTAL_NUMBERS) {
                    winnerComplement = generatedNumber;
                } else {
                    winnerNumbers[generatedNumbers] = generatedNumber;
                }
                // Incrementamos o contador de números xerados
                generatedNumbers++;
            }
        }
        // Xeramos o número do reintegro, entre 0 e o máximo establecido na
        // constante, ambos incluídos
        refundNumber = new java.util.Random().nextInt(MAX_REFUND_NUMBER + 1);
    }

    /**
     * Xenera un boleto da primitiva pedindo os datos do teclado
     *
     * @return Boleto da primitiva cos datos cubertos
     */
    public PrimitivaTicket generateTicket() {
        // Scanner para ler os datos do teclado
        Scanner scanner = new Scanner(System.in);
        // Creamos o array de números
        int numbers[] = new int[TOTAL_NUMBERS];
        // Pedimos por teclado os números do boleto
        for (int i = 0; i < TOTAL_NUMBERS; i++) {
            System.out.println("Introduce o teu número " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }
        // Pedimos por teclado o número de reintegro
        System.out.println("Introduce o reintegro:");
        int refund = scanner.nextInt();
        // Creamos o obxecto do boleto e devolvémolo no resultado
        return new PrimitivaTicket(numbers, refund);
    }

    
    /**
     * Mostra o premio para un boleto da primitiva
     *
     * @param ticket Boleto para o que queremos saber o premio
     */
    public void showPrize(PrimitivaTicket ticket) {
        // Variables para contar o número de acertos e se se acertou  o complementario
        int numHits = 0;
        boolean hitComplement = false;
        // Comprobamos se os números do boleto coinciden co complementario ou
        // con algún número dos premiados
        for (int number : ticket.getNumbers()) {
            if (number == winnerComplement) {
                hitComplement = true;
            } else {
                for (int winnerNumber : winnerNumbers) {
                    if (winnerNumber == number) {
                        numHits++;
                    }
                }
            }
        }
        // Mostramos o premio en función do número de acertos
        if (numHits == 6) {
            System.out.println("6 acertos. Premio de 500000€!");
        } else if (numHits == 5) {
            if (hitComplement) {
                System.out.println("5 acertos mais o complementario. Premio de 10000€!");
            } else {
                System.out.println("5 acertos. Premio de 500€!");
            }
        } else if ((numHits == 4) && (hitComplement)) {
            System.out.println("4 acertos mais o complementario. Premio de 20€!");
        } else if (ticket.getRefundNumber() == refundNumber) {
            System.out.println("Reintegro do boleto!");
        } else {
            System.out.println("O billete non ten premio");
        }
    }
    
    
    /**
     * Método principal que crea un sorteo e mostra por pantalla o resultado
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos o obxecto primitiva e establecemos os números premiados
        Primitiva primitiva = new Primitiva(21, 11, 2019);
        primitiva.makeDraw();
        // Mostramos o resultado do sorteo
        primitiva.showResult();
        

        primitiva.makeDraw();
        // Mostramos o resultado do sorteo
        primitiva.showResult();
        // Xeneramos un boleto
        PrimitivaTicket ticket = primitiva.generateTicket();
        // Mostramos o premio do boleto
        primitiva.showPrize(ticket);
    }
    
}
