
package raven.form;

import javax.swing.ImageIcon;
import raven.model.Model_Card;

/**
 *
 * @author juanp
 */
public class Form_Home extends javax.swing.JPanel {

    public Form_Home() {
        initComponents();
              card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/raven/icon/stock.png")), "ventas mensuales", "$200000", "increment by 500.000$"));
       card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/raven/icon/flag.png")), "Aportes mensuales", "1200000+", " march"));
card4.setData(new Model_Card(new ImageIcon(getClass().getResource("/raven/icon/profit.png")), "ganacia mensual", "$800000", "increment by 9%"));
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        card4 = new raven.component.Card();
        card2 = new raven.component.Card();
        card3 = new raven.component.Card();

        setBackground(new java.awt.Color(247, 243, 243));

        jLayeredPane1.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card4.setColor1(new java.awt.Color(82, 82, 181));
        card4.setColor2(new java.awt.Color(84, 173, 173));
        jLayeredPane1.add(card4);

        card2.setColor1(new java.awt.Color(139, 0, 0));
        card2.setColor2(new java.awt.Color(202, 39, 39));
        jLayeredPane1.add(card2);

        card3.setColor1(new java.awt.Color(251, 219, 10));
        card3.setColor2(new java.awt.Color(233, 182, 31));
        jLayeredPane1.add(card3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private raven.component.Card card2;
    private raven.component.Card card3;
    private raven.component.Card card4;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
