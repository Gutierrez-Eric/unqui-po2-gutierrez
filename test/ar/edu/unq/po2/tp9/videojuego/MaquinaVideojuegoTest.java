package ar.edu.unq.po2.tp9.videojuego;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaquinaVideojuegoTest {

    private MaquinaVideojuego maquina;

    @BeforeEach
    void setUp() {
        maquina = new MaquinaVideojuego();
    }

    @Test
    void testEstadoInicialEsSinFichas() {
        assertTrue(maquina.getEstado() instanceof EstadoSinFichas);
    }

    @Test
    void testIngresarUnaFichaCambiaAEstadoConUnaFicha() {
        maquina.ingresarFicha();
        assertTrue(maquina.getEstado() instanceof EstadoConUnaFicha);
    }

    @Test
    void testIngresarDosFichasCambiaAEstadoConDosFichas() {
        maquina.ingresarFicha();
        maquina.ingresarFicha();
        assertTrue(maquina.getEstado() instanceof EstadoConDosFichas);
    }

    @Test
    void testPresionarInicioConUnaFichaIniciaUnJugador() {
        maquina.ingresarFicha(); // Pasa a EstadoConUnaFicha
        maquina.presionarInicio(); // Inicia juego para 1 jugador
      
        assertTrue(maquina.getEstado() instanceof EstadoJugando);
        
        EstadoJugando estado = (EstadoJugando) maquina.getEstado();
        assertEquals(1, estado.getCantidadJugadores());
    }

    @Test
    void testPresionarInicioConDosFichasIniciaDosJugadores() {
        maquina.ingresarFicha();
        maquina.ingresarFicha(); 
        maquina.presionarInicio(); 

    
        assertTrue(maquina.getEstado() instanceof EstadoJugando);
        
        EstadoJugando estado = (EstadoJugando) maquina.getEstado();
        assertEquals(2, estado.getCantidadJugadores());
    }

    @Test
    void testTerminarJuegoReiniciaLaMaquinaASinFichas() {
  
        maquina.ingresarFicha();
        maquina.presionarInicio();
        assertTrue(maquina.getEstado() instanceof EstadoJugando);
        maquina.terminarJuego();

    
        assertTrue(maquina.getEstado() instanceof EstadoSinFichas);
    }
}