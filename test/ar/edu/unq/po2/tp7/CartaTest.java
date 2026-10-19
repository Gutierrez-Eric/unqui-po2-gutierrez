package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CartaTest {
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;

	@BeforeEach
	public void setUp() {
		carta1 = new Carta(Carta.ValorCarta.AS, Carta.Palo.CORAZONES);
	    carta2 = new Carta(Carta.ValorCarta.K, Carta.Palo.CORAZONES);
	    carta3 = new Carta(Carta.ValorCarta.AS, Carta.Palo.DIAMANTES);
	    
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
	
	@Test
	public void testCartasDelMismoValor() {
		boolean sonMismoPalo = carta1.mismoValorQue(carta3);
		assertTrue(sonMismoPalo);
	}
	
	@Test
	public void testNoTienenMismoValor() {
		boolean sonMismoPalo = carta1.mismoValorQue(carta2);
		assertFalse(sonMismoPalo);
	}
	
}
