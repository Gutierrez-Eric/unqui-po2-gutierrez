package ar.edu.unq.po2.tp5;

public class Mascota implements Nombrable {
	private String nombre;
	private String raza;
	
	public Mascota(String nombre, String raza) {
		this.nombre = nombre;
		this.raza = raza;
	}

	public String nombre() {
		return this.nombre;
	}
	
	public String raza() {
		return this.raza;
	}
	
}
