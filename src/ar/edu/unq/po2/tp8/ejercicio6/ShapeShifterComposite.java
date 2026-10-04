package ar.edu.unq.po2.tp8.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class ShapeShifterComposite implements IShapeShifter{
	private List<IShapeShifter> elements = new ArrayList<>();

	public void agregarShapeShifter(IShapeShifter uno) {
		elements.add(uno);
	}

	@Override
	public IShapeShifter compose(IShapeShifter other) {
			ShapeShifterComposite nuevo = new ShapeShifterComposite();
		    nuevo.agregarShapeShifter(this);
		    nuevo.agregarShapeShifter(other); 
		    return nuevo;
		}

	@Override
	public int deepest() {
		int profundidad = 0;
		for (IShapeShifter element: this.elements) {
			profundidad = Math.max(profundidad, element.deepest());
		}
		return 1 + profundidad;
	}

	@Override
	public IShapeShifter flat() {
		IShapeShifter nuevoShifter = new ShapeShifterComposite();
		for (Integer valor : this.values()) {
			nuevoShifter.agregarShapeShifter(new ShapeShifterLeaf(valor));
		}
		return nuevoShifter;
	}

	@Override
	public List<Integer> values() {
		List<Integer> resultado = new ArrayList<>();
		for (IShapeShifter element : this.elements) {
			resultado.addAll(element.values());
		}
    return resultado;
	}

	@Override
	public int getValue() {
		return elements.stream()
					   .mapToInt(e -> e.getValue())
					   .sum();
	}
}
