package jahv.webcomponents.chapter4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Class to visualize the servlet life cycle
 * 
 * @author jahv
 *
 */
public class ServletLifeCycle extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(ServletLifeCycle.class);
	
	/**
	 * Constructor
	 */
	public ServletLifeCycle() {
		LOGGER.info("Constructor");
	}
	
	/**
	 * Overriding init method
	 */
	@Override
	public void init(){
		LOGGER.info("Init method");
	}
	
	/**
	 * Overriding service method
	 * This must should not be overriden, this is only for demostrative
	 * purposes
	 */
	@Override
	public void service(final HttpServletRequest request, final HttpServletResponse response) 
			throws ServletException, IOException {
		LOGGER.info("Service method");
		switch (HttpMethodsEnum.getHttpMethod(request.getMethod())) {
			case GET:
				this.doGet(request, response);
				break;
			case POST:
				this.doPost(request, response);
				break;
			default:
				this.doGet(request, response);
				break;
		}
	}
	
	/**
	 * Overriding destroy method
	 */
	@Override
	public void destroy() {
		LOGGER.info("Destroy method");
	}
	
	/**
	 * Method to handle HTTP GET requests
	 */
	public void doGet(final HttpServletRequest request, final HttpServletResponse response) throws IOException  {
		LOGGER.info("doGet method");
		final PrintWriter out = response.getWriter();
		out.println("doGetMethod");
		
		response.addHeader("addCustomHeader", "addCustomHeader");
		response.addHeader("addCustomHeader", "addCustomHeader2");
		
		response.setHeader("setCustomHeader", "setCustomHeader");
		response.setHeader("setCustomHeader", "setCustomHeader2");
	}
	
	/**
	 * Method to handle HTTP POST requests
	 */
	public void doPost(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
		LOGGER.info("doPost method");
		
		final String color = request.getParameter("color");
		final String body = request.getParameter("body");
		final String size = request.getParameter("sizes");
		final String[] sizes = request.getParameterValues("sizes");
		LOGGER.info("color: " + color);
		LOGGER.info("body: " + body);
		LOGGER.info("size: " + size);
		LOGGER.info("sizes: " + Arrays.toString(sizes));
	}

}
