package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PointTest {
	
	private Point punto1;
    private Point punto2;
	
	
	@BeforeEach
	public void setUp() throws Exception {
		
		punto1 = new Point(3,4);
		punto2 = new Point();
		
	}
	
	@Test
	public void testCreacionPuntoConValores(){
		assertEquals(3, punto1.getX());
        assertEquals(4, punto1.getY());
	}
	
	@Test
	public void testCreacionPuntoVacio() {
		assertEquals(0, punto2.getX());
        assertEquals(0, punto2.getY());
	}
	
	@Test
	public void testMoverPunto() {
		punto1.moverPunto(5, 5);
		assertEquals(5, punto1.getX());
        assertEquals(5, punto1.getY());
	}
	
	@Test
	public void testSumarDosPuntos() {
		punto2.moverPunto(5, 5);
		Point resultado = punto1.sumarteAOtro(punto2);
		assertEquals(8, resultado.getX());
        assertEquals(9, resultado.getY());
	}
}
