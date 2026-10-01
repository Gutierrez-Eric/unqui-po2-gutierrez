package ar.edu.unq.po2.tp7;

import java.util.List;

public class PoquerStatus2 {

public String verificar(String c1, String c2, String c3, String c4, String c5) {
		
		List <String> cartas = List.of(c1, c2, c3, c4, c5);
		
		List<String> valores = cartas.stream()
									 .map(c -> this.obtenerValor(c))
									 .toList();
		
		List<String> palos = cartas.stream()
									.map(c -> this.obtenerPalo(c))
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

	public boolean esTrio(List<String> palos,int cantidad) {
		return palos.stream()
				.anyMatch(p -> contarRepeticiones(palos, p) == cantidad);
	}
	

	public boolean esColor(List<String> palos,int cantidad) {
		return palos.stream()
					.anyMatch(p -> contarRepeticiones(palos, p) == cantidad);
	}
	
	public String obtenerPalo(String carta) {
		return carta.substring(carta.length() - 1);
	}
	

	public String obtenerValor(String carta) {
		return carta.substring(0, carta.length() - 1);
	}
	
	public long contarRepeticiones(List<String> valores,String valor) {
		return valores.stream().filter(v -> v.equals(valor)).count();
	}
	
	public boolean esPoquer(List<String> valores,int cantidad) {
		return valores.stream()
                .anyMatch(v -> contarRepeticiones(valores, v) >= cantidad);
	}
}

