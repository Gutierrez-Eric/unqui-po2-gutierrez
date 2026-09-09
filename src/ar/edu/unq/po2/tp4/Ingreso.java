package ar.edu.unq.po2.tp4;

import java.time.Month;

public class Ingreso {
	private Month mes;
	private String concepto;
	private double monto;
	
	public Ingreso(Month mes, String concepto, double monto) {
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;
	}

	public double getMonto() {
		return monto;
	}
	
	public double getMontoImponible() {
		return monto;
	}
}
