package ar.edu.unq.po2.tp3.equipodetrabajo;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
				
			Persona persona1 = new Persona("Eric","Gutierrez",26);
			Persona persona2 = new Persona("Chaz","Ortiz",32);
			Persona persona3 = new Persona("Jesse","Rodriguez",26);
			Persona persona4 = new Persona("Andrea","Perez",40);
			Persona persona5 = new Persona("Ismael","Guevara",30);
			EquipoDeTrabajo equipo = new EquipoDeTrabajo("Equipo 1");
			
			equipo.agregarPersonaAlEquipo(persona1);
			equipo.agregarPersonaAlEquipo(persona2);
			equipo.agregarPersonaAlEquipo(persona3);
			equipo.agregarPersonaAlEquipo(persona4);
			equipo.agregarPersonaAlEquipo(persona5);
				
			System.out.println("Promedio edad de equipo: " + equipo.promedioEdadIntegrantes());
	}
}

	

