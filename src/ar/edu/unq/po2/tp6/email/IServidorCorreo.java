package ar.edu.unq.po2.tp6.email;

import java.util.List;

public interface IServidorCorreo {
	
	public List<Correo> recibirNuevos(String user, String pass);

	public void conectar(String nombreUsuario, String passusuario);

	public void enviar(Correo correo);

	public void desconectar(String nombreUsuario);
}

