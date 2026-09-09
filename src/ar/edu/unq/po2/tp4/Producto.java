package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombre;
	private double precio;
	private boolean pertenecePreciosCuidados = false;
	
	public Producto(String _nombre, double _precio, boolean _pertenecePreciosCuidados) {
		this.nombre = _nombre;
		this.precio = _precio;
		this.pertenecePreciosCuidados = _pertenecePreciosCuidados;
	}

	public Producto(String _nombre, double _precio) {
		this.nombre = _nombre;
		this.precio = _precio;
	}

	public String getNombre() {
		return nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public Boolean esPrecioCuidado() {
		return pertenecePreciosCuidados;
	}

	public void aumentarPrecio(double d) {
		this.precio += d;
		
	}
	
	
	

}
