package Vehiculo.Transito;

import PowerUp.PowerUp;

public class Auto extends Transito {

    public Auto(String pat, PowerUp po) {
        super(120, 666, pat, po);
    }

    public Auto(String pat) {
        super(120, 666, pat);
    }
}
