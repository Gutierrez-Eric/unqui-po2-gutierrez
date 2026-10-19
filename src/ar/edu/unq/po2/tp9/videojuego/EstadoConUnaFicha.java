package ar.edu.unq.po2.tp9.videojuego;

public class EstadoConUnaFicha implements EstadoVideojuego{

	@Override
	public void ingresarFicha(MaquinaVideojuego maquina) {
		System.out.println("Se ingresó la 2da ficha.");
        maquina.setEstado(new EstadoConDosFichas());
	}

	@Override
	public void presionarInicio(MaquinaVideojuego maquina) {
		System.out.println("PANTALLA: Iniciando juego para 1 JUGADOR.");
        maquina.setEstado(new EstadoJugando(1));
	}

}
