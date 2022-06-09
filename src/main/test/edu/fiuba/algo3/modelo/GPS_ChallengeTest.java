package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class GPS_ChallengeTest {

    @Test
    public void test01UnaMotoCruzaLaCiudadEncuentraPozoYPenaliza() {

        Vehiculo vehiculo = new Moto();
        Jugador jugador = new Jugador(vehiculo);

        int pos_inicial_x = 1;
        int pos_inicial_y = 1;
        GPS_Challenge juego = new GPS_Challenge(jugador, pos_inicial_x, pos_inicial_y);

        //En la posición de "Arriba" hay un pozo hardcodeado.
        juego.moverJugadorHaciaDireccion(new Arriba());

        assertEquals(4, juego.cantMovimientosJugador());
    }

    @Test
    public void test02UnAutoCruzaLaCiudadEncuentraPozoYPenaliza() {
        Vehiculo vehiculo = new Auto();
        Jugador jugador = new Jugador(vehiculo);

        int pos_inicial_x = 1;
        int pos_inicial_y = 1;
        GPS_Challenge juego = new GPS_Challenge(jugador, pos_inicial_x, pos_inicial_y);

        //En la posición de "Arriba" hay un pozo hardcodeado.
        juego.moverJugadorHaciaDireccion(new Arriba());
        assertEquals(4, juego.cantMovimientosJugador());

    }

    @Test
    public void test03Una4x4CruzaLaCiudadEncuentraPozoYNoPenaliza() {
        Vehiculo vehiculo = new CxC();
        Jugador jugador = new Jugador(vehiculo);

        int pos_inicial_x = 1;
        int pos_inicial_y = 1;
        GPS_Challenge juego = new GPS_Challenge(jugador, pos_inicial_x, pos_inicial_y);

        //En la posición de "Arriba" hay un pozo hardcodeado.
        juego.moverJugadorHaciaDireccion(new Arriba());
        assertEquals(1, juego.cantMovimientosJugador());

    }
}