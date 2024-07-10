import Carreras.CarreraAventura;
import Carreras.CarreraCalle;
import Carreras.CarreraRecreativa;
import Corredores.Corredor;

public class Main {
    public static void main(String[] args) {

        // Corredores

        Corredor corredor1 = new Corredor("Lautaro");
        Corredor corredor2 = new Corredor("Santi");
        Corredor corredor3 = new Corredor("Valentina");


        // Los tipos de carreras

        CarreraCalle carrera1 = new CarreraCalle("pinamarTodoTerreno",8);
        CarreraAventura carrera2 = new CarreraAventura("GesellMedanos",60,2000);
        CarreraRecreativa carrera3 = new CarreraRecreativa("CarreraParaTodos",30);


        // Inscripciones de los corredores a las carreras
        corredor1.setCertificado(true);
        carrera1.inscribirse(corredor1);

        carrera2.setCupomaximo(4);
        carrera2.inscribirse(corredor2);

        carrera3.inscribirse(corredor3);


        // Muestro cada los datos de cada carrera
        System.out.println(carrera1);
        System.out.println(carrera2);
        System.out.println(carrera3);


        //Muestro los daos de los corredores
        System.out.println(corredor1.mostrarDatosDelCorredor());
        System.out.println(corredor2.mostrarDatosDelCorredor());
        System.out.println(corredor3.mostrarDatosDelCorredor());




    }
}