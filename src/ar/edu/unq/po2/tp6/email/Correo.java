package ar.edu.unq.po2.tp6.email;

public class Correo {
	private String asunto;
	private String destinatario;
	private String cuerpo;
	
	public Correo(String _asunto, String _destinatario, String _cuerpo) {
		this.asunto = _asunto;
		this.destinatario = _destinatario;
		this.cuerpo = _cuerpo;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	
}
