package ar.edu.unq.po2.tp10.empleados;

public class EmpleadoPlanta extends Empleado{
	private double sueldoBasico;
	private int cantHijos;
	
	
	
	public EmpleadoPlanta(double sueldoBasico, int cantHijos) {
		super();
		this.sueldoBasico = sueldoBasico;
		this.cantHijos = cantHijos;
	}

	@Override
	public double sueldoBruto() {
		
		return this.sueldoBasico + this.extraPorHijo();
	}
	
	public double extraPorHijo() {
		return 150 * cantHijos;
	}
	
	public double sueldoBasico() {
		return this.sueldoBasico;
	}
}
