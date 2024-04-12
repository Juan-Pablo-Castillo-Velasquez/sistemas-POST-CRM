/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package raven.component;

import raven.model.Model_Menu;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

/**
 *
 * @author juanpablo castillo
 */
public class Menu extends javax.swing.JPanel {

    public Menu() {
        initComponents();
         setOpaque(false);
         listMenu1.setOpaque(false);

        Init();
    }
private void Init(){
listMenu1.addItem(new Model_Menu("1", "Dashboard", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("2", "Caja de venta", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("3", "inventario productos", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("4", "ventas", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("5", "proevedores", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.TITLE));
        listMenu1.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("6", "sucursales", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("7", "ventas diarias y mensuales", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("8", " informes", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("9", "More", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("10", "Logout", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMoving = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listMenu1 = new reven.swing.ListMenu<>();

        setPreferredSize(new java.awt.Dimension(215, 445));

        PanelMoving.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/raven/icon/logo.png"))); // NOI18N
        jLabel1.setText("Brasas rojas LTA");

        javax.swing.GroupLayout PanelMovingLayout = new javax.swing.GroupLayout(PanelMoving);
        PanelMoving.setLayout(PanelMovingLayout);
        PanelMovingLayout.setHorizontalGroup(
            PanelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMovingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelMovingLayout.setVerticalGroup(
            PanelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMovingLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
  @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;  // Se crea un objeto Graphics2D a partir del objeto Graphics recibido en el parámetro 'grphcs'.
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);  // Se activa el suavizado de bordes para obtener una apariencia más suave en las formas.

// Se crea un gradiente que va desde el color #1CB5E0 a lo largo de la altura del componente, hasta el color #000046.
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#333333"), 0, getHeight(), Color.decode("#dd1818"));

        g2.setPaint(g);  // Se establece el gradiente como el color de pintura actual.

// Se dibuja un rectángulo redondeado que cubre todo el área del componente con esquinas redondeadas de radio 15.
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);

// Se dibuja un rectángulo sólido en la esquina superior derecha del componente para crear un efecto visual adicional.
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());

        super.paintChildren(grphcs);  // Se llama al método paintChildren() de la clase base para pintar los componentes hijos.
    }
    //lo de  abajo es para poder mover la pantalla

    private int x;
    private int y;
    public void InitMoving(JFrame fram) {
        PanelMoving.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getX();

            }
        });
        this.PanelMoving.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
fram.setLocation(e.getXOnScreen()-x, e.getYOnScreen()-y);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMoving;
    private javax.swing.JLabel jLabel1;
    private reven.swing.ListMenu<String> listMenu1;
    // End of variables declaration//GEN-END:variables
}
