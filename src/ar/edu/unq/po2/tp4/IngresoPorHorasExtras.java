package ar.edu.unq.po2.tp4;

import java.time.Month;

public class IngresoPorHorasExtras extends Ingreso{
	private int cantHorasExtras;
	
	public IngresoPorHorasExtras(Month mes, String concepto, double monto, int cantHorasExtras) {
		super(mes, concepto, monto);
		this.cantHorasExtras = cantHorasExtras;
	}

	@Override
	public double getMontoImponible() {
		return 0;
	}
}
