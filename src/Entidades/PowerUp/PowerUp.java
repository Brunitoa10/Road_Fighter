package Entidades.PowerUp;

import Entidades.Vehiculo.Carrera.Jugador;

public abstract class PowerUp {

    protected float puntaje;

    public abstract float get_puntaje();

    public abstract void afectar(Jugador j);
}
