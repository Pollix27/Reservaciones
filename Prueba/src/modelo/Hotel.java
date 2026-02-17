package modelo;

import java.time.LocalDate;
import java.util.List;

import utileria.EstadoReservacion;

public class Hotel {
    private List<Huesped> listaHuespedes;
    private List <Habitacion> habitaciones;
    
    public Hotel(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
    
    public List<Huesped> getListaHuespedes() {
        return listaHuespedes;
    }
    public void setListaHuespedes(List<Huesped> listaHuespedes) {
        this.listaHuespedes = listaHuespedes;
    }

    public Huesped buscarHuesped(Huesped h){
       return null;
    }

    public void agregarHuesped(Huesped h){}

    public void generarReservacion(Huesped h,List<Habitacion> cuartos,LocalDate fe, int noches){

    }
    public List<Habitacion> buscarDisponibilidad(LocalDate fe, LocalDate fs, int np){return null;}

    private void actualizarReservacion(Reservacion r,EstadoReservacion ne){}

    public void cancelarReservacion(Reservacion r){}
    public Reservacion buscarReservacion(Huesped h,LocalDate fechaEntrada){
        return null;
    }
    
    public void checkIn(Reservacion r){

    }
    public void chechOut(Reservacion r){

    }

}
