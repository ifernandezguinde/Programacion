/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

/**
 *
 * @author omar.gilgonzalez
 */
public class GenerateWordException extends Exception {
    private final boolean visible;

    public GenerateWordException(String message, boolean visible) {
        super(message);
        this.visible = true;
    }

    public boolean isVisible() {
        return visible;
    }
}

