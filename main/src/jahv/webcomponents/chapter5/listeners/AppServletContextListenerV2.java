package jahv.webcomponents.chapter5.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

/**
 * Listener when the context is initialized/destroyed
 * 
 * @author jahv
 *
 */
public class AppServletContextListenerV2 implements ServletContextListener {

	private static final Logger LOGGER = Logger.getLogger(AppServletContextListenerV2.class);

	/**
	 * method when context is initialized
	 */
	public void contextInitialized(ServletContextEvent event) {
		LOGGER.info("Context initialized VERSION 2");
	}

	/**
	 * Method when context is destroyed
	 */
	public void contextDestroyed(ServletContextEvent event) {
		LOGGER.info("Context destroyed VERSION 2");
	}
}
