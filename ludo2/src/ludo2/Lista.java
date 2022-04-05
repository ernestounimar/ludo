/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ludo2;

/**
 *
 * @author Usuario
 */
public class Lista {
    
    
    // Puntero que indica el inicio de la lista o conocida tambien
    // como cabeza de la lista.
     nodo inicio;
    // Variable para registrar el tamaño de la lista.
     int tamanio;
     jugador jugadora;
    /**
     * Constructor por defecto.
     */
    public void Lista(String color){
        inicio = null;
        tamanio = 0;
        jugadora=new jugador(color);
        crearlista1();
    }
    public void Lista2(String color){
        inicio=null;
        tamanio=0;
        jugadora=new jugador(color);
        crearlista2();
    }
    public boolean esVacia(){
        return inicio == null;
    }
    public void agregar(int valor){
        // Define un nuevo nodo.
        nodo nuevo = new nodo();
        // Agrega al valor al nodo.
        nuevo.setValor(valor);
        // Consulta si la lista esta vacia.
        if (esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            inicio = nuevo;
            inicio.jugadoraux=jugadora;
        // Caso contrario va agregando los nodos al inicio de la lista.
        } else{
            // Une el nuevo nodo con la lista existente.
            nuevo.setSiguiente(inicio);
            // Renombra al nuevo nodo como el inicio de la lista.
            inicio = nuevo;
        }
        // Incrementa el contador de tamaño de la lista.
        tamanio++;
    }
    public void agregaralfinal(int valor){
      nodo nuevo=new nodo();
      nuevo.setValor(valor);
      if(esVacia()){
          inicio=nuevo;
          inicio.jugadoraux=jugadora;
      }else{
          nodo aux= inicio;
          while(aux.getSiguiente()!=null){
              aux=aux.getSiguiente();
          }
          aux.setSiguiente(nuevo);
      }
      tamanio++;
    }
    public void ubicarjugador(int posicion){

                nodo aux = inicio;
                // Recorre la lista hasta la posición ingresada.
                for (int i = 1; i < posicion; i++) {
                    if(aux.hayJugador()){
                        aux.jugadoraux=null;
                    }
                    aux = aux.getSiguiente();
                }
                // Retorna el valor del nodo.
                aux.jugadoraux=jugadora;
            
    }
    public void crearlista1(){
        for(int i=1;i<53;i++){
            agregaralfinal(i);          
        }
    }
    public void crearlista2(){
        for(int i=1;i<7;i++){
            agregaralfinal(i);
        }
    }
}
