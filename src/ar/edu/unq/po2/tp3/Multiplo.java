package ar.edu.unq.po2.tp3;

public class Multiplo {

	public int multiploMasAltoDe_Y_(int x, int y) {
		for (int numero = 1000; numero > 0; numero--) {
	        if (this.esMultiploDeAmbos(numero, x, y)) {
	            return numero;
	        }
	    }
	    return -1;
	}

	
	public Boolean esMultiploDeAmbos(int numero, int x, int y) {
		return this.el_esMultiploDe_(numero, x) && this.el_esMultiploDe_(numero, y);
	}
	
	public Boolean el_esMultiploDe_(int numero1, int numero2) {
		return (numero1 % numero2) == 0;
			
		}
}

