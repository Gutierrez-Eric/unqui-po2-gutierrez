package ar.edu.unq.po2.tp10.empleados;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoPlantaTest {
	private EmpleadoPlanta empleadoPlanta;
	
	@BeforeEach
	public void setUp() {
		empleadoPlanta = new EmpleadoPlanta(3000.0,3);
	}
	 
	    @Test
	    public void testSueldo() {
	    	Empleado empleado = new EmpleadoPlanta(3000.0,3);
	    	double sueldo = empleado.sueldo();
	    	assertEquals(3001.5,sueldo);
	    }
	
	    @Test
	    public void testSueldoBasico() {
	    	double sueldoBasico =  empleadoPlanta.sueldoBasico();
	    	assertEquals(3000.0,sueldoBasico);
	    }
	    
	    @Test
	    public void testPagaPorHijos() {
	    	double extra = empleadoPlanta.extraPorHijo();
	    	assertEquals(450.0,extra);
	    }

}
