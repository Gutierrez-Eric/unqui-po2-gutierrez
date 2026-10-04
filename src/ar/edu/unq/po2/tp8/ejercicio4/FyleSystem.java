package ar.edu.unq.po2.tp8.ejercicio4;

import java.time.LocalDate;

public interface FyleSystem {
		
	/*
		* Retorna el total ocupado en disco del receptor. Expresado en
		*cantidad de bytes.
		*/
		public int totalSize();
		/*
		* Imprime en consola el contenido indicando el nombre del elemento
		Programación Orientada a Objetos II
		* e indentandolo con tantos espacios como profundidad en la
		estructura.
		*/
		public void printStructure();
		
		public void printStructureConProfundidad(int profundidad);
		
		/*
		* Elemento mas nuevo
		*/
		public FyleSystem lastModified();
		/* Elemento mas antiguo
		*/
		public FyleSystem oldestElement();
		
		public LocalDate getFecha();
}
