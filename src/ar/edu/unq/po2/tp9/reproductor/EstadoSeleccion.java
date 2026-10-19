package ar.edu.unq.po2.tp9.reproductor;

public class EstadoSeleccion implements EstadoReproductor {

	@Override
	public void play(MP3Player player) {
		player.getSongActual().play();
        player.setEstado(new EstadoReproduciendo());
	}

	@Override
	public void pause(MP3Player player) {
		throw new RuntimeException("Error: No se puede pausar en modo de selección de canciones.");
	}

	@Override
	public void stop(MP3Player player) {
		player.getSongActual().stop();
        player.setEstado(new EstadoSeleccion());
		
	}

}
