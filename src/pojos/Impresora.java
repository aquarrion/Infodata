package pojos;

public class Impresora extends Producto{
    private int velocidad;

    public Impresora(String codigo, String modelo, int velocidad){
        super(codigo, modelo);

        this.setVelocidad(velocidad);
    }


    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
