package ar.edu.unq.po2.tp9.reproductor;

public class MP3Player {
	private EstadoReproductor estadoActual;
    private Song songActual;
    
    public MP3Player(Song song) {
        this.songActual = song;
        this.estadoActual = new EstadoSeleccion(); // Arranca en selección
    }
    
    public void setEstado(EstadoReproductor nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    public EstadoReproductor getEstadoActual() {
        return estadoActual;
    }

    public Song getSongActual() {
        return songActual;
    }
    
    public void play() {
        this.estadoActual.play(this);
    }

    public void pause() {
        this.estadoActual.pause(this);
    }

    public void stop() {
        this.estadoActual.stop(this);
    }


}
