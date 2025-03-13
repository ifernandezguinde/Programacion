/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorygame;

/**
 *
 * @author ivan.fernandezguinde
 */
public class ArrayCardGenerator implements CardGenerator {
    
    // Arrays coa información para as cartas
    private static final String[] words = new String[]{"Elefante", "Pataca", "Pera"};
    private static final int[] operators1 = new int[]{3, 5, 6};
    private static final int[] operators2 = new int[]{9, 2, 3};
    private static final char[] operations = new char[]{MathCard.SUM, MathCard.MULT, MathCard.SUB};


    @Override
    /**
     * 
     */
    public Card[][] generateCards(int rows, int columns) throws GenerateCardsException {
        if((rows*columns) > 12){
            throw new GenerateCardsException("Se queres tantas cartas, debes mercar a versión PRO");
        } else {
            Card[][] cards = new Card[rows][columns];
            // numero de pares de cartas a crear
            int totalPairs = (rows * columns) / 2;
            
            // creamos os arrays de pares de TextCard necesarios
            for (int i = 0; i < totalPairs; i++) {
                Card[] cardPair;
                if(i < totalPairs/2) {
                    // creamos dous pares de cartas de texto
                    cardPair = new Card[]{ new TextCard(words[i]), 
                        new TextCard(words[i])
                    };
                } else {
                    // creamos o resto como MathCard
                    int num1 = operators1[i-totalPairs/2];
                    int num2 = operators2[i-totalPairs/2];
                    char operation = operations[i-totalPairs/2];  

                    // creamos a carta ca operación
                    MathCard operationCard = new MathCard(num1, num2, operation, 0);
                    // creamos a carta co resultado
                    MathCard resultCard = new MathCard(num1, num2, operation, 1);

                    // metémolas no array
                    cardPair = new Card[]{operationCard, resultCard};
                }
                this.insertPair(cardPair, cards, rows, columns);
            }
            return cards;
        }
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
