/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxecto.pkgdo.aforcado;

import java.util.ArrayList;

/**
 * Esta clase implementa todo o estado dunha partida ao aforcado. Manterá unha
 * referencia a un obxecto da clase HiddenWord coa palabra oculta a adiviñar, e
 * tamén irá almacenando as letras introducidas polo usuario que non estean na
 * palabra, para irllas mostrando e que non as introduza de novo.
 *
 * Neste clase almacenaremos nunha constante "MAX_FAILS" o número máximo de
 * fallos que pode cometer o xogador antes de darlle a partida por perdida (por
 * defecto serán seis). Ademais terá os seguintes atributos:
 *
 * hiddenWord: obxecto da clase HiddenWord coa palabra a adiviñar no xogo.
 * fails: ArrayList de caracteres no que se van almacenando as letras
 * introducidas polo usuario que non están na palabra oculta.
 *
 * O construtor da clase recibirá como parámetro un String que conteña a palabra
 * a adiviñar, e creará o obxecto "hiddenWord" con esa palabra.
 *
 * Incluirá os seguintes métodos:
 *
 * public ArrayList<Character> getFails(): Obtén a lista de caracteres fallados
 * acumulados na partida. public String getStringFails(): Obtén un String coa
 * lista de caracteres fallados acumulados, separados por espazos en branco.
 * public String showHiddenWord(): Devolve a palabra oculta pero poñendo un
 * guión nas letras non acertadas. public String showFullWord(): Devolve a
 * palabra oculta mostrando todas as súas letras. public void tryChar(char c):
 * Proba a ver se o caracter indicado forma parte da palabra oculta. Se está,
 * márcanse todas as súas aparicións como letras acertadas; se non está engádese
 * o caracter na lista de fallos acumulados na partida. public boolean
 * isGameOver(): Comproba se rematou a partida, ben porque se chegou ao límite
 * de fallos ou ben porque se adiviñou toda a palabra oculta. public boolean
 * maxFailsExceeded(): Comproba se se chegou ao límite de fallos permitidos.
 * Permitiranos saber se usuario gañou ou perdeu a partida.
 *
 * @author omar.gilgonzalez
 */
public class HangMan {

    /**
     * Definimos 3 atributos:
     *
     * Creamos a constante "MAX_FAILS" que representa o número máximo de
     * intentos fallidos permitidos no xogo (6 por defecto).
     *
     * Creamos un obxeto da clase HiddenWord que contén a palabra oculta que se
     * debe adiviñar, e xestiona as letras descubertas e ocultas na palabra.
     *
     * Creamos un ArrayList que almacena as letras que se intentaron adiviñar,
     * pero non están na palabra. Úsase para mostrar as letras que xa se
     * intentaron e non eran válidas.
     */
    private static final int MAX_FAILS = 6;
    private final HiddenWord hiddenWord;
    private final ArrayList<Character> fails = new ArrayList<>();

    /**
     * Construtor que inicializa a partida, e crea un novo obxecto HiddenWord
     * coa palabra proporcionada como parámetro. Inicializa a lista de fallos
     * como vacía.
     *
     * @param guessWord
     */
    public HangMan(String guessWord) {
        this.hiddenWord = new HiddenWord(guessWord);
    }

    /**
     * Método que devolve unha copia da lista de fallos. Devolve unha nova
     * ArrayList (fails) para protexer a outra ArrayList de modificacións
     * externas (encapsulación).
     *
     *
     * @return
     */
    public ArrayList<Character> getFails() {
        return new ArrayList<>(fails);
    }

    /**
     * Método que devolve un String coas letras fallidas separadas por espacios.
     *
     * Itera sobre a ArrayList (fails) empregando un bucle for, concatenando
     * cada letra fallida seguida dun espacio. Ao fianl devolve o String
     * resultante.
     *
     * @return
     */
    public String getStringFails() {
        String stringFails = "";
        for (char fail : fails) {
            stringFails += fail + " ";
        }
        return stringFails;
    }

    /**
     * Método que devolve a palabra oculta con guións nas posicións das letras
     * non acertadas.
     *
     * Chama ó método show() da clase HiddenWord. O formato exacto depende da
     * implementación de HiddenWord.
     *
     * @return
     */
    public String showHiddenWord() {
        return hiddenWord.show();
    }

    /**
     * Método que devolve a palabra completa, sen importar se as letras xa foron
     * adiviñadas.
     *
     * Chama ao método showFullWord() da clase HiddenWord.
     *
     * @return
     */
    public String showFullWord() {
        return hiddenWord.showFullWord();
    }

    /**
     * Método que xestiona o intento do xogador ó adiviñar un caracter.
     *
     * Chama a hiddenWord.checkChar(c) para verificar se o caracter está na
     * palabra oculta. Se está, HiddenWord marca todas as aparicións dese
     * caracter com descubertas; se non está, verifica se o caracter non está xa
     * na lista fails (!fails.contains(c)). Se non está, engádeo á lista de
     * fallos (fails.add(c)).
     *
     * @param c
     */
    public void tryChar(char c) {
        if (!hiddenWord.checkChar(c)) {
            if (!fails.contains(c)) {
                fails.add(c);
            }
        }
    }

    /**
     * Método que verifica se xa rematou a partida.
     *
     * Devolve true se se alzanzou o número máximo de fallos
     * (maxFailsExceeded()) ou se todas as letras da palabra oculta xa foron
     * descubertas (hiddenWord.isVisible()).
     *
     * @return
     */
    public boolean isGameOver() {
        return maxFailsExceeded() || hiddenWord.isVisible();
    }

    /**
     * Método que comproba se o xogador xa esgotou os intentos permitidos.
     *
     * Devolve true se o tamaño da lista fails (fails.size()) e maior ou igual a
     * MAX_FAILS.
     *
     * @return
     */
    public boolean maxFailsExceeded() {
        return fails.size() >= MAX_FAILS;
    }
}
