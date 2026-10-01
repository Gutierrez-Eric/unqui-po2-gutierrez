package ar.edu.unq.po2.tp7;

import java.util.ArrayList;
import java.util.List;

public class PoquerStatus1 {

	public boolean verificar(String c1, String c2, String c3, String c4, String c5) {
		
		List <String> cartas = List.of(c1, c2, c3, c4, c5);
		
		List<String> valores = cartas.stream()
									 .map(c -> this.obtenerValor(c))
									 .toList();
		
		return valores.stream()
                .anyMatch(v -> contarRepeticiones(valores, v) >= 4);
	}
	
	

	public String obtenerValor(String carta) {
		return carta.substring(0, carta.length() - 1);
	}
	
	public long contarRepeticiones(List<String> valores,String valor) {
		
		return valores.stream().filter(v -> v.equals(valor)).count();
	}
}
