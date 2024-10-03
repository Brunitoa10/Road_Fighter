package Entidades.PowerUp;

import Entidades.Vehiculo.Carrera.Jugador;

public class Nitro extends PowerUp {

    public Nitro() {
        puntaje = 20;
    }

    public void afectar(Jugador j) {

    }

    @Override
    public float get_puntaje() {
        return puntaje;
    }
}
