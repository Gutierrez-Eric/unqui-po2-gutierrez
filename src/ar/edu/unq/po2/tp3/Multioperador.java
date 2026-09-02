package ar.edu.unq.po2.tp3;

import java.util.List;

public class Multioperador {

	public Multioperador() {
	}

	public int sumarTodosOpc1(List<Integer> numeros) {
	
		return numeros.stream().mapToInt(Integer::intValue).sum();
	}
	
	public Integer sumarTodosOpc2(List<Integer> numeros) {
		if (numeros.isEmpty()) {
	        return 0;
		}else {
		Integer suma = 0;
		for(Integer numero : numeros) {
			suma += numero;
		}
			return suma;
		}
	}

	public Integer restarTodos(List<Integer> numeros) {
		if (numeros.isEmpty()) {
	        return 0;
	    } else {
		Integer resta = numeros.getFirst();
		for(int i = 1; i < numeros.size(); i++) {
			resta -= numeros.get(i);
		}
			return resta;
	    	}
	}
public Integer multiplicoTodos(List<Integer> numeros) {
	if (numeros.isEmpty()) {
	    return 0;
	} else {
		Integer multiplicacion = 1;
		for(Integer numero : numeros) {
			multiplicacion = multiplicacion * numero;
		}
		return multiplicacion;
		}
	}
}


