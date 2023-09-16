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

    ArrayList<Player> jugadores;

    private JTextArea txtAreaEliminados;
    private JPanel hi;

    private JLabel Turnos;

    private boolean SeSeleccionoCasilla = false;
    private Casillas casillaSeleccionada;
    private Casillas[][] casillas;
    private boolean mover = false;
    private Image tablero;
    Timer timer;
    
    int segundosRestantes;

    private int Cartas = 4;
    private int turno = 0;
    JLabel nose;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int imageWidth = getWidth() / 10;
        int imageHeight = getHeight() / 10;
        g.drawImage(tablero, 0, 0, getWidth(), getHeight(), this);
    }

    public Tablero(Player player, Main main, JTextArea txtAreaEliminados, JLabel Turnos, Juego juego, JPanel hola, JLabel x) {

        segundosRestantes = 0;
        this.player = player;
        this.nose = x;
        this.main = main;
        this.txtAreaEliminados = txtAreaEliminados;
        this.Turnos = Turnos;
        this.juego = juego;
        this.hi = hola;

        jugadores = Funciones.getPlayers();

        setLayout(new GridLayout(10, 10));
        hi.setLayout(new GridLayout(1, Cartas + 1));

        ImageIcon fondo = new ImageIcon("src/img/Taablero.jpg");
        tablero = fondo.getImage();

        casillas = new Casillas[11][10];

        for (int filas = 0; filas < 10; filas++) {
            for (int columnas = 0; columnas < 10; columnas++) {
                Casillas ficha = new Casillas(filas, columnas, null);
                casillas[filas][columnas] = ficha;
                add(casillas[filas][columnas].label);
            }
        }
        for (int columnas = 0; columnas < 10; columnas++) {
            Casillas ficha = new Casillas(10, columnas, null);
            casillas[10][columnas] = ficha;
            hola.add(casillas[10][columnas].label);
        }
        
            timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                juego.turno().setText("Turno de: " + jugadores.get(turno).getUser());
                if (segundosRestantes == 0) {
                    ((Timer) e.getSource()).stop(); // Detener el cronómetro cuando llegue a 0
                    
                    turno++;
                    if (turno >= jugadores.size()) {
                        turno = 0;
                    }
                    for (int c = 0; c < Cartas; c++) {
                        casillas[10][c].setPersonaje(null);
                    }

                    JOptionPane.showMessageDialog(null, "Turno de " + jugadores.get(turno).getUser());
                    CambiarManos(getTurno());
                }

                segundosRestantes--;

                int minutos = segundosRestantes / 60;
                int segundos = segundosRestantes % 60;

                Turnos.setText("Tiempo restante: " + String.format("%02d:%02d", minutos, segundos));

            }
        });


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
                                        Resaltar(casillaSeleccionada.Carta);
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

        //Reparte cartas a las barajas de cada jugador
        RepartirCartas();
        //Coloca valores en el tablero
        ColocarCartas();
        //Coloca la mano inicial
        CambiarManos(jugadores.get(turno).getBaraja());

        casillas[10][9].setPersonaje(new Cartass("basura", 100, true, null));

        setVisible(true);
    }

    public void añadirCarta(ArrayList<Cartass> hi) {
        Random random = new Random();

        if (hi.size() < Cartas) {
            int hola = random.nextInt(hi.size());
            Cartass Carta = BarajaGeneral.get(hola);
            hi.add(Carta);
            BarajaGeneral.remove(hola);
            JOptionPane.showMessageDialog(null, "Se añadio un " + Carta.NombreCarta + " a tu baraja");

        CambiarManos(hi);
        } else {
            JOptionPane.showMessageDialog(null, "Error: mano llena");
        }

    }

    public void RepartirCartas() {

        Random random = new Random();

        for (int a = 0; a < jugadores.size(); a++) {
            for (int i = 0; i < Cartas; i++) {
                int hola = random.nextInt(BarajaGeneral.size());
                Cartass ficha = BarajaGeneral.get(hola);
                jugadores.get(a).getBaraja().add(ficha);
                BarajaGeneral.remove(hola);
            }
        }

    }

    public void comenzarTimer() {
        segundosRestantes = 120;
 
        timer.start();

    }

    public void CambiarManos(ArrayList<Cartass> hola) {
        ArrayList<Cartass> cartasJugador = hola;

        if(segundosRestantes==0){
        timer.stop();
        comenzarTimer();
        }
        
        for (int c = 0; c < hola.size(); c++) {
            casillas[10][c].setPersonaje(cartasJugador.get(c));
        }

    }

    public void ColocarCartas() {
        int pruebaa = 0;
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
        return jugadores.get(turno).getBaraja();
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

    public void Resaltar(Cartass hi) {

        for (int filas = 0; filas < 10; filas++) {
            for (int columnas = 0; columnas < 10; columnas++) {
                if (casillas[filas][columnas].getColoreada() == true) {
                    casillas[filas][columnas].CambiarColor(false);
                }
            }
        }

        if (hi != null) {
            for (int filas = 0; filas < 10; filas++) {
                for (int columnas = 0; columnas < 10; columnas++) {
                    Cartass hola = casillas[filas][columnas].Carta;
                    if (hola.NumeroCarta == hi.NumeroCarta) {
                        casillas[filas][columnas].CambiarColor(true);
                    }

                }
            }
        }
    }

    private void moverPersonaje(int filanueva, int columananueva) {
        String TurnoDeUsuario = Turnos.getText();

        if (casillas[filanueva][columananueva].Carta != null) {

            Cartass ganador = ValidarFicha(casillaSeleccionada.Carta, casillas[filanueva][columananueva].Carta);

            if (ganador == null) {
            } else if (casillaSeleccionada.Carta == ganador) {
                casillaSeleccionada.setPersonaje(null);
                casillas[filanueva][columananueva].setPersonaje(ganador);
            } else {
                casillaSeleccionada.setPersonaje(null);
            }

            return;

        }

    }

    public Cartass ValidarFicha(Cartass Atacante, Cartass defensor) {

        if (defensor.NumeroCarta == 100) {
            if (EvaluarEliminar(Atacante.NumeroCarta) == true) {
                JOptionPane.showMessageDialog(null, "Se removio un " + Atacante.NombreCarta+" de tu baraja");
                getTurno().remove(Atacante);
                return defensor;
            } else {
                JOptionPane.showMessageDialog(null, "Error: todavia puedes jugar con esta carta");
            }

        }

        if (Atacante.NumeroCarta == 102) {
            if (defensor.NumeroCarta > 0) {
                JOptionPane.showMessageDialog(null, "Usted coloco un " + Atacante.NombreCarta);
                Atacante.setposicion();
                getTurno().remove(Atacante);
                nose.setIcon(Atacante.getIcon());
                Atacante.setRango();
                Atacante.setNombre(jugadores.get(turno).getColor());
                Resaltar(null);
                return Atacante;
            } else {
                JOptionPane.showMessageDialog(null, "Error: Casilla ocupada");
            }

        }

        if (Atacante.NumeroCarta == defensor.NumeroCarta) {
            JOptionPane.showMessageDialog(null, "Usted coloco un " + Atacante.NombreCarta);
            Atacante.setposicion();
            getTurno().remove(Atacante);
            nose.setIcon(Atacante.getIcon());
            Atacante.setRango();
            Atacante.setNombre(jugadores.get(turno).getColor());
            Resaltar(null);
            segundosRestantes = 0;
            return Atacante;
        }
        
        
        if(Atacante.NumeroCarta!=defensor.NumeroCarta){
            JOptionPane.showMessageDialog(null, "Error: Eliga una carta igual");
        }
        
        
        return null;
    }

    public boolean EvaluarEliminar(int x) {
        for (int filas = 0; filas < 10; filas++) {
            for (int columnas = 0; columnas < 10; columnas++) {
                if (casillas[filas][columnas].Carta.NumeroCarta == x) {
                    return false;
                }
            }
        }
        return true;
    }

    public void Win() {

        main.llamarmenu(player, main);
        juego.dispose();

    }

}
