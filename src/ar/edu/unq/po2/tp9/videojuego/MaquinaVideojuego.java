package ar.edu.unq.po2.tp9.videojuego;

public class MaquinaVideojuego {
	private EstadoVideojuego estado;
	
	public MaquinaVideojuego() {
        // Al encenderse la máquina, arranca sin fichas
        this.estado = new EstadoSinFichas();
    }

	public void setEstado(EstadoVideojuego estado) {
		this.estado = estado;
	}
	
	public EstadoVideojuego getEstado() {
		return  estado;
	}
	
	public void ingresarFicha() {
		this.estado.ingresarFicha(this);
    }
	
	
	public void presionarInicio() {
		this.estado.presionarInicio(this);
	}

	public void terminarJuego() {
        System.out.println("El juego ha terminado. Volviendo al estado inicial.");
        this.setEstado(new EstadoSinFichas());
    }
}

