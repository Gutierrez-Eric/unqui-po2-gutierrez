package ar.edu.unq.po2.tp6.email;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ServidorPopTest {
		private ClienteEMail cliente1;
		private ClienteEMail cliente2;
		private ServidorPop servidor;
		private Correo correo1;
		private Correo correo2;
		
		@BeforeEach
		public void setUp() {
			
			correo1 = new Correo ("Saludo","Eric","Hola");
			correo2 = new Correo ("Despedida","Eric","Chau");
			servidor = new ServidorPop(new HashMap<>(),new HashMap<>());
			cliente1 = new ClienteEMail(servidor,"Eric","123");
			cliente2 = new ClienteEMail(servidor,"Alejandro","234");
			servidor.registrarCuenta(cliente1.getUsuario(), cliente1.getPassword());
		}

		@Test
		public void testTieneCuentaRegistrada() {
			assertTrue(servidor.tieneCuentaRegistrada(cliente1.getUsuario()));
			assertFalse(servidor.tieneCuentaRegistrada(cliente2.getUsuario()));
		}
		
		@Test
		public void testEnviarCorreo() {
			assertEquals(0, servidor.cantCorreosEnBuzon(cliente1.getUsuario()));
			servidor.enviar(correo2);
			assertEquals(1, servidor.cantCorreosEnBuzon(cliente1.getUsuario()));
		}
		
		@Test
		public void testConectarConElServidor() {
			assertFalse(servidor.estaConectado(cliente1.getUsuario()));
			cliente1.conectar();
			assertTrue(servidor.estaConectado(cliente1.getUsuario()));
		}

		@Test
		public void testDesconectarDelServidor() {
			cliente1.conectar();
			assertTrue(servidor.estaConectado(cliente1.getUsuario()));
			cliente1.desconectar();
			assertFalse(servidor.estaConectado(cliente1.getUsuario()));
		}
		
		@Test 
		public void testExcepcionCuentaNoRegistrada() {
		assertThrows(RuntimeException.class, () -> {
			servidor.conectar(cliente2.getUsuario(), cliente2.getPassword());
	    });
	}
		
		@Test
		public void testExcepcionRecibirNuevos() {
			assertThrows(RuntimeException.class, () -> {
				servidor.recibirNuevos(cliente2.getUsuario(), cliente2.getPassword());
			});
		}
}