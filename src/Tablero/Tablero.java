package Tablero;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Proyecto.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class Tablero extends JPanel {

    Player player;
    Main main;
    Juego juego;

    ArrayList<Cartass> CartasTablero = Cartass.CartasTablero();
    ArrayList<Cartass> BarajaGeneral = Cartass.CartasBaraja();
    ArrayList<Cartass> ManoP1;
    ArrayList<Cartass> ManoP2;

    private JTextArea txtAreaEliminados;

    private JLabel Turnos;
    private boolean SeSeleccionoCasilla = false;
    private Casillas casillaSeleccionada;
    private Casillas[][] casillas;
    private boolean mover = false;
    public static boolean P1;
    private Image tablero;
    int pruebaa = 0;

    private int Jugadores = 2;
    
    private int Cartas = 4;
    private int turno = 1;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int imageWidth = getWidth() / 10;
        int imageHeight = getHeight() / 10;
        g.drawImage(tablero, 0, 0, getWidth(), getHeight(), this);
    }

    public Tablero(Player player, Main main, JTextArea txtAreaEliminados, JLabel Turnos, Juego juego) {

        ManoP1 = new ArrayList<>();
        ManoP2 = new ArrayList<>();
        this.player = player;
        this.main = main;
        this.txtAreaEliminados = txtAreaEliminados;
        this.Turnos = Turnos;
        this.juego = juego;

        setLayout(new GridLayout(11, 11));

        //ImageIcon fondo = new ImageIcon("src/img/Tablero.jpg");
        //tablero = fondo.getImage();
        casillas = new Casillas[11][10];

        for (int filas = 0; filas < 11; filas++) {
            for (int columnas = 0; columnas < 10; columnas++) {
                Casillas ficha = new Casillas(filas, columnas, null);
                casillas[filas][columnas] = ficha;
                add(casillas[filas][columnas].label);
            }
        }

        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JLabel label = (JLabel) e.getSource();

                if (SeSeleccionoCasilla == false) {
                    for (int i = 0; i < 11; i++) {
                        for (int j = 0; j < 10; j++) {
                            if (casillas[i][j].label == label) {
                                casillaSeleccionada = casillas[i][j];
                                if (casillaSeleccionada.Carta != null && casillaSeleccionada.Carta.p1 == mover) {
                                    SeSeleccionoCasilla = true;
                                    break;
                                } else {
                                    casillaSeleccionada = null;
                                    SeSeleccionoCasilla = false;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    for (int filas = 0; filas < 11; filas++) {
                        for (int columnas = 0; columnas < 10; columnas++) {
                            if (casillas[filas][columnas].label == label) {
                                if (casillas[filas][columnas].Carta != null) {
                                    if (casillas[filas][columnas].Carta.p1 == mover) {
                                        casillaSeleccionada = casillas[filas][columnas];
                                        break;
                                    }
                                }
                                if (ComprobarMovimientoValido(filas, columnas) == true) {
                                    moverPersonaje(filas, columnas);
                                    SeSeleccionoCasilla = false;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Error: Movimiento invalido");
                                }
                            }

                        }
                    }
                }
            }
        };

        for (int filas = 0; filas < 11; filas++) {
            for (int columnas = 0; columnas < 10; columnas++) {
                casillas[filas][columnas].label.addMouseListener(mouseAdapter);
            }
        }
        
        RepartirCartas();
        ColocarCartas();
        CambiarManos(ManoP1);
        
        setVisible(true);
        Turnos.setText("Turno de: " + player.getUser());
    }
    
    public void añadirCarta(ArrayList<Cartass> hi){
        Random random = new Random();
        
            if(ManoP1.size()<4){
                
            int hola=random.nextInt(hi.size());
            Cartass ficha=BarajaGeneral.get(hola);
            hi.add(ficha);    
            BarajaGeneral.remove(hola);
            JOptionPane.showMessageDialog(null, "Se añadio un "+ficha.NombreCarta+" a tu baraja");
            CambiarManos(hi);
            }else{
                JOptionPane.showMessageDialog(null, "Error: mano llena");
            }
        
    }
    
    
    public void RepartirCartas(){
        
        Random random = new Random();
        
        for(int i=0;i<Cartas;i++){
            int hola=random.nextInt(BarajaGeneral.size());
            Cartass ficha=BarajaGeneral.get(hola);
            ManoP1.add(ficha);
            BarajaGeneral.remove(hola);
        }
        
        for(int i=0;i<Cartas;i++){
            int hola=random.nextInt(BarajaGeneral.size());
            Cartass ficha=BarajaGeneral.get(hola);
            ManoP2.add(ficha);
            BarajaGeneral.remove(hola);
        }
        
        
        
        
    }

    public void CambiarManos(ArrayList<Cartass> hola) {
         ArrayList<Cartass> cartasJugador=hola;
        
        for (int c = 0; c < Cartas; c++) {
            casillas[10][c].setPersonaje(null);
        }

        for (int c = 0; c < hola.size(); c++) {
            casillas[10][c].setPersonaje(cartasJugador.get(c));
        }

    }

    public void ColocarCartas() {
        for (int filas = 0; filas < 10; filas++) {
            for (int columnas = 0; columnas < 10; columnas++) {
                if (pruebaa < CartasTablero.size()) {
                    Cartass personajeActual = CartasTablero.get(pruebaa);
                    casillas[filas][columnas].setPersonaje(personajeActual);
                    pruebaa++;
                }
            }
        }
    }
    

    public ArrayList<Cartass> getTurno() {
        if (turno == 1) {
            return ManoP1;
        }

        if (turno == 2) {
            return ManoP2;
        }

        return null;
    }

    private boolean ComprobarMovimientoValido(int fila, int columna) {
        int FilaActual = casillaSeleccionada.row;
        int ColumnaActual = casillaSeleccionada.column;

        if (casillaSeleccionada.Carta.NumeroCarta == 0) {
            return false;
        }

        if (casillaSeleccionada.Carta.NumeroCarta == 1 || casillaSeleccionada.Carta.NumeroCarta == 3 || casillaSeleccionada.Carta.NumeroCarta == 2) {
            boolean FichaEstaOcupada = (casillas[fila][columna].Carta != null);

            if (FichaEstaOcupada == true) {
                FichaEstaOcupada = (casillas[fila][columna].Carta.p1 == casillaSeleccionada.Carta.p1);
            }
            return (FichaEstaOcupada == false);
        }
        return true;
    }

    private void moverPersonaje(int filanueva, int columananueva) {
        String TurnoDeUsuario = Turnos.getText();

        if (casillas[filanueva][columananueva].Carta != null) {

            Cartass ganador = ValidarFicha(casillaSeleccionada.Carta, casillas[filanueva][columananueva].Carta);

            if (ganador == null) {
                JOptionPane.showMessageDialog(null, "Error: Eliga una carta igual");
            } else if (casillaSeleccionada.Carta == ganador) {
                casillaSeleccionada.setPersonaje(null);
                casillas[filanueva][columananueva].setPersonaje(ganador);            
            if(turno==1){
                JOptionPane.showMessageDialog(null, "Turno de 2");
                turno=2;
            }else{
                JOptionPane.showMessageDialog(null, "Turno de 1");
                turno=1;
            }
            
            CambiarManos(getTurno());
            
            
            } else {
                casillaSeleccionada.setPersonaje(null);
            }


            return;

        }
        Cartass personaje = casillaSeleccionada.Carta;
        casillaSeleccionada.setPersonaje(null);
        casillas[filanueva][columananueva].setPersonaje(personaje);

    }

    public Cartass ValidarFicha(Cartass NuevaCarta, Cartass CartaColocada) {

        if (NuevaCarta.NumeroCarta == CartaColocada.NumeroCarta) {
            JOptionPane.showMessageDialog(null, "Usted coloco un " + NuevaCarta.NombreCarta);
            NuevaCarta.setposicion();

            getTurno().remove(NuevaCarta);
            NuevaCarta.setNombre();
            return NuevaCarta;
        }
        return null;
    }
    
    public void Win(boolean rendirse) {

        main.llamarmenu(player, main);
        juego.dispose();

    }

}