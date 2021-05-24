package cl.inacap.regisCivilWeb.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.inacap.regisCivilModel.dao.SolicitudesDAO;
import cl.inacap.regisCivilModel.dao.TipoSolicitudDAOLocal;
import cl.inacap.regisCivilModel.dto.Solicitud;
import cl.inacap.regisCivilModel.dto.TipoSolicitud;

/**
 * Servlet implementation class IngresarSolicitudController
 */
@WebServlet("/IngresarSolicitudController.do")
public class IngresarSolicitudController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Inject
	private SolicitudesDAO solicitudesDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IngresarSolicitudController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/vistas/IngresarSolicitud.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<String> errores = new ArrayList<>();
		
		String nombre = request.getParameter("nombre-txt").trim();
		if(nombre.isEmpty()) {
			errores.add("Debe Ingresar Nombre y Apellido con un espacio entre si");
		}
		String rut = request.getParameter("rut-txt").trim();
		int rutc=0;
		try {
			rutc = Integer.parseInt(rut);
		}catch(Exception ex) {
			errores.add("Debe ingresar rut chileno sin puntos ni guion");
		}
		
		String tipo = request.getParameter("tipo-select").trim();
		if(tipo.isEmpty()) {
			errores.add("Debe Ingresar el tipo de Solicitud que desea");
		}
		
		if (errores.isEmpty()) {
			Solicitud solicitud = new Solicitud();
			solicitud.setNombre(nombre);
			solicitud.setRut(rutc);
			solicitud.setTipoSolicitud(tipo);
			solicitudesDAO.save(solicitud);
			
			request.setAttribute("mensaje", "Solicitud Ingresada Correctamente");
		} else {
			request.setAttribute("errores", errores);
		}
		
		doGet(request, response);
		
	}

}
