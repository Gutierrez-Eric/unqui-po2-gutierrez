package ar.edu.unq.po2.tp5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.IngresoPorHorasExtras;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;


public class CajaRegistradoraTest {

	private CajaRegistradora cajaRegistradora;
	private List<Producto> productos;
	private Producto leche;
	private Producto cafe;
	
	@BeforeEach
	public void setUp() {
	
	
	leche = new ProductoCooperativa(800.10,2);
	cafe = new ProductoTradicional(1000.10,2);
	cajaRegistradora = new CajaRegistradora();
	productos = new java.util.ArrayList<>();
	productos.add(cafe);
	productos.add(leche);
	}
	
	@Test
	public void testRegistrarProductos() {
		double precioTotalProd = cajaRegistradora.registrarProductos(productos);
		assertEquals(1720.19, precioTotalProd);
	}
	
	@Test
	public void testRegistrarProductoSinStockLanzaExcepcion() {
	    Producto cafeSinStock = new ProductoTradicional(500.0, 0);
	    
	    List<Producto> listaSinStock = new java.util.ArrayList<>();
	    listaSinStock.add(cafeSinStock);

	    assertThrows(RuntimeException.class, () -> {
	        cajaRegistradora.registrarProductos(listaSinStock);
	    });
	}
}
