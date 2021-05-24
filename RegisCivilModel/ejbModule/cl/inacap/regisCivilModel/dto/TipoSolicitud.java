package cl.inacap.regisCivilModel.dto;

import java.util.List;

public class TipoSolicitud {
	private String solicitud;
	private String retiro;
	private List<Solicitud> solicitudes;
	
	public String getSolicitud() {
		return solicitud;
	}
	public void setSolicitud(String solicitud) {
		this.solicitud = solicitud;
	}
	public String getRetiro() {
		return retiro;
	}
	public void setRetiro(String retiro) {
		this.retiro = retiro;
	}
	public List<Solicitud> getSolicitudes() {
		return solicitudes;
	}
	public void setSolicitudes(List<Solicitud> solicitudes) {
		this.solicitudes = solicitudes;
	}

}
