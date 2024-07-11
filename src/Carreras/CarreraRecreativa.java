package Carreras;

import Corredores.Corredor;

public class CarreraRecreativa extends Carrera {


    public CarreraRecreativa(String nombre,int distancia) {
        this.nombre = nombre;
        this.distancia = distancia;
    }

    @Override
    public void inscribirse(Corredor unCorredor) {
        corredoresIncriptos.add(unCorredor);
        unCorredor.incrementarCarreras();
        unCorredor.actualizarDistancia(this.distancia);

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean podesSerPatrocinado() {
        return false;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }
}
