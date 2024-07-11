package Sponsors;

import java.util.HashSet;

public class Sponsor {

    private String nombre;
    private HashSet<Patrocinable> patrocinados = new HashSet<>();

    public Sponsor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void patrocinar (Patrocinable unSponsor){
        if (unSponsor.podesSerPatrocinado()){
            patrocinados.add(unSponsor);
        }
    }
    public  String toString(){
        String out= this.nombre + " es sponsor de: ";
        for (Patrocinable p : this.patrocinados){
            out += p.getNombre() +","+ " ";
        }
        return out + "\n";
    }

}
