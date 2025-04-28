/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.InitMenuController;

/**
 *
 * @author ivan.fernandezguinde
 */
public class InitMenuView {
    private InitMenuController controller;

    public InitMenuView(InitMenuController controller) {
        this.controller = controller;
    }

    
    
    
    
    
    
    
    
    public boolean showLoginMenu() {
        
        return false;
    }
    
    
    public void showLoginErrorMessage() {
        
    }
    
    
    public void showRegisterMenu() {
        
    }
    
    
    public String showNewNameMenu() {
        System.out.println("este nome xa está en uso, introduce outro");
        return "s";
    }
    
}
