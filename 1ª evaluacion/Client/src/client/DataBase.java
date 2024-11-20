/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;
import java.util.Scanner;
import java.util.HashMap;


/**
 * crea un ArrayMap de clientes, pide o nif, name e surname de cada 
 * cliente (invocando ao método addClient() 
 * tantas veces como clientes queiramos introducir).
 * mostra o nif de todos os clientes do array invocando o método showClients()
 * elimina a un cliente do array pedindo o nif cando invocamos o método removeClient()
 * e por último o número de clientes que hay no array ao invocar o método numClients()
 * @author ivan
 */
public class DataBase {
    // creamos o HashMap de clients
    HashMap<String, Client> clients = new HashMap<>();
    
    
    private void addClient() {
        Scanner scan = new Scanner(System.in);
        
        
        // pedimos por teclado o nif, name e surname e gardamos cada un na sua 
        // variable correspondente
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
        clients.put(nif, client);
        
    }
    
    private void showClients() {
        
        System.out.println("nif's rexistrados: ");
        
        // recorre o array e devolve o nif de cada cliente que ten rexistrado
        for (Client client : clients.values()) {
            System.out.println( client.getNif() + " ");
            
            // salto de liña
            System.out.println();
        }
    }
    
    private void removeClient(String nif) {
        Scanner scan = new Scanner(System.in);
        
        // pide por teclado o nif do cliente que queres eliminar
        // gárdao nunha variable e bórrao do array
        System.out.println("indica o nif do cliente que queres eliminar: ");
        nif = scan.nextLine();
        clients.remove(nif);
        
        // salto de liña
        System.out.println();
    }
    
    private int numClients() {
        return clients.size();
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        DataBase db1 = new DataBase();
        
        // añadimos os clientes
        db1.addClient();
        db1.addClient();
        db1.addClient();
        
        // mostramos o nif dos clientes rexistrados array
        db1.showClients();
        
        // borra do array o cliente co nif indicado
        db1.removeClient(scan.nextLine());
        
        // mostra o nif dos clientes rexistrados no array tras borrar os indicados
        db1.showClients();
        
        // mostra a cantidade de clientes rexistrados 
        System.out.println("hay " + db1.numClients() + " clientes rexistrados");
        
    }
    
}
