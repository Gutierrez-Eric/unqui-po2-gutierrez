package ar.edu.unq.po2.tp10.empleados;

public class EmpleadoTemporario extends Empleado{
	private int cantHorasExtras;
	private double sueldoBasico;
	private boolean tieneHijos;
	private boolean estaCasado;
	
	
	
	public EmpleadoTemporario(int cantHorasExtras, double sueldoBasico, boolean tieneHijos, boolean estaCasado) {
		super();
		this.cantHorasExtras = cantHorasExtras;
		this.sueldoBasico = sueldoBasico;
		this.tieneHijos = tieneHijos;
		this.estaCasado = estaCasado;
	}
	
	public double sueldoBasico() {
		return this.sueldoBasico;
	}

	@Override
	public double sueldoBruto() {
		// TODO Auto-generated method stub
		return this.sueldoBasico + this.pagoPorHorasExtras() + this.extraSiTieneHijosOEstaCasado();
	}
	
	public double pagoPorHorasExtras() {
		return this.cantHorasExtras * 5;
	}
	
	public double extraSiTieneHijosOEstaCasado() {
		if(this.estaCasado || this.tieneHijos) {
			return 100;
		} else {
			return 0;
		}
 
	}
}
