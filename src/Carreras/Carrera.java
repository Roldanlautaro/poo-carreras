package Carreras;

import Corredores.Corredor;
import java.util.HashSet;
import java.util.Set;

public abstract class Carrera {
    protected String nombre;
    protected int distancia;
    protected Set<Corredor> corredoresIncriptos = new HashSet<>();
    public abstract void inscribirse(Corredor unCorredor);


    public String toString() {
        String out = "Carrera: " + this.nombre + "\n" +
                "Distancia de la carrera: " + this.distancia + " KM" + "\n" +
                "Corredores anotados: ";
        for (Corredor c : this.corredoresIncriptos) {
            out += c + ", ";
        }
        return out + "\n";
    }
}