package ar.edu.unq.po2.tp8.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class ShapeShifterLeaf implements IShapeShifter {
	private int value;

	public ShapeShifterLeaf(int _value) {
		this.value = _value;
	}
	
	public int getValue() {
		return value;
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
		return 0;
	}

	@Override
	public IShapeShifter flat() {
		return this;
	}

	@Override
	public List<Integer> values() {
		List<Integer> lista = new ArrayList<>();
	    lista.add(this.value);
	    return lista;
	}

	@Override
	public void agregarShapeShifter(IShapeShifter _IShapeShifte) {
		// TODO Auto-generated method stub
		
	}
	
	
}
