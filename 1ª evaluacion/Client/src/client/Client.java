/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package client;
import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Client {
    
    private String nif, name, surname;

    public Client(String nif, String name, String surname) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("introduce o nif: ");
        this.nif = scan.nextLine();
        
        System.out.println("introduce o nome: ");
        this.name = scan.nextLine();
        
        System.out.println("introduce o apelido: ");
        this.surname = scan.nextLine();
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
