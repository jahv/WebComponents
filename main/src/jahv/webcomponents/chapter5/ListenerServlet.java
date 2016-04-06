package jahv.webcomponents.chapter5;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import jahv.webcomponents.chapter5.listeners.AppHttpSessionBindingListener;

public class ListenerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(ListenerServlet.class);

	public void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException,
			IOException {
		LOGGER.info("Listener servlet");
		final Dog dog = (Dog) getServletContext().getAttribute("contextDog");
		LOGGER.info("contextDog: " + dog);

		final Dog newDog = new Dog();
		newDog.setBreed("new Breed");
		newDog.setName("new Name");

		getServletContext().setAttribute("contextDog", newDog);
		getServletContext().removeAttribute("contextDog");

		/**
		 * Related to RequestAttributeListener
		 */
		request.setAttribute("requestDog", dog);
		request.setAttribute("requestDog", newDog);
		request.removeAttribute("requestDog");

		/**
		 * Related to session
		 */
		HttpSession session = request.getSession();
		session.setAttribute("sessionDog", dog);
		session.setAttribute("sessionDog", newDog);
		session.removeAttribute("sessionDog");
		AppHttpSessionBindingListener data = new AppHttpSessionBindingListener();
		data.setName("JAHV&NLFM");
		session.setAttribute("bindingSession", data);
		session.removeAttribute("bindingSession");
		session.invalidate();

		final RequestDispatcher view = request.getRequestDispatcher("/chapter5/requestDispatcher.jsp");
		view.forward(request, response);
	}

}
