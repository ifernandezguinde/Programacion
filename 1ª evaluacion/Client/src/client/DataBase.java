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
    
    
    private void addClient(Client) {
        Client client1 = new Client();
        
        
        client.put(nif, Client);
        
        
    }
    
    private void showClients() {
        Collection Client = clients.values();
    }
    
    private void removeClient(String nif) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("indica o nif do cliennte que queres eliminar: ");
        clients.remove(scan.nextLine());
    }
    
    private int numClients() {
        
    }
    
    
    public static void main(String[] args) {
        
        
    }
    
}
