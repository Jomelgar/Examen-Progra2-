/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprograii;

import java.util.Calendar;

/**
 *
 * @author jomel
 */
public abstract class Barco {
    String nombre;
    Calendar fecha;

    public Barco(String nombre) {
        this.nombre = nombre;
        fecha= Calendar.getInstance();
    }
    
    //Getters

    public String getNombre() {
        return nombre;
    }

    public Calendar getFecha() {
        return fecha;
    }
    
    public String toString(){
        return nombre;
    }
    
    //abstractas
    public abstract void agregarElemento();
    public abstract double vaciarCobrar();
    public abstract double precioElemento();
    
}
