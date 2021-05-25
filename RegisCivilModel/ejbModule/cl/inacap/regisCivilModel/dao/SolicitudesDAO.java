package cl.inacap.regisCivilModel.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.regisCivilModel.dto.Solicitud;

/**
 * Session Bean implementation class SolicitudesDAO
 */
@Stateless
@LocalBean
public class SolicitudesDAO implements SolicitudesDAOLocal {
	
	private static List<Solicitud> solicitudes = new ArrayList<>();


	@Override
	public void save(Solicitud solicitud) {
		solicitudes.add(solicitud);
		
	}

	@Override
	public List<Solicitud> getAll() {
		return solicitudes;
	}

	@Override
	public void delete(Solicitud solicitud) {
		solicitudes.remove(solicitud);
		
	}

	@Override
	public List<Solicitud> findByName(String nombre) {
		return solicitudes.stream().filter(s->s.getNombre().toLowerCase().contains(nombre.toLowerCase())).collect(Collectors.toList());
	}
	
}

    
