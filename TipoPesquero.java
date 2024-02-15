/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package examenprograii;

/**
 *
 * @author jomel
 */
public enum TipoPesquero {
    PEZ(25), CAMARON(30), LANGOSTA(50);
    
    public final double price;
    
    TipoPesquero(double precio){
        price = precio;
    }
}
