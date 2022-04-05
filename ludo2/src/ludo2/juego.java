/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ludo2;

import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class juego {
   Lista[] listasjugadores=new Lista[4];
   Lista[] listasecundaria=new Lista[4];
   boolean ganador=false;
   int nganador;
   dado dd=new dado();
   archivo ar=new archivo();
   public void juego(){
       listasjugadores[0]=new Lista(); listasjugadores[0].Lista("rojo");
       listasjugadores[1]=new Lista(); listasjugadores[1].Lista("azul"); 
       listasjugadores[2]=new Lista(); listasjugadores[2].Lista("amarillo");
       listasjugadores[3]=new Lista(); listasjugadores[3].Lista("verde");
       listasecundaria[0]=new Lista(); listasecundaria[0].Lista2("rojo");
       listasecundaria[1]=new Lista(); listasecundaria[1].Lista2("azul");
       listasecundaria[2]=new Lista(); listasecundaria[2].Lista2("amarillo");
       listasecundaria[3]=new Lista(); listasecundaria[3].Lista2("verde");
   }
   public int lanzar(){
      dd.lanzarDado();
      return dd.resultado;
   }
   public void asignarLanzamiento(int i) throws IOException{      
       int y=lanzar();
       int sobrante;
       int faltante;
       
       if(!listasecundaria[i].jugadora.metafinal){
       listasjugadores[i].jugadora.posicionactual+=y;
       if(listasjugadores[i].jugadora.posicionactual<=52){
       
       switch(i){
           case 0:System.out.println("El jugador rojo lanza el dado y obtiene un: "+y+" se encuentra en la posicion numero "+listasjugadores[i].jugadora.posicionactual+" con respecto a su salida");break;
           case 1:System.out.println("El jugador azul lanza el dado y obtiene un: "+y+" se encuentra en la posicion numero "+listasjugadores[i].jugadora.posicionactual+" con respecto a su salida");break;
           case 2:System.out.println("El jugador amarillo lanza el dado y obtiene un: "+y+" se encuentra en la posicion numero "+listasjugadores[i].jugadora.posicionactual+" con respecto a su salida");break;
           case 3:System.out.println("El jugador verde lanza el dado y obtiene un: "+y+" se encuentra en la posicion numero "+listasjugadores[i].jugadora.posicionactual+" con respecto a su salida");break;
       }
       listasjugadores[i].ubicarjugador(listasjugadores[i].jugadora.posicionactual);
       }else{
           sobrante=listasjugadores[i].jugadora.posicionactual-52;
           faltante=6-sobrante;
           switch(i){
           case 0:System.out.println("El jugador rojo lanza el dado y obtiene un: "+y+" y entra en la posicion numero "+sobrante+" de su linea de meta, tiene que sacar un "+faltante+" para ganar");break;
           case 1:System.out.println("El jugador azul lanza el dado y obtiene un: "+y+" y entra en la posicion numero "+sobrante+" de su linea de meta, tiene que sacar un "+faltante+" para ganar");break;
           case 2:System.out.println("El jugador amarillo lanza el dado y obtiene un: "+y+" y entra en la posicion numero "+sobrante+" de su linea de meta, tiene que sacar un "+faltante+" para ganar");break;
           case 3:System.out.println("El jugador verde lanza el dado y obtiene un: "+y+" y entra en la posicion numero "+sobrante+" de su linea de meta, tiene que sacar un "+faltante+" para ganar");break;
       }
           listasecundaria[i].ubicarjugador(sobrante);
           listasecundaria[i].jugadora.metafinal=true;
       }
   }else{
           sobrante=listasjugadores[i].jugadora.posicionactual-52;
           faltante=6-sobrante;
          if(y==faltante){
              System.out.println("El jugador "+listasecundaria[i].jugadora.color+" ha lanzado un "+y+" y ha ganado!");
              listasecundaria[i].ubicarjugador(6);
              ganador=true;
              nganador=i;
              ar.crear("ganadoresLudo.txt", "el ganador de la partida es el jugador "+listasecundaria[i].jugadora.color);
          }else{
              System.out.println("El jugador "+listasecundaria[i].jugadora.color+" ha lanzado un "+y+" pero no se mueve debido a que necesita un: "+faltante);
          }
       }
   }
   public void ronda() throws IOException{
       for(int i=0;i<4;i++){
           if(!ganador){
           asignarLanzamiento(i);
           }
           }
   }
   public void iniciar() throws IOException{
       while(!ganador){
           ronda();
       }
   }
   
}
