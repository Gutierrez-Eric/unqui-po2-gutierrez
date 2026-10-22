package ar.edu.unq.po2.tp10.ayudandoAlSoberano;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {
	private String titular;
	private int saldo;
	private List<String> movimientos;

	public CuentaBancaria(String titular){
		 this.titular=titular;
		 this.saldo=0;
		 this.movimientos=new ArrayList<String>();
	}
		 
	public String getTitular(){ //Metodo concreto
		 return this.titular;
	}
	
	protected int getSaldo(){ //Metodo concreto
		 return this.saldo;
	}
	
	protected void setSaldo(int monto){ //Metodo concreto
		 this.saldo=monto;
	}
	
	public void agregarMovimientos(String movimiento){ //Metodo concreto
		this.movimientos.add(movimiento);
	}
		 
	public void extraer(int monto) { //Template method
		if(this.puedeExtraer(monto)) {
	        this.setSaldo(this.getSaldo() - monto);
	        this.agregarMovimientos("Extraccion");
	    }
	}

	public abstract boolean puedeExtraer(int monto); // Hook method
	
}
