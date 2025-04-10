package ui.Graphics;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.HangMan;
import ui.KeyboardWordGenerator;
import ui.GenerateWordException;
import ui.ArrayWordGenerator;
import ui.WordGenerator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * A clase MainWindow ten os seguintes compoñentes principais:
 *
 * Atributos: HangMan hangMan: Representa a partida actual do xogo. JLabel[]
 * hangManLabels: Contén as imaxes que representan as distintas fases do
 * aforcado.
 *
 * Métodos principais: MainWindow(): Constructor que inicializa a interface e
 * inicia unha nova partida. startNewGame(): Comeza unha nova partida, pedindo
 * unha palabra e creando un obxecto HangMan. showGameStatus(): Actualiza a
 * interface cos progresos do xogo. tryChar(): Captura a entrada do usuario e
 * procesa o intento de adiviñar unha letra. updateHangmanImage(): Actualiza a
 * imaxe do aforcado segundo os erros cometidos.
 *
 *
 * Eventos e interacción: newGameButtonActionPerformed(evt): Inicia unha nova
 * partida cando se preme o botón. tryButtonActionPerformed(evt): Procesa a
 * entrada de letra cando se preme o botón "Probar".
 * letterInputActionPerformed(evt): Procesa a entrada de letra cando o usuario
 * preme Enter. exitButtonActionPerformed(evt): Pecha a aplicación.
 *
 *
 * MainWindow é a ventá principal do xogo do aforcado, encargada de xestionar a interface gráfica e interactuar co usuario.
 * Controla o inicio de partida, a entrada de letras, a actualización da interface e o final do xogo.
 * Usa clases como HangMan, WordGenerator e GenerateWordException para modularizar a lóxica.
 * @author omar.gilgonzalez
 */
public class MainWindow extends javax.swing.JFrame {

    private HangMan hangMan; //atributo obxecto que xestiona a lóxica do xogo
    private JLabel[] hangManLabels; //Array de JLabel que contén as imaxes do aforcado en diferentes estados.

    /**
     * Construtor que chama initComponents(), o cal configura a interface
     * gráfica.
     *
     * Inicializa hangManLabels coas diferentes imaxes do aforcado.
     *
     * Chama startNewGame() para comezar unha nova partida automaticamente.
     */
    public MainWindow() {
        initComponents();
        hangManLabels = new JLabel[]{hangman0, hangman1, hangman2, hangman3, hangman4, hangman5, hangman6};
        startNewGame();
    }

    /**
     * Método que mostra unha ventá para seleccionar o modo de xogo usando
     * ModeSelectionWindow.showDialog(this).
     *
     * Se o usuario cancela, non se fai nada.
     *
     * Crea un xerador de palabras (WordGenerator) segundo o modo de xogo:
     *
     * Se o usuario escolle "Un xogador, xerando a palabra ao azar", usa
     * ArrayWordGenerator. Se escolle "Introduce a palabra", pídella cun
     * JOptionPane.showInputDialog().
     *
     * Crea unha nova partida con hangMan = new
     * HangMan(generator.generateWord());. Reinicia a interface gráfica:
     *
     * Mostra a palabra agochada (hiddenWordLabel). Borra as letras falladas.
     * Habilita os campos de entrada. Actualiza a imaxe do aforcado.
     */
    private void startNewGame() {
        try {
            // Chamamos á ventá de selección de modo de xogo
            String selectedMode = ModeSelectionWindow.showDialog(this);

            // Se o usuario cancela, non se fai nada
            if (selectedMode == null) {
                return;
            }

            // Definimos o xerador de palabras segundo o modo elixido
            WordGenerator generator;
            if (selectedMode.equals("Un xogador, xerando a palabra ao azar")) {
                generator = new ArrayWordGenerator();
            } else {
                String palabra = JOptionPane.showInputDialog(this, "Introduce a palabra:");
                if (palabra == null || palabra.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Debe introducirse unha palabra!", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                generator = new KeyboardWordGenerator();
            }

            // Creamos unha nova partida
            hangMan = new HangMan(generator.generateWord());

            // Reiniciamos os elementos visuais
            hiddenWordLabel.setText(hangMan.showHiddenWord());
            failedLettersDisplayLabel.setText("");
            letterInput.setEnabled(true);
            tryButton.setEnabled(true);
            updateHangmanImage();

        } catch (GenerateWordException e) {
            if (e.isVisible()) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * Método que:
     *
     * Actualiza a interface:
     *
     * Mostra a palabra agochada coas letras descubertas. Mostra as letras
     * falladas. Actualiza a imaxe do aforcado.
     *
     * Se o xogo remata, mostra unha ventá co resultado e desactiva os campos de
     * entrada.
     */
    private void showGameStatus() {
        hiddenWordLabel.setText(hangMan.showHiddenWord());
        failedLettersDisplayLabel.setText(hangMan.getStringFails());
        updateHangmanImage();

        if (hangMan.isGameOver()) {
            new GameOverWindow(this, "Fin do xogo! A palabra era: " + hangMan.showFullWord()).setVisible(true);
            letterInput.setEnabled(false);
            tryButton.setEnabled(false);
        }
    }

    /**
     * Método que:
     *
     * Valida a entrada do usuario:
     *
     * Verifica que o usuario introduciu unha única letra minúscula. Se non é
     * válida, mostra unha mensaxe de erro.
     *
     * Chama tryChar(letter) en hangMan para procesar a letra. Actualiza a
     * interface co novo estado do xogo. Balea o campo de entrada e volve poñer
     * o foco nel.
     */
    private void tryChar() {
        String input = letterInput.getText().trim();
        if (input.isEmpty() || !Character.isLowerCase(input.charAt(0))) {
            JOptionPane.showMessageDialog(this, "Introduce unha única letra minúscula!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        char letter = input.charAt(0);
        hangMan.tryChar(letter);
        showGameStatus();
        letterInput.setText("");
        letterInput.requestFocus();
    }

    /**
     * Método que conta o número de erros cometidos e mostra a imaxe do aforcado
     * correspondente ao número de erros.
     */
    private void updateHangmanImage() {
        int failures = hangMan.getFails().size();
        for (int i = 0; i < hangManLabels.length; i++) {
            hangManLabels[i].setVisible(i == failures);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        controlPanel = new javax.swing.JPanel();
        newGameButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        gamePanel = new javax.swing.JPanel();
        infoPanel = new javax.swing.JPanel();
        wordLabel = new javax.swing.JLabel();
        failedLettersLabel = new javax.swing.JLabel();
        inputLabel = new javax.swing.JLabel();
        hiddenWordLabel = new javax.swing.JLabel();
        failedLettersDisplayLabel = new javax.swing.JLabel();
        letterInput = new javax.swing.JTextField();
        tryButton = new javax.swing.JButton();
        hangmanPanel = new javax.swing.JPanel();
        hangman0 = new javax.swing.JLabel();
        hangman1 = new javax.swing.JLabel();
        hangman2 = new javax.swing.JLabel();
        hangman3 = new javax.swing.JLabel();
        hangman4 = new javax.swing.JLabel();
        hangman5 = new javax.swing.JLabel();
        hangman6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aforcado");
        setMinimumSize(new java.awt.Dimension(700, 300));

        mainPanel.setLayout(new java.awt.BorderLayout());

        titleLabel.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("O Xogo Do Aforcado");
        mainPanel.add(titleLabel, java.awt.BorderLayout.PAGE_START);

        newGameButton.setText("Nova partida");
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButtonActionPerformed(evt);
            }
        });
        controlPanel.add(newGameButton);

        exitButton.setText("Saír");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        controlPanel.add(exitButton);

        mainPanel.add(controlPanel, java.awt.BorderLayout.PAGE_END);

        gamePanel.setLayout(new java.awt.GridLayout(1, 0, 2, 0));

        infoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        wordLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        wordLabel.setText("Palabra a adiviñar:");
        infoPanel.add(wordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 170, 30));

        failedLettersLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        failedLettersLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        failedLettersLabel.setText("Letras falladas:");
        infoPanel.add(failedLettersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 140, 30));

        inputLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inputLabel.setText("Introduce unha letra:");
        infoPanel.add(inputLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 190, 30));

        hiddenWordLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        hiddenWordLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        infoPanel.add(hiddenWordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 170, 30));

        failedLettersDisplayLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        failedLettersDisplayLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        infoPanel.add(failedLettersDisplayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 180, 30));

        letterInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        letterInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letterInput.setActionCommand("<Not Set>");
        letterInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterInputActionPerformed(evt);
            }
        });
        infoPanel.add(letterInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 30, 30));

        tryButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tryButton.setText("Probar");
        tryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tryButtonActionPerformed(evt);
            }
        });
        infoPanel.add(tryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, 30));

        gamePanel.add(infoPanel);

        hangmanPanel.setLayout(new java.awt.CardLayout());

        hangman0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hangman0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Hangman-0.png"))); // NOI18N
        hangmanPanel.add(hangman0, "card2");

        hangman1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hangman1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Hangman-1.png"))); // NOI18N
        hangmanPanel.add(hangman1, "card3");

        hangman2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hangman2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Hangman-2.png"))); // NOI18N
        hangmanPanel.add(hangman2, "card4");

        hangman3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hangman3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Hangman-3.png"))); // NOI18N
        hangmanPanel.add(hangman3, "card5");

        hangman4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hangman4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Hangman-4.png"))); // NOI18N
        hangmanPanel.add(hangman4, "card6");

        hangman5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hangman5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Hangman-5.png"))); // NOI18N
        hangmanPanel.add(hangman5, "card7");

        hangman6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hangman6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Hangman-6.png"))); // NOI18N
        hangmanPanel.add(hangman6, "card8");

        gamePanel.add(hangmanPanel);

        mainPanel.add(gamePanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
        startNewGame();
    }//GEN-LAST:event_newGameButtonActionPerformed

    private void tryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tryButtonActionPerformed
        tryChar();
    }//GEN-LAST:event_tryButtonActionPerformed

    private void letterInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterInputActionPerformed
        tryChar();
    }//GEN-LAST:event_letterInputActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel controlPanel;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel failedLettersDisplayLabel;
    private javax.swing.JLabel failedLettersLabel;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JLabel hangman0;
    private javax.swing.JLabel hangman1;
    private javax.swing.JLabel hangman2;
    private javax.swing.JLabel hangman3;
    private javax.swing.JLabel hangman4;
    private javax.swing.JLabel hangman5;
    private javax.swing.JLabel hangman6;
    private javax.swing.JPanel hangmanPanel;
    private javax.swing.JLabel hiddenWordLabel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JTextField letterInput;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton newGameButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton tryButton;
    private javax.swing.JLabel wordLabel;
    // End of variables declaration//GEN-END:variables
}
