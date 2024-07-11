package Carreras;

import Corredores.Corredor;

public class CarreraAventura extends Carrera{
    private int desnivel;
    private int cupomaximo;
    private int puntos;

    public CarreraAventura(String nombre,int distancia,int desnivel,int cupomaximo) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.desnivel = desnivel;
        this.cupomaximo = cupomaximo;
    }

    public void setCupomaximo(int cupomaximo) {
        this.cupomaximo = cupomaximo;
    }

    public int puntosPorkm(){
        return this.distancia / 20;
    }

    public int puntosPorDesnivel(){
        return this.desnivel / 1000;
    }

    public int calcularPuntos(){
        return this.puntos =  this.puntosPorkm() + this.puntosPorDesnivel();
    }

    @Override
    public void inscribirse(Corredor unCorredor) {
        if (corredoresIncriptos.size() < cupomaximo) {
            corredoresIncriptos.add(unCorredor);
            unCorredor.incrementarCarreras();
            unCorredor.actualizarDistancia(this.distancia);
            unCorredor.recibirPuntos(this.calcularPuntos());
        } else {
            System.out.println("El cupo máximo de corredores esta al limite. No se puede inscribir al corredor " + unCorredor);
        }
    }

    @Override
    public String toString() {
        String out = "Desnivel : " + this.desnivel + "\n" +
                "Cupo maximo : " + this.cupomaximo + "\n" +
                "Puntos : " + this.calcularPuntos() + "\n";
        return out + super.toString();
    }

    private boolean contasConCorredorAlMenos5Puntos(){
        boolean tenesCorredor = false;
        for (Corredor corredor : this.corredoresIncriptos){
            if (corredor.getPuntos() >= 5){
                tenesCorredor = true;
            }
        }return tenesCorredor;
    }

    private boolean condicionDesnivel(){
        return this.desnivel >= 2000;
    }
    @Override
    public boolean podesSerPatrocinado() {
        return this.contasConCorredorAlMenos5Puntos() || this.condicionDesnivel();
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }
}
