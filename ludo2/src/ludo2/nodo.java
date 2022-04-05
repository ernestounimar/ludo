/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ludo2;

/**
 *
 * @author Usuario
 */
public class nodo {
    int valor;
    jugador jugadoraux;
    nodo siguiente;
    public void nodo(int w){
        this.valor = w;
        this.siguiente = null;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }
    public void setjugador(jugador jugador1){
        jugadoraux=jugador1;
    }
    public boolean hayJugador(){
    if(jugadoraux!=null){
         return true;
    }else{
        return false;
    }
    
}
}
