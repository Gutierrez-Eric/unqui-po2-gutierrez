package ar.edu.unq.po2.tp5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Eric",LocalDate.of(2000, 01, 19));
		Persona persona2 = new Persona("Chaz",LocalDate.of(1994, 04, 04));
		
		Mascota mascota1 = new Mascota ("Luli","Bretona");
		Mascota mascota2 = new Mascota ("Coca", "Caniche");
		
		List<Nombrable> listaNombrables = new ArrayList<>();
        listaNombrables.add(persona1);
        listaNombrables.add(persona2);
        listaNombrables.add(mascota1);
        listaNombrables.add(mascota2);
        
        for (Nombrable elemento : listaNombrables) {
            System.out.println(elemento.nombre());
        }
    }

}
