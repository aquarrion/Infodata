package pojos;

public class DiscoDuro extends Alquilable {
    private int capacidad;

    public DiscoDuro(String codigo, String modelo, double precioHora, int capacidad){
        super(codigo, modelo, precioHora);

        this.setCapacidad(capacidad);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
