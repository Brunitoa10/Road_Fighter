package Entidades.Vehiculo.Carrera;

import Entidades.Vehiculo.Vehiculo;

public class Carrera extends Vehiculo {

    protected int posicion;

    public Carrera(float v, float p, String pat) {
        super(v, p, pat);
    }

    public void set_posicion(int p) {
        posicion = p;
    }

    public int get_posicion() {
        return posicion;
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
