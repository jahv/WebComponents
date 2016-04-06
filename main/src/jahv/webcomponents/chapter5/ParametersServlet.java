package jahv.webcomponents.chapter5;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Class to verify the init parameters for servlets
 * 
 * @author jahv
 *
 */
public class ParametersServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(ParametersServlet.class);

	public void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException,
			IOException {
		LOGGER.info("Getting init parameters");
		String servletData = getInitParameter("ParametersServletData");
		LOGGER.info("Invoking getInitParameter: " + servletData);

		servletData = getServletConfig().getInitParameter("ParametersServletData");
		LOGGER.info("Invoking getInitParameter: " + servletData);

		String contextData = getServletContext().getInitParameter("ContextParamData");
		LOGGER.info("Invoking getServletContext().getInitParameter: " + contextData);

		contextData = getServletConfig().getServletContext().getInitParameter("ContextParamData");
		LOGGER.info("Invoking getServletConfig().getServletContext().getInitParameter: " + contextData);

		LOGGER.info("getServletConfig().getInitParameterNames()");
		for (Enumeration<String> e = getServletConfig().getInitParameterNames(); e.hasMoreElements();) {
			LOGGER.info(e.nextElement());
		}

		LOGGER.info("getServletConfig().getServletContext().getInitParameterNames()");
		for (Enumeration<String> e = getServletConfig().getServletContext().getInitParameterNames(); e
				.hasMoreElements();) {
			LOGGER.info(e.nextElement());
		}
	}
}
