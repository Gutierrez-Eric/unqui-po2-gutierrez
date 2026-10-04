package ar.edu.unq.po2.tp8.ejercicio6;

import java.util.List;

public interface IShapeShifter {

	public int getValue();
	public IShapeShifter compose(IShapeShifter _IShapeShifte);
	public int deepest();
	public IShapeShifter flat();
	public List<Integer> values();
	
	public void agregarShapeShifter(IShapeShifter _IShapeShifte);
}
