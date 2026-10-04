package ar.edu.unq.po2.tp8.ejercicio5;

import java.util.List;

public class CarroDeCompras {
	private List<Product> elements;
	
	private void setElements(List<Product> productos) {
		this.elements = productos;
	}
	
	public List<Product> getElements(){
		return elements;
	}
	
	public int totalRounded() {
		return Math.round(this.total());
}
	
	public float total() {
		return (float) this.elements.stream()
                .mapToDouble(p -> p.getPrice())
                .sum();
	}
}
