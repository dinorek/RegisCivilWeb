package cl.inacap.regisCivilModel.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.regisCivilModel.dto.TipoSolicitud;

/**
 * Session Bean implementation class TipoSolicitudDAO
 */
@Stateless
@LocalBean
public class TipoSolicitudDAO implements TipoSolicitudDAOLocal {

    
    private static List<TipoSolicitud> tipoSolicitudes = new ArrayList<>();
    
    
    
	@Override
	public void save(TipoSolicitud tipoSolicitud) {
		tipoSolicitudes.add(tipoSolicitud);
		
	}

	@Override
	public List<TipoSolicitud> getAll() {
		return tipoSolicitudes;
	}

	@Override
	public void delete(TipoSolicitud tipoSolicitud) {
		tipoSolicitudes.remove(tipoSolicitud);
		
	}

	@Override
	public List<TipoSolicitud> filterByName(String tipo) {
	return tipoSolicitudes.stream().filter(t->t.getSolicitud().contains(tipo)).collect(Collectors.toList());
	}

}
