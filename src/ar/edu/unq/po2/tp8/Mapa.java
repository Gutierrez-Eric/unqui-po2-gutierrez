package ar.edu.unq.po2.tp8;

import java.util.List;

public class Mapa {
	private List<Personaje> personajes;
	private int ancho;
	private int alto;
	
	public void agregarPersonaje(Personaje _personaje) {
		personajes.add(_personaje);
	}
}
