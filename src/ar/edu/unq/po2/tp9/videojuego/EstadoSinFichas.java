package ar.edu.unq.po2.tp9.videojuego;

public class EstadoSinFichas implements EstadoVideojuego {

	@Override
	public void ingresarFicha(MaquinaVideojuego maquina) {
		System.out.println("Se ingresó 1 ficha.");
        maquina.setEstado(new EstadoConUnaFicha());
    }
		

	@Override
	public void presionarInicio(MaquinaVideojuego maquina) {
		System.out.println("PANTALLA: Por favor, ingrese fichas para jugar.");
    }

}
