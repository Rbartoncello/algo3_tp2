package gps_challenge;

public abstract class Vehiculo {
    Cuadra cuadra_actual;
    Jugador conductor;

    public Vehiculo(){
    }

    private Cuadra avanzar(Direccion direccion) {
        cuadra_actual = cuadra_actual.conseguirCuadraEnDireccion(direccion);
        return cuadra_actual;
    }

    public int moverHaciaDireccion(Direccion direccion) {
        cuadra_actual = avanzar(direccion);
        Evento evento = cuadra_actual.buscarEvento();
        //1 movimiento por defecto + los movimientos que se agreguen del evento.
        return 1 + actuarSobreEvento(evento);
    }

    public Cuadra pos_actual() {
        return this.cuadra_actual;
    }

    public abstract int actuarSobreEvento(Evento evento);

    public void setearCuadra(Cuadra cuadra) {
        cuadra_actual = cuadra;
    }
}
