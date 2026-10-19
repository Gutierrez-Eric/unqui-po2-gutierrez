package ar.edu.unq.po2.tp9.reproductor;

public class EstadoReproduciendo implements EstadoReproductor{

	@Override
	public void play(MP3Player player) {
		throw new RuntimeException("Error: La canción ya se está reproduciendo.");
	}

	@Override
	public void pause(MP3Player player) {
		player.getSongActual().pause();
        player.setEstado(new EstadoPausado());
		
	}

	@Override
	public void stop(MP3Player player) {
		player.getSongActual().stop();
        player.setEstado(new EstadoSeleccion());
	}

}
