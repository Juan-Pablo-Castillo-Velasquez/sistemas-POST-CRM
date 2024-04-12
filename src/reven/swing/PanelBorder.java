/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package reven.swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author juanp
 */
public class PanelBorder extends javax.swing.JPanel {

    public PanelBorder() {
        initComponents();
        setOpaque(false);
        setBackground(new Color(0,0,0));
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
  @Override
   protected void paintComponent(Graphics grphcs) {  // Se sobrescribe el método paintComponent para personalizar la apariencia del componente.
    Graphics2D g2 = (Graphics2D) grphcs;  // Se crea un objeto Graphics2D a partir del objeto Graphics recibido en el parámetro 'grphcs'.
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);  // Se activa el suavizado de bordes para obtener una apariencia más suave en las formas.

    g2.setColor(getBackground());  // Se establece el color de pintura como el color de fondo del componente.

    // Se dibuja un rectángulo redondeado que cubre todo el área del componente con esquinas redondeadas de radio 15.
    g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);

    super.paintComponent(grphcs);  // Se llama al método paintComponent() de la clase base para pintar los componentes hijos.
}
    private void setOpacity(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
