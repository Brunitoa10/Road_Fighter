package Entidades.PowerUp;

import Entidades.Vehiculo.Carrera.Jugador;

public class Nafta extends PowerUp {

    public Nafta() {
        puntaje = 10;
    }

    public void afectar(Jugador j) {

    }

    @Override
    public float get_puntaje() {
        return puntaje;
    }
}
