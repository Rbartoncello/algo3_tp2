package edu.fiuba.algo3.modelo;
public class CxC extends Vehiculo {

    int cant_pozos = 0;

    public int actuarSobreEvento(Evento evento) {
        if (evento instanceof Pozo) {
            this.cant_pozos += 1;
            if (this.cant_pozos == 3) {
                this.cant_pozos = 0;
                return 2;
            }
            return 0;
        }
        return 0;
    }
}
