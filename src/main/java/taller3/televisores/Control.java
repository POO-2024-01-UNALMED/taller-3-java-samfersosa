package taller3.televisores;

public class Control {
    private TV tv;

    // Métodos de control

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public TV getTv() {
        return tv;
    }

    public void enlazar(TV tv) {
        this.tv = tv;
        tv.setControl(this);
    }

    public void setCanal(int canal) {
        if (tv != null) {
            tv.setCanal(canal);
        }
    }

    public void setVolumen(int volumen) {
        if (tv != null) {
            tv.setVolumen(volumen);
        }
    }

    // Otros métodos de control...
}
