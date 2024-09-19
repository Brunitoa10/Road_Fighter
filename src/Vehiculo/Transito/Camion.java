package Vehiculo.Transito;

import PowerUp.PowerUp;

public class Camion extends Transito {

    public Camion(String pat, PowerUp po) {
        super(80, 777, pat, po);
    }

    public Camion(String pat, PowerUp po, PowerUp upo) {
        super(80, 777, pat, po);
        mi_power_up = upo;
    }

    public Camion(String pat) {
        super(80, 777, pat);
    }
}
