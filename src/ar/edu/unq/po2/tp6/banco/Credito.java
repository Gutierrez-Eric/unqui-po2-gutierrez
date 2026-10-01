package ar.edu.unq.po2.tp6.banco;

public abstract class Credito {
	private Cliente solicitante;
    private double monto;
    private int plazoEnMeses;
    
    
    
    public Credito(Cliente solicitante, double monto, int plazoEnMeses) {
		this.solicitante = solicitante;
		this.monto = monto;
		this.plazoEnMeses = plazoEnMeses;
	}

	public double getMontoCuotaMensual() {
        return this.monto / this.plazoEnMeses;
    }
    
    public Cliente getSolicitante() {
        return this.solicitante;
    }

    public double getMonto() {
        return this.monto;
    }

    public int getPlazoEnMeses() {
        return this.plazoEnMeses;
    }
    
   public double plazoEnAnios() {
	   return this.plazoEnMeses / 12.0;
   }
    
    public abstract boolean esAceptable();
    

}

