package ar.edu.unq.po2.tp10.empleados;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EmpleadoPasanteTest {

	 
	    @Test
	    public void testSueldo() {
	    	Empleado empleado = new EmpleadoPasante(10);
	    	double sueldo = empleado.sueldo();
	    	assertEquals(348.0,sueldo);
	    }
	    
	    @Test
	    public void pagaPorHoras() {
	    	EmpleadoPasante empleadoPasante = new EmpleadoPasante(15);
	    	double pagaPorHoras = empleadoPasante.pagaPorHoras();
	    	assertEquals(600.0,pagaPorHoras);
	    }
	      
}
