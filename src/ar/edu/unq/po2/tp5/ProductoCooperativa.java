package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto{
	
	public ProductoCooperativa(double precio, int stock) {
		super(precio, stock);
	}

	public double precioAplicable() {
		return this.getPrecio() - this.descuentoIVA();
	}
	
	public double descuentoIVA() {
		return this.getPrecio() * 0.10;
	}
}
