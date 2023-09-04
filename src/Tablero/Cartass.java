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

    private int currentRow;
    private int currentColumn;
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

        loadIcon();
    }

    public void setposicion(){
        p1=true;
    }
    
    public void setDificultad(int num) {
        this.dificultad = num;
    }

    private void loadIcon() {
        String NombreFoto;
        if (Player.getrandom() == true) {
            NombreFoto = "src/random/" + NombreCarta.replace(" ", "") + ".jpg";
        } else {
            NombreFoto = "src/img/" + NombreCarta.replace(" ", "") + ".jpg";
        }

        try {
            Image newImg = resizeImage(ImageIO.read(new File(NombreFoto)), 80, 72);
            icono = new ImageIcon(newImg);
        } catch (Exception e) {
            icono = null;
        }
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
        personajes.add(new Cartass("Esquina1", 0, true, null));
        personajes.add(new Cartass("2 de Picas negro", 1, true, null));
        personajes.add(new Cartass("3 de Picas negro", 2, true, null));
        personajes.add(new Cartass("4 de Picas negro", 3, true, null));
        personajes.add(new Cartass("5 de Picas negro", 4, true, null));
        personajes.add(new Cartass("6 de Picas negro", 5, true, null));
        personajes.add(new Cartass("7 de Picas negro", 6, true, null));
        personajes.add(new Cartass("8 de Picas negro", 7, true, null));
        personajes.add(new Cartass("9 de Picas negro", 8, true, null));
        personajes.add(new Cartass("Esquina2", 0, true, null));
        personajes.add(new Cartass("6 de Trebol negro", 9, true, null));
        personajes.add(new Cartass("5 de Trebol negro", 10, true, null));
        personajes.add(new Cartass("4 de Trebol negro", 11, true, null));
        personajes.add(new Cartass("3 de Trebol negro", 29, true, null));
        personajes.add(new Cartass("2 de Trebol negro", 12, true, null));
        personajes.add(new Cartass("Jota Roja", 13, true, null));
        personajes.add(new Cartass("Rey Rojo", 14, true, null));
        personajes.add(new Cartass("Reina Roja", 15, true, null));
        personajes.add(new Cartass("10 de Corazones rojo", 16, true, null));
        personajes.add(new Cartass("10 de Picas negro", 17, true, null));
        personajes.add(new Cartass("7 de Picas negro", 6, true, null));
        personajes.add(new Cartass("Jota negro", 18, true, null));
        personajes.add(new Cartass("2 de diamante rojo", 19, true, null));
        personajes.add(new Cartass("3 de diamante rojo", 20, true, null));
        personajes.add(new Cartass("4 de diamante rojo", 21, true, null));
        personajes.add(new Cartass("5 de diamante rojo", 22, true, null));
        personajes.add(new Cartass("6 de diamante rojo", 23, true, null));
        personajes.add(new Cartass("7 de diamante rojo", 24, true, null));
        personajes.add(new Cartass("9 de diamante rojo", 25, true, null));
        personajes.add(new Cartass("Reina negro", 26, true, null));
        personajes.add(new Cartass("8 de Trebol negro", 27, true, null));
        personajes.add(new Cartass("Rey negro", 28, true, null));
        personajes.add(new Cartass("6 de Trebol negro", 9, true, null));
        personajes.add(new Cartass("5 de Trebol negro", 10, true, null));
        personajes.add(new Cartass("4 de Trebol negro", 11, true, null));
        personajes.add(new Cartass("3 de Trebol negro", 29, true, null));
        personajes.add(new Cartass("2 de Trebol negro", 12, true, null));
        personajes.add(new Cartass("8 de diamante rojo", 30, true, null));
        personajes.add(new Cartass("8 de corazones rojo", 31, true, null));
        personajes.add(new Cartass("Rey negro", 28, true, null));
        personajes.add(new Cartass("9 de Trebol negro", 32, true, null));
        personajes.add(new Cartass("Reina negro", 26, true, null));
        personajes.add(new Cartass("7 de Trebol negro", 33, true, null));
        personajes.add(new Cartass("6 de corazones rojo ", 34, true, null));
        personajes.add(new Cartass("5 de corazones rojo ", 35, true, null));
        personajes.add(new Cartass("4 de corazones rojo ", 36, true, null));
        personajes.add(new Cartass("Jota Roja", 13, true, null));
        personajes.add(new Cartass("9 de diamante rojo", 25, true, null));
        personajes.add(new Cartass("7 de corazones rojo ", 37, true, null));
        personajes.add(new Cartass("Jota negro", 18, true, null));
        personajes.add(new Cartass("10 de Trebol negro", 38, true, null));
        personajes.add(new Cartass("10 de Picas negro", 17, true, null));
        personajes.add(new Cartass("8 de Trebol negro", 27, true, null));
        personajes.add(new Cartass("7 de corazones rojo ", 37, true, null));
        personajes.add(new Cartass("2 de corazones rojo ", 39, true, null));
        personajes.add(new Cartass("3 de corazones rojo ", 40, true, null));
        personajes.add(new Cartass("Rey Rojo", 14, true, null));
        personajes.add(new Cartass("10 de diamante rojo", 41, true, null));
        personajes.add(new Cartass("6 de corazones rojo ", 34, true, null));
        personajes.add(new Cartass("2 de diamante rojo", 19, true, null));
        personajes.add(new Cartass("Reina negro", 26, true, null));
        personajes.add(new Cartass("9 de Picas negro", 8, true, null));
        personajes.add(new Cartass("9 de Trebol negro", 32, true, null));
        personajes.add(new Cartass("8 de corazones rojo", 31, true, null));
        personajes.add(new Cartass("9 de corazones rojo", 42, true, null));
        personajes.add(new Cartass("10 de Corazones rojo", 16, true, null));
        personajes.add(new Cartass("Reina Roja", 15, true, null));
        //ask
        personajes.add(new Cartass("Reina Roja", 15, true, null));
        personajes.add(new Cartass("5 de corazones rojo ", 35, true, null));
        personajes.add(new Cartass("3 de diamante rojo", 20, true, null));
        personajes.add(new Cartass("Rey negro", 28, true, null));
        personajes.add(new Cartass("8 de Picas negro", 7, true, null));
        personajes.add(new Cartass("10 de Trebol negro", 38, true, null));
        //ask
        personajes.add(new Cartass("Reina negro", 26, true, null));
        personajes.add(new Cartass("Rey negro", 28, true, null));
        personajes.add(new Cartass("Jota negro", 18, true, null));
        personajes.add(new Cartass("Jota Roja", 13, true, null));
        personajes.add(new Cartass("Rey Rojo", 14, true, null));
        personajes.add(new Cartass("4 de corazones rojo ", 36, true, null));
        personajes.add(new Cartass("4 de diamante rojo", 21, true, null));
        personajes.add(new Cartass("Jota negro", 18, true, null));
        personajes.add(new Cartass("7 de Picas negro", 6, true, null));
        personajes.add(new Cartass("6 de Picas negro", 5, true, null));
        personajes.add(new Cartass("5 de Picas negro", 4, true, null));
        personajes.add(new Cartass("4 de Picas negro", 3, true, null));
        personajes.add(new Cartass("3 de Picas negro", 2, true, null));
        personajes.add(new Cartass("2 de Picas negro", 1, true, null));
        personajes.add(new Cartass("2 de corazones rojo ", 39, true, null));
        personajes.add(new Cartass("3 de corazones rojo ", 40, true, null));
        personajes.add(new Cartass("5 de diamante rojo", 22, true, null));
        personajes.add(new Cartass("Esquina3", 0, true, null));
        personajes.add(new Cartass("Jota Roja", 13, true, null));
        personajes.add(new Cartass("Rey Rojo", 14, true, null));
        personajes.add(new Cartass("Reina Roja", 15, true, null));
        personajes.add(new Cartass("10 de diamante rojo", 41, true, null));
        personajes.add(new Cartass("9 de diamante rojo", 25, true, null));
        personajes.add(new Cartass("8 de diamante rojo", 30, true, null));
        personajes.add(new Cartass("7 de diamante rojo", 24, true, null));
        personajes.add(new Cartass("6 de diamante rojo", 23, true, null));
        personajes.add(new Cartass("Esquina4", 0, true, null));

        return personajes;
    }

    public static ArrayList<Cartass> CartasBaraja() {
        ArrayList<Cartass> personajes = new ArrayList<Cartass>();

        personajes.add(new Cartass("2 de Picas negro", 1, false, null));
        personajes.add(new Cartass("3 de Picas negro", 2, false, null));
        personajes.add(new Cartass("4 de Picas negro", 3, false, null));
        personajes.add(new Cartass("5 de Picas negro", 4, false, null));
        personajes.add(new Cartass("6 de Picas negro", 5, false, null));
        personajes.add(new Cartass("7 de Picas negro", 6, false, null));
        personajes.add(new Cartass("8 de Picas negro", 7, false, null));
        personajes.add(new Cartass("9 de Picas negro", 8, false, null));
        personajes.add(new Cartass("6 de Trebol negro", 9, false, null));
        personajes.add(new Cartass("5 de Trebol negro", 10, false, null));
        personajes.add(new Cartass("4 de Trebol negro", 11, false, null));
        personajes.add(new Cartass("3 de Trebol negro", 29, false, null));
        personajes.add(new Cartass("2 de Trebol negro", 12, false, null));
        personajes.add(new Cartass("Jota Roja", 13, false, null));
        personajes.add(new Cartass("Rey Rojo", 14, false, null));
        personajes.add(new Cartass("Reina Roja", 15, false, null));
        personajes.add(new Cartass("10 de Corazones rojo", 16, false, null));
        personajes.add(new Cartass("10 de Picas negro", 17, false, null));
        personajes.add(new Cartass("7 de Picas negro", 6, false, null));
        personajes.add(new Cartass("Jota negro", 18, false, null));
        personajes.add(new Cartass("2 de diamante rojo", 19, false, null));
        personajes.add(new Cartass("3 de diamante rojo", 20, false, null));
        personajes.add(new Cartass("4 de diamante rojo", 21, false, null));
        personajes.add(new Cartass("5 de diamante rojo", 22, false, null));
        personajes.add(new Cartass("6 de diamante rojo", 23, false, null));
        personajes.add(new Cartass("7 de diamante rojo", 24, false, null));
        personajes.add(new Cartass("9 de diamante rojo", 25, false, null));
        personajes.add(new Cartass("Reina negro", 26, false, null));
        personajes.add(new Cartass("8 de Trebol negro", 27, false, null));
        personajes.add(new Cartass("Rey negro", 28, false, null));
        personajes.add(new Cartass("6 de Trebol negro", 9, false, null));
        personajes.add(new Cartass("5 de Trebol negro", 10, false, null));
        personajes.add(new Cartass("4 de Trebol negro", 11, false, null));
        personajes.add(new Cartass("3 de Trebol negro", 29, false, null));
        personajes.add(new Cartass("2 de Trebol negro", 12, false, null));
        personajes.add(new Cartass("8 de diamante rojo", 30, false, null));
        personajes.add(new Cartass("8 de corazones rojo", 31, false, null));
        personajes.add(new Cartass("Rey negro", 28, false, null));
        personajes.add(new Cartass("9 de Trebol negro", 32, false, null));
        personajes.add(new Cartass("Reina negro", 26, false, null));
        personajes.add(new Cartass("7 de Trebol negro", 33, false, null));
        personajes.add(new Cartass("6 de corazones rojo ", 34, false, null));
        personajes.add(new Cartass("5 de corazones rojo ", 35, false, null));
        personajes.add(new Cartass("4 de corazones rojo ", 36, false, null));
        personajes.add(new Cartass("Jota Roja", 13, false, null));
        personajes.add(new Cartass("9 de diamante rojo", 25, false, null));
        personajes.add(new Cartass("7 de corazones rojo ", 37, false, null));
        personajes.add(new Cartass("Jota negro", 18, false, null));
        personajes.add(new Cartass("10 de Trebol negro", 38, false, null));
        personajes.add(new Cartass("10 de Picas negro", 17, false, null));
        personajes.add(new Cartass("8 de Trebol negro", 27, false, null));
        personajes.add(new Cartass("7 de corazones rojo ", 37, false, null));
        personajes.add(new Cartass("2 de corazones rojo ", 39, false, null));
        personajes.add(new Cartass("3 de corazones rojo ", 40, false, null));
        personajes.add(new Cartass("Rey Rojo", 14, false, null));
        personajes.add(new Cartass("10 de diamante rojo", 41, false, null));
        personajes.add(new Cartass("6 de corazones rojo ", 34, false, null));
        personajes.add(new Cartass("2 de diamante rojo", 19, false, null));
        personajes.add(new Cartass("Reina negro", 26, false, null));
        personajes.add(new Cartass("9 de Picas negro", 8, false, null));
        personajes.add(new Cartass("9 de Trebol negro", 32, false, null));
        personajes.add(new Cartass("8 de corazones rojo", 31, false, null));
        personajes.add(new Cartass("9 de corazones rojo", 42, false, null));
        personajes.add(new Cartass("10 de Corazones rojo", 16, false, null));
        personajes.add(new Cartass("Reina Roja", 15, false, null));
//ask
        personajes.add(new Cartass("Reina Roja", 15, false, null));
        personajes.add(new Cartass("5 de corazones rojo ", 35, false, null));
        personajes.add(new Cartass("3 de diamante rojo", 20, false, null));
        personajes.add(new Cartass("Rey negro", 28, false, null));
        personajes.add(new Cartass("8 de Picas negro", 7, false, null));
        personajes.add(new Cartass("10 de Trebol negro", 38, false, null));
//ask
        personajes.add(new Cartass("Reina negro", 26, false, null));
        personajes.add(new Cartass("Rey negro", 28, false, null));
        personajes.add(new Cartass("Jota negro", 18, false, null));
        personajes.add(new Cartass("Jota Roja", 13, false, null));
        personajes.add(new Cartass("Rey Rojo", 14, false, null));
        personajes.add(new Cartass("4 de corazones rojo ", 36, false, null));
        personajes.add(new Cartass("4 de diamante rojo", 21, false, null));
        personajes.add(new Cartass("Jota negro", 18, false, null));
        personajes.add(new Cartass("7 de Picas negro", 6, false, null));
        personajes.add(new Cartass("6 de Picas negro", 5, false, null));
        personajes.add(new Cartass("5 de Picas negro", 4, false, null));
        personajes.add(new Cartass("4 de Picas negro", 3, false, null));
        personajes.add(new Cartass("3 de Picas negro", 2, false, null));
        personajes.add(new Cartass("2 de Picas negro", 1, false, null));
        personajes.add(new Cartass("2 de corazones rojo ", 39, false, null));
        personajes.add(new Cartass("3 de corazones rojo ", 40, false, null));
        personajes.add(new Cartass("5 de diamante rojo", 22, false, null));
        personajes.add(new Cartass("Jota Roja", 13, false, null));
        personajes.add(new Cartass("Rey Rojo", 14, false, null));
        personajes.add(new Cartass("Reina Roja", 15, false, null));
        personajes.add(new Cartass("10 de diamante rojo", 41, false, null));
        personajes.add(new Cartass("9 de diamante rojo", 25, false, null));
        personajes.add(new Cartass("8 de diamante rojo", 30, false, null));
        personajes.add(new Cartass("7 de diamante rojo", 24, false, null));
        personajes.add(new Cartass("6 de diamante rojo", 23, false, null));
        
        return personajes;
    }
    
    public void setNombre(){
        NombreCarta="Ficha";
    }

    public String toString() {
        String nombreSinEtiquetas = NombreCarta.replaceAll("\\<.*?\\>", "");
        return nombreSinEtiquetas;
    }

}
