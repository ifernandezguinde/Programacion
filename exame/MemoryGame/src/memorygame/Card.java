package memorygame;

/**
 * Clase abstracta que implementa unha carta xenérica do xogo
 *
 * @author Profe de programación
 */
public abstract class Card {

    // Atributos protexidos, omítese o Javadoc
    protected String text;
    protected boolean hit;

    /**
     * Obtén o texto da carta
     *
     * @return Texto da carta
     */
    public String getText() {
        return text;
    }

    /**
     * Establece o texto da carta
     *
     * @param text Texto para a carta
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Obtén se a carta está acertada
     *
     * @return True se a carta está acertada, false se non
     */
    public boolean isHit() {
        return hit;
    }

    /**
     * Establecer se a carta está acertada
     *
     * @param hit True se a carta está acertada, false se non
     */
    public void setHit(boolean hit) {
        this.hit = hit;
    }

    /**
     * Crea unha nova carta
     *
     * @param text Texto da carta
     */
    public Card(String text) {
        this.text = text;
        // Por defecto, a carta non está acertada
        this.hit = false;
    }

    /**
     * Indica se a carta recibida como parámetro é a parella desta carta
     *
     * @param c Carta da que se quere saber se é parella a carta actual
     * @return true se as dúas cartas son parella, false se non o son
     */
    public abstract boolean isEquals(Card c);

}
