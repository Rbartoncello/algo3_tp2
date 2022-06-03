package gps_challenge;
import java.util.HashMap;

public class Jugador {
    Vehiculo vehiculo;
    Movimientos cant_movimientos = new Movimientos();


    public Jugador(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.vehiculo.conductor = this;
    }

    public int moverHaciaDireccion(Direccion direccion) {

        int movimientos =  vehiculo.moverHaciaDireccion(direccion);
        cant_movimientos.actualizarMovimientos(movimientos);
        return movimientos;
    }


    public int cant_movimientos() {
        return cant_movimientos.cant_movimientos;
    }

    public void setearPosicion(Cuadra cuadra) {
        vehiculo.setearCuadra(cuadra);
    }
}
