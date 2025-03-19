/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.util.Scanner;

/**
 *
 * @author omar.gilgonzalez
 */
public class KeyboardWordGenerator implements WordGenerator {

    @Override
    public String generateWord() throws GenerateWordException {
        System.out.print("Introduce a palabra a adiviñar: ");
        String word;

        if (System.console() != null) {
            word = new String(System.console().readPassword());
        } else {
            Scanner scanner = new Scanner(System.in);
            word = scanner.next();
        }

        return word;
    }
}
