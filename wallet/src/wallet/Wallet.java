/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package wallet;

/**
 *
 * @author ivan
 */
public class Wallet {
    //declaramos as variables
    private double money;
    private boolean card;

    /**
     * dalle un valor a "money" e "card"
     * @param money
     * @param card 
     */
    public Wallet(double money, boolean card) {
        this.money = money;
        this.card = card;
    }

    /**
     *devolde o valor de money
     * @return
     */
    public double getMoney() {
        return money;
    }

    /**
     * modifica o valor de money
     * @param money 
     */
    public void setMoney(double money) {
        this.money = money;
    }

    /**
     * devolve o valor de card
     * @return 
     */
    public boolean isCard() {
        return card;
    }

    /**
     * modifica o valor de card
     * @param card 
     */
    public void setCard(boolean card) {
        this.card = card;
    }
    
    
    /**
     * di o que teis que facer dependendo de se teis mais de 100 euros de
     * efectivo e se teis tarxeta ou non
     *
     * @return acción que ten que facer o usuario
     */
    public String avaliable() {
        if (money >= 100) {
            return "si teño efectivo";
        } else if ((money < 100) && (card)) {
            return "vai ao caixeiro";
        } else {
            return "vai a sucursal";
        }
    }

    public static void main(String[] args) {

        //creamos novas clases wallet e mandamoslle que nos mostre por
        //pantalla o método avaliable
        Wallet wallet1 = new Wallet(250, false);
        System.out.println(wallet1.avaliable());

        Wallet wallet2 = new Wallet(25, true);
        System.out.println(wallet2.avaliable());

        Wallet wallet3 = new Wallet(10, false);
        System.out.println(wallet3.avaliable());

    }
   
}
