package Tablero;


import java.awt.*;
import javax.swing.*;
public class Casillas {
    
    
    JLabel label;
    Cartass Carta;
    int row;
    int column;
    boolean selected = false;
    boolean coloreada;

    public Casillas(int row, int column, Cartass nose) {
        this.label = new JLabel();
        this.row = row;
        this.column = column;
        this.Carta = nose;

        label.setPreferredSize(new Dimension(70, 65));
       //label.setBorder(BorderFactory.createLineBorder(Color.cyan));
    }
    
    public boolean getColoreada(){
        return coloreada;
    }


    public void CambiarColor(boolean activar) {
        if (activar) {
            label.setBorder(BorderFactory.createLineBorder(Color.green,5));
            coloreada = true;
        } else {
            if (coloreada == true) {
              //  label.setOpaque(false);
                //label.setBackground(null);
                
            label.setBorder(null);
            coloreada=false;
            }
        }
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
    

    public void setPersonaje(Cartass personaje) {
        Carta = personaje;

        if (personaje == null) {
            label.setText("");
            label.setIcon(null);
        } else {
            
            if (Carta.icono != null) {
                label.setIcon(Carta.icono);
            } else {
                label.setText(null);
            }
        }
    }
    
}

