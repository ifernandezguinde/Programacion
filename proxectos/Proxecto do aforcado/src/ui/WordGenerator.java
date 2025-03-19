/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ui;

/**
 * Define unha interface WordGenerator.
 *
 * Declaración dun método abstracto: Nome: generateWord() Retorno: String → O
 * método debe devolver unha palabra. Excepción: Pode lanzar
 * GenerateWordException se ocorre un erro.
 *
 * "throws GenerateWordException" indica que este método pode xerar unha
 * excepción do tipo GenerateWordException. As clases que implementen
 * WordGenerator poden ter que manexar esta excepción se ocorre un erro ao xerar
 * a palabra.
 *
 * @author omar.gilgonzalez
 */
public interface WordGenerator {

    String generateWord() throws GenerateWordException;

}
