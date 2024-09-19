package PowerUp;

import Obstaculo.Obstaculo;
import Vehiculo.Carrera.Jugador;

public class Misil extends PowerUp {

    public Misil() {
        puntaje = 50;
    }

    public void afectar(Jugador j) {

    }

    public void lanzar(Obstaculo o) {

    }

    @Override
    public float get_puntaje() {
        return puntaje;
    }

}
