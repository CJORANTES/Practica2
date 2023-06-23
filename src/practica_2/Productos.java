
package practica_2;

import java.io.Serializable;


public class Productos implements Serializable {
    String Comida_bebida;
    double precio;

    public Productos() {
    }

    public Productos(String Comida_bebida, double precio) {
        this.Comida_bebida = Comida_bebida;
        this.precio = precio;
    }

    public String getComida_bebida() {
        return Comida_bebida;
    }

    public void setComida_bebida(String Comida_bebida) {
        this.Comida_bebida = Comida_bebida;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

 
    
    
}
