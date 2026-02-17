package modelo;

import java.time.LocalDate;

public class Huesped {

    private String nombre;
    private String CURP;
    private LocalDate fechNac;
    private long telefono;
    private String correo;

    public Huesped(){}
    
    public Huesped(String nombre, long telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCURP() {
        return CURP;
    }
    public void setCURP(String cURP) {
        CURP = cURP;
    }
    public LocalDate getFechNac() {
        return fechNac;
    }
    public void setFechNac(LocalDate fechNac) {
        this.fechNac = fechNac;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Huesped [nombre=" + nombre + ", CURP=" + CURP + ", fechNac=" + fechNac + ", telefono=" + telefono
                + ", correo=" + correo + "]";
    }
     
}
