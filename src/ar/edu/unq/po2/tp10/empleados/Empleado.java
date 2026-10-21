package ar.edu.unq.po2.tp10.empleados;

public abstract class Empleado {
	
	
	public Empleado() {
		super();
	}

	public double sueldo() {
		return this.sueldoBruto() - this.descuentoPorAportes();
	}

	public abstract double sueldoBruto();

	public double descuentoPorAportes() {
		return this.sueldoBruto() * 0.13;
	}
	
	
}
