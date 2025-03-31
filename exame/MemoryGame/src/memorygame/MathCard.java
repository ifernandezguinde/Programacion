package memorygame;

/**
 * Clase que implementa unha carta matemática
 *
 * @author Profe de programación
 */
public class MathCard extends Card {

    /**
     * Constante para unha operación de suma
     */
    public final static char SUM = '+';

    /**
     * Constante para unha operación de resta
     */
    public final static char SUB = '-';

    /**
     * Constante para unha operación de multiplicación
     */
    public final static char MULT = '*';

    /**
     * Constante para unha carta de tipo operación
     */
    public final static int OPERATION = 0;

    /**
     * Constante para unha carta de tipo resultado
     */
    public final static int RESULT = 1;

    // Atributos privados da carta, cos operandos e a operación da carta
    private int operator1, operator2;
    private char operation;

    /**
     * Crea unha carta de tipo matemático
     *
     * @param operator1 Primeiro operando da operación
     * @param operator2 Segundo operando da operación
     * @param operation Tipo de operación (SUM, SUB ou MULT)
     * @param cardType Tipo de carta (OPERATION ou RESULT)
     */
    public MathCard(int operator1, int operator2, char operation, int cardType) {
        // Invocamos o construtor da superclase cun texto en branco
        super("");

        // Inicializamos os atributos
        this.operator1 = operator1;
        this.operator2 = operator2;
        this.operation = operation;

        // Establecemos o valor do texto da carte dependendo de se a carta é
        // de operación ou de resultado
        if (cardType == OPERATION) {
            text = Integer.toString(operator1) + operation
                    + Integer.toString(operator2);
        } else {
            text = Integer.toString(getValue());
        }
    }

    /**
     * Obtén o valor da operación matemática da carta
     *
     * @return Valor do resultado da operación matemática da carta
     */
    public int getValue() {
        int value;
        switch (operation) {
            case SUM:
                value = operator1 + operator2;
                break;
            case SUB:
                value = operator1 - operator2;
                break;
            default:
                value = operator1 * operator2;
                break;
        }
        return value;
    }

    /**
     * Indica se a carta recibida como parámetro é a parella desta carta
     *
     * @param c Carta da que se quere saber se é parella a carta actual
     * @return true se a carta tamén é matemática e ten o mesmo valor que a
     * carta actual, false se non é así
     */
    @Override
    public boolean isEquals(Card c) {
        if (c instanceof MathCard) {
            return (getValue() == ((MathCard) c).getValue());
        }
        return false;
    }

}
