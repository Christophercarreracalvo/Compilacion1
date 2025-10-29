package app;

import java.time.LocalDate;

public class Pasaporte {
    private String numero;
    private String nacionalidad;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private boolean estaVigente;

    public Pasaporte(String numero, String nacionalidad, LocalDate fechaEmision, LocalDate fechaVencimiento) {
        this.numero = numero;
        this.nacionalidad = nacionalidad;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.estaVigente = fechaVencimiento.isAfter(LocalDate.now());
    }

    public boolean isEstaVigente() {
        return estaVigente;
    }
}
