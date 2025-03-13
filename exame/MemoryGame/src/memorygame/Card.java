/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package memorygame;

/**
 *
 * @author ivan.fernandezguinde
 */
public abstract class Card {
    protected String text;
    protected boolean hit = false;     
        

    /**
     * constructor da clase que inicializa o valor text
     * @param word
     */
    public Card(String word) {
        text = word;
    }

    /**
     * devolve o valor de text
     * @return 
     */
    public String getText() {
        return text;
    }

    /**
     * modifica o valor de text
     * @param text 
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * devolve o valor de hit
     * @return 
     */
    public boolean isHit() {
        return hit;
    }

    /**
     * modifica o valor de hit
     * @param hit 
     */
    public void setHit(boolean hit) {
        this.hit = hit;
    }

    /**
     * comproba se as cartas fan match
     * @param card
     * @return 
     */
    public abstract boolean isEquals(String card);
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
    }
}
