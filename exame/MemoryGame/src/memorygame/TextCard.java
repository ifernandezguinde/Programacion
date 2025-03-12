/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorygame;

/**
 *
 * @author ivan.fernandezguinde
 */
public class TextCard extends Card{

    /**
     * constructor da clase que recibe o valor do texto da carta
     * e invoca o constructor da superclase
     * @param word 
     */
    public TextCard(String word) {
        super(word);
    }

    @Override
    /**
     * comproba se o texto das cartas é igual
     */
    public boolean isEquals(String card) {
        if(card == text) {
            return true;
        }
        return false;       
    }
    
}
