package jahv.webcomponents.chapter4;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class SendRedirectServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(SendRedirectServlet.class);

	public void doGet(final HttpServletRequest request, final HttpServletResponse response) 
			throws IOException {
		LOGGER.info("send redirect");
		
		response.sendRedirect("receiveRequest.jsp");
	}

}
