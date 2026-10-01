package ar.edu.unq.po2.tp6.banco;

public class CreditoHipotecario extends Credito {
	private PropiedadInmobiliaria propiedadDeGarantia;
	private static final double PORCENTAJE_MAXIMO_CUOTA = 0.50;
	private static final int EDAD_MAXIMA = 65;
	private static final double PORCENTAJE_MAXIMO_GARANTIA = 0.70;
	
	public CreditoHipotecario(Cliente solicitante, double monto, int plazoEnMeses,
			PropiedadInmobiliaria propiedadDeGarantia) {
		super(solicitante, monto, plazoEnMeses);
		this.propiedadDeGarantia = propiedadDeGarantia;
	}

	public boolean esAceptable() {
		return this.seCumpleRequisitoMensual() && this.seCumpleRequisitoDeGarantia() && this.seCumpleRequisitoEdad();
	}
	
	public boolean seCumpleRequisitoMensual() {
		return this.getMontoCuotaMensual() <= this.getSolicitante().getSueldoNeto() * PORCENTAJE_MAXIMO_CUOTA;
	}
	
	public boolean seCumpleRequisitoEdad() {
		double edadAlTerminarDePagar = (this.getSolicitante().getEdad()+ this.plazoEnAnios());
		return edadAlTerminarDePagar <= EDAD_MAXIMA;
	}
	
	public boolean seCumpleRequisitoDeGarantia() {
		return this.getMonto() <=  this.propiedadDeGarantia.getValorFiscal() * PORCENTAJE_MAXIMO_GARANTIA;
	}
}
