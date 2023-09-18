package Proyecto;

import javax.swing.JOptionPane;
import Tablero.*;

public class Oponente extends javax.swing.JFrame {
    Player player;
    Main main;
    
    public Oponente(Player player,Main main) {
        initComponents();
        this.player=player;
        this.main=main;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        Choose = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        player2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        player3 = new javax.swing.JTextField();
        player4 = new javax.swing.JTextField();
        player5 = new javax.swing.JTextField();
        player6 = new javax.swing.JTextField();
        player7 = new javax.swing.JTextField();
        player8 = new javax.swing.JTextField();
        player9 = new javax.swing.JTextField();
        player10 = new javax.swing.JTextField();
        player11 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(111, 66, 22));

        Choose.setBackground(new java.awt.Color(170, 153, 0));
        Choose.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Choose.setForeground(new java.awt.Color(31, 14, 0));
        Choose.setText("EMPEZAR PARTIDA");
        Choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(31, 14, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        player2.setEditable(false);
        player2.setBackground(new java.awt.Color(31, 14, 0));
        player2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        player2.setForeground(new java.awt.Color(170, 153, 0));
        player2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        player2.setText("Player 1");
        player2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));
        player2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("HP Simplified", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INVITAR JUGADORES");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EQUIPO 1");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EQUIPO 2");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EQUIPO 3");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EQUIPO 3 NO DISPONIBLE");

        jComboBox3.setBackground(new java.awt.Color(59, 42, 9));
        jComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roja", "Azul", "Verde", "Amarilla", "Aqua", "AzulClaro", "Blanca", "Cafe", "Gris", "Lavanda", "Morada", "Rosa", "Naranja", "VerdeOscuro", "Vino", "Negra", "Oro", "Arcoiris", "Buenarda", "Malarda" }));

        jComboBox4.setBackground(new java.awt.Color(59, 42, 9));
        jComboBox4.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roja", "Azul", "Verde", "Amarilla", "Aqua", "AzulClaro", "Blanca", "Cafe", "Gris", "Lavanda", "Morada", "Rosa", "Naranja", "VerdeOscuro", "Vino", "Negra", "Oro", "Arcoiris", "Buenarda", "Malarda" }));

        jComboBox5.setBackground(new java.awt.Color(59, 42, 9));
        jComboBox5.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roja", "Azul", "Verde", "Amarilla", "Aqua", "AzulClaro", "Blanca", "Cafe", "Gris", "Lavanda", "Morada", "Rosa", "Naranja", "VerdeOscuro", "Vino", "Negra", "Oro", "Arcoiris", "Buenarda", "Malarda" }));

        jComboBox6.setBackground(new java.awt.Color(59, 42, 9));
        jComboBox6.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roja", "Azul", "Verde", "Amarilla", "Aqua", "AzulClaro", "Blanca", "Cafe", "Gris", "Lavanda", "Morada", "Rosa", "Naranja", "VerdeOscuro", "Vino", "Negra", "Oro", "Arcoiris", "Buenarda", "Malarda" }));

        jComboBox7.setBackground(new java.awt.Color(59, 42, 9));
        jComboBox7.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roja", "Azul", "Verde", "Amarilla", "Aqua", "AzulClaro", "Blanca", "Cafe", "Gris", "Lavanda", "Morada", "Rosa", "Naranja", "VerdeOscuro", "Vino", "Negra", "Oro", "Arcoiris", "Buenarda", "Malarda" }));

        jComboBox8.setBackground(new java.awt.Color(59, 42, 9));
        jComboBox8.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roja", "Azul", "Verde", "Amarilla", "Aqua", "AzulClaro", "Blanca", "Cafe", "Gris", "Lavanda", "Morada", "Rosa", "Naranja", "VerdeOscuro", "Vino", "Negra", "Oro", "Arcoiris", "Buenarda", "Malarda" }));

        jComboBox9.setBackground(new java.awt.Color(59, 42, 9));
        jComboBox9.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roja", "Azul", "Verde", "Amarilla", "Aqua", "AzulClaro", "Blanca", "Cafe", "Gris", "Lavanda", "Morada", "Rosa", "Naranja", "VerdeOscuro", "Vino", "Negra", "Oro", "Arcoiris", "Buenarda", "Malarda" }));

        jComboBox10.setBackground(new java.awt.Color(59, 42, 9));
        jComboBox10.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roja", "Azul", "Verde", "Amarilla", "Aqua", "AzulClaro", "Blanca", "Cafe", "Gris", "Lavanda", "Morada", "Rosa", "Naranja", "VerdeOscuro", "Vino", "Negra", "Oro", "Arcoiris", "Buenarda", "Malarda" }));

        jComboBox11.setBackground(new java.awt.Color(59, 42, 9));
        jComboBox11.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roja", "Azul", "Verde", "Amarilla", "Aqua", "AzulClaro", "Blanca", "Cafe", "Gris", "Lavanda", "Morada", "Rosa", "Naranja", "VerdeOscuro", "Vino", "Negra", "Oro", "Arcoiris", "Buenarda", "Malarda" }));

        jComboBox12.setBackground(new java.awt.Color(59, 42, 9));
        jComboBox12.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roja", "Azul", "Verde", "Amarilla", "Aqua", "AzulClaro", "Blanca", "Cafe", "Gris", "Lavanda", "Morada", "Rosa", "Naranja", "VerdeOscuro", "Vino", "Negra", "Oro", "Arcoiris", "Buenarda", "Malarda" }));

        player3.setBackground(new java.awt.Color(31, 14, 0));
        player3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        player3.setForeground(new java.awt.Color(170, 153, 0));
        player3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        player3.setText("INVITAR +");
        player3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));
        player3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player3ActionPerformed(evt);
            }
        });

        player4.setBackground(new java.awt.Color(31, 14, 0));
        player4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        player4.setForeground(new java.awt.Color(170, 153, 0));
        player4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        player4.setText("INVITAR +");
        player4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));
        player4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player4ActionPerformed(evt);
            }
        });

        player5.setBackground(new java.awt.Color(31, 14, 0));
        player5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        player5.setForeground(new java.awt.Color(170, 153, 0));
        player5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        player5.setText("INVITAR +");
        player5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));
        player5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player5ActionPerformed(evt);
            }
        });

        player6.setBackground(new java.awt.Color(31, 14, 0));
        player6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        player6.setForeground(new java.awt.Color(170, 153, 0));
        player6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        player6.setText("INVITAR +");
        player6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));
        player6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player6ActionPerformed(evt);
            }
        });

        player7.setBackground(new java.awt.Color(31, 14, 0));
        player7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        player7.setForeground(new java.awt.Color(170, 153, 0));
        player7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        player7.setText("INVITAR +");
        player7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));
        player7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player7ActionPerformed(evt);
            }
        });

        player8.setBackground(new java.awt.Color(31, 14, 0));
        player8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        player8.setForeground(new java.awt.Color(170, 153, 0));
        player8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        player8.setText("INVITAR +");
        player8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));
        player8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player8ActionPerformed(evt);
            }
        });

        player9.setBackground(new java.awt.Color(31, 14, 0));
        player9.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        player9.setForeground(new java.awt.Color(170, 153, 0));
        player9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        player9.setText("INVITAR +");
        player9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));
        player9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player9ActionPerformed(evt);
            }
        });

        player10.setBackground(new java.awt.Color(31, 14, 0));
        player10.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        player10.setForeground(new java.awt.Color(170, 153, 0));
        player10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        player10.setText("INVITAR +");
        player10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));
        player10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player10ActionPerformed(evt);
            }
        });

        player11.setBackground(new java.awt.Color(31, 14, 0));
        player11.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        player11.setForeground(new java.awt.Color(170, 153, 0));
        player11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        player11.setText("INVITAR +");
        player11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));
        player11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(player3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(player4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(player5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))
                            .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(player7, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(player8, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(player9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(player6, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(131, 131, 131)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(player11, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(79, 79, 79))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(player10, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(128, 128, 128))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(300, 300, 300)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(Choose, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(player6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(player10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(player3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(player7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(player11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(player4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(player8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addComponent(jLabel2)))
                        .addGap(125, 125, 125))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(240, 240, 240))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(304, 304, 304)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)))
                .addComponent(Choose, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(111, 66, 22));

        jLabel6.setFont(new java.awt.Font("HP Simplified", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("INVITAR JUGADORES");

        jButton2.setBackground(new java.awt.Color(31, 14, 0));
        jButton2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("INVITAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(jLabel6)))
                .addContainerGap(413, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel2, javax.swing.JLayeredPane.PALETTE_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1093, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu llamar=new Menu(player,main);
        llamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseActionPerformed

        String usuario2=player2.getText();
        player.setOponente(usuario2);
        Juego jugar=new Juego(player,main);
        jugar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ChooseActionPerformed

    private void player2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player2ActionPerformed

    private void player3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player3ActionPerformed

    private void player4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player4ActionPerformed

    private void player5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player5ActionPerformed

    private void player6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player6ActionPerformed

    private void player7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player7ActionPerformed

    private void player8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player8ActionPerformed

    private void player9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player9ActionPerformed

    private void player10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player10ActionPerformed

    private void player11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player11ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int cant = new Funciones().getCant();
        if(cant == 2){
            player3.setVisible(false);
            player4.setVisible(false);
            player5.setVisible(false);
            player7.setVisible(false);
            player8.setVisible(false);
            player9.setVisible(false);
            player10.setVisible(false);
            player11.setVisible(false);
            jComboBox4.setVisible(false);
            jComboBox5.setVisible(false);
            jComboBox6.setVisible(false);
            jComboBox8.setVisible(false);
            jComboBox9.setVisible(false);
            jComboBox10.setVisible(false);
            jComboBox11.setVisible(false);
            jComboBox12.setVisible(false);
        }
        else if(cant == 3){
            player3.setVisible(false);
            player4.setVisible(false);
            player5.setVisible(false);
            player7.setVisible(false);
            player8.setVisible(false);
            player9.setVisible(false);
            player11.setVisible(false);
            jComboBox4.setVisible(false);
            jComboBox5.setVisible(false);
            jComboBox6.setVisible(false);
            jComboBox8.setVisible(false);
            jComboBox9.setVisible(false);
            jComboBox10.setVisible(false);
            jComboBox12.setVisible(false);
            jLabel2.setVisible(false);
        }
        else if(cant == 4){
            player4.setVisible(false);
            player5.setVisible(false);
            player8.setVisible(false);
            player9.setVisible(false);
            player10.setVisible(false);
            player11.setVisible(false);
            jComboBox5.setVisible(false);
            jComboBox6.setVisible(false);
            jComboBox9.setVisible(false);
            jComboBox10.setVisible(false);
            jComboBox11.setVisible(false);
            jComboBox12.setVisible(false);
        }
        else if(cant == 6){
            player4.setVisible(false);
            player5.setVisible(false);
            player8.setVisible(false);
            player9.setVisible(false);
            jComboBox5.setVisible(false);
            jComboBox6.setVisible(false);
            jComboBox9.setVisible(false);
            jComboBox10.setVisible(false);
            jLabel2.setVisible(false);
        }
        else if(cant == 8){
            player10.setVisible(false);
            player11.setVisible(false);
            jComboBox11.setVisible(false);
            jComboBox12.setVisible(false);
        }
        jPanel2.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Choose;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField player10;
    private javax.swing.JTextField player11;
    private javax.swing.JTextField player2;
    private javax.swing.JTextField player3;
    private javax.swing.JTextField player4;
    private javax.swing.JTextField player5;
    private javax.swing.JTextField player6;
    private javax.swing.JTextField player7;
    private javax.swing.JTextField player8;
    private javax.swing.JTextField player9;
    // End of variables declaration//GEN-END:variables
}
