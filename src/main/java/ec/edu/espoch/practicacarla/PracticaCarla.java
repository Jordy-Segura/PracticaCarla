/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.practicacarla;

import ec.edu.espoch.practicacarla.clases.Carla;
import ec.edu.espoch.practicacarla.clases.Jordy;
import ec.edu.espoch.practicacarla.enumeraciones.Color;
import ec.edu.espoch.practicacarla.enumeraciones.Dias;

/**
 *
 * @author jordy
 */
public class PracticaCarla {

    public static void main(String[] args) {
        
    Carla objCarla =new Carla("Carla","Mancero","25 de marzo",20,"o+","0968601134",Color.BLANCO,Dias.LUNES); 
    Jordy objJordy =new Jordy("Jordy","Segura","06 de noviembre",17,"o+","nose",Color.ROJO,Dias.VIERNES);   
        
       
    objCarla.mostrarDatos();
    System.out.println("division "+objCarla.dividirEdad());
    
    objJordy.mostrarDatos();
    objJordy.calcularEdad();
    
    
    
  }
}
