/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

/**
 * GenerateWordException é unha excepción personalizada. Permite almacenar unha
 * mensaxe de erro e se debe mostrarse (visible). O método isVisible() indica se
 * o erro se debe amosar. Úsase para controlar erros na xeración de palabras no
 * xogo.
 *
 * @author omar.gilgonzalez
 */
public class GenerateWordException extends Exception {

    /**
     * Declara unha variable visible de tipo boolean. É private, polo que só se
     * pode acceder a ela dentro desta clase.
     */
    private final boolean visible;

    /**
     * Método que recibe dous parámetros:
     *
     * message: unha cadea de texto (String) que contén a mensaxe de erro.
     * visible: un booleano que indica se a excepción debe ser "visible".
     *
     * super(message);
     *
     * Chama ao constructor da clase Exception, pasando a mensaxe de erro. Isto
     * fai que a excepción almacene a mensaxe e poida ser recuperada máis tarde
     * usando getMessage().
     *
     * Garda o valor de visible.
     *
     * @param message
     * @param visible
     */
    public GenerateWordException(String message, boolean visible) {
        super(message);
        this.visible = visible;
    }

    /**
     * Método que devolve o valor da variable visible. Como visible é private,
     * outras clases non poden acceder directamente a el.
     *
     * @return
     */
    public boolean isVisible() {
        return visible;
    }
}
