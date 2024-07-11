package Carreras;

import Corredores.Corredor;

public class CarreraCalle extends Carrera {

    public CarreraCalle(String nombre, int distancia) {
        this.nombre = nombre;
        this.distancia = distancia;
    }



    //Si la carrera es de 10km o más exige que el corredor cuente con un certificado médico al día.
    // Si la distancia de la carrera es menor a 10km pueden admitir a cualquier corredor,
    // pero siempre registrando su inscripción.
    @Override
    public void inscribirse(Corredor unCorredor) {
        if (distancia >= 10) {
            if (unCorredor.tenescertificado()) {
                corredoresIncriptos.add(unCorredor);
                unCorredor.incrementarCarreras();
                unCorredor.actualizarDistancia(this.distancia);
            } else {
                System.out.println("El corredor " + unCorredor + " necesita un certificado médico para inscribirse.");
            }
        } else {
            corredoresIncriptos.add(unCorredor);
            unCorredor.incrementarCarreras();
            unCorredor.actualizarDistancia(this.distancia);
        }
    }

    @Override
    public boolean podesSerPatrocinado() {
        return corredoresIncriptos.size() >= 100;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }
}

