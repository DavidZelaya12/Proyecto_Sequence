
package Tablero;

import java.awt.Dimension;
import java.awt.GridLayout;
import Proyecto.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Juego extends javax.swing.JFrame {

 Player player;
 Main main;
 Tablero tablero;
    public Juego(Player player,Main main) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.player=player;
        this.main=main;
        this.setSize(1300,820);
        Tablero.setLayout(new GridLayout(1,1));
        tablero=new Tablero(player, main, null, lblTurnos, this,Manoo,UltimaCarta);
        
        panelquenosetienequemover.setPreferredSize(new Dimension(270,845));
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

        Tablero = new javax.swing.JPanel();
        panelquenosetienequemover = new javax.swing.JPanel();
        lblTurnos = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        NosePanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        UltimaCarta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jugadoractual = new javax.swing.JLabel();
        Manoo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tablero.setBackground(new java.awt.Color(204, 204, 204));
        Tablero.setForeground(new java.awt.Color(204, 255, 255));
        Tablero.setPreferredSize(new java.awt.Dimension(420, 720));

        javax.swing.GroupLayout TableroLayout = new javax.swing.GroupLayout(Tablero);
        Tablero.setLayout(TableroLayout);
        TableroLayout.setHorizontalGroup(
            TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        TableroLayout.setVerticalGroup(
            TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        panelquenosetienequemover.setBackground(new java.awt.Color(153, 153, 153));

        lblTurnos.setText("jLabel1");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelquenosetienequemoverLayout = new javax.swing.GroupLayout(panelquenosetienequemover);
        panelquenosetienequemover.setLayout(panelquenosetienequemoverLayout);
        panelquenosetienequemoverLayout.setHorizontalGroup(
            panelquenosetienequemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelquenosetienequemoverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelquenosetienequemoverLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton1))
        );
        panelquenosetienequemoverLayout.setVerticalGroup(
            panelquenosetienequemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelquenosetienequemoverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTurnos)
                .addGap(281, 281, 281)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NosePanel.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("Ultima carta jugada");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UltimaCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(UltimaCarta)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jugadoractual.setText("jLabel2");

        javax.swing.GroupLayout NosePanelLayout = new javax.swing.GroupLayout(NosePanel);
        NosePanel.setLayout(NosePanelLayout);
        NosePanelLayout.setHorizontalGroup(
            NosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NosePanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(NosePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jugadoractual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        NosePanelLayout.setVerticalGroup(
            NosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NosePanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jugadoractual)
                .addGap(107, 107, 107)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(552, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ManooLayout = new javax.swing.GroupLayout(Manoo);
        Manoo.setLayout(ManooLayout);
        ManooLayout.setHorizontalGroup(
            ManooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );
        ManooLayout.setVerticalGroup(
            ManooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(NosePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Manoo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tablero, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelquenosetienequemover, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(NosePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(Tablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Manoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
            .addComponent(panelquenosetienequemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tablero.añadirCarta(tablero.getTurno());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Manoo;
    private javax.swing.JPanel NosePanel;
    private javax.swing.JPanel Tablero;
    private javax.swing.JLabel UltimaCarta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jugadoractual;
    private javax.swing.JLabel lblTurnos;
    private javax.swing.JPanel panelquenosetienequemover;
    // End of variables declaration//GEN-END:variables
}
