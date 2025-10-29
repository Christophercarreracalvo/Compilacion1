package app;

public class Persona {
    private String nombre;
    private String apellidos;
    private Pasaporte pasaporte;
    private Mascota mascota;
    private MaquinaSoldar maquinaSoldar;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public void sacarPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    public void tomarVuelo(String destino) {
        if (pasaporte != null && pasaporte.isEstaVigente()) {
            System.out.println(nombre + " " + apellidos + " toma un vuelo a " + destino + ".");
        } else {
            System.out.println(nombre + " " + apellidos + " no puede tomar el vuelo, ya que su pasaporte no está vigente.");
        }
    }

    public void adoptarMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public void jugarConMascota() {
        if (mascota != null) {
            System.out.print(nombre + " " + apellidos + " juega con su mascota: ");
            mascota.jugar();
        } else {
            System.out.println(nombre + " " + apellidos + " no tiene mascota para jugar.");
        }
    }

    public void setMaquinaSoldar(MaquinaSoldar maquina) {
        this.maquinaSoldar = maquina;
    }

    public void soldar(String metal) {
        if (maquinaSoldar != null) {
            maquinaSoldar.soldar(metal);
        } else {
            System.out.println(nombre + " " + apellidos + " no tiene máquina de soldar.");
        }
    }
}
