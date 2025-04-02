/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import java.util.ArrayList;
import modelo.HogwartsCharacter;
import modelo.Subject;

/**
 *
 * @author ivan.fernandezguinde
 */
public class SubjectDB {
    private final static ArrayList subjects = new ArrayList();

    /**
     * devolve o valor do ArrayList subjects
     * @return 
     */
    public static ArrayList getSubjects() {
        return subjects;
    }

    
    public static HogwartsCharacter findByCode(Subject code) {
        for(int i = 0; i<subjects.size(); i++) {
            
        }
    }
    
    
}
