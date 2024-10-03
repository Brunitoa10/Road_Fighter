package Entidades.Obstaculo;

import Entidades.PowerUp.Misil;
import Entidades.Vehiculo.Carrera.Jugador;

public class Bache extends Obstaculo {

    public Bache() {
        peso = 0;
        puntaje = -5;
    }

    @Override
    public float peso() {
        return peso;
    }

    @Override
    public float puntaje() {
        return puntaje;
    }

    @Override
    public void afectar(Jugador j) {
        j.quitar_power_ups();
    }

    @Override
    public void explotar(Misil m) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'explotar'");
    }

}
