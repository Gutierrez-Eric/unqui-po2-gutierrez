package ar.edu.unq.po2.tp6.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Cliente> clientes;
	private List <Credito> solicitudesCredito;
	
	public Banco() {
		this.clientes = new ArrayList<>();
		this.solicitudesCredito = new ArrayList<>();
	}

	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void agregarSolicitudPrestamo(Credito credito) {
		solicitudesCredito.add(credito);
	}
	
	public double montoADesembolsarDePrestamos() {
		return solicitudesCredito.stream()
									.filter(c -> c.esAceptable())
									.mapToDouble(c -> c.getMonto())
									.sum();
	}
	
}

