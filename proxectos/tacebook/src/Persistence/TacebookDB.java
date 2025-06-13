/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import Model.Profile;
import java.util.ArrayList;

/**
 *
 * @author ivan
 */
public class TacebookDB {
    static ArrayList<Profile> profiles = new ArrayList();

    /**
     * devolve o valor de profiles
     *
     * @return
     */
    public static ArrayList<Profile> getProfiles() {
        return profiles;
    }

    /**
     * modifica o valor de profiles
     *
     * @param profiles
     */
    public static void setProfiles(ArrayList<Profile> profiles) {
        TacebookDB.profiles = profiles;
    }

    
    
    
}
