package ar.edu.unq.po2.tp5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.Producto;

import static org.junit.jupiter.api.Assertions.*;


public class ProductoCooperativaTest {
	private ProductoCooperativa arroz;
	private ProductoCooperativa leche;
	
	@BeforeEach
	public void setUp() {
		arroz = new ProductoCooperativa(1000.5,5);
		leche = new ProductoCooperativa(800.10,2);
	}
	
	@Test
	public void testPrecioAplicable() {
		assertEquals(900.45, arroz.precioAplicable());
		assertEquals(720.09,leche.precioAplicable());
	}
	
	@Test
	public void testDecrementarStock() {
		assertEquals(5, arroz.getStock());
		arroz.decrementarStock();
		assertEquals(4,arroz.getStock());
		arroz.decrementarStock();
		assertEquals(3,arroz.getStock());
	}
	
	@Test
	public void testValidacionStock() {
		ProductoCooperativa fideos = new ProductoCooperativa(500.0, 0);
		assertThrows(RuntimeException.class, () -> {
	        fideos.decrementarStock();
	    });
	}
}
