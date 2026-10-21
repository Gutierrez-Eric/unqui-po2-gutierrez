package ar.edu.unq.po2.tp10.empleados;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTemporarioTest {
private EmpleadoTemporario empleadoTemporario;
	
	@BeforeEach
	public void setUp() {
		empleadoTemporario = new EmpleadoTemporario(10,1000.0,true,false);
	}
	 
	    @Test
	    public void testSueldo() {
	    	Empleado empleado = new EmpleadoTemporario(10,1000.0,true,false);
	    	double sueldo = empleado.sueldo();
	    	assertEquals(1000.5,sueldo);
	    }
	
	    @Test
	    public void testSueldoBasico() {
	    	double sueldoBasico =  empleadoTemporario.sueldoBasico();
	    	assertEquals(1000.0,sueldoBasico);
	    }
	    
	    @Test
	    public void extraPorCasadoOHijos() {
	    	EmpleadoTemporario empleadoTemporario2 = new EmpleadoTemporario(10,1000.0,false,false);
	    	double extra = empleadoTemporario.extraSiTieneHijosOEstaCasado();
	    	assertEquals(100.0,extra);
	    	double extra2 = empleadoTemporario2.extraSiTieneHijosOEstaCasado();
	    	assertEquals(0.0,extra2);
	    }

}