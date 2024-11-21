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
    private HashMap<Integer, Client> phonebook = new HashMap<>();

    /**
     * devolve os valores do array phonebook
     * @return 
     */
    public HashMap<Integer, Client> getPhonebook() {
        return phonebook;
    }

    /**
     * modifica o valor do array phonebook
     * @param phonebook 
     */
    public void setPhonebook(HashMap<Integer, Client> phonebook) {
        this.phonebook = phonebook;
    }

   
    
    
    
    private void insert(int tel, Client cli) {
        
        
        // añade un client ao array coa sua key e o seu obxeto asociado
        phonebook.put(tel, cli);
    }
    
    private void remove(int tel) {
        phonebook.remove(tel);        
    }
    
    private Client findByNumber(int tel) {
        return phonebook.get(tel);
    }
    
    private int numContacts() {
     return 3;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Contacts contacts = new Contacts();
        
        // pedimos por teclado o teléfono, nif, name e surname e gardamos
        // cada un na sua variable correspondente
        
        System.out.println("introduce o teléfono: ");
        int tel = scan.nextInt();
        scan.nextLine();
        
        System.out.println("introduce o nif: ");
        String nif = scan.nextLine();
        
        System.out.println("introduce o nome: ");
        String name = scan.nextLine();
        
        System.out.println("introduce o apelido: ");
        String surname = scan.nextLine();
        
        // salto de liña
        System.out.println();
        
        // creamos o obxeto client
        Client client1 = new Client(nif, name, surname);
        
        // insertamos un cliente no array
        phonebook.insert(tel, client1);
        
        // añadimos outro cliente 
        System.out.println("introduce o teléfono: ");
        tel = scan.nextInt();
        scan.nextLine();
        
        System.out.println("introduce o nif: ");
        nif = scan.nextLine();
        
        System.out.println("introduce o nome: ");
        name = scan.nextLine();
        
        System.out.println("introduce o apelido: ");
        surname = scan.nextLine();
        
        // salto de liña
        System.out.println();
        
        // creamos outro cliente
        Client client2 = new Client(nif, name, surname);
        
        // insertamos un cliente no array
        contacts.insert(tel, client2);
        
        
        
        // mostramos cantos contactos ten o array
        contacts.numContacts();
        
        // buscamos a un cliente polo seu número de teléfono e mostrámolo
        // por pantalla
        System.out.println("indica o número de teléfono do cliente que queres buscar");
        tel = scan.nextInt();        
        System.out.println("o cliente co número de teléfono: "+ tel + " é: " + phonebook.findByNumber(tel));
        
        System.out.println("introduce o teléfono do cliente que queiras eliminar: ");
        tel = scan.nextInt();
        contacts.remove(tel); 
        
        // mostramos os clientes que quedan no array despois de borrar o anterior
        contacts.numContacts();
        
        
        
        
        
    }
    
}
