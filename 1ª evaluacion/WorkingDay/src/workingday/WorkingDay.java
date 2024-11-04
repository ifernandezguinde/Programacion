/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package workingday;

/**
 *calcula o sueldo que percibe un traballador a semana dependendo de distintos parámetros
 * @author ivan
 */
public class WorkingDay {
    private String quenda ;
    private String dia;
    private int horas;

    /**
     * da un valor a quenda, dia e horas
     * @param quenda
     * @param dia
     * @param horas 
     */
    public WorkingDay(String quenda, String dia, int horas) {
        this.quenda = quenda;
        this.dia = dia;
        this.horas = horas;
    }

    /**
     * devolve o valor de quenda
     * @return 
     */
    public String getQuenda() {
        return quenda;
    }

    /**
     * modifica o valor de quenda
     * @param quenda 
     */
    public void setQuenda(String quenda) {
        this.quenda = quenda;
    }

    /**
     * devolde o valor de dia
     * @return 
     */
    public String getDia() {
        return dia;
    }

    /**
     * modifica o valor de dia
     * @param dia 
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * devolve o valor de horas
     * @return 
     */
    public int getHoras() {
        return horas;
    }

    /**
     * modifica o valor de horas
     * @param horas 
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    

    /**
     * calcula o salario por hora segundo traballe de dia, de noite, en domingo ou nun 
     * día normal que non sexa domingo
     * @return 
     */
    public double calcuoSalario() {
        double precioHora;
        
        // se traballa de dia
        if (quenda.charAt(0) == 'd') {
            precioHora = 8;
        } else {
            // se traballa de noite
            precioHora = 12;
        }
        
        // se traballa un domingo
        if (dia.charAt(0) == 'd') {
            precioHora *= 1.2;
        }
        return precioHora * horas;
    }

    
    /**
     * calcula o salario semanal dependendo de se traballa de dia , de noite, 
     * en domingo ou nun día normal
     * @param domingo
     * @return 
     */
    public static double salarioSemanal(boolean domingo) {

        double salarioTotal = 0;

        //se traballa un domingo
        if (domingo) {
            salarioTotal += new WorkingDay("d", "d", 8).calcuoSalario();
            for (int i =0; i < 4; i++) {
                    salarioTotal += new WorkingDay("d", "x", 8).calcuoSalario();
            }
        } else {
            // se traballa os 5 días normais
            for (int i = 0; i < 5; i++) {
                salarioTotal += new WorkingDay ("d", "x", 8).calcuoSalario();
            }
        }
        return salarioTotal;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // unha semana na que traballa 4 días normais e un domingo
        double salarioConDomingo = salarioSemanal(true);
        System.out.println("o salario semanal é: " +salarioConDomingo+ " €");
        
        // unha semana na que traballa 5 días normais
        double salarioSinDomingo = salarioSemanal(false);
        System.out.println("o salario semanal é: " +salarioSinDomingo+ " €");
    }
}
