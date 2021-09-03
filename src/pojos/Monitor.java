package pojos;

import Interfaces.IReseteable;

public class Monitor extends Alquilable implements IReseteable {
    private String resolucionMaxima;

    public Monitor(String codigo, String modelo, double precioHora, String resolucionMaxima){
        super(codigo, modelo, precioHora);

        this.setResolucionMaxima(resolucionMaxima);
    }

    public String getResolucionMaxima() {
        return resolucionMaxima;
    }

    public void setResolucionMaxima(String resolucionMaxima) {
        this.resolucionMaxima = resolucionMaxima;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolucionMaxima='" + resolucionMaxima + '\'' +
                ", precioHora=" + precioHora +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public void reset() {
        System.out.println("Reseteando monitor.....");
    }
}
