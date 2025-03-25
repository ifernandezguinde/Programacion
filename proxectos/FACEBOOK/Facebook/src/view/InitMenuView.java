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
    private InitMenuController initMenuController;

    public InitMenuView(InitMenuController initMenuController) {
        this.initMenuController = initMenuController;
    }

    
    
    
    
    
    
    
    
    public boolean showLoginMenu() {
        
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
