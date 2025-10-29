package app;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Pasaportes
        Pasaporte pasaporte1 = new Pasaporte("A12345", "Costarricense", LocalDate.of(2022, 1, 10), LocalDate.of(2030, 1, 10));
        Pasaporte pasaporte2 = new Pasaporte("B67890", "Costarricense", LocalDate.of(2015, 5, 20), LocalDate.of(2020, 5, 20));

        // Personas
        Persona persona1 = new Persona("Romario", "Salas Cerdas");
        Persona persona2 = new Persona("María", "Fernández Soto");

        persona1.sacarPasaporte(pasaporte1);
        persona2.sacarPasaporte(pasaporte2);

        // Mascota compartida
        Mascota mascota = new Mascota("Firulais", "Perro", 3);
        persona1.adoptarMascota(mascota);
        persona2.adoptarMascota(mascota);

        // Máquina de soldar
        MaquinaSoldar maquina = new MaquinaSoldar("Miller Electric", "ME123X", 2000, Arrays.asList("hierro", "acero", "aluminio"));
        persona1.setMaquinaSoldar(maquina);

        // Ejecución
        persona1.tomarVuelo("España");
        persona2.tomarVuelo("México");

        persona1.jugarConMascota();
        persona2.jugarConMascota();

        persona1.soldar("hierro");
        persona1.soldar("titanio");
    }
}
