package modelo;

import java.time.LocalDate;
import java.util.List;

import utileria.EstadoReservacion;
import utileria.TiposPago;

public class Reservacion {
    private Huesped huesped;
    private List<Habitacion> habitaciones;
    private int totalPersonas;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private EstadoReservacion estado;
    private TiposPago formaPago;
    
    public Reservacion(Huesped huesped, List<Habitacion> habitaciones, int totalPersonas, LocalDate fechaEntrada,LocalDate fechaSalida) {
        this.huesped = huesped;
        this.habitaciones = habitaciones;
        this.totalPersonas = totalPersonas;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    
    public Huesped getHuesped() {
        return huesped;
    }


    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }


    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }


    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }


    public int getTotalPersonas() {
        return totalPersonas;
    }


    public void setTotalPersonas(int totalPersonas) {
        this.totalPersonas = totalPersonas;
    }


    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }


    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }


    public LocalDate getFechaSalida() {
        return fechaSalida;
    }


    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }


    public EstadoReservacion getEstado() {
        return estado;
    }


    public void setEstado(EstadoReservacion estado) {
        this.estado = estado;
    }


    public TiposPago getFormaPago() {
        return formaPago;
    }


    public void setFormaPago(TiposPago formaPago) {
        this.formaPago = formaPago;
    }


    private void confirmar(String CURP,TiposPago fp){}

    private float calcularTotal(){}

    
    


}
