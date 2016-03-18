package jahv.webcomponents.chapter3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Controller for select beer
 * 
 * @author jahv
 *
 */
public class SelectBeerController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	/**
	 * doPost method
	 */
	@Override
	public void doPost(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		final PrintWriter out = response.getWriter();
		final String color = request.getParameter("color");
		out.println("Beer color: " + color);
		
	}
}
