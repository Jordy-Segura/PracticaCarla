/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.practicacarla.clases;

import ec.edu.espoch.practicacarla.enumeraciones.Color;
import ec.edu.espoch.practicacarla.enumeraciones.Dias;

/**
 *
 * @author jordy
 */
public class Carla {
    
    private String Nombre;
    private String Apellido;
    private String FechaNacimiento;
    private int Edad;
    private String TipoSangre;
    private String celular;
    private Color color;
    private Dias dias;

    public Carla() {
    }

    public Carla(String Nombre, String Apellido, String FechaNacimiento, int Edad, String TipoSangre, String celular, Color color, Dias dias) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.FechaNacimiento = FechaNacimiento;
        this.Edad = Edad;
        this.TipoSangre = TipoSangre;
        this.celular = celular;
        this.color = color;
        this.dias = dias;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getTipoSangre() {
        return TipoSangre;
    }

    public void setTipoSangre(String TipoSangre) {
        this.TipoSangre = TipoSangre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Dias getDias() {
        return dias;
    }

    public void setDias(Dias dias) {
        this.dias = dias;
    }

   
    public void mostrarDatos(){
        System.out.println("Nombre: "+this.Nombre);
        System.out.println("Apellido: "+this.Apellido);
        System.out.println("Fecha de Nacimiento: "+this.FechaNacimiento);
        
        if (this.Edad>18) {
            System.out.println("Edad: "+this.Edad+": Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
        
        System.out.println("Tipo de sangre: "+this.TipoSangre);
        System.out.println("Celular: "+this.celular);
        System.out.println("Color: "+this.color);
        System.out.println("Dia: "+this.dias);        
    }    
    
    public int dividirEdad(){

        return this.Edad/2;
    
    }
    
}
