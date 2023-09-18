
package Tablero;

import java.awt.Dimension;
import java.awt.GridLayout;
import Proyecto.*;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Juego extends javax.swing.JFrame {

 Player player;
 Main main;
 Tablero tablero;
    public Juego(Player player,Main main,ArrayList<Player> hola) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.player=player;
        this.main=main;
        Tablero.setLayout(new GridLayout(1,1));
        tablero=new Tablero(player, main, null, lblTurnos, this,Manoo,UltimaCarta,hola);
        
        Tablero.setPreferredSize(new Dimension(420,720));
        Manoo.setPreferredSize(new Dimension(35,50));
        
        Tablero.add(tablero);
    }
    
    public JLabel turno(){
        return jugadoractual;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Manoo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jugadoractual = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UltimaCarta = new javax.swing.JLabel();
        Tablero = new javax.swing.JPanel();
        lblTurnos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Manoo.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout ManooLayout = new javax.swing.GroupLayout(Manoo);
        Manoo.setLayout(ManooLayout);
        ManooLayout.setHorizontalGroup(
            ManooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        ManooLayout.setVerticalGroup(
            ManooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel2.add(Manoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 640, 680, 130));

        jButton1.setText("Robar Carta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 670, 110, 40));

        jugadoractual.setText("jLabel2");
        jPanel2.add(jugadoractual, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));
        jPanel2.add(UltimaCarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 100, 120));

        Tablero.setBackground(new java.awt.Color(204, 204, 204));
        Tablero.setForeground(new java.awt.Color(204, 255, 255));
        Tablero.setPreferredSize(new java.awt.Dimension(420, 720));

        javax.swing.GroupLayout TableroLayout = new javax.swing.GroupLayout(Tablero);
        Tablero.setLayout(TableroLayout);
        TableroLayout.setHorizontalGroup(
            TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );
        TableroLayout.setVerticalGroup(
            TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        jPanel2.add(Tablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 549, 540));

        lblTurnos.setText("jLabel1");
        jPanel2.add(lblTurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/f05054a8-99b0-476b-9f4f-8221d2f9c3cd.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tablero.añadirCarta(tablero.getTurno());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Manoo;
    private javax.swing.JPanel Tablero;
    private javax.swing.JLabel UltimaCarta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jugadoractual;
    private javax.swing.JLabel lblTurnos;
    // End of variables declaration//GEN-END:variables
}
