package jahv.webcomponents.chapter5.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

import jahv.webcomponents.chapter5.Dog;

/**
 * Listener when the context is initialized/destroyed
 * 
 * @author jahv
 *
 */
public class AppServletContextListener implements ServletContextListener {

	private static final Logger LOGGER = Logger.getLogger(AppServletContextListener.class);

	/**
	 * method when context is initialized
	 */
	public void contextInitialized(ServletContextEvent event) {
		LOGGER.info("Context initialized");

		final String dogName = event.getServletContext().getInitParameter("dogName");
		final String dogBreed = event.getServletContext().getInitParameter("dogBreed");

		final Dog dog = new Dog();
		dog.setName(dogName);
		dog.setBreed(dogBreed);

		event.getServletContext().setAttribute("contextDog", dog);
	}

	/**
	 * Method when context is destroyed
	 */
	public void contextDestroyed(ServletContextEvent event) {
		LOGGER.info("Context destroyed");
		event.getServletContext().removeAttribute("contextDog");
		LOGGER.info("Removed contextDog: ");
	}
}
