package loginjee;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Consulta
 *MAPIING O CORRESPONDECIA 
 DECLARANDO ESTA CLASE ASÍ, LE ESTOY DICIENDO al servidor
 OYE, LO QUE SEA /Consulta, es para Mi, para esta clase, para este SERVICIO
 */
@WebServlet("/Consulta")
public class Consulta extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Consulta() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("proyecto LUIS FUNCIONA: ").append(request.getContextPath());
		Usuario usuario_aux = null;
		List<Usuario> lu = new ArrayList<Usuario>();
		
		try {
			ResultSet rs = BaseDeDatos.getConnection().createStatement().executeQuery ("SELECT * FROM usuarios");
			while (rs.next())
			{
				//crear el usuario
				usuario_aux = new Usuario(rs);
				//add a la lista
				lu.add(usuario_aux);
			}
			System.out.println(lu);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
