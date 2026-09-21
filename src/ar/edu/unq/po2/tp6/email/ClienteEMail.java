package ar.edu.unq.po2.tp6.email;

import java.util.ArrayList;
import java.util.List;

public class ClienteEMail {
	
	private IServidorCorreo servidor;
	private String nombreUsuario;
	private String passUsuario;
	private List<Correo> inbox;
	private List<Correo> borrados;
	private Boolean conectado;
	
	public ClienteEMail(IServidorCorreo servidor, String nombreUsuario, String pass){
		this.servidor=servidor;
		this.nombreUsuario=nombreUsuario;
		this.passUsuario=pass;
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
		this.conectado = false;
	}
	
	public boolean getConectado() {
	    return this.conectado;
	}
	
	public String getUsuario() {
		return nombreUsuario;
	}
	
	public String getPassword() {
		return passUsuario;
	}
	
	public void agregarCorreoAInbox(Correo correo) {
		this.inbox.add(correo);
	}
	
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passUsuario);
		this.conectado = true;
	}
	
	public void desconectar() {
        this.servidor.desconectar(this.nombreUsuario);
        this.conectado = false;
    }
	
	public void borrarCorreo(Correo correo){
		this.validarCorreoEnInbox(correo);
		this.inbox.remove(correo);
		this.borrados.add(correo);
	}

	public void validarCorreoEnInbox(Correo correo) {
		boolean existeEnInbox = this.inbox.stream()
                .anyMatch(c -> c.equals(correo));
		if(!existeEnInbox) {
			throw new RuntimeException("El correo no se encuentra en inbox");
		}
	}
	public void validarCorreoEnBorrados(Correo correo) {
		boolean existeEnBorrados = this.borrados.stream()
                .anyMatch(c -> c.equals(correo));
		if(!existeEnBorrados) {
			throw new RuntimeException("El correo no se encuentra en inbox");
		}
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.validarCorreoEnBorrados(correo);
		this.borrados.remove(correo);
	}
	
	public void recibirNuevos(){
		this.servidor.recibirNuevos(this.nombreUsuario, this.passUsuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}

}
