/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.InitMenuView;

/**
 *
 * @author ivan.fernandezguinde
 */
public class InitMenuController {
    private InitMenuView view;

    public InitMenuController(InitMenuView view) {
        this.view = view;
    }
    
    
    public void initApp() {
        //chama o método showLoginMenu ata que devolva true
        do{
            InitMenuView.showLoginMenu;
        }while(false);
    }
    
    
    public void login(String id, String pasword) {
        
    }
    
    
}
