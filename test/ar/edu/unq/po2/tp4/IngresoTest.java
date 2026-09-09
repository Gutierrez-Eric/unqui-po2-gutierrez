package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;

public class IngresoTest {

	private Ingreso ingresoEnero;
	
	@BeforeEach
	public void setUp() {
		ingresoEnero = new Ingreso(Month.FEBRUARY,"Salario",30000.10);
	}
	
	@Test
	public void testCalcularIngreso() {
		assertEquals(30000.10,ingresoEnero.getMonto());
	}
	
	@Test
	public void testCalcularIngresoImponible() {
		assertEquals(30000.10,ingresoEnero.getMontoImponible());
	}
}
