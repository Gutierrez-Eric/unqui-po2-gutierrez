package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private List<Ingreso> ingresos = new ArrayList<>();

	public void agregarIngreso(Ingreso ingreso) {
		ingresos.add(ingreso);
	}
	
	public double getMontoPercibido() {
		double monto = 0;
		for(Ingreso ingreso : this.ingresos) {
			monto += ingreso.getMonto();
		}
		return monto;
	}
	
	public double getMontoImponible() {
		double montoImponible = 0;
		for(Ingreso ingreso : this.ingresos) {
			montoImponible += ingreso.getMontoImponible();
		}
		return montoImponible;
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}
}
