package ar.edu.unq.po2.tp7;

public class Carta {
	private ValorCarta valor;
	private Palo palo;

	public Carta(ValorCarta _valor, Palo _palo) {
        this.valor = _valor;
        this.palo = _palo;
    }
	
	public Palo getPalo() {
		return this.palo;
	}
	
	public ValorCarta getValor() {
		return this.valor;
	}

	//--- ENUMS ANIDADOS ---
	public enum Palo {
	    CORAZONES, DIAMANTES, PICAS, TREBOLES
	}

	public enum ValorCarta {
	    DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), OCHO(8), NUEVE(9),
	    J(10), Q(11), K(12), AS(13);

	    private final int peso;

	    ValorCarta(int peso) {
	        this.peso = peso;
	    }

	    public int getPeso() {
	        return peso;
	    }
	}
	
	public boolean mismoPaloQue(Carta carta) {
		return this.getPalo() == carta.getPalo();
	}
	
	public boolean mismoValorQue(Carta carta) {
		return this.getValor() == carta.getValor();
	}
	
	public boolean esSuperiorA(Carta carta) {
	    return this.getValor().getPeso() > carta.getValor().getPeso();
	}

}
