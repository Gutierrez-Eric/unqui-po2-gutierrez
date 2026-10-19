package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PoquerStatus3Test {
	private PoquerStatus3 poquer;
    private Carta carta1;
    private Carta carta2;
    private Carta carta3;
    private Carta carta4;
    private Carta carta5;

    @BeforeEach
    public void setUp() {
        poquer = new PoquerStatus3();
    }

    
    @Test
    public void testVerificarPoquer() {
        // 4 Ases y 1 King de diferentes palos
        carta1 = new Carta(Carta.ValorCarta.AS, Carta.Palo.CORAZONES);
        carta2 = new Carta(Carta.ValorCarta.K, Carta.Palo.CORAZONES);
        carta3 = new Carta(Carta.ValorCarta.AS, Carta.Palo.DIAMANTES);
        carta4 = new Carta(Carta.ValorCarta.AS, Carta.Palo.PICAS);
        carta5 = new Carta(Carta.ValorCarta.AS, Carta.Palo.TREBOLES);

        String resultado = poquer.verificar(carta1, carta2, carta3, carta4, carta5);
        assertEquals("POQUER", resultado);
    }

    @Test
    public void testVerificarColor() {
        // 5 cartas del mismo palo (CORAZONES)
        carta1 = new Carta(Carta.ValorCarta.AS, Carta.Palo.CORAZONES);
        carta2 = new Carta(Carta.ValorCarta.DOS, Carta.Palo.CORAZONES);
        carta3 = new Carta(Carta.ValorCarta.CINCO, Carta.Palo.CORAZONES);
        carta4 = new Carta(Carta.ValorCarta.J, Carta.Palo.CORAZONES);
        carta5 = new Carta(Carta.ValorCarta.K, Carta.Palo.CORAZONES);

        String resultado = poquer.verificar(carta1, carta2, carta3, carta4, carta5);
        assertEquals("COLOR", resultado);
    }

    @Test
    public void testVerificarTrio() {
        // 3 Ases y 2 cartas distintas
        carta1 = new Carta(Carta.ValorCarta.AS, Carta.Palo.CORAZONES);
        carta2 = new Carta(Carta.ValorCarta.DOS, Carta.Palo.DIAMANTES);
        carta3 = new Carta(Carta.ValorCarta.AS, Carta.Palo.PICAS);
        carta4 = new Carta(Carta.ValorCarta.AS, Carta.Palo.TREBOLES);
        carta5 = new Carta(Carta.ValorCarta.K, Carta.Palo.CORAZONES);

        String resultado = poquer.verificar(carta1, carta2, carta3, carta4, carta5);
        assertEquals("TRIO", resultado);
    }

    @Test
    public void testVerificarNada() {
        // Ninguna jugada válida
        carta1 = new Carta(Carta.ValorCarta.AS, Carta.Palo.CORAZONES);
        carta2 = new Carta(Carta.ValorCarta.DOS, Carta.Palo.DIAMANTES);
        carta3 = new Carta(Carta.ValorCarta.TRES, Carta.Palo.PICAS);
        carta4 = new Carta(Carta.ValorCarta.CUATRO, Carta.Palo.TREBOLES);
        carta5 = new Carta(Carta.ValorCarta.K, Carta.Palo.CORAZONES);

        String resultado = poquer.verificar(carta1, carta2, carta3, carta4, carta5);
        assertEquals("NADA", resultado);
    }
}


