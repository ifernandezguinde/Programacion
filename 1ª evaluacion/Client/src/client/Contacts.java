/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Contacts {
    HashMap<Integer, Client> clients = new HashMap<>();
    
    private void insert(int tel, Client cli) {
        Scanner scan = new Scanner(System.in);
        
        
        // pedimos por teclado o teléfono, nif, name e surname e gardamos cada un na sua 
        // variable correspondente
        System.out.println("introduce o teléfono: ");
        int tel = scan.nextLine();
        
        System.out.println("introduce o nif: ");
        String nif = scan.nextLine();
        
        System.out.println("introduce o nome: ");
        String name = scan.nextLine();
        
        System.out.println("introduce o apelido: ");
        String surname = scan.nextLine();
        
        // salto de liña
        System.out.println();
        
        // creamos o obxeto client
        Client client = new Client(nif, name, surname);
        
        // añade un client ao array coa sua key e o seu obxeto asociado
        clients.put(tel, client);
    }
    
    private void remove(int tel) {
        
    }
    
    private Client findByNumber(int tel) {
        
    }
    
    private int numContacts() {
        
    }
    
    public static void main(String[] args) {
        
    }
    
}
