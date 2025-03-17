/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;

/**
 *
 * @author ivan
 */
public class KeyDispatcher implements KeyEventDispatcher {
        public boolean dispatchKeyEvent(KeyEvent e) {
          if(e.getID() == KeyEvent.KEY_TYPED) {
            System.out.println( "typed" + e.getKeyCode() );
          }

          // allow the event to be redispatched
          return false;
        }
}
