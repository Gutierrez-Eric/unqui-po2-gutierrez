package ar.edu.unq.po2.tp9.videojuego;

public class EstadoJugando implements EstadoVideojuego{

	private int cantidadJugadores;

    public EstadoJugando(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    @Override
    public void ingresarFicha(MaquinaVideojuego maquina) {
        System.out.println("Juego en curso: Ficha rechazada.");
    }

    @Override
    public void presionarInicio(MaquinaVideojuego maquina) {
        System.out.println("Juego en curso: El botón de inicio no realiza acción.");
    }
}

