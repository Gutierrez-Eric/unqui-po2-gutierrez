package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PoquerStatus1Test {
	private PoquerStatus1 poquer;

	@BeforeEach
	public void setUp() {
		poquer = new PoquerStatus1();
		
	}
	
	@Test
	public void testVerificarPoquer() {
		boolean esPoquer = poquer.verificar("KP","KD","2T","KT","KC");
		assertTrue(esPoquer);
	}
	
	@Test
	public void testVerificarNoPoquer() {
		boolean esPoquer = poquer.verificar("3T","KD","2T","KT","KC");
		assertFalse(esPoquer);
	}
}
