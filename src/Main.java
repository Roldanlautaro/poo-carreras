import Carreras.CarreraAventura;
import Carreras.CarreraCalle;
import Carreras.CarreraRecreativa;
import Corredores.Corredor;
import Sponsors.Sponsor;

public class Main {
    public static void main(String[] args) {

        // Parte 1

        // Corredores

        Corredor corredor1 = new Corredor("Lautaro");
        Corredor corredor2 = new Corredor("Santi");
        Corredor corredor3 = new Corredor("Valentina");
        Corredor corredor4 = new Corredor("Javier");
        Corredor corredor5 = new Corredor("Lola");


        // Los tipos de carreras

        CarreraCalle carrera1 = new CarreraCalle("pinamarTodoTerreno",8);
        CarreraAventura carrera2 = new CarreraAventura("GesellMedanos",60,2000,10);
        CarreraRecreativa carrera3 = new CarreraRecreativa("CarreraParaTodos",30);


        // Inscripciones de los corredores a las carreras
        corredor1.setCertificado(true);
        carrera1.inscribirse(corredor1);

        carrera2.inscribirse(corredor2);

        carrera3.inscribirse(corredor3);




        // Muestro los datos de cada carrera
        System.out.println(carrera1);
        System.out.println(carrera2);
        System.out.println(carrera3);


        //Muestro los datos de los corredores
        System.out.println("-----------------------------------");
        System.out.println(corredor1.mostrarDatosDelCorredor());
        System.out.println(corredor2.mostrarDatosDelCorredor());
        System.out.println(corredor3.mostrarDatosDelCorredor());


        // Parte 2


        // Creo los sponsor

        Sponsor sponsor1 = new Sponsor("Disney Plus");
        Sponsor sponsor2 = new Sponsor("RedBull");


        // Patrocinio los sponsor a las carreras
        sponsor1.patrocinar(carrera1);
        sponsor1.patrocinar(carrera2);
        sponsor1.patrocinar(carrera3);

        // Las carreras que se pudieron patronicar
        System.out.println("-----------------------------------");
        System.out.println(sponsor1);

        carrera1.inscribirse(corredor1);
        carrera1.inscribirse(corredor2);
        carrera1.inscribirse(corredor3);


        // Patrocino los sponsor a los corredores
        sponsor2.patrocinar(corredor1);
        sponsor2.patrocinar(corredor2);
        sponsor2.patrocinar(corredor3);


        // Pongo al corredor 1 para que participe 3 carreras y pueda ser patrocinado
        carrera2.inscribirse(corredor1);
        carrera3.inscribirse(corredor1);


        // Los corredores que se pudieron patronicar
        System.out.println(sponsor2);

    }
}