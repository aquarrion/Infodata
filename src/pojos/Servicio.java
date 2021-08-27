package pojos;

public class Servicio {
    private Cliente cliente;
    private Impresora impresora;
    private String detalle;
    private double totalFacturado;

    public Servicio(Cliente cliente, Impresora impresora, String detalle, double totalFacturado) {
        this.setCliente(cliente);
        this.setImpresora(impresora);
        this.setDetalle(detalle);
        this.setTotalFacturado(totalFacturado);
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Impresora getImpresora() {
        return impresora;
    }

    public void setImpresora(Impresora impresora) {
        this.impresora = impresora;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getTotalFacturado() {
        return totalFacturado;
    }

    public void setTotalFacturado(double totalFacturado) {
        this.totalFacturado = totalFacturado;
    }
}
