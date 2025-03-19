/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import model.HangMan;
import java.util.Scanner;

/**
 * Esta clase encárgase de mostrar os menús coas distintas opcións do xogo, e
 * recoller o que introduza o usuario.
 *
 * Terá un atributo "hangMan" que será un obxecto da clase HangMan que
 * xestionará o funcionamento da partida actual.
 *
 * Incluirá os seguintes métodos:
 *
 * private String showInitMenu(): Mostra o menú inicial que permite xerar a
 * palabra a adiviñar. Inicialmente simplemente creará un obxecto da clase
 * "WordGenerator" para invocar o método "generateWord"()". Máis adiante cando
 * se permitan distintos modos de xogo preguntará que modo se quere utilizar e
 * empregará unha clase ou outra para xerar a palabra. private void
 * showGameMenu(): Mostra o menú do xogo, que vai pedindo as letras e mostrando
 * o avance de fallos e acertos na palabra. O xogo remata cando se acertan todas
 * as letras da palabra ou se chega ao límite de fallos. private boolean
 * showExitMenu(): Pregunta ao usuario se quere xogar outra partida ou saír da
 * aplicación. Devolve true se o usuario quere saír da aplicación, e false en
 * caso contrario.
 *
 * Nesta clase incluiremos o método principal que executa o programa. A modo de
 * exemplo, o código deste método podería ser como o que se mostra a
 * continuación:
 *
 * public static void main(String[] args) { MenuGenerator menuGenerator = new
 * MenuGenerator();
 *
 * do { menuGenerator.hangMan = new HangMan(menuGenerator.showInitMenu());
 * menuGenerator.showGameMenu(); } while (!menuGenerator.showExitMenu()); }
 *
 * @author omar.gilgonzalez
 */
public class MenuGenerator {

    /**
     * private HangMan hangMan;:
     *
     * Este atributo almacena unha instancia da clase HangMan, que é responsable
     * xestionar a lóxica do xogo, como comprobar a corrección e fallos, e o
     * estado do xogo.
     *
     * private final Scanner scan;:
     *
     * Este obxecto úsase para ler a entrada do usuario. É un Instancia do
     * escáner que se inicializa no construtor e que se usa para capturar as
     * letras que introduce o xogador.
     */
    private HangMan hangMan;
    private final Scanner scan;

    /**
     * O construtor da clase MenuGenerator simplemente inicializa o Escáner para
     * ler a entrada do usuario desde a consola. É un práctica común para
     * inicializar os recursos que se utilizarán ao longo do clase dentro do
     * construtor.
     */
    public MenuGenerator() {
        this.scan = new Scanner(System.in);
    }

    /**
     * Este método mostra o menú inicial e xera a palabra que o xogador terás
     * que adiviñar.
     *
     * Operación: imprímese unha mensaxe de benvida co nome do xogo: "MOSTRAR".
     * A continuación, imprímese a mensaxe "Cargando palabra...". para simular o
     * proceso de selección de palabras. Créase unha instancia da clase
     * WordGenerator e chámase ao seu método generateWord(), * devolve unha
     * palabra aleatoria. Finalmente, imprime "¡Listo!" e devolve a palabra
     * xerada para ser usada no xogo.
     *
     * Devolve: a palabra xerada como un String.
     *
     * @return
     */
    private String showInitMenu() throws GenerateWordException {
        System.out.println("AFORCADO");
        System.out.println("Escolla o modo de xogo:");
        System.out.println("1. Xogador vs Computador");
        System.out.println("2. Xogador vs Xogador");

        int option;
        while (true) {
            try {
                System.out.print("Opción: ");
                option = Integer.parseInt(scan.nextLine());
                if (option == 1 || option == 2) {
                    break;
                }
                System.out.println("Entrada non válida. Escolle 1 ou 2.");
            } catch (NumberFormatException e) {
                System.out.println("Entrada non válida. Introduce un número.");
            }
        }

        WordGenerator wordGenerator = (option == 1) ? new ArrayWordGenerator() : new KeyboardWordGenerator();
        System.out.println("Cargando palabra...");
        String wordGenerated = wordGenerator.generateWord();
        System.out.println("Listo!");
        return wordGenerated;
    }

    /**
     * Este método xestiona a interacción co xogador durante a partida do
     * Aforcado. * Funcionamento: Iníciase un bucle `while
     * (!hangMan.isGameOver())`, que se executa mentres o xogo non remate (é
     * dicir, mentres `isGameOver()` da clase `HangMan` devolva `false`). En
     * cada iteración do bucle: * Imprímese a palabra oculta cos caracteres
     * acertados ata o momento (`hangMan.showHiddenWord()`). Imprímese a
     * cantidade de fallos que o xogador cometeu (`hangMan.getStringFails()`).
     * Solicítase ao xogador que introduza unha letra a través de
     * `System.out.print("Escribe unha letra: ")`. Valídase que a entrada sexa
     * correcta: se o xogador non introduce unha única letra ou a entrada está
     * baleira, móstrase unha mensaxe de erro. Se a entrada é válida: Extráese a
     * primeira letra da entrada e chámaselle ao método
     * `hangMan.tryChar(guessedChar)` da clase `HangMan`, que procesa o intento
     * de adiviñar a letra. Compara o estado da palabra antes e despois de
     * intentar adiviñar a letra: Se o estado da palabra cambiou (é dicir, a
     * letra estaba na palabra), imprímese unha mensaxe indicando que a letra
     * foi acertada. Se non cambiou, imprímese unha mensaxe dicindo que a letra
     * non está na palabra. * Cando o xogo remata (xa sexa por gañar ou perder),
     * verifícase se o número de fallos excedeu o límite
     * (`hangMan.maxFailsExceeded()`): Se o xogador perdeu, móstrase unha
     * mensaxe indicando que perdeu e revélase a palabra completa. Se o xogador
     * gañou, móstrase unha mensaxe de felicitación e revélase a palabra.
     *
     * No ten valor de retorno.
     */
    private void showGameMenu() {
        Scanner scan = new Scanner(System.in);
        while (!hangMan.isGameOver()) {
            System.out.println("Palabra: " + hangMan.showHiddenWord());
            System.out.println("Fallos: " + hangMan.getStringFails());
            System.out.print("Escribe unha letra: ");

            String inputLetter = scan.nextLine().trim();
            if (inputLetter.isEmpty() || inputLetter.length() > 1) {
                System.out.println("Por favor, escribe unha soa letra.");
            } else {
                char guessedChar = inputLetter.charAt(0);
                String previousState = hangMan.showHiddenWord();
                hangMan.tryChar(guessedChar);
                String currentState = hangMan.showHiddenWord();

                if (!previousState.equals(currentState)) {
                    System.out.println("Ben! A letra está na palabra.");
                } else {
                    System.out.println("Alaaa! Esa letra non está.");
                }
            }
        }

        if (hangMan.maxFailsExceeded()) {
            System.out.println("Perdiches! A palabra era: " + hangMan.showFullWord());
        } else {
            System.out.println("Parabéns! Adiviñaches a palabra: " + hangMan.showFullWord());
        }
    }

    /**
     * Este método pregunta ao xogador se desexa xogar outra partida ou saír do
     * xogo.
     *
     * Funcionamento: Imprímese a pregunta "¿Queres xogar outra partida? (S/N)".
     * Logo, iníciase un bucle while (true) que continuará pedindo a entrada do
     * xogador ata que reciba unha resposta válida. Se o xogador introduce "S"
     * ou "s", o método devolve false, indicando que desexa xogar outra partida.
     * Se o xogador introduce "N" ou "n", o método devolve true, indicando que
     * desexa saír do xogo. Se o xogador introduce calquera outra cousa,
     * móstrase unha mensaxe de erro pedindo que introduza 'S' ou 'N'.
     *
     * Devolve: true se o xogador quere saír do xogo. false se o xogador desexa
     * continuar xogando outra partida.
     *
     * main(String[] args)
     *
     * @return
     */
    private boolean showExitMenu() {
        System.out.println("¿Queres xogar outra partida? (S/N)");
        while (true) {
            String input = scan.nextLine().trim();
            if (input.equals("S") || input.equals("s")) {
                return false; // Jugar otra vez
            } else if (input.equals("N") || input.equals("n")) {
                return true;  // Salir del juego
            } else {
                System.out.println("Entrada non válida. Por favor, escribe 'S' ou 'N'.");
            }
        }
    }

    /**
     * Este é o método principal que executa o programa. Controla o fluxo
     *
     * do xogo e os menús.
     *
     * Funcionamento: Créase unha instancia de MenuGenerator. Introdúcese nun
     * bucle do-while, o que permite executar o ciclo de xogo polo menos unha
     * vez e repetir o proceso se o xogador decide xogar outra vez: Primeiro,
     * chámaselle a showInitMenu() para xerar unha palabra aleatoria. Logo,
     * créase unha nova instancia de HangMan coa palabra xerada. Despois,
     * chámaselle a showGameMenu() para xestionar a partida. Ao rematar cada
     * partida, chámaselle a showExitMenu() para preguntar ao xogador se desexa
     * xogar outra partida ou saír. O bucle remata cando showExitMenu() devolve
     * true, indicando que o xogador escolleu saír do xogo. Finalmente, péchase
     * o recurso scan con menuGenerator.scan.close(); para liberar os recursos
     * asociados ao obxecto Scanner.
     *
     * @param args
     */
    public static void main(String[] args) {
        MenuGenerator menuGenerator = new MenuGenerator();

        do {
            try {
                String word = menuGenerator.showInitMenu();
                menuGenerator.hangMan = new HangMan(word);
                menuGenerator.showGameMenu();
            } catch (GenerateWordException e) {
                if (e.isVisible()) {
                    System.out.println("Erro: " + e.getMessage());
                } else {
                    System.out.println("Produciuse un erro ao xerar a palabra.");
                }
            }
        } while (!menuGenerator.showExitMenu());

        menuGenerator.scan.close();
    }
}
