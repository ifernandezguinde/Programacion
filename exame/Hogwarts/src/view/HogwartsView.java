/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import exceptions.UnderConstructionException;
import java.util.ArrayList;
import modelo.HogwartsCharacter;
import modelo.Subject;

/**
 *
 * @author ivan.fernandezguinde
 */
public interface HogwartsView {
    
    /**
     * indica a lista de personaxes da academia que hai que mostrar. Pode 
     * arroxar unha "UnderConstructionException" se esta operación non estivese 
     * aínda implementada.
     * @param characters
     * @throws UnderConstructionException 
     */
    public void setCharacters(ArrayList<HogwartsCharacter> characters) throws UnderConstructionException;
    
    /**
     * indica a lista de materia da academia que hai que mostrar. Pode arroxar 
     * unha "UnderConstructionException" se esta operación non estivese aínda 
     * implementada.
     * @param subjects
     * @throws UnderConstructionException 
     */
    public void setSubjects(ArrayList<Subject> subjects) throws UnderConstructionException;
    
    /**
     * mostra ao usuario o menú coas opcións da aplicación. Pode arroxar unha 
     * "UnderConstructionException" se esta operación non estivese aínda
     * implementada.
     * @throws UnderConstructionException 
     */
    public void showMenu() throws UnderConstructionException;
    
    /**
     * mostrar os datos dunha personaxe da academia. Pode arroxar unha 
     * "UnderConstructionException" se esta operación non estivese aínda 
     * implementada.
     * @param character
     * @throws UnderConstructionException 
     */
    public void showCharacterData(HogwartsCharacter character) throws UnderConstructionException;
    
    /**
     * mostrar os datos dunha materia da academia. Pode arroxar unha 
     * "UnderConstructionException" se esta operación non estivese aínda 
     * implementada.
     * @param subject
     * @throws UnderConstructionException 
     */
    public void showSubjectData(Subject subject) throws UnderConstructionException;
    
    /**
     * Este método será chamado pola controladora no caso de que se produza unha
     * "UnderConstructionException" e o que fará é mostrar unha mensaxe ao 
     * usuario indicando que a operación recibida como parámetro está aínda 
     * en construcción.
     * @param operationName 
     */
    public void showUnderConstructionMessage(String operationName);
    
}
