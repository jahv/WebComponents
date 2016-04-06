package jahv.webcomponents.chapter5.listeners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.log4j.Logger;

/**
 * Class for HttpSessionListener
 * 
 * @author jahv
 *
 */
public class AppHttpSessionListener implements HttpSessionListener {

	private static final Logger LOGGER = Logger.getLogger(AppHttpSessionListener.class);

	public void sessionCreated(final HttpSessionEvent event) {
		LOGGER.info("Session " + event.getSession().getId() + " created at: " +
				event.getSession().getCreationTime());
	}

	public void sessionDestroyed(final HttpSessionEvent event) {
		LOGGER.info("Session " + event.getSession().getId() + " destroyed at: " +
				event.getSession().getCreationTime());
	}

}
