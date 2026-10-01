package ar.edu.unq.po2.tp6.banco;

public class CreditoPersonal extends Credito {
	private static final double INGRESO_ANUAL_MINIMO = 15000.0;
	private static final double PORCENTAJE_MAXIMO_CUOTA = 0.70;
	
	
	public CreditoPersonal(Cliente solicitante, double monto, int plazoEnMeses) {
		super(solicitante, monto, plazoEnMeses);
	}
	
	@Override
	public boolean esAceptable() {
		return this.seCumpleRequisitoAnual() && this.seCumpleRequisitoMensual();
	}
	
	public boolean seCumpleRequisitoAnual() {
		return this.getSolicitante().sueldoNetoAnual() >= INGRESO_ANUAL_MINIMO;
	}
	

	public boolean seCumpleRequisitoMensual() {
		return this.getMontoCuotaMensual() <= (this.getSolicitante().getSueldoNeto() * PORCENTAJE_MAXIMO_CUOTA);
	}
}
