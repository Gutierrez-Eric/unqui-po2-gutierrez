package ar.edu.unq.po2.tp6.banco;

public class PropiedadInmobiliaria {
	private String descripcion;
	private String direccion;
	private double valorFiscal;
	
	public PropiedadInmobiliaria(String descripcion, String direccion, double valorFiscal) {
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}

	public double getValorFiscal() {
		return valorFiscal;
	}
	
}
