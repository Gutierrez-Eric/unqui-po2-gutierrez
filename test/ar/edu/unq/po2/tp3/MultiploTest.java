package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MultiploTest {
	
	private Multiplo multiplo;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		multiplo = new Multiplo();
		
	}
	
	@Test
	public void multiploTest() {
		int multiploMasAlto = multiplo.multiploMasAltoDe_Y_(3, 9);
		
		assertEquals(multiploMasAlto,999);
	}
	
	@Test
	public void sinMultiploTest() {
		int multiploMasAlto = multiplo.multiploMasAltoDe_Y_(40, 27);
		
		assertEquals(multiploMasAlto,-1);
	}

}
