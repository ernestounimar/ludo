/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ludo2;

/**
 *
 * @author Usuario
 */
public class jugador {
    String color;
    boolean metafinal=false;
    int posicionactual;   
    int metablanca;
    int ganar=6;
    public jugador(String colo){
        color=colo;      
        posicionactual=1;
        metablanca=52;
        
    }
    
}
