package ar.edu.unq.po2.tp3;

public class Rectangulo {
	private Point origen;
	private int base;
    private int altura;
	
    public Rectangulo(Point unPunto, int largo, int altura) {
    	this.validarCreacionRectangulo(base,altura);
    	this.origen = unPunto;
		this.base = largo;
		this.altura = altura;
	}
    
    public void validarCreacionRectangulo(int largo, int ancho) {
    	if(!this.puedoCrearRectangulo(largo,ancho)) {
    		throw new IllegalArgumentException ("El ancho y el alto deben ser mayores a cero.");
    	} 
    }
    
    public Boolean puedoCrearRectangulo(int largo, int ancho){
    	return (largo > 0 && ancho > 0);
    }

    public int calcularArea() {
    	return this.base * this.altura;
    }
    
    public int calcularPerimetro() {
    	return (2* this.base) + (2*this.altura);
    }
}