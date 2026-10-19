package ar.edu.unq.po2.tp9.videojuego;

public class EstadoConDosFichas implements EstadoVideojuego {

	@Override
	public void ingresarFicha(MaquinaVideojuego maquina) {
		System.out.println("Máximo de fichas alcanzado. Ficha no aceptada.");
	}

	@Override
	public void presionarInicio(MaquinaVideojuego maquina) {
		System.out.println("PANTALLA: Iniciando juego para 2 JUGADORES.");
        maquina.setEstado(new EstadoJugando(2));
	}

	
}
