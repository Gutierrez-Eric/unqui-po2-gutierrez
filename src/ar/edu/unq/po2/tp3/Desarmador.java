package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Desarmador {
	
	public Desarmador() {
		super();
	}

	public Integer numeroConMásDigitosPares(ArrayList<Integer> numeros) {
		Integer numeroConMasDigitosPar = numeros.get(0);
		Integer maxPares = this.cantDigitosPares(numeroConMasDigitosPar);
		for (int i = 1; i < numeros.size(); i++){
			int paresActual = this.cantDigitosPares(numeros.get(i));
		    if (paresActual > maxPares) {
		    	numeroConMasDigitosPar = numeros.get(i);
		    	maxPares = this.cantDigitosPares(numeros.get(i));
		    }
		}
		return numeroConMasDigitosPar;
	}
	
	public Integer cantDigitosPares(Integer numero) {
		Integer contador = 0;
		while (numero > 0){
			Integer digito = numero % 10; //Saco el ultimo digito
			contador = contador + this.devolverUnoSiElDigitoEsPar(digito);
			numero = numero / 10; // Resto el ultimo digito al numero completo
		}
		return contador;
	}
	
	public Integer devolverUnoSiElDigitoEsPar(Integer digito) {
		if(digito % 2 == 0) {
			return 1;
		} else {
			return 0;
		}
	}
}
