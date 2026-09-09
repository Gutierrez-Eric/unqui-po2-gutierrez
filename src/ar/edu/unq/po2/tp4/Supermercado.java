package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombreSup;
	private String direccion;
	private List <Producto> productos = new ArrayList<>();
		
	public Supermercado(String nombre, String _direccion) {
		this.nombreSup = nombre;
		this.direccion = _direccion;
	}

	public Integer getCantidadDeProductos() {
		return productos.size();
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
		
	}

	public Double getPrecioTotal() {
		double total = 0;
		for(Producto producto : this.productos){
			total += producto.getPrecio();
		}
		return total;
	}
}