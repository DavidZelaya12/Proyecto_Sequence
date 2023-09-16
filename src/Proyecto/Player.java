package Proyecto;

import Tablero.Cartass;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Player {
    
    private String username;
    private String contra;
    private int puntos;
    private String[] partidas;
    private String oponente;
    ArrayList<Cartass>baraja;
    public String color="Amarilla";
    
    RandomAccessFile logs;
    
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

public void añadirpartida(String hola)throws IOException{
    logs.seek(logs.length());
    logs.writeUTF(hola);
}

public String retornarPartidas()throws IOException{
    String nose="";
    
    logs.seek(0);
    
    while(logs.getFilePointer()<logs.length()){
        nose+=logs.readUTF()+"\n";
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
