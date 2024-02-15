/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprograii;

/**
 *
 * @author jomel
 */
public class BarcoPesquero extends Barco{
    int pecesCapturados;
    TipoPesquero comida;

    public BarcoPesquero(String nombre,TipoPesquero comida) {
        super(nombre);
        pecesCapturados = 0;
        this.comida = comida;
    }
    
    public void agregarElemento(){
        pecesCapturados++;
    }
    
    public double vaciarCobrar(){
        double valor = pecesCapturados * comida.price;
        pecesCapturados =0;
        
        return valor;
    } 
    
    public double precioElemento(){
        return comida.price;
    }
    
    public String toString(){
        return super.toString() + ", Tipo: Barco Pesquero " + ", Cantidad de peces capturados:" + pecesCapturados;
    }
    
    
}
