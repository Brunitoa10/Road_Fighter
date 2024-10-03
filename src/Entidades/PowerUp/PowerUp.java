package Entidades.PowerUp;

import Entidades.Entidad;
import Entidades.Vehiculo.Carrera.Jugador;

public abstract class PowerUp extends Entidad {

    protected float puntaje;

    public abstract float get_puntaje();

    public abstract void afectar(Jugador j);
}
