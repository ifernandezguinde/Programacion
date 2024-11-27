/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitiva;

/**
 *crea un ticket cun array de 6 números e un reintegro
 * @author ivan.fernandezguinde
 */
public class PrimitivaTicket {
    private int numbers[], refundNumber;

    /**
     * dalle un valor a refoundNumbers e ao array numbers 
     * @param numbers
     * @param refundNumber 
     */
    public PrimitivaTicket(int[] numbers, int refundNumber) {
        this.numbers = numbers;
        this.refundNumber = refundNumber;
    }

    /**
     * devolde o valor do array numbers
     * @return 
     */
    public int[] getNumbers() {
        return numbers;
    }

    /**
     * modifica o valor do array numbers
     * @param numbers 
     */
    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    /**
     * devolve o valor de refundNumber
     * @return 
     */
    public int getRefundNumber() {
        return refundNumber;
    }

    /**
     * modifica o valor de refundNumber
     * @param refundNumber 
     */
    public void setRefundNumber(int refundNumber) {
        this.refundNumber = refundNumber;
    }
    
    
}
