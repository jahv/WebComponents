package jahv.webcomponents.chapter1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * First servlet
 * 
 * @author jahv
 *
 */
public class FirstServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * doGet method
	 */
	@Override
	public void doGet(final HttpServletRequest request, HttpServletResponse response) throws IOException {
		final PrintWriter out = response.getWriter();
		final Date date = new Date();
		out.println("<html><head></head><body>Chapter one: " + date + "</body></html>");
	}

}
