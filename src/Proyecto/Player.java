package Proyecto;

import Tablero.Cartass;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Player {
    
    public int sequencias=0;
    
    private String username;
    private String contra;
    private int puntos;
    private String[] partidas;
    private String oponente;
    ArrayList<Cartass>baraja;
    public String color="Amarilla";
     int equipo=1;
    RandomAccessFile logs;
    int CantJugadores=4;
    int cantEquipos=2;
    int cartas=7;
    boolean ColoresEquipo=false;
    
    
public Player(String user,String password){
    this.username=user;
    this.contra=password;
    this.partidas= new String[0];
    this.puntos=0;
    baraja=new ArrayList<>();
    
    try{
        logs=new RandomAccessFile("src/logs/"+user+".xd","rw");    
        }catch(IOException e){
            System.out.println("nose");
        }
        
}


public void SetCantidades(int Cantidad,int cartas,int teams){
 this.cantEquipos=teams;
 this.CantJugadores=Cantidad;
 this.cartas=cartas;
}

public void setEquipo(int i){
    equipo=i;
}

public int getSecuencias(){
    return sequencias;
}

public int getEquipo(){
    return equipo;
}

public void añadirpartida(String hola)throws IOException{
    logs.seek(logs.length());
    logs.writeUTF(hola);
}

public void agregarSecuencia(int secuencia){
  sequencias+=secuencia;  
}

public String[] retornarPartidas()throws IOException{
    String[] nose=new String[100];
    
    logs.seek(0);
    int i=0;
    while(logs.getFilePointer()<logs.length()){
        nose[i]=logs.readUTF();
        i++;
    }
    return nose;
}

public void setColor(String color){
    this.color=color;
}

public String getColor(){
    return color;
}

public ArrayList getBaraja(){
    return baraja;
}


public void setOponente(String p2){
    oponente=p2;
}


public String getUser(){
    return username;
}

public String getContra(){
    return contra;
}

}
