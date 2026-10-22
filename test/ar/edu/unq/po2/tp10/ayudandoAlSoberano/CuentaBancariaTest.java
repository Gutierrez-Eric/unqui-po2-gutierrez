package ar.edu.unq.po2.tp10.ayudandoAlSoberano;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CuentaBancariaTest {
	private CajaDeAhorro cajaDeAhorro;
    private CuentaCorriente cuentaCorriente;

    @BeforeEach
    public void setUp() {
        // Configuramos una caja de ahorro con un límite de extracción de 5000 y saldo inicial en 0 (por defecto)
        cajaDeAhorro = new CajaDeAhorro("Juan Perez", 5000);
        
        // Configuramos una cuenta corriente con un descubierto de 3000
        cuentaCorriente = new CuentaCorriente("Maria Gomez", 3000);
    }

    @Test
    public void testExtraccionExitosaCajaDeAhorro() {
        // Primero le seteamos saldo a la caja de ahorro para poder extraer (usando un setter o simulando un depósito previo si lo tuviera)
        // Nota: Como setSaldo es protected, podés usarlo en el test si estás en el mismo paquete, 
        // o simular el saldo según cómo tengas modelados los depósitos.
        cajaDeAhorro.setSaldo(4000);
        
        // Extraemos un monto menor al saldo y menor al límite
        cajaDeAhorro.extraer(1500);

        assertEquals(2500, cajaDeAhorro.getSaldo());
    }

    @Test
    public void testExtraccionFallidaCajaDeAhorroSuperaSaldo() {
        cajaDeAhorro.setSaldo(1000);
        
        // Intentamos extraer más de lo que hay en el saldo (aunque el límite sea alto)
        cajaDeAhorro.extraer(2000);

        // El saldo no debería modificarse porque la extracción se rechaza
        assertEquals(1000, cajaDeAhorro.getSaldo());
    }

    @Test
    public void testExtraccionExitosaCuentaCorrienteConDescubierto() {
        cuentaCorriente.setSaldo(500);
        
        // Extraemos 2000 (tenemos 500 propios + 3000 de descubierto, por lo que debería dejar usar el descubierto)
        cuentaCorriente.extraer(2000);

        assertEquals(-1500, cuentaCorriente.getSaldo());
    }

    @Test
    public void testExtraccionFallidaCuentaCorrienteSuperaDescubierto() {
        cuentaCorriente.setSaldo(0);
        
        // Intentamos extraer más de los 3000 de descubierto permitidos
        cuentaCorriente.extraer(4000);

        // El saldo debe quedar intacto en 0
        assertEquals(0, cuentaCorriente.getSaldo());
    }
}
