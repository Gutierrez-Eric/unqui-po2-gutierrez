package ar.edu.unq.po2.tp10.empleados;

public class EmpleadoPasante extends Empleado {
	private int cantHorasExtrasTrabajadas;
	
	
	
	public EmpleadoPasante(int cantHorasExtrasTrabajadas) {
		super();
		this.cantHorasExtrasTrabajadas = cantHorasExtrasTrabajadas;
	}

	@Override
	public double sueldoBruto() {
		return this.pagaPorHoras();
	}
	
	public double pagaPorHoras() {
		return 40 * this.cantHorasExtrasTrabajadas;
	}

}
