package memorygame;

/**
 * Clase que implementa unha carta de texto
 *
 * @author Profe de programación
 */
public class TextCard extends Card {

    /**
     * Crea unha carta de texto
     *
     * @param text Texto da carta
     */
    public TextCard(String text) {
        super(text);
    }

    /**
     * Indica se a carta recibida como parámetro é a parella desta carta
     *
     * @param c Carta da que se quere saber se é parella a carta actual
     * @return true se o texto da carta recibido coincide co texto da carta,
     * false se non
     */
    @Override
    public boolean isEquals(Card c) {
        return c.getText().equals(text);
    }

}
