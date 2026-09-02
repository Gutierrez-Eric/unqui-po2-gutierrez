package ar.edu.unq.po2.tp3;

public class Point {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public void moverPunto(int coordenadaX, int coordenadaY) {
		this.x = coordenadaX;
		this.y = coordenadaY;
	}

	public Point sumarteAOtro(Point punto) {
		int nuevaX = this.x + punto.getX();
		int nuevaY = this.y + punto.getY();
		Point nuevoPunto = new Point (nuevaX, nuevaY);
		return nuevoPunto;
	}
	
}
