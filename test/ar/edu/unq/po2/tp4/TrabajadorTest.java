package ar.edu.unq.po2.tp4;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;


public class TrabajadorTest {
	private Trabajador juan;
	
	@BeforeEach
	public void setUp() {
	
		juan = new Trabajador();
		IngresoPorHorasExtras ingresoExtrasEnero =new IngresoPorHorasExtras (Month.JANUARY,"Horas extras",10000,10);
		Ingreso ingresoFebrero = new Ingreso(Month.FEBRUARY,"Salario",30000.10);
		Ingreso ingresoEnero = new Ingreso(Month.JANUARY,"Salario",30000.10);
		juan.agregarIngreso(ingresoEnero);
		juan.agregarIngreso(ingresoFebrero);
		juan.agregarIngreso(ingresoExtrasEnero);
	}

	@Test
	public void testGetTotalPercibido() {
		assertEquals(70000.20,juan.getMontoPercibido());
	}

	@Test
	public void testGetMontoImponible() {
		assertEquals(60000.20, juan.getMontoImponible());
	}

	@Test
	public void testGetImpuestoAPagar() {
		assertEquals(1200.004, juan.getImpuestoAPagar());
	}

}

