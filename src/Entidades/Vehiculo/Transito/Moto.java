package Entidades.Vehiculo.Transito;

import Entidades.PowerUp.PowerUp;

public class Moto extends Transito {

    public Moto(String pat, PowerUp po) {
        super(100, 555, pat, po);
    }

    public Moto(String pat) {
        super(100, 555, pat);
    }

}
