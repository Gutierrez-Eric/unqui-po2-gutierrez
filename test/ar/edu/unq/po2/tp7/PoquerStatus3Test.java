package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PoquerStatus3Test {
	private PoquerStatus3 poquer;
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;

	@BeforeEach
	public void setUp() {
		poquer = new PoquerStatus3();
		carta1 = new Carta("1","C");
		carta2 = new Carta("K","C");
		carta3 = new Carta("10","D");
	}
	
	@Test
	public void testCartasDelMismoPalo() {
		boolean sonMismoPalo = carta1.mismoPaloQue(carta2);
		assertTrue(sonMismoPalo);
	}
	
	@Test
	public void testNoSonMismoPalo() {
		boolean sonMismoPalo = carta1.mismoPaloQue(carta3);
		assertFalse(sonMismoPalo);
	}
}
