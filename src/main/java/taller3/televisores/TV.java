package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;
    private static int numTV;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        canal = 1;
        volumen = 1;
        precio = 500;
        numTV++;
    }

    // Getters y setters para los atributos de TV

    public void setCanal(int canal) {
        if (canal >= 1 && canal <= 120) {
            this.canal = canal;
        }
    }

    public int getCanal() {
        return canal;
    }

    public void setVolumen(int volumen) {
        if (volumen >= 0 && volumen <= 7) {
            this.volumen = volumen;
        }
    }

    public int getVolumen() {
        return volumen;
    }

    public boolean getEstado() {
        return estado;
    }

    public void turnOn() {
        estado = true;
    }

    public void turnOff() {
        estado = false;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public Control getControl() {
        return control;
    }

    public static int getNumTV() {
        return numTV;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }
}
