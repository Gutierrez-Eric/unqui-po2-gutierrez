package ar.edu.unq.po2.tp5;

public abstract class Producto implements Facturable {
	private double precio;
	private int stock;
	
	public Producto(double precio, int stock) {
		this.precio = precio;
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}

	public abstract double precioAplicable();
	
	public void decrementarStock() {
		this.validarStock();
		this.stock -= 1;
	}

	public void registrar() {
		this.decrementarStock();
	}
	
	public void validarStock() {
		if (this.stock <= 0) {
	        throw new RuntimeException("Producto sin stock");
	    }
	}
}
