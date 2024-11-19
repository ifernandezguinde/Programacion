/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;
import java.util.Scanner;
import java.util.HashMap;


/**
 *
 * @author ivan
 */
public class DataBase {
    HashMap<String, Client> clients = new HashMap<>();
    
    
    private void addClient() {
        Scanner scan = new Scanner(System.in);
        
        
        
        System.out.println("introduce o nif: ");
        String nif = scan.nextLine();
        
        System.out.println("introduce o nome: ");
        String name = scan.nextLine();
        
        System.out.println("introduce o apelido: ");
        String surname = scan.nextLine();
        
        Client client = new Client(nif, name, surname);
        
    }
    
    private void showClients() {
        
    }
    
    private void removeClient(String nif) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("indica o nif do cliente que queres eliminar: ");
        clients.remove(nif);
    }
    
    private int numClients() {
        return clients.size();
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        DataBase db1 = new DataBase();
        
        db1.addClient();
        db1.addClient();
        db1.addClient();
        db1.showClients();
        db1.removeClient(scan.nextLine());
        db1.showClients();
        db1.numClients();
        
        
    }
    
}
