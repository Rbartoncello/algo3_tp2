package edu.fiuba.algo3.gps_challenge;
public class Cuadra {
    Evento evento;

    //No sé si es lo más elegante posible que tenga una referencia a escenario
    Escenario escenario;
    int x;
    int y;
    public Cuadra(int x, int y, Escenario escenario) {
        this.escenario = escenario;
        this.x = x;
        this.y = y;
    }
    public Evento buscarEvento() {
        return this.evento;
    }

    public Cuadra conseguirCuadraEnDireccion(Direccion direccion) {
        Cuadra nueva_cuadra = escenario.grilla[x + direccion.movimientoEnX()][y + direccion.movimientoEnY()];
        return nueva_cuadra;
    }
}
