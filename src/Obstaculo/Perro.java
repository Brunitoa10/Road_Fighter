package Obstaculo;

import PowerUp.Misil;
import Vehiculo.Carrera.Jugador;

public class Perro extends Obstaculo {

    public Perro() {
        peso = 20;
        puntaje = -50;
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
        j.set_velocidad(j.get_velocidad() / 2);
    }

    @Override
    public void explotar(Misil m) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'explotar'");
    }

}
