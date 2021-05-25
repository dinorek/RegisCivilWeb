package cl.inacap.regisCivilModel.dto;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Solicitud {

	private String nombre;
	private int rut;
	private String tipoSolicitud;
	private int nSolicitud;
		
	public int getnSolicitud() {
		return nSolicitud;
	}
	public void setnSolicitud(int nSolicitud) {
		this.nSolicitud = nSolicitud;
	}

	
	public String getTipoSolicitud() {
		return tipoSolicitud;
	}
	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	
}
