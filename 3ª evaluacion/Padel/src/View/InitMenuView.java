/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.InitMenuController;

/**
 *
 * @author ivan.fernandezguinde
 */
public class InitMenuView {
    private InitMenuController controller;

    /**
     * fai referencia a InitMenuController
     * @param controller 
     */
    public InitMenuView(InitMenuController controller) {
        this.controller = controller;
    }
    
    
    public void showInvalidUser() {
        System.out.println("as credenciais introducidas non son correctas");
    }
    
    
    public boolean showLoginMenu() {
        
    }
    
}
