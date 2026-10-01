package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PoquerStatus2Test {
	private PoquerStatus2 poquer;

	@BeforeEach
	public void setUp() {
		poquer = new PoquerStatus2();
		
	}
	
	@Test
	public void testVerificarPoquer() {
		String esPoquer = poquer.verificar("KP","KD","2T","KT","KC");
		assertEquals("POQUER",esPoquer);
	}
	
	@Test
	public void testVerificarColor() {
		String esColor = poquer.verificar("3T","2T","4T","5T","6T");
		assertEquals("COLOR",esColor);
	}
	
	@Test
	public void testVerificarTrio() {
		String esTrio = poquer.verificar("2D","2T","2P","5D","6T");
		assertEquals("TRIO",esTrio);
	}
	
	@Test
	public void testVerificarNada() {
		String nada = poquer.verificar("2D", "3T", "KP", "10T", "10C");
		assertEquals("NADA",nada);
	}
}
