package Entidades.Obstaculo;

import Entidades.PowerUp.Misil;
import Entidades.Vehiculo.Carrera.Jugador;

public abstract class Obstaculo {

    protected float peso;
    protected float puntaje;

    public abstract float peso();

    public abstract float puntaje();

    public abstract void afectar(Jugador j);

    public abstract void explotar(Misil m);
}
