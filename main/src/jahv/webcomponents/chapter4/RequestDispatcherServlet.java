package jahv.webcomponents.chapter4;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class RequestDispatcherServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOGGER = Logger.getLogger(RequestDispatcherServlet.class);
	
	public void doGet(final HttpServletRequest request, final HttpServletResponse response) 
			throws IOException, ServletException {
		LOGGER.info("Request Dispatcher");
		
		final RequestDispatcher view = request.getRequestDispatcher("receiveRequest.jsp");
		
		view.forward(request, response);
	}

}
