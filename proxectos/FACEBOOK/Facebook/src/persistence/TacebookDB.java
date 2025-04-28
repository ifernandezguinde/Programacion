/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import java.util.ArrayList;
import model.Profile;

/**
 *
 * @author ivan.fernandezguinde
 */
public class TacebookDB {
    private ArrayList<Profile> profiles = new ArrayList<>();
    
    

    public ArrayList<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(ArrayList<Profile> profiles) {
        this.profiles = profiles;
    }
    
    
    
}
