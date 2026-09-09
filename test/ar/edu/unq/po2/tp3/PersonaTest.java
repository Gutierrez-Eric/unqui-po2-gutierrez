package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class PersonaTest {
	private Persona persona;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		persona = new Persona("Eric",LocalDate.of(2000, 1, 19));
		
	}
	@Test
	public void testEdad() {
		int edad = persona.edad();
		assertEquals(edad,26);
	}
	
	@Test
	public void testMenorQueOtraPersona() {
		Persona persona2 = new Persona("Alejandro",LocalDate.of(2000, 1, 1));
		assertTrue(persona.menorQue(persona2));
	}
}
