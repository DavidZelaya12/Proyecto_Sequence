package Proyecto;

import javax.swing.JOptionPane;
import Tablero.*;
import java.util.ArrayList;
import java.util.Random;

public class Oponente extends javax.swing.JFrame {

    Player player;
    Main main;

    ArrayList<String> Colores;
    ArrayList<Player> Jugadores;

    int equipos = 0;
    int jugadores = 0;

    int contador;

    public Oponente(Player player, Main main) {
        initComponents();
        this.player = player;
        this.main = main;
        Colores = new ArrayList<>();
        Jugadores = new ArrayList<>();

        Colores.add("Buenarda");
        Colores.add("Aqua");
        Colores.add("Verde");
        Colores.add("Azul");
        Colores.add("Rosa");
        Colores.add("AzulClaro");
        Colores.add("Negra");
        Colores.add("Lavanda");
        Colores.add("Vino");
        Colores.add("Blanca");
        Colores.add("Naranja");
        Colores.add("Gris");
        Colores.add("Cafe");
        Colores.add("Roja");
        Colores.add("Morada");
        Colores.add("Arcoiris");
        Colores.add("Malvada");
        Colores.add("VerdeOscuro");
        Colores.add("Amarilla");
        Colores.add("Oro");

        JugadorActual.setEditable(true);
        Equipos.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        JugadorActual = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Equipos = new javax.swing.JTextArea();
        Añadir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(111, 66, 22));

        JugadorActual.setEditable(false);
        JugadorActual.setBackground(new java.awt.Color(31, 14, 0));
        JugadorActual.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        JugadorActual.setForeground(new java.awt.Color(170, 153, 0));
        JugadorActual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JugadorActual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 153, 0), 2));
        JugadorActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugadorActualActionPerformed(evt);
            }
        });

        Equipos.setColumns(20);
        Equipos.setRows(5);
        jScrollPane1.setViewportView(Equipos);

        Añadir.setText("Añadir");
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("HP Simplified", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INVITAR JUGADORES");

        jLabel3.setText("Ingrese el nombre del jugador");

        jButton1.setText("Comenzar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JugadorActual, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton1)))
                .addGap(149, 149, 149)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(136, 136, 136))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jLabel2)
                    .addContainerGap(754, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(JugadorActual, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(Añadir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jLabel2)
                    .addContainerGap(526, Short.MAX_VALUE)))
        );

        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1093, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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


    private void JugadorActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugadorActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JugadorActualActionPerformed

    
    public String colocarColor(boolean random,int i){
       String color="";
        if(random==true){
        Random numrandom=new Random();
        int hola=numrandom.nextInt(Colores.size());
        color=Colores.get(hola);
        Colores.remove(hola);
        return color;
        }else{
            color=Colores.get(i);
        }
        
        return color;
    }
    public void Equipos(){
        String hi="";
        for(int EquipoActual=0;EquipoActual<equipos;EquipoActual++){
            hi+="Equipo #"+(EquipoActual+1)+"\n";
            for(int JugadorActual=0;JugadorActual<Jugadores.size();JugadorActual++){
                if(Jugadores.get(JugadorActual).getEquipo()==EquipoActual){
                    colocarColor(player.ColoresEquipo,EquipoActual);
                    Jugadores.get(JugadorActual).setColor(colocarColor(player.ColoresEquipo,EquipoActual));
                    hi+="-> "+Jugadores.get(JugadorActual).getUser()+" Color: "+Jugadores.get(JugadorActual).getColor()+"\n";
                }
            }
            
        }
        
        Equipos.setText(hi);
        
    }
    
    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
        // TODO add your handling code here:

        if (equipos <= player.cantEquipos) {
            System.out.println("Hola");
            //Equipos.setText(Equipos.getText() + "\n Equipo #" + equipos + 1);
            if (jugadores < player.CantJugadores / player.cantEquipos) {
                System.out.println("Hola3");
                if (main.getfunciones().buscarplayer(JugadorActual.getText(), 0) != null) {
                    System.out.println("Hola2");
                    Player jugador=main.getfunciones().buscarplayer(JugadorActual.getText(), 0);
                    jugador.equipo=equipos;
                    Jugadores.add(jugador);
                    System.out.println("Jugador: "+jugador.getUser()+"Equipo: "+jugador.getEquipo()+" " );
                    //Equipos.setText(Equipos.getText() + "\n" + main.getfunciones().buscarplayer(JugadorActual.getText(), 0).getUser());
                    jugadores++;
                } else {
                }
            } else {
                equipos++;
                jugadores = 0;
            }
            if(equipos==player.cantEquipos){
                Equipos();
            }
        }

    }//GEN-LAST:event_AñadirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        if(equipos==player.cantEquipos){
                new Juego(player,main,Jugadores).setVisible(true);
                this.dispose();
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                Menu menu = new Menu(player, main);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Añadir;
    private javax.swing.JTextArea Equipos;
    private javax.swing.JTextField JugadorActual;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
