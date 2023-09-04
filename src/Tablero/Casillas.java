package Tablero;


import java.awt.*;
import javax.swing.*;
public class Casillas {
    
    JLabel label;
    Cartass Carta;
    int row;
    int column;
    boolean selected = false;
    
    
   
    public Casillas(int row, int column, Cartass nose) {        
        this.label = new JLabel();
        this.row = row;
        this.column = column;
        this.Carta = nose;
        
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
       
    public void highlightMove(boolean activar) {
        if (activar) {
            label.setBackground(Color.green);
            label.setOpaque(true);
        } else label.setOpaque(false);
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
            }
             else {
                label.setText(Carta.NombreCarta);
            }
        }        
    }
    
    public void esconderCasilla(boolean esconder) {
        if (esconder) {
            if (Carta.iconoEscondido != null) {
                label.setIcon(Carta.iconoEscondido);
                label.repaint();
            } else {
                label.setIcon(null);
                label.setText("???");
            }  
        } else {
            if (Carta.icono != null) {
                label.setIcon(Carta.icono);
            }
            else
                label.setText(Carta.NombreCarta);
        }
    } 
    
   
    
    
    
}

