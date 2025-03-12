/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorygame;

/**
 *
 * @author ivan.fernandezguinde
 */
public class MathCard extends Card{
    
    // constantes para as operacións
    public static String SUM = "+";
    public static String SUB = "-";
    public static String MULT = "*";
    // constantes para o tipo de carta
    public static int OPERATIONTYPE = 0;
    public static int RESULTYPE = 1;
    
    private int operator1, operator2;
    private String operation;
    private int cardType;
    
    

    /**
     * constructor da clase que asigna valores as variables en función dos 
     * parámetros recibidos
     * @param firstNumber
     * @param secondNumber
     * @param symbol
     * @param type 
     */
    public MathCard(int firstNumber, int secondNumber, String symbol, int type) {
        super("");
        operator1 = firstNumber;
        operator2 = secondNumber;
        operation = symbol;
        cardType = type;
        
        if (cardType == RESULTYPE) {
            setText(Integer.toString(getValue()));
        } else {
            // Se é unha carta de operación, gardamos a operación como texto
            setText(operator1 + operation + operator2);
        }
        
    }
    
    
    /**
     * calcula o resultado dos operators con operation
     * @return 
     */
    public int getValue() {
        return (operator1 + Integer.parseInt(operation) + operator2);
        
    }

    @Override
    /**
     * comproba se as cartas fan match
     */
    public boolean isEquals(String card) {
    return false;
    }
    
    
}
