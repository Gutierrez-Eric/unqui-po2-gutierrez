package ar.edu.unq.po2.tp3.equipodetrabajo;

import java.util.ArrayList;
import java.util.List;


public class EquipoDeTrabajo {
	private String nombre;
	private List<Persona> integrantes;
	
	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
		this.integrantes = new ArrayList<Persona>();
	}

	public void agregarPersonaAlEquipo(Persona persona) {
		integrantes.add(persona);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double promedioEdadIntegrantes() {
		if(integrantes.isEmpty()) {
			return 0.0;
		} else {
			int sumaEdades = 0;
		    for (Persona p : integrantes) {
		        sumaEdades += p.getEdad();
		    }
		return (double) sumaEdades / integrantes.size();
		}
	}
	
}
