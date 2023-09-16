package Tablero;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import Proyecto.*;

public class Cartass {
String NombreCarta;
    int NumeroCarta;
    boolean p1;
    boolean posicionado = false;
    ImageIcon icono;
    ImageIcon iconoEscondido;
    private int dificultad;
    Player player;

    public Cartass(String name, int lvl, boolean placed, String path) {
        this.NombreCarta = name;
        this.NumeroCarta = lvl;
        this.p1 = placed;
        this.dificultad = 8;

        try {
            Image resizedImg = resizeImage(ImageIO.read(new File("src/img/interrogacion.jpg")), 85, 85);
            iconoEscondido = new ImageIcon(resizedImg);
        } catch (Exception e) {
            iconoEscondido = null;
        }

        try {
            Image newImg = resizeImage(ImageIO.read(new File(path)), 55, 55);
            icono = new ImageIcon(newImg);
        } catch (Exception e) {
            icono = null;
        }

        if(p1==false || lvl==100){
        loadIcon();
        }
    }

    public void setposicion() {
        p1 = true;
    }

    public void setRango() {
        NumeroCarta = -1;
    }

    public void setDificultad(int num) {
        this.dificultad = num;
    }

    private void loadIcon() {
        String NombreFoto="";
        
        if(p1==false || NumeroCarta==100 || NumeroCarta==-1){
        NombreFoto = "src/img/" + NombreCarta + ".png";
        }
        try {
            Image newImg = resizeImage(ImageIO.read(new File(NombreFoto)), 60, 55);
            icono = new ImageIcon(newImg);
        } catch (Exception e) {
            icono = null;
        }
    }
    
    public ImageIcon getIcon(){
        return icono;
    }

    private Image resizeImage(Image img, int w, int h) {
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g2.drawImage(img, 0, 0, w, h, null);
        g2.dispose();

        return resizedImg;
    }

    public static ArrayList<Cartass> CartasTablero() {
        ArrayList<Cartass> personajes = new ArrayList<Cartass>();

        //Fila 1
        personajes.add(new Cartass("Esquina", 0, true, null));
        personajes.add(new Cartass("2 de Picas", 1, true, null));
        personajes.add(new Cartass("3 de Picas", 2, true, null));
        personajes.add(new Cartass("4 de Picas", 3, true, null));
        personajes.add(new Cartass("5 de Picas", 4, true, null));
        personajes.add(new Cartass("6 de Picas", 5, true, null));
        personajes.add(new Cartass("7 de Picas", 6, true, null));
        personajes.add(new Cartass("8 de Picas", 7, true, null));
        personajes.add(new Cartass("9 de Picas", 8, true, null));
        personajes.add(new Cartass("Esquina", 0, true, null));

        //Fila 2
        personajes.add(new Cartass("6 de Trebol", 9, true, null));
        personajes.add(new Cartass("5 de Trebol", 10, true, null));
        personajes.add(new Cartass("4 de Trebol", 11, true, null));
        personajes.add(new Cartass("3 de Trebol", 29, true, null));
        personajes.add(new Cartass("2 de Trebol", 12, true, null));
        personajes.add(new Cartass("As de corazones", 60, true, null));
        personajes.add(new Cartass("Rey de corazones", 70, true, null));
        personajes.add(new Cartass("Reina de corazones", 71, true, null));
        personajes.add(new Cartass("10 de Corazones", 16, true, null));
        personajes.add(new Cartass("10 de Picas", 17, true, null));

        //Fila 3 
        personajes.add(new Cartass("7 de Trebol", 33, true, null));
        personajes.add(new Cartass("As de picas", 61, true, null));
        personajes.add(new Cartass("2 de diamante", 19, true, null));
        personajes.add(new Cartass("3 de diamante", 20, true, null));
        personajes.add(new Cartass("4 de diamante", 21, true, null));
        personajes.add(new Cartass("5 de diamante", 22, true, null));
        personajes.add(new Cartass("6 de diamante", 23, true, null));
        personajes.add(new Cartass("7 de diamante", 24, true, null));
        personajes.add(new Cartass("9 de corazones", 42, true, null));
        personajes.add(new Cartass("Reina de picas", 72, true, null));

        //Fila 4
        personajes.add(new Cartass("8 de Trebol", 27, true, null));
        personajes.add(new Cartass("Rey de picas", 73, true, null));
        personajes.add(new Cartass("6 de Trebol", 9, true, null));
        personajes.add(new Cartass("5 de Trebol", 10, true, null));
        personajes.add(new Cartass("4 de Trebol", 11, true, null));
        personajes.add(new Cartass("3 de Trebol", 29, true, null));
        personajes.add(new Cartass("2 de Trebol", 12, true, null));
        personajes.add(new Cartass("8 de diamante", 30, true, null));
        personajes.add(new Cartass("8 de corazones", 31, true, null));
        personajes.add(new Cartass("Rey de picas", 73, true, null));

        //Fila 5
        personajes.add(new Cartass("9 de Trebol", 32, true, null));
        personajes.add(new Cartass("Reina de picas", 72, true, null));
        personajes.add(new Cartass("7 de Trebol", 33, true, null));
        personajes.add(new Cartass("6 de corazones", 34, true, null));
        personajes.add(new Cartass("5 de corazones", 35, true, null));
        personajes.add(new Cartass("4 de corazones", 36, true, null));
        personajes.add(new Cartass("As de corazones", 60, true, null));
        personajes.add(new Cartass("9 de diamante", 25, true, null));
        personajes.add(new Cartass("7 de corazones", 37, true, null));
        personajes.add(new Cartass("As de picas", 61, true, null));

        //Fila 6
        personajes.add(new Cartass("10 de Trebol", 38, true, null));
        personajes.add(new Cartass("10 de Picas", 17, true, null));
        personajes.add(new Cartass("8 de Trebol", 27, true, null));
        personajes.add(new Cartass("7 de corazones", 37, true, null));
        personajes.add(new Cartass("2 de corazones", 39, true, null));
        personajes.add(new Cartass("3 de corazones", 40, true, null));
        personajes.add(new Cartass("Rey de corazones", 70, true, null));
        personajes.add(new Cartass("10 de diamante", 41, true, null));
        personajes.add(new Cartass("6 de corazones", 34, true, null));
        personajes.add(new Cartass("2 de diamante", 19, true, null));

        //Fila 7
        personajes.add(new Cartass("Reina de Trebol", 74, true, null));
        personajes.add(new Cartass("9 de Picas", 8, true, null));
        personajes.add(new Cartass("9 de Trebol", 32, true, null));
        personajes.add(new Cartass("8 de corazones", 31, true, null));
        personajes.add(new Cartass("9 de corazones", 42, true, null));
        personajes.add(new Cartass("10 de Corazones", 16, true, null));
        personajes.add(new Cartass("Reina de corazones", 71, true, null));
        personajes.add(new Cartass("Reina de diamantes", 78, true, null));
        personajes.add(new Cartass("5 de corazones", 35, true, null));
        personajes.add(new Cartass("3 de diamante", 20, true, null));

        //Fila 8
        personajes.add(new Cartass("Rey de Trebol", 75, true, null));
        personajes.add(new Cartass("8 de Picas", 7, true, null));
        personajes.add(new Cartass("10 de Trebol", 38, true, null));
        personajes.add(new Cartass("Reina de Trebol", 74, true, null));
        personajes.add(new Cartass("Rey de Trebol", 75, true, null));
        personajes.add(new Cartass("As de Trebol", 62, true, null));
        personajes.add(new Cartass("As de diamante", 63, true, null));
        personajes.add(new Cartass("Rey de diamante", 76, true, null));
        personajes.add(new Cartass("4 de corazones", 36, true, null));
        personajes.add(new Cartass("4 de diamante", 21, true, null));

        //Fila 9
        personajes.add(new Cartass("As de Trebol", 62, true, null));
        personajes.add(new Cartass("7 de Picas", 6, true, null));
        personajes.add(new Cartass("6 de Picas", 5, true, null));
        personajes.add(new Cartass("5 de Picas", 4, true, null));
        personajes.add(new Cartass("4 de Picas", 3, true, null));
        personajes.add(new Cartass("3 de Picas", 2, true, null));
        personajes.add(new Cartass("2 de Picas", 1, true, null));
        personajes.add(new Cartass("2 de corazones", 39, true, null));
        personajes.add(new Cartass("3 de corazones", 40, true, null));
        personajes.add(new Cartass("5 de diamante", 22, true, null));

        //Fila 10
        personajes.add(new Cartass("Esquina", 0, true, null));
        personajes.add(new Cartass("As de diamante", 63, true, null));
        personajes.add(new Cartass("Rey de diamante", 76, true, null));
        personajes.add(new Cartass("Reina de diamantes", 78, true, null));
        personajes.add(new Cartass("10 de diamante", 41, true, null));
        personajes.add(new Cartass("9 de diamante", 25, true, null));
        personajes.add(new Cartass("8 de diamante", 30, true, null));
        personajes.add(new Cartass("7 de diamante", 24, true, null));
        personajes.add(new Cartass("6 de diamante", 23, true, null));
        personajes.add(new Cartass("Esquina", 0, true, null));

        return personajes;
    }

    public static ArrayList<Cartass> CartasBaraja() {
        ArrayList<Cartass> personajes = new ArrayList<Cartass>();

        personajes.add(new Cartass("2 de Picas", 1, false, null));
        personajes.add(new Cartass("3 de Picas", 2, false, null));
        personajes.add(new Cartass("4 de Picas", 3, false, null));
        personajes.add(new Cartass("5 de Picas", 4, false, null));
        personajes.add(new Cartass("6 de Picas", 5, false, null));
        personajes.add(new Cartass("7 de Picas", 6, false, null));
        personajes.add(new Cartass("8 de Picas", 7, false, null));
        personajes.add(new Cartass("9 de Picas", 8, false, null));
        //personajes.add(new Cartass("Esquina", 0, false, null));
        personajes.add(new Cartass("6 de Trebol", 9, false, null));
        personajes.add(new Cartass("5 de Trebol", 10, false, null));
        personajes.add(new Cartass("4 de Trebol", 11, false, null));
        personajes.add(new Cartass("3 de Trebol", 29, false, null));
        personajes.add(new Cartass("2 de Trebol", 12, false, null));
        personajes.add(new Cartass("As de corazones", 60, false, null));
        personajes.add(new Cartass("Rey de corazones", 70, false, null));
        personajes.add(new Cartass("Reina de corazones", 71, false, null));
        personajes.add(new Cartass("10 de Corazones", 16, false, null));
        personajes.add(new Cartass("10 de Picas", 17, false, null));
        personajes.add(new Cartass("7 de Picas", 6, false, null));
        personajes.add(new Cartass("As de picas", 61, false, null));
        personajes.add(new Cartass("2 de diamante", 19, false, null));
        personajes.add(new Cartass("3 de diamante", 20, false, null));
        personajes.add(new Cartass("4 de diamante", 21, false, null));
        personajes.add(new Cartass("5 de diamante", 22, false, null));
        personajes.add(new Cartass("6 de diamante", 23, false, null));
        personajes.add(new Cartass("7 de diamante", 24, false, null));
        personajes.add(new Cartass("9 de corazones", 42, false, null));
        personajes.add(new Cartass("Reina de picas", 72, false, null));
        personajes.add(new Cartass("8 de Trebol", 27, false, null));
        personajes.add(new Cartass("Rey de picas", 73, false, null));
        personajes.add(new Cartass("6 de Trebol", 9, false, null));
        personajes.add(new Cartass("5 de Trebol", 10, false, null));
        personajes.add(new Cartass("4 de Trebol", 11, false, null));
        personajes.add(new Cartass("3 de Trebol", 29, false, null));
        personajes.add(new Cartass("2 de Trebol", 12, false, null));
        personajes.add(new Cartass("8 de diamante", 30, false, null));
        personajes.add(new Cartass("8 de corazones", 31, false, null));
        personajes.add(new Cartass("Rey de picas", 73, false, null));
        personajes.add(new Cartass("9 de Trebol", 32, false, null));
        personajes.add(new Cartass("Reina de picas", 72, false, null));
        personajes.add(new Cartass("7 de Trebol", 33, false, null));
        personajes.add(new Cartass("6 de corazones", 34, false, null));
        personajes.add(new Cartass("5 de corazones", 35, false, null));
        personajes.add(new Cartass("4 de corazones", 36, false, null));
        personajes.add(new Cartass("As de corazones", 60, false, null));
        personajes.add(new Cartass("9 de diamante", 25, false, null));
        personajes.add(new Cartass("7 de corazones", 37, false, null));
        personajes.add(new Cartass("As de picas", 61, false, null));
        personajes.add(new Cartass("10 de Trebol", 38, false, null));
        personajes.add(new Cartass("10 de Picas", 17, false, null));
        personajes.add(new Cartass("8 de Trebol", 27, false, null));
        personajes.add(new Cartass("7 de corazones", 37, false, null));
        personajes.add(new Cartass("2 de corazones", 39, false, null));
        personajes.add(new Cartass("3 de corazones", 40, false, null));
        personajes.add(new Cartass("Rey de corazones", 70, false, null));
        personajes.add(new Cartass("10 de diamante", 41, false, null));
        personajes.add(new Cartass("6 de corazones", 34, false, null));
        personajes.add(new Cartass("2 de diamante", 19, false, null));
        personajes.add(new Cartass("Reina de Trebol", 74, false, null));
        personajes.add(new Cartass("9 de Picas", 8, false, null));
        personajes.add(new Cartass("9 de Trebol", 32, false, null));
        personajes.add(new Cartass("8 de corazones", 31, false, null));
        personajes.add(new Cartass("9 de corazones", 42, false, null));
        personajes.add(new Cartass("10 de Corazones", 16, false, null));
        personajes.add(new Cartass("Reina de corazones", 71, false, null));
        personajes.add(new Cartass("Reina de diamantes", 78, false, null));
        personajes.add(new Cartass("5 de corazones", 35, false, null));
        personajes.add(new Cartass("3 de diamante", 20, false, null));
        personajes.add(new Cartass("Rey de Trebol", 75, false, null));
        personajes.add(new Cartass("8 de Picas", 7, false, null));
        personajes.add(new Cartass("10 de Trebol", 38, false, null));
        personajes.add(new Cartass("Reina de Trebol", 74, false, null));
        personajes.add(new Cartass("Rey de Trebol", 75, false, null));
        personajes.add(new Cartass("As de Trebol", 62, false, null));
        personajes.add(new Cartass("As de diamante", 63, false, null));
        personajes.add(new Cartass("Rey de diamante", 76, false, null));
        personajes.add(new Cartass("4 de corazones", 36, false, null));
        personajes.add(new Cartass("4 de diamante", 21, false, null));
        personajes.add(new Cartass("As de Trebol", 62, false, null));
        personajes.add(new Cartass("7 de Picas", 6, false, null));
        personajes.add(new Cartass("6 de Picas", 5, false, null));
        personajes.add(new Cartass("5 de Picas", 4, false, null));
        personajes.add(new Cartass("4 de Picas", 3, false, null));
        personajes.add(new Cartass("3 de Picas", 2, false, null));
        personajes.add(new Cartass("2 de Picas", 1, false, null));
        personajes.add(new Cartass("2 de corazones", 39, false, null));
        personajes.add(new Cartass("3 de corazones", 40, false, null));
        personajes.add(new Cartass("5 de diamante", 22, false, null));
        personajes.add(new Cartass("As de diamante", 63, false, null));
        personajes.add(new Cartass("Rey de diamante", 76, false, null));
        personajes.add(new Cartass("Reina de diamantes", 78, false, null));
        personajes.add(new Cartass("10 de diamante", 41, false, null));
        personajes.add(new Cartass("9 de diamante", 25, false, null));
        personajes.add(new Cartass("8 de diamante", 30, false, null));
        personajes.add(new Cartass("7 de diamante", 24, false, null));
        personajes.add(new Cartass("6 de diamante", 23, false, null));
        
        //Un ojo
        personajes.add(new Cartass("J de corazones", 101, false, null));
        personajes.add(new Cartass("J de corazones", 101, false, null));
        personajes.add(new Cartass("J de Picas", 102, false, null));
        personajes.add(new Cartass("J de Picas", 102, false, null));
       
        //2 ojo
        personajes.add(new Cartass("J de diamante", 101, false, null));
        personajes.add(new Cartass("J de diamante", 101, false, null));
        personajes.add(new Cartass("J de Trebol", 102, false, null));
        personajes.add(new Cartass("J de Trebol", 102, false, null));
        
        
        return personajes;
    }

    public void setNombre(String color) {
    NombreCarta = "Ficha"+color;
    loadIcon();
    }

}
