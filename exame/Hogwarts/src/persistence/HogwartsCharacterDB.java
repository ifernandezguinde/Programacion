/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import java.util.ArrayList;
import modelo.HogwartsCharacter;

/**
 *
 * @author ivan.fernandezguinde
 */
public class HogwartsCharacterDB {
    private final static ArrayList characters = new ArrayList();

    /**
     * devolve o valor do ArrayList characters
     * @return 
     */
    public static ArrayList getCharacters() {
        return characters;
    }


    public static HogwartsCharacter findByCode(Character codigo) {
        for(int i = 0; i<characters.size(); i++) {
            
        }
    }
    
    
}
