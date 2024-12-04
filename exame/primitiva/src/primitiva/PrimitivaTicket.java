/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitiva;

/**
 *
 * @author ivan.fernandezguinde
 */
public class PrimitivaTicket {
    /**
     * Números do boleto
     */
    private int[] numbers;
    
    /**
     * Número de reintegro
     */
    private int refundNumber;

    /**
     * Obtén o array de números do boleto
     *
     * @return Números do boleto
     */
    public int[] getNumbers() {
        return numbers;
    }

    /**
     * Establece o array de números do boleto
     *
     * @param numbers Array de números do boleto
     */
    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    /**
     * Obtén o número de reintegro do boleto
     *
     * @return Número de reintegro do boleto
     */
    public int getRefundNumber() {
        return refundNumber;
    }

    /**
     * Establece o número de reintegro do boleto
     *
     * @param refundNumber Número de reintegro para o boleto
     */
    public void setRefundNumber(int refundNumber) {
        this.refundNumber = refundNumber;
    }

    /**
     * Crea un boleto da primitiva
     *
     * @param numbers Array cos números do boleto
     * @param refundNumber Número de reintegro
     */
    public PrimitivaTicket(int[] numbers, int refundNumber) {
        this.numbers = numbers;
        this.refundNumber = refundNumber;
    }
}