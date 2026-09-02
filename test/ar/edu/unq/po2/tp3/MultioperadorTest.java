package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class MultioperadorTest {
	
	private Multioperador multioperador;
	@BeforeEach
	public void setUp() throws Exception {
		
		multioperador = new Multioperador();
		
	}
	@Test
	public void testSumarTodosOpc1() {
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		int amount = multioperador.sumarTodosOpc1(numeros);
		assertEquals(amount, 15);
	}
	
	@Test
	public void testSumarTodosOpc2() {
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		int amount = multioperador.sumarTodosOpc1(numeros);
		assertEquals(amount, 15);
	}
	
	@Test
	public void testRestarTodosCaso1() {
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		Integer amount = multioperador.restarTodos(numeros);
		assertEquals(amount, -7);
	}
	@Test
	public void testRestarTodosCasoVacio() {
		List<Integer> numeros = new ArrayList<Integer>();
		Integer amount = multioperador.restarTodos(numeros);
		assertEquals(amount,0);
	}
	
	@Test
	
	public void testMultiplicarTodosCaso1() {
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		Integer amount = multioperador.multiplicoTodos(numeros);
		assertEquals(amount, 120);
	}
	
	@Test
	public void testMultiplicarTodosCasoVacio() {
		List<Integer> numeros = new ArrayList<Integer>();
		Integer amount = multioperador.multiplicoTodos(numeros);
		assertEquals(amount, 0);
	}
}
