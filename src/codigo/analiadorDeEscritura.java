/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import java.awt.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

/**
 *
 * @author kevyn
 */
public class analiadorDeEscritura extends javax.swing.JFrame {
int xMouse,yMouse;
    /**
     * Creates new form FrmPrincipal
     */
    public analiadorDeEscritura() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Analizar una cadena de texto");
        ImageIcon fondo = new ImageIcon("src/images/fondo.jpg");
        Icon icono = new ImageIcon(fondo.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_DEFAULT));
        lblFondo.setIcon(icono);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtInput = new javax.swing.JTextField();
        btnAnalizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tPane = new javax.swing.JTextPane();
        lblCopyright = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtInput.setEditable(false);
        txtInput.setBackground(new java.awt.Color(0, 0, 0));
        txtInput.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtInput.setForeground(new java.awt.Color(153, 153, 153));
        txtInput.setText("Ingrese la cadena de texto a analizar");
        txtInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtInputMouseClicked(evt);
            }
        });
        getContentPane().add(txtInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 612, 37));

        btnAnalizar.setBackground(new java.awt.Color(0, 0, 0));
        btnAnalizar.setFont(new java.awt.Font("Cascadia Mono", 1, 14)); // NOI18N
        btnAnalizar.setForeground(new java.awt.Color(204, 0, 0));
        btnAnalizar.setText("ANALIZAR");
        btnAnalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnalizarMouseClicked(evt);
            }
        });
        getContentPane().add(btnAnalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 159, 106));

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(204, 0, 0));
        btnLimpiar.setText("VACIAR CONTENIDO");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setOpaque(false);
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 160, 104));

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setForeground(new java.awt.Color(255, 0, 0));

        tPane.setBackground(new java.awt.Color(255, 255, 255));
        tPane.setForeground(new java.awt.Color(255, 0, 0));
        tPane.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tPane);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 443, 385));

        lblCopyright.setForeground(new java.awt.Color(255, 255, 255));
        lblCopyright.setText("@CopyRight Kevyn_SB");
        getContentPane().add(lblCopyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, -1, -1));

        btnCerrar.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrar.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(204, 0, 0));
        btnCerrar.setText("CERRAR");
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setOpaque(false);
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 120, 40));

        lblFondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblFondoMouseDragged(evt);
            }
        });
        lblFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblFondoMousePressed(evt);
            }
        });
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnalizarMouseClicked
        // TODO add your handling code here:
        File archivo = new File("archivo.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(txtInput.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(analiadorDeEscritura.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Reader lector = new BufferedReader(new FileReader("archivo.txt"));
            Lexer lexer = new Lexer(lector);
            String resultado = "";
            String variable1 = "";
            while (true) {
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    return;
                }
                switch (tokens) {
                    case palabra_reservada:
                        appendToPane(tPane, lexer.lexeme + "\tEs una " + tokens + "\n", Color.RED);
                        break;
                    case operador_matematico:
                        appendToPane(tPane, lexer.lexeme + "\tEs un " + tokens + "\n", Color.BLUE);
                        break;
                    case comentario:
                        appendToPane(tPane, lexer.lexeme + "\tEs un " + tokens + "\n", Color.yellow);
                        break;

                    case variable:
                        appendToPane(tPane, lexer.lexeme + "\tEs un " + tokens + "\n", Color.CYAN);
                        break;
                    case numero:
                        appendToPane(tPane, lexer.lexeme + "\tEs un " + tokens + "\n", Color.DARK_GRAY);
                        break;
                    case vacio:
                        break;
                    case signo_de_agrupacion:
                        appendToPane(tPane, lexer.lexeme + "\tEs un " + tokens + "\n", Color.GREEN);
                        break;
                    case signo_de_puntuacion:
                        appendToPane(tPane, lexer.lexeme + "\tEs un " + tokens + "\n", Color.MAGENTA);
                        break;
                    case comillas:
                        appendToPane(tPane, lexer.lexeme + "\tEs un " + tokens + "\n", Color.ORANGE);
                        break;
                    default:
                        appendToPane(tPane, lexer.lexeme + "\tEs un " + tokens + "\n", Color.PINK);
                        break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(analiadorDeEscritura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(analiadorDeEscritura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAnalizarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        tPane.setText("");
        txtInput.setText("");

    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void txtInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtInputMouseClicked
        // TODO add your handling code here:
        txtInput.setText("");
        txtInput.setForeground(Color.red);
        txtInput.setEditable(true);
    }//GEN-LAST:event_txtInputMouseClicked

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void lblFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFondoMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_lblFondoMousePressed

    private void lblFondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFondoMouseDragged
        int x= evt.getXOnScreen();
        int y= evt.getYOnScreen();
        this.setLocation(xMouse,yMouse);
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_lblFondoMouseDragged

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
            java.util.logging.Logger.getLogger(analiadorDeEscritura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(analiadorDeEscritura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(analiadorDeEscritura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(analiadorDeEscritura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new analiadorDeEscritura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTextPane tPane;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
 private void appendToPane(JTextPane tp, String msg, Color c) {//Método Append to Pane;
        StyleContext sc = StyleContext.getDefaultStyleContext();//StyleContext define un conjunto de estilos.
        //en sc se guarda el estilo por defecto.
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);//definir la COLECCIÓN DE ATRIBUTOS ÚNICOS

        aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Lucida Console");
        aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

        int len = tp.getDocument().getLength();
        tp.setCaretPosition(len);
        tp.setCharacterAttributes(aset, false);
        tp.replaceSelection(msg);
    }
}
