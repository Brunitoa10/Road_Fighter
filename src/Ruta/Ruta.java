package Ruta;

import Obstaculo.Obstaculo;
import Vehiculo.Transito.Transito;

public class Ruta {

    protected Transito vehiculos_transito;
    protected Obstaculo obstaculo;

    public Ruta() {

    }

    public float complejidad() {
        return 5;
    }

    public float mayor_masa() {
        return 5;
    }

    public String nombre() {
        return "Ruta";
    }
}
