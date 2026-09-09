package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;

public class IngresoPorHorasExtrasTest {
	private IngresoPorHorasExtras ingresoEnero;
	
	@BeforeEach
	public void setUp() {
		ingresoEnero = new IngresoPorHorasExtras(Month.FEBRUARY,"Horas extras",10000,10);
	}
	
	@Test
	public void testCalcularIngreso() {
		assertEquals(10000,ingresoEnero.getMonto());
	}
	
	@Test
	public void testCalcularIngresoImponible() {
		assertEquals(0,ingresoEnero.getMontoImponible());
	}
}

