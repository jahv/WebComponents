package jahv.webcomponents.chapter3;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
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
	 * @throws ServletException 
	 */
	@Override
	public void doPost(final HttpServletRequest request, final HttpServletResponse response) 
			throws IOException, ServletException {
		final BeerModel beerModel = new BeerModel();
		final List<String> brands = beerModel.getBrands(request.getParameter("color"));
		request.setAttribute("brands", brands);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/chapter3/advisor.jsp");
		dispatcher.forward(request, response);
	}
}
