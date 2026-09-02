package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;



public class DesarmadorTest {
	
	private Desarmador desarmador;
	@BeforeEach
	public void setUp() throws Exception {
		
		desarmador = new Desarmador();
		
	}
	
	@Test
	public void testDesarmador() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(5394128);
		numeros.add(2468);
		numeros.add(1357);
		Integer ganador = desarmador.numeroConMásDigitosPares(numeros);
		assertEquals(ganador, 2468);
	}
	
	@Test
	public void testDigitosPares() {
		Integer amount = desarmador.cantDigitosPares(5394128);
		assertEquals(amount,3);
	}
}
