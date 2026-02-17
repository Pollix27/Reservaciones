package modelo;

public class Habitacion {

    private int numero;
    private int capacidad;
    private float costo;
    private boolean ocupado;

    public Habitacion(){
        ocupado=false;
    }
    public Habitacion(int numero, int capacidad, float costo) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.costo = costo;
        this.ocupado=false;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public float getCosto() {
        return costo;
    }
    public void setCosto(float costo) {
        this.costo = costo;
    }
    public boolean isOcupado() {
        return ocupado;
    }
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    @Override
    public String toString() {
        return "Habitacion [numero=" + numero + ", capacidad=" + capacidad + ", costo=" + costo + ", ocupado=" + ocupado
                + "]";
    }
    
        
}
