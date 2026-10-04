package ar.edu.unq.po2.tp8.ejercicio6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.PoquerStatus2;


public class ShapeShifterTest {
	private IShapeShifter a;
	private IShapeShifter b;
	private IShapeShifter c;
	private IShapeShifter d;
	IShapeShifter cinco = new ShapeShifterLeaf(5);
	IShapeShifter seis = new ShapeShifterLeaf(6);
	private IShapeShifter e;
	private IShapeShifter f;
	private IShapeShifter g;
	

	@BeforeEach
	public void setUp() {
		a = new ShapeShifterLeaf(1);
		b = new ShapeShifterLeaf(2);
		c = a.compose(b);
		d = new ShapeShifterLeaf(3);
		e = cinco.compose(seis);
	}
	
	@Test
	public void testValoresLeaf() {
		assertEquals(List.of(1),a.values());
		assertEquals(List.of(2),b.values());
		assertEquals(List.of(3),d.values());
	}
	
	@Test
	public void testValoresComposite() {
		d = d.compose(c);
		f = d.compose(e);
		assertEquals(List.of(3,1,2),d.values());
		assertEquals(List.of(5,6),e.values());
		assertEquals(List.of(3,1,2,5,6),f.values());
	}

	@Test
	public void testDeepest() {
		d = d.compose(c);
		f = d.compose(e);
		assertEquals(0,a.deepest());
		assertEquals(1,c.deepest());
		assertEquals(3,f.deepest());
	}
	
	@Test
	public void testFlat() {
		d = d.compose(c);
		f = d.compose(e);
		g = f.flat();
		assertEquals(a,a.flat());
		assertEquals(1, g.deepest());
	    assertEquals(List.of(3, 1, 2, 5, 6), g.values());;
	}
	
}