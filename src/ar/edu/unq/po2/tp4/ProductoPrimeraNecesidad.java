package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad  extends Producto{
	private double descuentoDe;
	

	
	
	public ProductoPrimeraNecesidad(String _nombre, double _precio, boolean _pertenecePreciosCuidados,
			double descuentoDe) {
		super(_nombre, _precio, _pertenecePreciosCuidados);
		this.descuentoDe = descuentoDe;
	}

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean pertenecePreciosCuidados) {
		super(nombre, precio, pertenecePreciosCuidados);
	}

	public ProductoPrimeraNecesidad(String nombre, double precio) {
		super(nombre, precio);
	}

	@Override
	public Double getPrecio() {
		return super.getPrecio() * descuentoDe;
	}
	
}
