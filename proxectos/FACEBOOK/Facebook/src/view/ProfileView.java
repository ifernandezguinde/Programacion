/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;
import model.Profile;

/**
 *
 * @author ivan.fernandezguinde
 */
public class ProfileView {
    private int postsShowed = 10;
    private String profileController;
    
    
    /**
     * mostra a información do perfil 
     * @param ownProfile
     * @param profile 
     */
    private void showProfileInfo(boolean ownProfile, Profile profile) {
        
    }
    
    
    /**
     * se "ownProfile" vale true pedirá un novo estado e invocará o método 
     * "updateProfileStatus()" do controlador. Se "ownProfile" vale false mostrará
     * unha mensaxe indicando que esta opción só é válida na propia biografía e 
     * chamará ao método "showProfileMenu" para mostra de novo o menú do perfil
     * @param ownProfile
     * @param scanner
     * @param profile 
     */
    private void changeStatus(boolean ownProfile, Scanner scanner, Profile profile) {
        
    }
    
    
    /**
     * Chamará ao método "showProfileInfo" para mostrar a información do perfil,
     * e a continuación mostrará as opcións de cambiar o estado do perfil
     * e pechar a sesión
     * @param profile 
     */
    public void showProfileMenu(Profile profile) {
        
    }
    
}
