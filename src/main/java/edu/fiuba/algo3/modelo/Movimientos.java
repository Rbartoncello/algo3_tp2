package edu.fiuba.algo3.modelo;
public class Movimientos {
    int cant_movimientos;

    public Movimientos() {
        this.cant_movimientos = 0;
    }

    public void actualizarMovimientos(int movimientos) {
        this.cant_movimientos += movimientos;
    }
}
