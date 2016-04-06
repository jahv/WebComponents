package jahv.webcomponents.chapter5.listeners;

import java.util.Enumeration;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

import org.apache.log4j.Logger;

/**
 * class for ServletRequestListener
 * 
 * @author jahv
 *
 */
public class AppServletRequestListener implements ServletRequestListener {

	private static final Logger LOGGER = Logger.getLogger(AppServletRequestListener.class);

	public void requestInitialized(final ServletRequestEvent event) {
		final StringBuilder str = new StringBuilder();
		for (Enumeration<String> e = event.getServletRequest().getParameterNames(); e.hasMoreElements();) {
			str.append(e.nextElement() + ", ");
		}
		LOGGER.info("Request initialized with params: " + str.toString());
	}

	public void requestDestroyed(final ServletRequestEvent event) {
		LOGGER.info("Request destroyed");
	}

}
