package taller3.televisores;
public class Control {
private TV tv;
public void canalUp() {
    if (tv.getEstado()) {
        int canalActual = tv.getCanal();
        if (canalActual >= 1 && canalActual <= 120) {
            tv.setCanal(canalActual + 1);
        }
    }
}

public void canalDown() {
    if (tv.getEstado()) {
        int canalActual = tv.getCanal();
        if (canalActual >= 1 && canalActual <= 120) {
            tv.setCanal(canalActual - 1);
        }
    }
}

public void volumenUp() {
    if (tv.getEstado()) {
        int volumenActual = tv.getVolumen();
        if (volumenActual >= 0 && volumenActual <= 7) {
            tv.setVolumen(volumenActual + 1);
        }
    }
}

public void volumenDown() {
    if (tv.getEstado()) {
        int volumenActual = tv.getVolumen();
        if (volumenActual >= 0 && volumenActual <= 7) {
            tv.setVolumen(volumenActual - 1);
        }
    }
}

public void enlazar(TV tv) {
    this.tv = tv;
    tv.setControl(this);
}



public int getCanal() {
    // Se puede obtener el canal de la TV asociada al control
    if (tv != null) {
        return tv.getCanal();
    } else {
        return 0; // Otra acción si la TV no está enlazada
    }
}

public void setCanal(int canal) {
    // Se puede establecer el canal de la TV asociada al control
    if (tv != null) {
        tv.setCanal(canal);
    }
}
}
