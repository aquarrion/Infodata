package pojos;

public class Cliente {
    private String Dni;
    private int telefono;
    private String domicilio;

    public Cliente(String dni, int telefono, String domicilio) {
        setDni(dni);
        this.setTelefono(telefono);
        this.setDomicilio(domicilio);
    }


    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
