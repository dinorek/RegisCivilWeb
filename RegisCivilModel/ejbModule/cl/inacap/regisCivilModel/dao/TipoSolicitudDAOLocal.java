package cl.inacap.regisCivilModel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.regisCivilModel.dto.TipoSolicitud;

@Local
public interface TipoSolicitudDAOLocal {
	
	void save(TipoSolicitud tipoSolicitud);
	List<TipoSolicitud> getAll();
	void delete(TipoSolicitud tipoSolicitud);
	List<TipoSolicitud> filterByName(String tipo);
	

}
