/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxecto.pkgdo.aforcado;

/**
 * Esta clase implementa a palabra a adiviñar coa que traballaremos no xogo, e
 * resolverá todo o traballo de manter as letras acertadas, mostrar a palabra
 * ocultando as letras non acertadas, e comprobar se unha letra forma parte da
 * palabra. Terá dous atributos:
 *
 * characters: É un array de caracteres que almacena os caracteres da palabra.
 * hits: É un array de booleans que marcarán con true aqueles caracteres da
 * palabra que están acertados e con false os que aínda non o están. Terá tantos
 * elementos como o array characters.
 *
 * O construtor da clase recibirá como parámetro un String que conteña a palabra
 * a adiviñar, e inicializará estes dous arrays: O array characters cos
 * caracteres do String (pódese utilizar o método "toCharArray()" do String) e o
 * de hits co mesmo número de elementos todos co valor false.
 *
 * Incluirá os seguintes métodos:
 *
 * public boolean checkChar(char c): Comproba se un caracter aparece na lista de
 * caracteres da palabra, marcando todas as aparicións dese caracter como
 * acertadas. Se o caracter aparece na palabra devolve true, se non devolve
 * false. public String show(): Devolve a palabra substituíndo os caracteres non
 * acertados por guións. public String showFullWord(): Devolve a palabra
 * completa, incluíndo os caracteres non acertados. Este método o usaremos para
 * mostrar ao usuario ao final do xogo, se perde, cal era a palabra oculta.
 * public boolean isVisible(): Indica se a palabra é totalmente visible, é
 * dicir, se todos os caracteres están xa acertados. Este método permitiranos
 * saber se o usuario adiviñou a palabra e polo tanto gañou a a partida.
 *
 * @author omar.gilgonzalez
 */
public class HiddenWord {

    /**
     * characters: Array de caracteres (char[]) que almacena os caracteres da
     * palabra oculta, e representa a palabra que o xogador debe adiviñar.
     *
     * hits: Array de booleanos (boolean[]) que indica qué caracteres da palabra
     * xa foron adiviñados correctamente. Cada índice corresponde ó mesmo índice
     * en "characters". Se hits[i] é true, significa que o carácter en
     * "characters[i] foi descuberto.
     */
    private char[] characters;
    private boolean[] hits;

    /**
     * Construtor da clase HiddenWord. Inicializa os atributos da clase a partir
     * da palabra proporcionada.
     *
     * Converte o String recibido (guessWord) nun array de caracteres empregando
     * o método toCharArray() e asígnao a "characters". Inicializa hits como un
     * array co mesmo tamaño que "characters", onde todos os valores iniciales
     * son false (é dicir, ningunha letra está descuberta ó inicio do xogo).
     *
     * @param guessWord
     */
    public HiddenWord(String guessWord) {
        this.characters = guessWord.toCharArray();
        this.hits = new boolean[characters.length];
    }

    /**
     * checkChar(char c)
     *
     * Descrición: Comproba se un carácter aparece na palabra oculta e marca
     * todas as súas aparicións como descubertas.
     *
     * Detalles: Declara unha variable foundLetter inicializada como false. Esta
     * variable usarase para rexistrar se o carácter c aparece na palabra.
     *
     * Recorre o array characters cun bucle for: - Se characters[i] == c, marca
     * hits[i] = true para indicar que esta posición foi adiviñada. - Cambia
     * foundLetter a true para indicar que o carácter se atopou polo menos unha
     * vez.
     *
     * Ao final, devolve o valor de foundLetter.
     *
     * Resultado: - Devolve true se o carácter está na palabra, false en caso
     * contrario. - Marca todas as posicións onde aparece o carácter como
     * descubertas.
     *
     * @param c
     * @return
     */
    public boolean checkChar(char c) {
        boolean foundLetter = false;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == c) {
                hits[i] = true;
                foundLetter = true;
            }
        }
        return foundLetter;
    }

    /**
     * Descrición: Devolve a palabra con guións nas posicións das letras non
     * acertadas e mostra as letras descubertas.
     *
     * Detalles: Declara unha variable slash como un String baleiro para
     * construir a palabra mostrada.
     *
     * Recorre o array characters cun bucle for: - Se hits[i] é true, concatena
     * o carácter en characters[i] a slash. - Se hits[i] é false, concatena un
     * guión ("-") a slash.
     *
     * Devolve o String resultante.
     *
     * Exemplo de saída:
     *
     * Se a palabra é "java", con hits = [true, false, false, true], o método
     * devolvería "j--a".
     *
     * @return
     */
    public String show() {
        String slash = "";
        for (int i = 0; i < characters.length; i++) {
            if (hits[i]) {
                slash += characters[i];
            } else {
                slash += "-";

            }
        }
        return slash;
    }

    /**
     * showFullWord()
     *
     * Descrición: Devolve a palabra completa, sen ocultar ningún carácter.
     *
     * Detalles: Convértese o array characters directamente nun String
     * utilizando o constructor `new String(characters)`. Isto usase para
     * mostrar a palabra completa ao final do xogo, cando o xogador perde.
     *
     * @return
     */
    public String showFullWord() {
        return new String(characters);

    }

    /**
     ** Descrición: Indica se todos os caracteres da palabra foron descubertos.
     *
     * Detalles: Recorre o array hits cun bucle for-each. Se atopa algún valor
     * false, devolve false de inmediato, xa que hai polo menos un carácter non
     * adiviñado. Se non atopa ningún false, devolve true, indicando que todos
     * os caracteres están descubertos.
     *
     * Resultado: - true se todos os caracteres foron adiviñados. - false se
     * polo menos un segue oculto.      *
     *
     * @return
     */
    public boolean isVisible() {
        for (boolean hit : hits) {
            if (!hit) {
                return false;
            }
        }

        return true;

    }
}
