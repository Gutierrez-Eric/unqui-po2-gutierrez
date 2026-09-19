package ar.edu.unq.po2.tp5;

import java.time.LocalDate;
import java.time.Period;

public class Persona implements Nombrable {
	private String nombre;
	private LocalDate fechaNac;
	
	public Persona(String nombre, LocalDate fechaNac) {
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}

	public String nombre(){
		return this.nombre;
	}
	
	public int edad() {
		return Period.between(this.fechaNac, LocalDate.now()).getYears();
	}
	
	
}
