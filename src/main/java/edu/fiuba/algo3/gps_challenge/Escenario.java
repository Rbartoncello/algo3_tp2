package edu.fiuba.algo3.gps_challenge;
public class Escenario {
    //El tamaño del escenario tiene que ser aleatorio, según la consigna (o por lo menos variar)
    //Por el momento lo dejo fijo.
    public Cuadra[][] grilla = new Cuadra[10][10];
    public Cuadra punto_partida;
    public Cuadra meta;


    //Cada cuadra cuando se setee tiene que tener un evento o sorpresa
    //Puede no tener ninguno
    //De alguna forma habría que generar pozos y sorpresas de forma tal que estén distribuidos
    //más o menos equitativamente por todo el mapa.
    public Escenario() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                grilla[i][j] = new Cuadra(i, j, this);
            }
        }
        //Por el momento hardcodeo un pozo para hacer los tests
        grilla[1][2].evento = new Pozo();

    }
}
