package Proyecto;

import java.util.*;
import java.io.*;

public class Funciones {

    private Player[] players;
    private int tamaño;
    RandomAccessFile Usuarios;

    public Funciones() {
        players = new Player[100];
        tamaño = 0;
        
        try{
        Usuarios=new RandomAccessFile("src/users/usuarios.xd","rw");    
        }catch(IOException e){
            System.out.println("hi");
        }
        
    }
    
    public void AñadirPlayer(String Username,String Password)throws IOException{
        Usuarios.seek(Usuarios.length());
        
        Usuarios.writeUTF(Username);
        Usuarios.writeUTF(Password);
        
        
    }
    
    
    
    public void llenarArreglo()throws IOException{
    Usuarios.seek(0);
        while(Usuarios.getFilePointer()<Usuarios.length()){
        String user=Usuarios.readUTF();
        String password=Usuarios.readUTF();
        Player jugador=new Player(user,password);
        Agregarpersona(jugador);
        }
    }

    public Player buscarplayer(String usuario, int i) {
        Player jugador = players[i];

        if (i > tamaño) {
            return null;
        }

        if (players[i] != null) {

            if (jugador.getUser().equals(usuario)) {
                return jugador;
            }
        }

        return buscarplayer(usuario, i + 1);

    }

    public boolean Agregarpersona(Player player) {
        Player valido = buscarplayer(player.getUser(), 0);

        if (valido == null) {
            players[tamaño] = player;
            tamaño++;
            return true;
        }

        return false;
    }

    public boolean BuscarOponente(String usuario, int i) {
        Player jugador = players[i];

        if (i > tamaño) {
            return false;
        }

        if (players[i] != null) {
            if (jugador.getUser().equals(usuario)) {
                return true;
            }

        }

        return BuscarOponente(usuario, i + 1);
    }


}

//fin

