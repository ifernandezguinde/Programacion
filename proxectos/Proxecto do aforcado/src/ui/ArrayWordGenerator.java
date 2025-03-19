/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.util.Random;

/**
 * Esta clase encárgase de xerar a palabra a adiviñar. Polo momento, simplemente
 * mantén unha lista de palabras nun array e escolle unha aleatoriamente. Máis
 * adiante estenderemos esta clase para permitir distintos modos de xogo, que
 * xerarán a palabra de diferentes maneiras.
 *
 * Almacenaremos nunha constante "WORDLIST" que será un array de Strings, a
 * lista de palabras posibles entre as que escoller a palabra oculta.
 *
 * Só incluirá o seguinte método:
 *
 * public String generateWord(): Devolve a palabra a adiviñar. Neste caso, o que
 * fará xerar un número aleatorio entre 0 e menor que a lonxitude do array, e
 * devolver o elemento do array que estea nesa posición.
 *
 * @author omar.gilgonzalez
 */
public class ArrayWordGenerator implements WordGenerator {

    /**
     * WORDLIST:
     *
     * * É unha constante (static final) que contén un array de palabras de
     * tipo String. Representa a lista de palabras posibles entre as cales se
     * seleccionará aleatoriamente a palabra para adiviñar.
     *
     * Ao ser static, o array está asociado á clase e non ás instancias
     * individuais. Ao ser final, non se pode reasignar a outro array, aínda que
     * os elementos dentro do array poden modificarse (aínda que isto non se fai
     * aquí). *
     */
    private static final String[] WORDLIST = {"videojuego", "manga", "smartphone"
    };

    /**
     * Descrición: Selecciona unha palabra de WORDLIST de forma aleatoria e a
     * devolve.
     *
     * Detalles:
     *
     * - Xerar un número aleatorio: Créase un obxecto da clase `Random`, que se
     * usa para xerar números pseudoaleatorios. O método
     * `random.nextInt(WORDLIST.length)` xera un número enteiro aleatorio entre
     * 0 (inclusive) e o tamaño do array `WORDLIST` (exclusivo).
     *
     * - Seleccionar unha palabra: Utilízase este número aleatorio como índice
     * para acceder a un elemento do array `WORDLIST`. Devolve a palabra naquela
     * posición. *
     *
     * @return
     */
    @Override
    public String generateWord() throws GenerateWordException {
        Random random = new Random();
        return WORDLIST[random.nextInt(WORDLIST.length)];
    }
}
