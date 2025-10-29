package app;

import java.util.Arrays;
import java.util.List;

public class MaquinaSoldar {
    private String marca;
    private String modelo;
    private int potencia;
    private List<String> metalesCompatibles;

    public MaquinaSoldar(String marca, String modelo, int potencia, List<String> metalesCompatibles) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.metalesCompatibles = metalesCompatibles;
    }

    public void soldar(String metal) {
        if (metalesCompatibles.contains(metal.toLowerCase())) {
            System.out.println("La máquina de soldar " + marca + " " + modelo + " solda el " + metal + ".");
        } else {
            System.out.println("La máquina de soldar " + marca + " " + modelo + " no puede soldar " + metal + ".");
        }
    }
}
