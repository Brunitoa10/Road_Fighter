package Obstaculo;

import PowerUp.Misil;
import Vehiculo.Carrera.Jugador;

public class Anciana extends Obstaculo {

    public Anciana() {
        peso = 50;
        puntaje = -10;
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'afectar'");
    }

    @Override
    public void explotar(Misil m) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'explotar'");
    }

}
