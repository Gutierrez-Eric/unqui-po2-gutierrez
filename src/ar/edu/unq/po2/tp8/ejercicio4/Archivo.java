package ar.edu.unq.po2.tp8.ejercicio4;

import java.time.LocalDate;

public class Archivo implements FyleSystem{
	private String nombre;
	private int tamanoBytes;
    private LocalDate fechaModificacion;

    public Archivo(String nombre, int tamanoBytes, LocalDate fechaModificacion) {
        this.nombre = nombre;
        this.tamanoBytes = tamanoBytes;
        this.fechaModificacion = fechaModificacion;
    }
    
    

    @Override
    public int totalSize() {
        return this.tamanoBytes;
    }

	@Override
	public void printStructure() {
		this.printStructureConProfundidad(0);
	}
	
	public void printStructureConProfundidad(int profundidad) {
	    System.out.println(" ".repeat(profundidad) + this.nombre);
	}
	

	@Override
	public  FyleSystem lastModified() {
		return this;
	}

	@Override
	public FyleSystem oldestElement() {
		return this;
	}

	@Override
	public LocalDate getFecha() {
		return fechaModificacion;
	}
}
