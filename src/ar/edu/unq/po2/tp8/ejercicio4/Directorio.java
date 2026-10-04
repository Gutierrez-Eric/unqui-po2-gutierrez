package ar.edu.unq.po2.tp8.ejercicio4;

import java.time.LocalDate;
import java.util.List;

public class Directorio  implements FyleSystem {
	 private String nombre;
	 private LocalDate fechaCreacion;
	 private List<FyleSystem> contenido;
	 
	 public Directorio(String nombre, LocalDate fechaCreacion, List<FyleSystem> contenido) {
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.contenido = contenido;
	}

	 public int totalSize() {
		return contenido.stream()
				 		.mapToInt(e -> e.totalSize())
				 		.sum();
	
	 }

	 @Override
	 public void printStructure() {
		 this.printStructureConProfundidad(0);
	 }
	 
	 public void printStructureConProfundidad(int profundidad) {
		    System.out.println(" ".repeat(profundidad) + this.nombre);
		    for (FyleSystem elemento : this.contenido) {
		        elemento.printStructureConProfundidad(profundidad + 1);
		    }
		}

	 @Override
	 public FyleSystem lastModified() {
		
		FyleSystem ultimoModificado = this;
		for (FyleSystem e : this.contenido) {
			FyleSystem elementoMasNuevo = e.lastModified();
			if (elementoMasNuevo.getFecha().isAfter(ultimoModificado.getFecha())) {
	            ultimoModificado = elementoMasNuevo;
	        }
	    }
	    
	    return ultimoModificado;
	 }

	 @Override
	 public FyleSystem oldestElement() {
		 FyleSystem ultimoModificado = this;
			for (FyleSystem e : this.contenido) {
				FyleSystem elementoMasNuevo = e.lastModified();
				if (elementoMasNuevo.getFecha().isBefore(ultimoModificado.getFecha())) {
		            ultimoModificado = elementoMasNuevo;
		        }
		    }
		    
		    return ultimoModificado;
	 }

	 @Override
	 public LocalDate getFecha() {
		return this.fechaCreacion;
	 }
	 
	 
}
