package ar.edu.unq.po2.tp6.email;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ServidorPop implements IServidorCorreo {
	private boolean conectado = false;
	private Map<String, String> cuentasRegistradas = new HashMap<>();
	private Map<String, List<Correo>> buzon = new HashMap<>();
	private Set<String> usuariosConectados = new HashSet<>();
	
	
	public boolean getConectado() {
		return this.conectado;
	}
	
	public ServidorPop(Map<String, String> cuentasRegistradas, Map<String, List<Correo>> buzon) {
		this.cuentasRegistradas = cuentasRegistradas;
		this.buzon = buzon;
	}

	public void registrarCuenta(String usuario, String pass) {
        this.cuentasRegistradas.put(usuario, pass);
        this.buzon.put(usuario, new ArrayList<Correo>());
    }
	
	public List<Correo> recibirNuevos(String user, String pass) {
		List<Correo> retorno = new ArrayList<Correo>();
		this.validarAutenticacion(user);
		retorno = this.buzon.get(user);
		return retorno;
	}

	public boolean estaConectado(String nombreUsuario) {
	    return this.usuariosConectados.contains(nombreUsuario);
	}
	
	public void conectar(String nombreUsuario, String passUsuario) {
	    this.validarConexion(nombreUsuario, passUsuario);
	    this.usuariosConectados.add(nombreUsuario);
	}
	
	public void desconectar(String nombreUsuario) {
		 this.usuariosConectados.remove(nombreUsuario);
	}

	public void validarAutenticacion(String usuario) {
	    if (!this.usuariosConectados.contains(usuario)) {
	        throw new RuntimeException("No hay una sesión activa para este usuario.");
	    }
	}
	
	public void validarConexion(String nombreUsuario, String passUsuario) {
	    String passwordUsuario = this.cuentasRegistradas.get(nombreUsuario);
	    if (passwordUsuario == null || !passwordUsuario.equals(passUsuario)) {
	        throw new RuntimeException("Usuario o contraseña incorrectos.");
	    }
	}
	
	public boolean tieneCuentaRegistrada(String nombreUsuario) {
		return this.cuentasRegistradas.containsKey(nombreUsuario);
	}
	
	public int cantCorreosEnBuzon(String usuario) {
		List<Correo> correos = this.buzon.get(usuario);
		if (correos != null) {
		    return correos.size();
		} else {
		    return 0;
		}
	}
	
	public void enviar(Correo correo) {
		String destinatario = correo.getDestinatario();
		if (this.buzon.containsKey(destinatario)) {
	        this.buzon.get(destinatario).add(correo);
	    }
	}	
}


