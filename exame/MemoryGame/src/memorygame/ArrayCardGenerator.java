package memorygame;

/**
 * Clase que xera as cartas a partir da información duns arrays estáticos
 *
 * @author Profe de programación
 */
public class ArrayCardGenerator implements CardGenerator {

    // Arrays coa información para as cartas
    private static final String[] words = new String[]{"Elefante", "Pataca", "Pera"};
    private static final int[] operators1 = new int[]{3, 5, 6};
    private static final int[] operators2 = new int[]{9, 2, 3};
    private static final char[] operations = new char[]{MathCard.SUM, MathCard.MULT, MathCard.SUB};

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
    @Override
    public Card[][] generateCards(int rows, int columns)
            throws GenerateCardsException {

        // Se o número de cartas que nos piden é maior que 12 xeramos unha
        // excepción, porque non podemos xerar máis de 12 cartas
        if (rows * columns > 12) {
            throw new GenerateCardsException("Se queres tantas cartas, debes mercar a versión PRO");
        }

        // Creamos o array bidimensional de cartas
        Card[][] cards = new Card[rows][columns];

        // Cubrimos o array colocando pares de cartas de forma aleatoria
        int numPairs = rows * columns / 2;
        for (int i = 0; i < numPairs; i++) {
            // Creamos un array con dúas cartas
            Card[] cardPair = new Card[2];
            // Se estamos na primeira metade, xeramos un par de cartas de texto
            // Se estamos na segunda metade, xeramos un par de cartas matemáticas
            if (i < numPairs / 2) {
                cardPair[0] = new TextCard(words[i]);
                cardPair[1] = cardPair[0];
            } else {
                int index = i - numPairs / 2;
                cardPair[0] = new MathCard(operators1[index], operators2[index],
                        operations[index], MathCard.OPERATION);
                cardPair[1] = new MathCard(operators1[index], operators2[index],
                        operations[index], MathCard.RESULT);
            }
            // Insertamos o par de cartas aleatoriamente no array de columnas
            insertPair(cardPair, cards, rows, columns);
        }
        // Devolvemos o array de cartas
        return cards;
    }

    /**
     * Inserta un array de duas cartas aleatoriamente nun array bidimensional de
     * cartas que ten o número de filas e de columnas indicado
     *
     * @param cardPair Array con dúas cartas
     * @param cards Array bidimensional no que se queren colocar as cartas
     * @param rows Número de filas
     * @param columns Número de columnas
     */
    private void insertPair(Card[] cardPair, Card[][] cards,
            int rows, int columns) {
        // Recorremos o array co par de cartas para colocar as dúas cartas
        for (int i = 0; i < 2; i++) {
            boolean cardInserted = false;
            do {
                // Xeramos aleatoriamente unha fila e unha columna para colocar
                // a carta
                int row = new java.util.Random().nextInt(rows);
                int column = new java.util.Random().nextInt(columns);
                // Se na posición xerada non hai ningunha carta, colocamos
                // a carta nesa posición e marcamos que está insertada
                if (cards[row][column] == null) {
                    cards[row][column] = cardPair[i];
                    cardInserted = true;
                }
            } while (!cardInserted);
        }
    }

}
