package Corredores;

public class Corredor {

    private String nombre;
    private boolean certificado;
    private int cantidadCarreras;
    private int distanciaMaxima;
    private int puntos;


    public int getDistanciaMaxima() {
        return distanciaMaxima;
    }

    public void incrementarCarreras() {
        cantidadCarreras++;
    }

    public int getCantidadCarreras() {
        return cantidadCarreras;
    }

    public void actualizarDistancia(int distancia) {

        if (distancia > this.distanciaMaxima) {
            distanciaMaxima = distancia;
        }
    }

    public int getPuntos() {
        return puntos;
    }

    public void recibirPuntos(int puntaje) {
        this.puntos += puntaje;
    }

    public void setCertificado(boolean certificado) {
        this.certificado = certificado;
    }

    public Corredor(String nombre) {
        this.nombre = nombre;
        this.certificado = false;
        this.cantidadCarreras = 0;
        this.distanciaMaxima = 0;
        this.puntos = 0;
    }

    public boolean tenescertificado() {
        return certificado;
    }

    @Override
    public String toString() {
        return this.nombre;

    }
    public String mostrarDatosDelCorredor() {
        return  "Nombre del corredor : " + this.nombre + "\n" + "Cantidad de carreras : " + cantidadCarreras + "\n" + "Distancia Máxima :" + distanciaMaxima + "KM" + "\n" + "Puntos: " + puntos;
    }

}
