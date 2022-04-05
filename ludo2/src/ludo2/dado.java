/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ludo2;

/**
 *
 * @author Usuario
 */
public class dado {
   int resultado;
   public dado(){
        
   }
   public void lanzarDado(){
    resultado = (int)(Math.random()*6 + 1); //Primer dado
}
} 

