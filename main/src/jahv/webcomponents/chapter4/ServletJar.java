package jahv.webcomponents.chapter4;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet to respond a jar
 * 
 * @author jahv
 *
 */
public class ServletJar extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(ServletJar.class);

	public void doGet(final HttpServletRequest request, final HttpServletResponse response)
			throws IOException {
		LOGGER.info("GET Method - sending Jar file");
		response.setContentType("application/jar");

		final ServletContext ctx = getServletContext();
		final InputStream is = ctx.getResourceAsStream("/resources/log4j-1.2.17.jar");

		int read = 0;
		final byte[] bytes = new byte[1024];
		final ServletOutputStream os = response.getOutputStream();
		while ((read = is.read(bytes)) != -1) {
			os.write(bytes, 0, read);
		}
		os.flush();
		os.close();
	}

}
