package app;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void jugar() {
        System.out.println(nombre + " (" + especie + ") está jugando felizmente.");
    }
}
