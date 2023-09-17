
package Proyecto;

public class config extends javax.swing.JFrame {

    /**
     * Creates new form config
     */
    
        Player player;
    Main main;
    
    public config(Player player,Main main) {
        initComponents();
                this.player=player;
        this.main=main;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(111, 66, 22));

        jLabel1.setFont(new java.awt.Font("HP Simplified", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONFIGURATION");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Player Count Per Match:");

        jComboBox1.setBackground(new java.awt.Color(59, 42, 9));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 Players (2 Teams)", "3 Players (3 Teams)", "4 Players (2 Teams)", "6 Players (3 Teams)", "8 Players (2 Teams)" }));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TOKEN COLOR");

        jComboBox2.setBackground(new java.awt.Color(59, 42, 9));
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Team" }));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Token Color Distribution:");

        jButton1.setBackground(new java.awt.Color(31, 14, 0));
        jButton1.setIcon(new javax.swing.ImageIcon("src/img/FichaRoja.png"));
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));

        jButton2.setBackground(new java.awt.Color(31, 14, 0));
        jButton2.setIcon(new javax.swing.ImageIcon("src/img/FichaAzul.png"));
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));

        jButton3.setBackground(new java.awt.Color(31, 14, 0));
        jButton3.setIcon(new javax.swing.ImageIcon("src/img/FichaVerde.png"));
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));

        jButton4.setBackground(new java.awt.Color(31, 14, 0));
        jButton4.setIcon(new javax.swing.ImageIcon("src/img/FichaAmarilla.png"));
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));

        jButton5.setBackground(new java.awt.Color(31, 14, 0));
        jButton5.setIcon(new javax.swing.ImageIcon("src/img/FichaAqua.png"));
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));

        jButton6.setBackground(new java.awt.Color(31, 14, 0));
        jButton6.setIcon(new javax.swing.ImageIcon("src/img/FichaAzulClaro.png"));
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));

        jButton7.setBackground(new java.awt.Color(31, 14, 0));
        jButton7.setIcon(new javax.swing.ImageIcon("src/img/FichaBlanca.png"));
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));

        jButton8.setBackground(new java.awt.Color(31, 14, 0));
        jButton8.setIcon(new javax.swing.ImageIcon("src/img/FichaCafe.png"));
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));

        jButton9.setBackground(new java.awt.Color(31, 14, 0));
        jButton9.setIcon(new javax.swing.ImageIcon("src/img/FichaGris.png"));
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));

        jButton10.setBackground(new java.awt.Color(31, 14, 0));
        jButton10.setIcon(new javax.swing.ImageIcon("src/img/FichaLavanda.png"));
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));

        jButton11.setBackground(new java.awt.Color(31, 14, 0));
        jButton11.setIcon(new javax.swing.ImageIcon("src/img/FichaMorada.png"));
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));

        jButton12.setBackground(new java.awt.Color(31, 14, 0));
        jButton12.setIcon(new javax.swing.ImageIcon("src/img/FichaRosa.png"));
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));

        jButton13.setBackground(new java.awt.Color(31, 14, 0));
        jButton13.setIcon(new javax.swing.ImageIcon("src/img/FichaNaranja.png"));
        jButton13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));

        jButton14.setBackground(new java.awt.Color(31, 14, 0));
        jButton14.setIcon(new javax.swing.ImageIcon("src/img/FichaVerdeOscuro.png"));
        jButton14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));

        jButton15.setBackground(new java.awt.Color(31, 14, 0));
        jButton15.setIcon(new javax.swing.ImageIcon("src/img/FichaVino.png"));
        jButton15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));

        jButton16.setBackground(new java.awt.Color(31, 14, 0));
        jButton16.setIcon(new javax.swing.ImageIcon("src/img/FichaNegra.png"));
        jButton16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));

        jButton17.setBackground(new java.awt.Color(31, 14, 0));
        jButton17.setIcon(new javax.swing.ImageIcon("src/img/FichaOro.png"));
        jButton17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));

        jButton18.setBackground(new java.awt.Color(31, 14, 0));
        jButton18.setIcon(new javax.swing.ImageIcon("src/img/FichaArcoiris.png"));
        jButton18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));

        jButton19.setBackground(new java.awt.Color(31, 14, 0));
        jButton19.setIcon(new javax.swing.ImageIcon("src/img/FichaBuenarda.png"));
        jButton19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));

        jButton20.setBackground(new java.awt.Color(31, 14, 0));
        jButton20.setIcon(new javax.swing.ImageIcon("src/img/FichaMalvada.png"));
        jButton20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));

        jButton21.setBackground(new java.awt.Color(31, 14, 0));
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("Volver");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton21)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)
                                .addContainerGap()))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton10))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton15))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton20)))
                            .addContainerGap()))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton21)))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(jButton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton16)
                    .addComponent(jButton17)
                    .addComponent(jButton18)
                    .addComponent(jButton19)
                    .addComponent(jButton20))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        Menu menu=new Menu (player,main);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton21ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
