package memorygame;

/**
 * Interface para as clases que xeran as cartas para o xogo
 *
 * @author Profe de programación
 */
public interface CardGenerator {

    /**
     * Método que xera aleatoriamente un array bidimensional de cartas coas
     * filas e columnas indicadas como parámetro
     *
     * @param rows Número de filas para a matriz de cartas
     * @param columns Número de columnas para a matriz de cartas
     * @return Array bidimensional coas cartas xeradas de forma aleatoria
     * @throws GenerateCardsException Arróxase se non se pode xerar a matriz co
     * número de filas e columnas indicadas
     */
    public Card[][] generateCards(int rows, int columns)
            throws GenerateCardsException;
}
