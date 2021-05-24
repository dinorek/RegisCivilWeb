package cl.inacap.regisCivilModel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.regisCivilModel.dto.Solicitud;
import cl.inacap.regisCivilModel.dto.TipoSolicitud;

@Local
public interface SolicitudesDAOLocal {

	void save(Solicitud solicitud);
	List<Solicitud> getAll();
	void delete(Solicitud solicitud);
	List<Solicitud> findByName(String tipo);
}