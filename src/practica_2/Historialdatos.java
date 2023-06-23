
package practica_2;

import java.io.Serializable;


public class Historialdatos implements Serializable {
    String Comida_bebida;
    double total;
    int distancia;
    public Historialdatos() {
    }

    public Historialdatos(String Comida_bebida, double total, int distancia) {
        this.Comida_bebida = Comida_bebida;
        this.total = total;
        this.distancia = distancia;
    }

    public String getComida_bebida() {
        return Comida_bebida;
    }

    public void setComida_bebida(String Comida_bebida) {
        this.Comida_bebida = Comida_bebida;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

   

 
    
    
}
