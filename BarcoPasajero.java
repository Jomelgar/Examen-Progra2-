
package examenprograii;

import javax.swing.JOptionPane;

/**
 *
 * @author jomel
 */
public class BarcoPasajero extends Barco{
    String[] Pasajeros;
    double precioBoleto;
    int contador;

    public BarcoPasajero(String nombre,double precioBoleto, int TotalPasajeros) {
        super(nombre);
        this.precioBoleto = precioBoleto;
        Pasajeros  = new String[TotalPasajeros];
        contador = 0;
    }
    
    public void agregarElemento(){
        if(contador < Pasajeros.length){
            Pasajeros[contador] = JOptionPane.showInputDialog("Nombre del Pasajero: ");
        }
    }
    
    public double vaciarCobrar(){
        double valor = precioBoleto * Pasajeros.length;
        contador = 0;
        return valor;
    }
    
    public double precioElemento(){
        return precioBoleto;
    }
    
    public String toString(){
        return super.toString() + " Cantidad de Pasajeros que compraron boleto: " + contador;
    }
    
    public String listarPasajeros(){
        return listarPasajeros(0,"PASAJEROS QUE COMPRARON BOLETO:\n");
    }
    
    private String listarPasajeros(int pos, String todo){
        if(pos< Pasajeros.length){
            todo+= (pos +1) + ". " + Pasajeros[pos];
        }
        return todo;
    }
}
