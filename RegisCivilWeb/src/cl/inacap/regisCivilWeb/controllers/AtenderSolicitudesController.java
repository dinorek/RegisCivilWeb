package cl.inacap.regisCivilWeb.controllers;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.inacap.regisCivilModel.dao.SolicitudesDAOLocal;
import cl.inacap.regisCivilModel.dao.TipoSolicitudDAOLocal;
import cl.inacap.regisCivilModel.dto.Solicitud;
import cl.inacap.regisCivilModel.dto.TipoSolicitud;

/**
 * Servlet implementation class AtenderSolicitudesController
 */
@WebServlet("/AtenderSolicitudesController.do")
public class AtenderSolicitudesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private SolicitudesDAOLocal solicitudesDAO;
    
	@Inject
	private TipoSolicitudDAOLocal tipoSolicitudDAO;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AtenderSolicitudesController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		if(request.getParameter("nombreEliminar") != null) {
			String nombre = request.getParameter("nombreEliminar").trim();
			List<Solicitud> busqueda = solicitudesDAO.findByName(nombre);
			
			Solicitud solicitudAEliminar = busqueda.isEmpty()? null:busqueda.get(0);
			if(solicitudAEliminar != null) {
				solicitudesDAO.delete(solicitudAEliminar);
			}
		
			
			
					
		}
		
		List<Solicitud> solicitudes = solicitudesDAO.getAll();
		
		request.setAttribute("solicitudes", solicitudes);
		
		request.getRequestDispatcher("WEB-INF/vistas/AtenderSolicitudes.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		doGet(request, response);
	}

}
