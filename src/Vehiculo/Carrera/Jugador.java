package Vehiculo.Carrera;

import Obstaculo.Obstaculo;
import PowerUp.Misil;
import PowerUp.PowerUp;
import Vehiculo.Vehiculo;

public class Jugador extends Carrera {

    protected Misil mis_misiles;
    protected float combustible;
    protected float puntaje;

    public Jugador(float p, String pat) {
        super(p, 5, pat);
    }

    public void set_velocidad(float v) {
        velocidad = v;
    }

    public void set_combustible(float c) {
        combustible = c;
    }

    public void set_puntaje(float p) {
        puntaje = p;
    }

    public void ser_Chocado(Jugador j) {
        if (this.mis_misiles != null) {
            this.mis_misiles.afectar(j);
            this.quitar_power_ups();
        }
    }

    public void quitar_power_ups() {
        this.mis_misiles = null;
    }

    public void juntar_power_up(PowerUp p) {
        p.afectar(this);
    }

    public void chocar(Vehiculo v) {
        v.ser_Chocado(this);
    }

    public void agregar_misil(Misil m) {
        mis_misiles = m;
    }

    public void lanzar_misil(Obstaculo o) {

    }

    public void pierde_partida() {

    }
}
