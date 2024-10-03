package Entidades.Vehiculo;

import Entidades.Vehiculo.Carrera.Jugador;

public abstract class Vehiculo {

    protected float velocidad;
    protected float peso;
    protected String patente;

    protected Vehiculo(float v, float p, String pat) {
        velocidad = v;
        peso = p;
        patente = pat;
    }

    public abstract void ser_Chocado(Jugador j);

    public abstract float get_peso();

    public abstract float get_velocidad();
}
