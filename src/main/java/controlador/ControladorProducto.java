package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClassProductoimp;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    } //fin del controlador

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		ClassProductoimp crud = new ClassProductoimp();
		List<TblProductocl2> listarproducto = crud.ListarProducto();
		request.setAttribute("listadoproductos", listarproducto);
		request.getRequestDispatcher("/ListadoProducto.jsp").forward(request, response);	
	}//fin del metodo do get

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String nombrecl2 = request.getParameter("nombre");
		Double precioventacl2 = Double.parseDouble(request.getParameter("precioventa"));
		Double preciocompracl2 = Double.parseDouble(request.getParameter("preciocompra"));
		String estadocl2 = request.getParameter("estado");
		String descripcl2 = request.getParameter("descrip");
		
		TblProductocl2 producto = new TblProductocl2();
		ClassProductoimp crud = new ClassProductoimp();
		
		producto.setNombrecl2(nombrecl2);
		producto.setPrecioventacl2(precioventacl2);
		producto.setPreciocompcl2(preciocompracl2);
		producto.setEstadocl2(estadocl2);
		producto.setDescripcl2(descripcl2);
		crud.RegistrarProducto(producto);
		
		List<TblProductocl2> listarProducto = crud.ListarProducto();
		request.setAttribute("listadoproductos", listarProducto);
		request.getRequestDispatcher("/ListadoProducto.jsp").forward(request, response);
		
	}//fin del metodo do post

}//fin del servlet
