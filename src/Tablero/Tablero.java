package Tablero;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Proyecto.*;
import java.io.IOException;
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

    private int SequenciasEquipo1;
    private int SequenciasEquipo2;
    private int SequenciasEquipo3;
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

    boolean HayGanador;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int imageWidth = getWidth() / 10;
        int imageHeight = getHeight() / 10;
        g.drawImage(tablero, 0, 0, getWidth(), getHeight(), this);
    }

    public Tablero(Player player, Main main, JTextArea txtAreaEliminados, JLabel Turnos, Juego juego, JPanel hola, JLabel x, ArrayList<Player> Players) {

        segundosRestantes = 0;
        this.player = player;
        this.nose = x;
        this.main = main;
        this.txtAreaEliminados = txtAreaEliminados;
        this.Turnos = Turnos;
        this.juego = juego;
        this.hi = hola;

        jugadores = Players;

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
        if (BarajaGeneral.size() > 0) {
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
        } else {
            JOptionPane.showMessageDialog(null, "Error: Ya no quedan cartas en la baraja");
        }
    }

    public void RepartirCartas() {

        Random random = new Random();

        for (int a = 0; a < jugadores.size(); a++) {
            jugadores.get(a).getBaraja().clear();
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

        if (segundosRestantes == 0) {
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

        if (getTurno().size() == Cartas) {
            if (casillas[filanueva][columananueva].Carta != null) {

                Cartass ganador
                        = ValidarFicha(casillaSeleccionada.Carta, casillas[filanueva][columananueva].Carta, filanueva, columananueva);

                if (ganador == null) {
                } else if (casillaSeleccionada.Carta == ganador) {
                    casillaSeleccionada.setPersonaje(null);
                    casillas[filanueva][columananueva].setPersonaje(ganador);
                    verificarGanador(filanueva, columananueva);
                    if (verificarGanador(filanueva, columananueva)) {
                        Win();
                    } else {
                        segundosRestantes = 0;
                    }
                } else {
                    casillaSeleccionada.setPersonaje(null);
                }
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Antes de continuar, anexe cartas a su mazo");
        }
    }

    public boolean AñadirSequencia(int equipo) {

        int pruebaa = 0;
        for (int filas = 0; filas < 10; filas++) {
            for (int columnas = 0; columnas < 10; columnas++) {
                if (casillas[filas][columnas].Carta.NumeroCarta == 1000 && casillas[filas][columnas].Carta.getEquipo() == equipo) {
                    pruebaa++;
                }
            }
        }

        if (pruebaa == 10) {
            return true;
        }
        return false;
    }

    private boolean verificarGanador(int f, int c) {
        int conexionesFilas = 0;
        int conexionesColumnas = 0;
        int conexionesDiagonales = 0;
        int equipoActual = jugadores.get(turno).getEquipo();

        // Verificar en filas
        for (int fila = 0; fila < 10; fila++) {
            int contadorCartasEnFila = 0;
            int rangoCartaAnterior = -2; // Inicializado con un valor que no puede existir
            for (int columna = 0; columna < 10; columna++) {
                Cartass cartaActual = casillas[fila][columna].Carta;
                if (cartaActual != null && cartaActual.NumeroCarta > 0) {
                    contadorCartasEnFila = 0;
                    rangoCartaAnterior = cartaActual.NumeroCarta;
                    Nose(false, 0, 0);
                } else if (cartaActual.getEquipo() == equipoActual || cartaActual.NumeroCarta == 0) {
                    contadorCartasEnFila++;
                    cartaActual.NumeroCarta = -5;
                } else {
                    contadorCartasEnFila = 0;
                    rangoCartaAnterior = -2; // Reiniciar el contador si encontramos una casilla vacía
                    Nose(false, 0, 0);
                }

                if (contadorCartasEnFila >= 5) {
                    conexionesFilas++;
                    Nose(true, f, c);
                }
            }
        }

        // Verificar en columnas
        for (int columna = 0; columna < 10; columna++) {
            int contadorCartasEnColumna = 0;
            int rangoCartaAnterior = -2;
            for (int fila = 0; fila < 10; fila++) {
                Cartass cartaActual = casillas[fila][columna].Carta;
                if (cartaActual != null && cartaActual.NumeroCarta > 0) {
                    contadorCartasEnColumna = 0;
                    rangoCartaAnterior = cartaActual.NumeroCarta;
                    Nose(false, 0, 0);
                } else if (cartaActual.getEquipo() == equipoActual || cartaActual.NumeroCarta == 0) {
                    contadorCartasEnColumna++;
                    cartaActual.NumeroCarta = -5;
                } else {
                    rangoCartaAnterior = -2;
                    contadorCartasEnColumna = 0;
                    Nose(false, 0, 0);
                }

                if (contadorCartasEnColumna >= 5) {
                    conexionesColumnas++;
                    Nose(true, f, c);
                }
            }
        }

        // Verificar en diagonales (izquierda arriba - derecha abajo)
        for (int fila = 0; fila <= 5; fila++) {
            for (int columna = 0; columna <= 5; columna++) {
                int contadorDiagonal = 0;
                int rangoCartaAnterior = -2;
                for (int i = 0; i < 5; i++) {
                    Cartass cartaActual = casillas[fila + i][columna + i].Carta;
                    if (cartaActual != null && cartaActual.NumeroCarta > 0) {
                        contadorDiagonal = 0;
                        rangoCartaAnterior = cartaActual.NumeroCarta;
                        Nose(false, 0, 0);
                    } else if (cartaActual.getEquipo() == equipoActual || cartaActual.NumeroCarta == 0) {
                        contadorDiagonal++;
                        cartaActual.NumeroCarta = -5;
                    } else {
                        contadorDiagonal = 0;
                        rangoCartaAnterior = -2;
                        Nose(false, 0, 0);
                    }

                    if (contadorDiagonal >= 5) {
                        conexionesDiagonales++;
                        Nose(true, f, c);
                    }
                }
            }
        }

        // Verificar en diagonales (derecha arriba - izquierda abajo)
        for (int fila = 0; fila <= 5; fila++) {
            for (int columna = 9; columna >= 4; columna--) {
                int contadorDiagonal = 0;
                int rangoCartaAnterior = -2;
                for (int i = 0; i < 5; i++) {
                    Cartass cartaActual = casillas[fila + i][columna - i].Carta;
                    if (cartaActual != null && cartaActual.NumeroCarta > 0) {
                        contadorDiagonal = 0;
                        rangoCartaAnterior = cartaActual.NumeroCarta;
                        Nose(false, 0, 0);
                    } else if (cartaActual.getEquipo() == equipoActual || cartaActual.NumeroCarta == 0) {
                        contadorDiagonal++;
                        cartaActual.NumeroCarta = -5;
                    } else {
                        contadorDiagonal = 0;
                        rangoCartaAnterior = -2;
                        Nose(false, 0, 0);
                    }

                    if (contadorDiagonal >= 5) {
                        conexionesDiagonales++;
                        Nose(true, f, c);
                    }
                }
            }
        }
        if (AñadirSequencia(jugadores.get(turno).getEquipo())) {
            return true;
        }else
        return false;

    }

    public void Nose(boolean hola, int f, int c) {

        if (hola == true) {
            //Resalta
            for (int filas = 0; filas < 10; filas++) {
                for (int columnas = 0; columnas < 10; columnas++) {
                    if (casillas[filas][columnas].Carta.NumeroCarta == -5) {
                        casillas[filas][columnas].Carta.NumeroCarta = 1000;
                        casillas[filas][columnas].secuencia();
                    }
                }
            }
            casillas[f][c].Carta.NumeroCarta = 1000;
            casillas[f][c].secuencia();
        } else {
            //Restablece
            for (int filas = 0; filas < 10; filas++) {
                for (int columnas = 0; columnas < 10; columnas++) {
                    if (casillas[filas][columnas].Carta.NumeroCarta == -5) {
                        casillas[filas][columnas].Carta.NumeroCarta = -1;
                    }
                }
            }
        }
    }

    public Cartass ValidarFicha(Cartass Atacante, Cartass defensor, int fila, int columna) {

        if (defensor.NumeroCarta == 100) {
            if (EvaluarEliminar(Atacante.NumeroCarta) == true) {
                JOptionPane.showMessageDialog(null, "Se removio un " + Atacante.NombreCarta + " de tu baraja");
                getTurno().remove(Atacante);
                return defensor;
            } else {
                JOptionPane.showMessageDialog(null, "Error: todavia puedes jugar con esta carta");
            }

        }

        if (Atacante.NumeroCarta == 101) {
            if (defensor.NumeroCarta == 1000) {
                JOptionPane.showMessageDialog(null, "Error: Esta ficha esta en una secuencia");
            }
            if (defensor.NumeroCarta < 0) {
                getTurno().remove(Atacante);
                casillaSeleccionada.setPersonaje(null);
                casillas[fila][columna].setPersonaje(null);
                casillas[fila][columna].setPersonaje(defensor.obtenerCartaTablero(defensor.getNombreViejo()));
                BarajaGeneral.add(defensor.obtenerCartaBaraja(defensor.getNombreViejo()));
                Resaltar(null);
                nose.setIcon(Atacante.getIcon());
                JOptionPane.showMessageDialog(null, "Removiste exitosamente la fichad de un rival!");
                //segundosRestantes = 0;
                return null;
            } else {
                JOptionPane.showMessageDialog(null, "Error: Eliga una carta que contenga una ficha");
            }
        }

        if (Atacante.NumeroCarta == 102) {
            if (defensor.NumeroCarta > 0) {
                if (jugadores.get(turno).getEquipo() != defensor.getEquipo()) {
                    JOptionPane.showMessageDialog(null, "Usted coloco un " + Atacante.NombreCarta);
                    getTurno().remove(Atacante);
                    nose.setIcon(Atacante.getIcon());
                    Atacante.SetFicha(jugadores.get(turno).getColor(), jugadores.get(turno).getEquipo());
                    Resaltar(null);
                    //segundosRestantes = 0;
                    return Atacante;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: no puedes quitar las fichas de tus aliados");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error: Casilla ocupada");
            }

        }

        if (Atacante.NumeroCarta != defensor.NumeroCarta) {
            JOptionPane.showMessageDialog(null, "Usted coloco un " + Atacante.NombreCarta);
            getTurno().remove(Atacante);
            nose.setIcon(Atacante.getIcon());
            Atacante.SetFicha(jugadores.get(turno).getColor(), jugadores.get(turno).getEquipo());
            Resaltar(null);
            //segundosRestantes = 0;
            return Atacante;
        }

        if (Atacante.NumeroCarta == defensor.NumeroCarta && Atacante.NumeroCarta < 100) {
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
        JOptionPane.showMessageDialog(null, "Ganaste");
        for (Player jugadorActual : jugadores) {
            try {
                if (jugadorActual.getEquipo() == jugadores.get(turno).getEquipo()) {
                    jugadorActual.añadirpartida(jugadorActual.getUser() + "Gano junto al equipo" + jugadores.get(turno).getEquipo());
                } else {
                    jugadorActual.añadirpartida(jugadorActual.getUser() + "Perdio junto al equipo" + jugadores.get(turno).getEquipo());

                }
            } catch (IOException e) {

            }
        }

        main.llamarmenu(player, main);
        juego.dispose();

    }

}
