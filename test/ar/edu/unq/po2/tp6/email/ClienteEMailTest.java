package ar.edu.unq.po2.tp6.email;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteEMailTest {
	private ClienteEMail cliente1;
	private ClienteEMail cliente2;
	private ServidorPop servidor;
	private Correo correo1;

	@BeforeEach
	public void setUp() {
		
		correo1 = new Correo ("Eric", "Saludo","Hola");
			
		servidor = new ServidorPop(new HashMap<>(),new HashMap<>());
				
		servidor.registrarCuenta("Eric", "123");
		
		cliente1 = new ClienteEMail(servidor,"Eric","123");
		
		cliente1.agregarCorreoAInbox(correo1);
		
		cliente2 = new ClienteEMail(servidor,"Alejandro","234");
	
	}
	
	@Test
	public void estaConectadoAServidor() {
		assertFalse(cliente1.getConectado());
		cliente1.conectar();
		assertTrue(cliente1.getConectado());
	}
	
	@Test
	public void testCantCorreosInbox() {
		assertEquals(1, cliente1.contarInbox());
		assertEquals(0, cliente2.contarInbox());
		
	}
	
	@Test
	public void testBorrarCorreo() {
		assertEquals(1, cliente1.contarInbox());
		cliente1.borrarCorreo(correo1);
		assertEquals(0,cliente1.contarInbox());
		assertEquals(1,cliente1.contarBorrados());
	}
	
	@Test
	public void testBorrarCorreoQueNoTengo() {
		assertThrows(RuntimeException.class, () -> {
	        cliente2.borrarCorreo(correo1);
	    });
	}
	
	public void testContarCorreosBorrados() {
		assertEquals(0, cliente1.contarBorrados());
		cliente1.borrarCorreo(correo1);
		assertEquals(1,cliente1.contarBorrados());
	}
	
	@Test
	public void testEliminarBorrados() {
		cliente1.borrarCorreo(correo1);
		assertEquals(1,cliente1.contarBorrados());
		cliente1.eliminarBorrado(correo1);
		assertEquals(0,cliente1.contarBorrados());
	}
	
	@Test
	public void testEliminarBorradoQueNoTengo() {
		assertThrows(RuntimeException.class, () -> {
	        cliente1.eliminarBorrado(correo1);
	    });
	}
	
}