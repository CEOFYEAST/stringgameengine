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

  // Used to size cells based on font size
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.awt.FontMetrics;
import java.text.AttributedCharacterIterator;

import javax.swing.BorderFactory;
import javax.swing.border.*;
import java.awt.Color;

import java.util.HashMap;
import java.util.Map;

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
  static int columnCount = 10;
  
  /**
   * Number of rows of cells in the screen
   */
  static int rowCount = 10;
  
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
    
      // This block of code sets the font to be used for the cells in cellsMatrix
    Font cellsFont = new Font( "Arial", Font.PLAIN, faceSize ); // Initializes the font
    Map< AttributedCharacterIterator.Attribute, String > attributes = new HashMap<>(); // Contains extra attributes to add to font
    attributes.put( TextAttribute.FAMILY, "monospaced" ); // Adds monospaced attribute to attributes
    cellsFont = cellsFont.deriveFont( attributes ); // Updates cellsFont with attributes in attributes 
    
    FontMetrics cellsFontMetrics = getFontMetrics( cellsFont );
    
    char cellText = '┃';
    
    for( int i = 1; i <= rowCount * columnCount; i++ )
    { 
      javax.swing.JTextField cellToAdd = new javax.swing.JTextField();
      
      cellToAdd.setBorder( new MatteBorder( 1, 1, 1, 1, Color.BLACK ) );
      
      cellToAdd.setHorizontalAlignment( javax.swing.JTextField.CENTER );
      
      cellToAdd.setFont( cellsFont );
      
      cellToAdd.setText( String.valueOf( cellText ) );
      
      cellToAdd.setMargin( new java.awt.Insets(0, 0, 0, 0) );
      
        // Gets object containing information about cellsFont dimensions in the context of the cellToAdd text field
      if( i == 1 ) // ensures cellsFontMetrics is only set once
      {
        cellsFontMetrics = cellToAdd.getFontMetrics( cellToAdd.getFont() );
      }
      
      cellsMatrix.add( cellToAdd );
    }
    
    cellsMatrix.setLayout( new java.awt.GridLayout( rowCount, columnCount, 0, 0 ) );
    
    getContentPane().add( cellsMatrix );
    
      // Code block sets dimensions of cellsMatrix by getting dimensions of a single cell and multiplying them out by row/column counts
    int cellHeight = cellsFontMetrics.getMaxAscent() + cellsFontMetrics.getMaxDescent();
    int cellWidth = cellHeight/2;
    int cellsMatrixWidth = cellWidth * columnCount;
    int cellsMatrixHeight = cellHeight * rowCount;
    
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
    jTextField1 = new javax.swing.JTextField();
    jTextField2 = new javax.swing.JTextField();
    jTextField3 = new javax.swing.JTextField();
    jTextField4 = new javax.swing.JTextField();
    menuBar = new javax.swing.JMenuBar();
    fileMenu = new javax.swing.JMenu();
    closeMenuItem = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    getContentPane().setLayout(null);

    jPanel1.setLayout(new java.awt.GridLayout(2, 2));

    jTextField1.setText("jTextField1");
    jPanel1.add(jTextField1);

    jTextField2.setText("jTextField2");
    jPanel1.add(jTextField2);

    jTextField3.setText("jTextField3");
    jPanel1.add(jTextField3);

    jTextField4.setText("jTextField4");
    jPanel1.add(jTextField4);

    getContentPane().add(jPanel1);
    jPanel1.setBounds(80, 10, 100, 110);

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
  private javax.swing.JTextField jTextField1;
  private javax.swing.JTextField jTextField2;
  private javax.swing.JTextField jTextField3;
  private javax.swing.JTextField jTextField4;
  private javax.swing.JMenuBar menuBar;
  // End of variables declaration//GEN-END:variables
}
