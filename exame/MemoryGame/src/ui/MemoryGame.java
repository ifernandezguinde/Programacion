package ui;

import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import memorygame.ArrayCardGenerator;
import memorygame.Card;
import memorygame.GenerateCardsException;

/**
 * Clase que implementa a ventá dun xogo de cartas de memoria
 *
 * @author Profe de programación
 */
public class MemoryGame extends javax.swing.JFrame {

    // Atributos privados da clase. Omítese o Javadoc
    private Card[][] cards;
    private JToggleButton[][] cardButtons;
    private Card selectedCard;
    private JToggleButton selectedCardButton;
    private int points;

    /**
     * Método que comeza unha nova partida
     *
     * @param level nivel para o que se quere iniciar a partida
     */
    private void startNewGame(int level) {
        // Capturamos a posible excepción que se pode producir cando xeramos
        // as cartas do xogo
        try {
            // Xeramos as cartas do xogo
            cards = new ArrayCardGenerator().generateCards(level + 2, 4);
            // Reseteamos o estado dos botóns das cartas
            for (int i = 0; i < cardButtons.length; i++) {
                for (JToggleButton btn : cardButtons[i]) {
                    // Quitamos o texto do botón, habilitámolo e deseleccionámolo
                    btn.setText("");
                    btn.setEnabled(true);
                    btn.setSelected(false);
                    // Se o nivel non é o sinxelo e o botón está na segunda fila
                    // se mostra. Se non, se oculta
                    if (i == 2) {
                        btn.setVisible(level != 0);
                    }
                }
            }
            // Poñemos a carta seleccionada a null
            selectedCard = null;
            // Inicializamos os puntos a 100 e mostramos o estado do xogo
            points = 100;
            showGameStatus();
        } catch (GenerateCardsException e) {
            // Se se produce unha excepción ao xerar as cartas mostramos unha
            // mensaxe de erro
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    /**
     * Método que mostra na etiqueta o estado da partida
     */
    private void showGameStatus() {
        jLblStatus.setText("Estás xogando no nivel "
                + jComboLevels.getSelectedItem() + " - Xogando por " + points
                + " puntos");
    }

    /**
     * Método que quita o texto de todos os botóns de cartas que non estean
     * seleccionados
     */
    private void clearUnselectedButtons() {
        for (JToggleButton[] buttonRow : cardButtons) {
            for (JToggleButton btn : buttonRow) {
                if (!btn.isSelected() && !btn.getText().isBlank()) {
                    btn.setText("");
                }
            }
        }
    }

    /**
     * Método que mostra unha mensaxe se se acabou a partida, por estar todas as
     * cartas acertadas
     */
    private void checkGameOver() {
        boolean gameOver = true;
        // Comprobamos se hai algunha carta sen acertar
        for (Card[] cardRow : cards) {
            for (Card card : cardRow) {
                if (!card.isHit()) {
                    gameOver = false;
                }
            }
        }
        // Se non quedan cartas sen acertar, mostramos a mensaxe de fin de partida
        if (gameOver) {
            JOptionPane.showMessageDialog(this,
                    "Noraboa! Acertaches todas as cartas, conseguindo "
                    + points + " puntos!", "Game Over",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }

    /**
     * Método que decubre unha carta do xogo
     *
     * @param row Fila da carta que se quere descubrir
     * @param column Columna da carta que se quere descubrir
     */
    private void uncover(int row, int column) {
        // Obtemos o botón e a carta correspondente coa fila e columna indicadas
        JToggleButton cardButton = cardButtons[row][column];
        Card card = cards[row][column];
        // Limpamos o texto de todos os botóns que poida haber sen seleccionar
        clearUnselectedButtons();
        // Poñemos o texto da carta no botón a descubrir
        cardButton.setText(card.getText());
        // Se non había ningunha carta seleccionada, poñemos a carta e o botón
        // como os seleccionados e desabilitamos o botón
        if (selectedCard == null) {
            selectedCard = card;
            selectedCardButton = cardButton;
            cardButton.setEnabled(false);
        } else {
            // Se había unha carta seleccionada, comprobamos se é parella da
            // que estamos descubrindo
            if (card.isEquals(selectedCard)) {
                // Se son parella, marcamos as dúas cartas como acertadas e
                // deshabilitamos o botón
                card.setHit(true);
                selectedCard.setHit(true);
                cardButton.setEnabled(false);
            } else {
                // Se non son parella, deseleccionamos o botón actual e o 
                // seleccionado anteriormente e habilitamos o botón seleccionado
                // anteriormente
                cardButton.setSelected(false);
                selectedCardButton.setSelected(false);
                selectedCardButton.setEnabled(true);
                // Restamos un punto á partida e mostramos o estado da mesma
                points--;
                showGameStatus();
            }
            // Marcamos que agora xa non hai ningunha carta seleccionada
            selectedCard = null;
        }
        // Comprobamos se se rematou a partida
        checkGameOver();
    }

    /**
     * Creates new form MemoryGame
     */
    public MemoryGame() {
        initComponents();
        // Creamos o array bidimensional cos botóns do xogo
        cardButtons = new JToggleButton[][]{
            {jToggleBtn_0_0, jToggleBtn_0_1, jToggleBtn_0_2, jToggleBtn_0_3},
            {jToggleBtn_1_0, jToggleBtn_1_1, jToggleBtn_1_2, jToggleBtn_1_3},
            {jToggleBtn_2_0, jToggleBtn_2_1, jToggleBtn_2_2, jToggleBtn_2_3}
        };
        // Comezamos unha nova partida ao mostrar a ventá
        startNewGame(jComboLevels.getSelectedIndex());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlGame = new javax.swing.JPanel();
        jToggleBtn_0_0 = new javax.swing.JToggleButton();
        jToggleBtn_0_1 = new javax.swing.JToggleButton();
        jToggleBtn_0_2 = new javax.swing.JToggleButton();
        jToggleBtn_0_3 = new javax.swing.JToggleButton();
        jToggleBtn_1_0 = new javax.swing.JToggleButton();
        jToggleBtn_1_1 = new javax.swing.JToggleButton();
        jToggleBtn_1_2 = new javax.swing.JToggleButton();
        jToggleBtn_1_3 = new javax.swing.JToggleButton();
        jToggleBtn_2_0 = new javax.swing.JToggleButton();
        jToggleBtn_2_1 = new javax.swing.JToggleButton();
        jToggleBtn_2_2 = new javax.swing.JToggleButton();
        jToggleBtn_2_3 = new javax.swing.JToggleButton();
        jPnlButtons = new javax.swing.JPanel();
        jLblLevel = new javax.swing.JLabel();
        jComboLevels = new javax.swing.JComboBox<>();
        jBtnNewGame = new javax.swing.JButton();
        jBtnExit = new javax.swing.JButton();
        jPnlStatus = new javax.swing.JPanel();
        jLblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Xogo de memoria");

        jPnlGame.setLayout(new java.awt.GridLayout(3, 4));

        jToggleBtn_0_0.setPreferredSize(new java.awt.Dimension(200, 200));
        jToggleBtn_0_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleBtn_0_0ActionPerformed(evt);
            }
        });
        jPnlGame.add(jToggleBtn_0_0);

        jToggleBtn_0_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleBtn_0_1ActionPerformed(evt);
            }
        });
        jPnlGame.add(jToggleBtn_0_1);

        jToggleBtn_0_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleBtn_0_2ActionPerformed(evt);
            }
        });
        jPnlGame.add(jToggleBtn_0_2);

        jToggleBtn_0_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleBtn_0_3ActionPerformed(evt);
            }
        });
        jPnlGame.add(jToggleBtn_0_3);

        jToggleBtn_1_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleBtn_1_0ActionPerformed(evt);
            }
        });
        jPnlGame.add(jToggleBtn_1_0);

        jToggleBtn_1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleBtn_1_1ActionPerformed(evt);
            }
        });
        jPnlGame.add(jToggleBtn_1_1);

        jToggleBtn_1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleBtn_1_2ActionPerformed(evt);
            }
        });
        jPnlGame.add(jToggleBtn_1_2);

        jToggleBtn_1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleBtn_1_3ActionPerformed(evt);
            }
        });
        jPnlGame.add(jToggleBtn_1_3);

        jToggleBtn_2_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleBtn_2_0ActionPerformed(evt);
            }
        });
        jPnlGame.add(jToggleBtn_2_0);

        jToggleBtn_2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleBtn_2_1ActionPerformed(evt);
            }
        });
        jPnlGame.add(jToggleBtn_2_1);

        jToggleBtn_2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleBtn_2_2ActionPerformed(evt);
            }
        });
        jPnlGame.add(jToggleBtn_2_2);

        jToggleBtn_2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleBtn_2_3ActionPerformed(evt);
            }
        });
        jPnlGame.add(jToggleBtn_2_3);

        getContentPane().add(jPnlGame, java.awt.BorderLayout.CENTER);

        jLblLevel.setText("Nivel:");
        jPnlButtons.add(jLblLevel);

        jComboLevels.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sinxelo", "Medio", "Difícil" }));
        jPnlButtons.add(jComboLevels);

        jBtnNewGame.setText("Nova Partida");
        jBtnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNewGameActionPerformed(evt);
            }
        });
        jPnlButtons.add(jBtnNewGame);

        jBtnExit.setText("Sair");
        jBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExitActionPerformed(evt);
            }
        });
        jPnlButtons.add(jBtnExit);

        getContentPane().add(jPnlButtons, java.awt.BorderLayout.SOUTH);

        jPnlStatus.add(jLblStatus);

        getContentPane().add(jPnlStatus, java.awt.BorderLayout.NORTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNewGameActionPerformed
        startNewGame(jComboLevels.getSelectedIndex());
    }//GEN-LAST:event_jBtnNewGameActionPerformed

    private void jBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExitActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Estás seguro de sair do xogo?",
                "Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)
                == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_jBtnExitActionPerformed

    private void jToggleBtn_0_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleBtn_0_0ActionPerformed
        uncover(0, 0);
    }//GEN-LAST:event_jToggleBtn_0_0ActionPerformed

    private void jToggleBtn_0_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleBtn_0_1ActionPerformed
        uncover(0, 1);
    }//GEN-LAST:event_jToggleBtn_0_1ActionPerformed

    private void jToggleBtn_0_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleBtn_0_2ActionPerformed
        uncover(0, 2);
    }//GEN-LAST:event_jToggleBtn_0_2ActionPerformed

    private void jToggleBtn_0_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleBtn_0_3ActionPerformed
        uncover(0, 3);
    }//GEN-LAST:event_jToggleBtn_0_3ActionPerformed

    private void jToggleBtn_1_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleBtn_1_0ActionPerformed
        uncover(1, 0);
    }//GEN-LAST:event_jToggleBtn_1_0ActionPerformed

    private void jToggleBtn_1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleBtn_1_1ActionPerformed
        uncover(1, 1);
    }//GEN-LAST:event_jToggleBtn_1_1ActionPerformed

    private void jToggleBtn_1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleBtn_1_2ActionPerformed
        uncover(1, 2);
    }//GEN-LAST:event_jToggleBtn_1_2ActionPerformed

    private void jToggleBtn_1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleBtn_1_3ActionPerformed
        uncover(1, 3);
    }//GEN-LAST:event_jToggleBtn_1_3ActionPerformed

    private void jToggleBtn_2_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleBtn_2_0ActionPerformed
        uncover(2, 0);
    }//GEN-LAST:event_jToggleBtn_2_0ActionPerformed

    private void jToggleBtn_2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleBtn_2_1ActionPerformed
        uncover(2, 1);
    }//GEN-LAST:event_jToggleBtn_2_1ActionPerformed

    private void jToggleBtn_2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleBtn_2_2ActionPerformed
        uncover(2, 2);
    }//GEN-LAST:event_jToggleBtn_2_2ActionPerformed

    private void jToggleBtn_2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleBtn_2_3ActionPerformed
        uncover(2, 3);
    }//GEN-LAST:event_jToggleBtn_2_3ActionPerformed

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
            java.util.logging.Logger.getLogger(MemoryGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemoryGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemoryGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemoryGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemoryGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnExit;
    private javax.swing.JButton jBtnNewGame;
    private javax.swing.JComboBox<String> jComboLevels;
    private javax.swing.JLabel jLblLevel;
    private javax.swing.JLabel jLblStatus;
    private javax.swing.JPanel jPnlButtons;
    private javax.swing.JPanel jPnlGame;
    private javax.swing.JPanel jPnlStatus;
    private javax.swing.JToggleButton jToggleBtn_0_0;
    private javax.swing.JToggleButton jToggleBtn_0_1;
    private javax.swing.JToggleButton jToggleBtn_0_2;
    private javax.swing.JToggleButton jToggleBtn_0_3;
    private javax.swing.JToggleButton jToggleBtn_1_0;
    private javax.swing.JToggleButton jToggleBtn_1_1;
    private javax.swing.JToggleButton jToggleBtn_1_2;
    private javax.swing.JToggleButton jToggleBtn_1_3;
    private javax.swing.JToggleButton jToggleBtn_2_0;
    private javax.swing.JToggleButton jToggleBtn_2_1;
    private javax.swing.JToggleButton jToggleBtn_2_2;
    private javax.swing.JToggleButton jToggleBtn_2_3;
    // End of variables declaration//GEN-END:variables
}
