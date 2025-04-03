/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import model.Profile;

/**
 *
 * @author ivan.fernandezguinde
 */
public class ProfileDB {
    
    public static Profile findByName(String name, int numberOfPosts) {
        for (Profile profile : profiles) {
            if(profile.getName().equals(name) && profile.getNumberOfPosts().equals(numberOfPosts))
                return profile;
                }
        return null;
    }
    
    
    public static Profile findByNameAndPassword(String name, String password, int numberOfPosts) {
        
    }
    
    
    public static void save(Profile profile) {
        
    }
    
    
    public static void update(Profile profile) {
        
    }
    
}
