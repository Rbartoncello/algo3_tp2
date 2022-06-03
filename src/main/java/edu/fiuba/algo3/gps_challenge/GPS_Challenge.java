package gps_challenge;

public class GPS_Challenge {
    public Escenario escenario;
    public Jugador jugador;

    public GPS_Challenge(Jugador jugador, int pos_inicial_x, int pos_inicial_y) {
        escenario = new Escenario();
        //Por como son las pruebas, lo más fácil es pasarle un jugador ya inicializado
        //pero no sé si es lo más correcto que sea así.
        this.jugador = jugador;
        //Esto está hardcodeado, hay que ver cómo se implementa.
        escenario.meta = escenario.grilla[9][9];
        escenario.punto_partida = escenario.grilla[pos_inicial_x][pos_inicial_y];
        this.jugador.setearPosicion(escenario.punto_partida);

    }

    public void moverJugadorHaciaDireccion(Direccion direccion) {
        jugador.moverHaciaDireccion(direccion);
    }

    public int cantMovimientosJugador() {
        return jugador.cant_movimientos();
    }


    //El juego le tiene que dar a elegir al jugador qué vehículo desea.
    //vehículo = elegirVehiculoInicial
    //Jugador jugador = new Jugador(vehiculo: vehiculo)
    //Por el momento, lo hardcodeo
    public void elegirVehiculoInicial(){

    }
}
