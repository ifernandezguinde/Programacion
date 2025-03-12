/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorygame;

/**
 *
 * @author ivan.fernandezguinde
 */
public interface CardGenerator {
    
    Card[][] generateCards(int rows, int columns) throws GenerateCardsException;
}
