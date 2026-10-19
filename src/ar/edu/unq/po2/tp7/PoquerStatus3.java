package ar.edu.unq.po2.tp7;

import java.util.List;

public class PoquerStatus3 {
	
public String verificar(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		
		List <Carta> cartas = List.of(c1, c2, c3, c4, c5);
		
		List<Carta.ValorCarta> valores = cartas.stream()
                						 .map(c -> c.getValor())
                						 .toList();
		
		List<Carta.Palo> palos = cartas.stream()
									.map(c -> c.getPalo())
									.toList();
		
		if(this.esPoquer(valores,4)) {
			return "POQUER";
		} else if(this.esColor(palos,5)){
			return "COLOR";
		}else if(this.esTrio(valores,3)) {
			return "TRIO";
		} else {
			return "NADA";
		}
	}

	public boolean esPoquer(List<Carta.ValorCarta> valores,int cantidad) {
		return valores.stream()
				.anyMatch(v -> contarRepeticionesValores(valores, v) >= cantidad);
	}

	public boolean esTrio(List<Carta.ValorCarta> valores, int cantidad) {
	    return valores.stream()
	                  .anyMatch(v -> contarRepeticionesValores(valores, v) >= cantidad);
	}

	public boolean esColor(List<Carta.Palo> palos, int cantidad) {
	    return palos.stream()
	                .anyMatch(p -> contarRepeticionesPalos(palos, p) == cantidad);
	}

	public long contarRepeticionesValores(List<Carta.ValorCarta> valores, Carta.ValorCarta valorBuscado) {
		return valores.stream()
					  .filter(v -> v.equals(valorBuscado))
					  .count();
	}

	public long contarRepeticionesPalos(List<Carta.Palo> palos, Carta.Palo paloBuscado) {
		return palos.stream()
					.filter(p -> p.equals(paloBuscado))
					.count();
	}
}



