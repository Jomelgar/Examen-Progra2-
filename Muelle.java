
package examenprograii;

import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author jomel
 */
public class Muelle {
    public static ArrayList<Barco> Barcos = new ArrayList();
    
    public void AgregarBarco(String tipo, String nombre,String dato, double extra){
        if(tipo.equalsIgnoreCase("PESQUERO")){
            Barcos.add(new BarcoPesquero(nombre, TipoPesquero.valueOf(dato)));
        }else{
            Barcos.add(new BarcoPasajero(nombre, extra,Integer.parseInt(dato)));
        }
    }
    
    
    public  void agregarElemento(String nombre){
       Barco barco = buscar(nombre);
       barco.agregarElemento();
    }
    
    public double vaciarBarco(String nombre, javax.swing.JTextArea txt){
        Barco barco = buscar(nombre);
        if(barco instanceof BarcoPasajero){
            txt.setText(((BarcoPasajero) barco).listarPasajeros());
        }
        
        return barco.vaciarCobrar();
    }
    
    public String barcosDesde(int year){
        return barcosDesde(year, "", 0);
    }
    private String barcosDesde(int year, String valor, int pos){
        if(pos< Barcos.size()){
            if(Barcos.get(pos).getFecha().get(Calendar.YEAR)>= year){
                valor += Barcos.get(pos).toString() + "\n";
            }
        }
        return valor;
    }
    
    public Barco buscar(String nombre){
        for(Barco barco : Barcos){
            if(barco.nombre.equals(nombre))
                return barco;
        }
        return null;
    }
    
    
    public static void main(String[] args) {
        Barcos = new ArrayList();
        GUI.Menu menu = new GUI.Menu();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
    }
}
