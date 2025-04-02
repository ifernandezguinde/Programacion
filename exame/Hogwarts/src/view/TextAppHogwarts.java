/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.HogwartsController;
import exceptions.UnderConstructionException;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.HogwartsCharacter;
import modelo.Subject;

/**
 *
 * @author ivan.fernandezguinde
 */
public class TextAppHogwarts implements HogwartsView {
    private HogwartsController controller;
    private ArrayList hogwartsCharacters = new ArrayList();

    /**
     * referencia ao controlador
     * @param controller 
     */
    public TextAppHogwarts(HogwartsController controller) {
        this.controller = controller;
    }
    
            
    

    @Override
    public void setCharacters(ArrayList<HogwartsCharacter> characters) throws UnderConstructionException {
        hogwartsCharacters.add(characters);
    }

    @Override
    public void setSubjects(ArrayList<Subject> subjects) throws UnderConstructionException {
        throw new UnsupportedOperationException("está en construccion"); 
    }

    @Override
    public void showMenu() throws UnderConstructionException {
        Scanner scan = new Scanner(System.in);
        int option;

        do {
            // Mostra o menú
            System.out.println("\n Benvido a hogwarts... ");
            System.out.println("1. Listar todas as personaxes");
            System.out.println("2. Mostrar os datos dunha personaxe");
            System.out.println("3. Listar todas as materias");
            System.out.println("4. Mostrar os datos dunha materia");
            System.out.println("5. Saír de Hogwarts");
            System.out.print("Que queres facer?: ");

            // Ler a opción do usuario
            option = scan.nextInt();

            // indica o que fai dependendo da opcion
            switch (option) {
                case 1:
                    this.
                    break;
                case 2:
                    System.out.println("introduce o código de Hogwarts da parsonaxe:");
                    this.showCharacterData(scan.nextLine());
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("introduce o código da materia:");
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        } while (option != 5);

        scan.close();
    }

    @Override
    public void showCharacterData(HogwartsCharacter character) throws UnderConstructionException {
        throw new UnsupportedOperationException("está en construccion"); 
    }

    @Override
    public void showSubjectData(Subject subject) throws UnderConstructionException {
        throw new UnsupportedOperationException("está en construccion"); 
    }

    @Override
    public void showUnderConstructionMessage(String operationName) {
        throw new UnsupportedOperationException(operationName + "está en construccion"); 
    }
    
    
    
    
    
    
}
