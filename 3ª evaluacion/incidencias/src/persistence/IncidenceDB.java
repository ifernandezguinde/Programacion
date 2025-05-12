/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import java.util.ArrayList;
import model.Incidence;

/**
 *
 * @author ivan.fernandezguinde
 */
public class IncidenceDB {
    public final static ArrayList<Incidence> incidences = new ArrayList();
    
    

    
    public static ArrayList<Incidence> findByUser(String username) {
        ArrayList<Incidence> matches = new ArrayList();
        
        for (Incidence incidence : incidences) {
            if (username.equals(incidence.getSender().getName())) {
                matches.add(incidences);
            }
        }
        return matches;
    }
    
    public static void save(Incidence incidence) {
        incidence.setId(incidences.size());
        incidences.add(incidence);
    }
    
}
