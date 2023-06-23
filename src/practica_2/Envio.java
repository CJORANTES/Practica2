package practica_2;

import javax.swing.JLabel;

public class Envio extends Thread {

    JLabel vehiculo;
    int distancia;
    boolean regreso;
    final int posDestino = Mapa_Entregas.Entrega.getLocation().x;

    public Envio(JLabel vehiculo, int distancia) {
        this.vehiculo = vehiculo;
        this.distancia = distancia;
    }

    @Override
    public void run() {

        while (true) {
            try {
                sleep(10 * distancia);

                int vehiculoPosX = vehiculo.getLocation().x;

                if (!regreso) {
                    // si no ha llegado al destino
                    if (vehiculoPosX < posDestino - 100) {
                        // avanzar el vehiculo
                        vehiculo.setLocation(vehiculoPosX + 10, vehiculo.getLocation().y);
                    } else {
                        regreso = true;
                    }
                } else {
                    // de regreso
                    // si no ha llegado al inicio
                    if (vehiculoPosX > 50) {
                        // retroceder el vehiculo
                        vehiculo.setLocation(vehiculoPosX - 10, vehiculo.getLocation().y);
                    } else {
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}
