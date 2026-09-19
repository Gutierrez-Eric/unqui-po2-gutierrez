package ar.edu.unq.po2.tp5;

public abstract class Factura implements Facturable {
    private Agencia agencia;

    public Factura(Agencia agencia) {
        this.agencia = agencia;
    }

    @Override
    public void registrar() {
        this.agencia.registrarPago(this);
    }

    @Override
    public abstract double precioAplicable();
}