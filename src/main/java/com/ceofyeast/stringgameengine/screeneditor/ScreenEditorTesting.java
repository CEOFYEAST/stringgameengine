/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ceofyeast.stringgameengine.screeneditor;

  // Used to enable full-screen mode
import java.awt.GraphicsEnvironment;
import java.awt.GraphicsDevice;

  // Used to close window
import java.awt.event.WindowEvent;

/**
 *
 * @author bento
 */
public class ScreenEditorTesting extends javax.swing.JFrame {
  /**
   * Base width of a cell in pixels
   */
  static final int BASE_WIDTH = 6;
  
  /**
   * Base height of a cell in pixels
   */
  static final int BASE_HEIGHT = 13;
  
  /**
   * Number of columns of cells in the screen
   */
  static int columnCount = 6;
  
  /**
   * Number of rows of cells in the screen
   */
  static int rowCount = 3;
  
  /**
   * Scale to apply to base ratio of 6x13 pixels, also to font-size
   * Ex: Scale of two would result in cells with width 12 pixels and height 26 pixels (2 * 6, 13 )
   */
  static int faceSize = 12;
  
  /**
   * Grid JPanel used to represent a Screen object graphically
   */
  javax.swing.JPanel cellsMatrix;
  
  /**
   * Used to enable full-screen mode
   */
  static GraphicsDevice device = GraphicsEnvironment
        .getLocalGraphicsEnvironment().getScreenDevices()[0];
  
  /**
   * Creates new form ScreenEditorTesting
   */
  public ScreenEditorTesting() {
    initComponents();
    
    initializeCellsMatrix();
    
    device.setFullScreenWindow( this );
  }
  
  public void initializeCellsMatrix() {
    cellsMatrix = new javax.swing.JPanel();
    
    cellsMatrix.setLayout( new java.awt.GridLayout( rowCount, columnCount ) );
    
    for( int i = 0; i < rowCount * columnCount; i++ )
    {
      javax.swing.JTextField cellToAdd = new javax.swing.JTextField();
      
      cellToAdd.setHorizontalAlignment( javax.swing.JTextField.CENTER );
      
      cellToAdd.setText( "R" );
      
      cellToAdd.setBorder( javax.swing.BorderFactory.createLineBorder( new java.awt.Color( 0, 0, 0 ) ) );
      
      cellToAdd.setMargin( new java.awt.Insets(0, 0, 0, 0) );
      
      cellsMatrix.add( cellToAdd );
    }
    
    getContentPane().add( cellsMatrix );
    
    int cellsMatrixWidth = BASE_WIDTH * faceSize * columnCount;
    
    int cellsMatrixHeight = BASE_HEIGHT * faceSize * rowCount;
    
    cellsMatrix.setBounds( 0, 0, cellsMatrixWidth, cellsMatrixHeight );
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    menuBar = new javax.swing.JMenuBar();
    fileMenu = new javax.swing.JMenu();
    closeMenuItem = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    getContentPane().setLayout(null);

    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    getContentPane().add(jPanel1);
    jPanel1.setBounds(90, 10, 100, 100);

    fileMenu.setText("File");

    closeMenuItem.setText("Close");
    closeMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        closeActionPerformed(evt);
      }
    });
    fileMenu.add(closeMenuItem);

    menuBar.add(fileMenu);

    setJMenuBar(menuBar);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
    // TODO add your handling code here:
    this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
  }//GEN-LAST:event_closeActionPerformed

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
      java.util.logging.Logger.getLogger(ScreenEditorTesting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(ScreenEditorTesting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(ScreenEditorTesting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(ScreenEditorTesting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ScreenEditorTesting().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuItem closeMenuItem;
  private javax.swing.JMenu fileMenu;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JMenuBar menuBar;
  // End of variables declaration//GEN-END:variables
}
