/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.util.Scanner;

/**
 * A clase KeyboardWordGenerator implementa a interface WordGenerator e
 * encárgase de pedir unha palabra ao usuario a través do teclado.
 * 
 * KeyboardWordGenerator pide unha palabra ao usuario polo teclado.
 * Usa System.console().readPassword() se hai unha consola real dispoñible.
 * Se System.console() é null, usa Scanner para ler a palabra.
 * Implementa WordGenerator e pode lanzar GenerateWordException.

🔹 Se System.console() está dispoñible → A palabra ocúltase ao escribila.
🔹 Se System.console() é null → A palabra móstrase ao escribila.
 *
 * @author omar.gilgonzalez
 */
public class KeyboardWordGenerator implements WordGenerator {

    /**
     * Método que implementa o método generateWord() da interface WordGenerator.
     * Retorna unha palabra (String) introducida polo usuario. Pode lanzar unha
     * excepción personalizada GenerateWordException se ocorre un erro.
     *
     * System.console(): Obtén a consola do sistema. Se non é null, significa
     * que o programa se está executando nun entorno con consola real (por
     * exemplo, en Linux ou en Windows PowerShell). Usa readPassword() para ler
     * a entrada sen mostrárllela ao usuario. new
     * String(System.console().readPassword()): Convértese a entrada nunha cadea
     * de texto (String).
     *
     * Se System.console() non está dispoñible, usa Scanner para ler a entrada.
     * scanner.next();
     *
     * Le a seguinte palabra que o usuario introduce. Se o usuario introduce
     * varias palabras, só colle a primeira.
     *
     * Devolve a palabra introducida polo usuario.
     *
     * @return
     * @throws GenerateWordException
     */
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
