package edu.fiuba.algo3.modelo;
public class Moto extends Vehiculo {
    public int actuarSobreEvento(Evento evento) {
        //Habría que intentar evitar los ifs, supongo
        if (evento instanceof Pozo) {
            return 3;
        }
        return 0;
    }
}
