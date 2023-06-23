
package practica_2;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import practica_2.Productos;
/**
 *
 * @author HP
 */
public class Default {
  public static void main(String[] args) {
       
         ArrayList<Productos> lista = new ArrayList<>();
        
        
       lista.add(new Productos("Pizza con piña", 50));
       lista.add(new Productos("Pizza sin piña", 40));
        lista.add(new Productos("Piña con pizza", 45));
       lista.add(new Productos("Piña sin pizza", 40));
        
  
    }
}
