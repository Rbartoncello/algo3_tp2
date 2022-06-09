package edu.fiuba.algo3.modelo;
public class Auto extends Vehiculo {
    public int actuarSobreEvento(Evento evento) {
        if (evento instanceof Pozo) {
            return 3;
        }
        return 0;
    }
}
