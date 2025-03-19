/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import model.Game;

/**
 * Clase que implementa a ventá principal do xogo do Tetris
 * @author Profe de Programación
 */
public class MainWindow extends javax.swing.JFrame {
    
    private Timer timer;
    //variable booleana para saber se o xogo rematou
    private boolean isGameOver = false;
    // intervalo inicial de 1 segundo(1000 milisegundos)
    private int currentInterval = 1000;
    // numero de liñas para reducir o intervalo
    private int lines = 4;


    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        
        // facemos que o JFrame teña o foco
        this.setFocusable(true);
        this.requestFocusInWindow();

        // Agregar KeyEventDispatcher para capturar as teclas globalmente
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(evt -> {
            if (evt.getID() == KeyEvent.KEY_PRESSED) {
                
                // indicamos que fai cada tecla
                switch (evt.getKeyCode()) {
                    // Rotar peza con control
                    case KeyEvent.VK_CONTROL:
                        if (game != null) game.rotatePiece();
                        break;
                    // Mover para abaixo
                    case KeyEvent.VK_DOWN:
                        if (game != null) game.movePieceDown();
                        break;
                    // Mover para a esquerda
                    case KeyEvent.VK_LEFT:
                        if (game != null) game.movePieceLeft();
                        break;
                    // Mover para a dereita
                    case KeyEvent.VK_RIGHT:
                        if (game != null) game.movePieceRight();
                        break;
                }
            }
            return false; // Para que otros componentes también reciban eventos de teclado
        });
    }

    private Game game = null; // Referenza ao obxecto do xogo actual
    
    

    /**
     * Pinta un cadrado no panel de cadrados
     *
     * @param lblSquare Etiqueta co cadrado que se quere pintar no panel
     */
    public void drawSquare(JLabel lblSquare) {
        pnlGame.add(lblSquare);
        pnlGame.repaint();
    }

    /**
     * Borra un cadrado do panel de cadrados
     *
     * @param lblSquare Etiqueta co cadrado que se quere borrar do panel
     */
    public void deleteSquare(JLabel lblSquare) {
        pnlGame.remove(lblSquare);
        pnlGame.repaint();
    }

    /**
     * Actualiza na ventá o número de liñas que van feitas no xogo
     *
     * @param numberOfLines Número de liñas feitas no xogo
     */
    public void showNumberOfLines(int numberOfLines) {
        lblNumberOfLines.setText(String.valueOf(numberOfLines));
        
        // Comproba se o número de liñas alcanzou o limte
        if (numberOfLines > 1 && numberOfLines % lines == 0) {
            // Reducirmos o intervalo a metade
            currentInterval = currentInterval / 2;

            // Detenemos o timer actual
            timer.stop();

            // Creación dun novo timer co novo intervalo
            timer = new Timer(currentInterval, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (isGameOver) {
                        timer.stop();
                    } else {
                        btnDownActionPerformed(null);
                    }
                }
            });

            // Iniciar o timer co novo intervalo
            timer.start();
        }
    }

    /**
     * Mostra unha mensaxe informando ao usuario do final do xogo
     */
    public void showGameOver() {
        game = null;
        JOptionPane.showMessageDialog(this, "Fin do xogo");
        isGameOver = true;
    }

    /**
     * Inicia un novo xogo e crea un timer que baixa a peza cada segundo que pasa
     */
    private void startGame() {
        // Limpamos todo o que puidese haber pintado no panel do xogo
        pnlGame.removeAll();
        // Creamos un novo obxecto xogo
        game = new Game(this);
        // Desactivamos o botón de pausa
        tglbtnPause.setSelected(false);
        // Establecemos o número de liñas que se mostran na ventá a cero
        lblNumberOfLines.setText("0");
        
        // comprobamos que non esté un timer xa en funcionamento
        if(timer != null) {
            timer.stop();
        }
        
        // Creamos o Timer que executa o método cada 1000 milisegundos
        timer = new Timer(currentInterval, (ActionEvent e) -> {
            // comproba se a partida rematou, de ser así finaliza o timer
            if (isGameOver) {  
                timer.stop();
            } else {
                // en caso de que a partida non rematase activa o boton de 
                // baixar a peza
                btnDownActionPerformed(null); 
            }
        });

        
        // inicia o Timer
        timer.start();
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNewGame = new javax.swing.JButton();
        pnlGame = new javax.swing.JPanel();
        btnRotate = new javax.swing.JButton();
        btnRight = new javax.swing.JButton();
        btnLeft = new javax.swing.JButton();
        btnDown = new javax.swing.JButton();
        tglbtnPause = new javax.swing.JToggleButton();
        lblLines = new javax.swing.JLabel();
        lblNumberOfLines = new javax.swing.JLabel();
        name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teistris");
        setLocation(new java.awt.Point(150, 300));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        btnNewGame.setText("Nova partida");
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameActionPerformed(evt);
            }
        });

        pnlGame.setBackground(java.awt.Color.white);
        pnlGame.setPreferredSize(new java.awt.Dimension(200, 240));

        javax.swing.GroupLayout pnlGameLayout = new javax.swing.GroupLayout(pnlGame);
        pnlGame.setLayout(pnlGameLayout);
        pnlGameLayout.setHorizontalGroup(
            pnlGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        pnlGameLayout.setVerticalGroup(
            pnlGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        btnRotate.setText("Rotar");
        btnRotate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRotateActionPerformed(evt);
            }
        });

        btnRight.setText("Dereita");
        btnRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRightActionPerformed(evt);
            }
        });

        btnLeft.setText("Esquerda");
        btnLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftActionPerformed(evt);
            }
        });

        btnDown.setText("Abaixo");
        btnDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownActionPerformed(evt);
            }
        });

        tglbtnPause.setText("Pausa");
        tglbtnPause.setToolTipText("");
        tglbtnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglbtnPauseActionPerformed(evt);
            }
        });

        lblLines.setText("Liñas:");

        lblNumberOfLines.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        name.setText("Iván e Omar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLines, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(lblNumberOfLines, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tglbtnPause, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(btnDown, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(btnRight, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(btnRotate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewGame)
                    .addComponent(tglbtnPause))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLines)
                    .addComponent(lblNumberOfLines, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(pnlGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnLeft))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnDown))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnRight))
                    .addComponent(btnRotate))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGameActionPerformed
        // Ao picar no botón de "Nova partida", invocamos ao método privado 
        // que inicia un novo xogo
        startGame();
    }//GEN-LAST:event_btnNewGameActionPerformed

    private void tglbtnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglbtnPauseActionPerformed
        // Ao picar no botón de "Pausa", chamamos ao obxecto xogo para 
        // establecer o atributo de pausa no estado do botón
        if (game != null) {
            game.setPaused(tglbtnPause.isSelected());
        }
    }//GEN-LAST:event_tglbtnPauseActionPerformed

    private void btnRotateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRotateActionPerformed
        // Ao picar no botón de "Rotar", chamamos ao obxecto xogo para que 
        // rote a peza actual
        if (game != null) {
            game.rotatePiece();
        }
    }//GEN-LAST:event_btnRotateActionPerformed

    private void btnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftActionPerformed
        // Ao picar no botón de "Esquerda", chamamos ao obxecto xogo para que
        // se mova a peza actual á esquerda
        if (game != null) {
            game.movePieceLeft();
        }
    }//GEN-LAST:event_btnLeftActionPerformed

    private void btnRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightActionPerformed
        // Ao picar no botón de "Dereita", chamamos ao obxecto xogo para que
        // se mova a peza actual á dereita
        if (game != null) {
            game.movePieceRight();
        }
    }//GEN-LAST:event_btnRightActionPerformed

    private void btnDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownActionPerformed
        // Ao picar no botón de "Abaixo", chamamos ao obxecto xogo para que
        // se mova a peza actual cara abaixo
        if (game != null) {
            game.movePieceDown();
        }
    }//GEN-LAST:event_btnDownActionPerformed


    
    
    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDown;
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JButton btnRight;
    private javax.swing.JButton btnRotate;
    private javax.swing.JLabel lblLines;
    private javax.swing.JLabel lblNumberOfLines;
    private javax.swing.JLabel name;
    private javax.swing.JPanel pnlGame;
    private javax.swing.JToggleButton tglbtnPause;
    // End of variables declaration//GEN-END:variables
}
