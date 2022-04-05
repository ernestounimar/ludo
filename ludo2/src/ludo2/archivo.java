/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ludo2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Usuario
 */
public class archivo
{
    PrintWriter pf;
    FileReader fr;
    int tamaño=1;
    String nombre1;
    
    void crear(String pNombre,String pDatos) throws IOException
    {
        pf=new PrintWriter(new FileWriter(pNombre, true));
        pf.println(pDatos);
        pf.close();
        System.out.println("Generacion del archivo completada, busque el archivo llamado ganadoresLudo.txt. que deberia estar en la carpeta de este programa");
        
    }
/*void leer(String pnombre,ColaGeneral cola ) throws IOException{
    FileReader fr=new FileReader(pnombre);
        BufferedReader br=new BufferedReader(fr);
        String linea=br.readLine();
       
        while ((linea=br.readLine())!=null)
        {
            String datos;
            datos=linea;
            String nombre = datos;
            tamaño++;
           
            Cliente cliente=new Cliente(nombre);
            cola.encolarNodo_ge(cliente);
    }
}*/

}
