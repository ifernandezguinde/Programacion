/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import Model.Profile;

/**
 *
 * @author ivan
 */
public class ProfileDB {
    
    /**
     * Recibe como parámetros o nome dun usuario e o número de publicacións dese
     * perfil que queremos recuperar e devolve o perfil asociado a ese usuario 
     * ou null si non existe
     * @param name
     * @param numberOfPosts
     * @return 
     */
    public static Profile findByName(String name, int numberOfPosts) {
        Profile perfil = null;
        
        for (Profile p : TacebookDB.profiles) {
            if(p.getName().equals(name)) {
                perfil = p;
            }
        }
        return perfil;
        
    }
    
    /**
     * Recibe como parámetros o nome dun usuario, o contrasinal e o número de 
     * publicacións dese perfil e devolve o perfil asociado a ese usuario ou 
     * null si non existe
     * @param name
     * @param password
     * @param numberOfPosts
     * @return 
     */
    public static Profile findByNameAndPassword(String name, String password, 
            int numberOfPosts) {
        Profile perfil = null;
        
        for (Profile p : TacebookDB.profiles) {
            if (p.getName().equals(name) && p.getPassword().equals(password)) {
                perfil = p;
            }
        }
        
        return perfil;
        
    }
    
    /**
     * almacena o perfil no almacenamento
     * @param profile 
     */
    public static void save(Profile profile) {
        
        TacebookDB.profiles.add(profile);
        
    }
    
    /**
     * actualiza o perfil no almacenamento (non fai nada neste caso)
     * @param profile 
     */
    public static void update(Profile profile) {
        
    }
    
}
