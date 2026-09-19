package ar.edu.unq.po2.tp5;

import java.util.List;

public class CajaRegistradora {

	public double registrarProductos(List <Producto> productos) {
		double total = 0;
		for(Producto producto : productos) {
			total += producto.precioAplicable();
			producto.decrementarStock();
		}
		return total;
	}
}
