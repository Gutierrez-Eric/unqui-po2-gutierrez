package ar.edu.unq.po2.tp6.banco;

public class Cliente {
	private String nombre;
	private String apellido;
	private int edad;
	private String direcion;
	private double sueldoNeto;
	
	public Cliente(String nombre, String apellido, int edad, String direcion, double sueldoNeto) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direcion = direcion;
		this.sueldoNeto = sueldoNeto;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getDirecion() {
		return direcion;
	}
	
	public double getSueldoNeto() {
		return sueldoNeto;
	}
	
	public double sueldoNetoAnual() {
		return sueldoNeto * 12;
	}
	
}
	
	
	

