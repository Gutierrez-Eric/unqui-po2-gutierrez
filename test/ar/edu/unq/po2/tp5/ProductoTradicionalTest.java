package ar.edu.unq.po2.tp5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoTradicionalTest {
	private ProductoTradicional panLactal;
	private ProductoTradicional cafe;
	
	@BeforeEach
	public void setUp() {
		panLactal = new ProductoTradicional(1500.5,5);
		cafe = new ProductoTradicional(1000.10,2);
	}
	
	@Test
	public void testPrecioAplicable() {
		assertEquals(1500.5, panLactal.precioAplicable());
		assertEquals(1000.10,cafe.precioAplicable());
	}
	
	@Test
	public void testDecrementarStock() {
		assertEquals(5, panLactal.getStock());
		panLactal.decrementarStock();
		assertEquals(4,panLactal.getStock());
		panLactal.decrementarStock();
		assertEquals(3,panLactal.getStock());
	}
	
	@Test
	public void testValidacionStock() {
		ProductoCooperativa fideos = new ProductoCooperativa(500.0, 0);
		assertThrows(RuntimeException.class, () -> {
	        fideos.decrementarStock();
	    });
	}
}

