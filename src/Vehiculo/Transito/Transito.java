package Vehiculo.Transito;

import PowerUp.PowerUp;
import Vehiculo.Vehiculo;
import Vehiculo.Carrera.Jugador;

public class Transito extends Vehiculo {

    protected PowerUp mi_power_up;

    protected Transito(float v, float p, String pat) {
        super(v, p, pat);
    }

    protected Transito(float v, float p, String pat, PowerUp po) {
        super(v, p, pat);
        mi_power_up = po;
    }

    public float masa() {
        return 6;
    }

    @Override
    public void ser_Chocado(Jugador j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ser_Chocado'");
    }

    @Override
    public float get_peso() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get_peso'");
    }

    @Override
    public float get_velocidad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get_velocidad'");
    }

}
