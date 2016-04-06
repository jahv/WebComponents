package jahv.webcomponents.chapter5.listeners;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import org.apache.log4j.Logger;

/**
 * Class for HttpSessionAttributeListener
 * @author jahv
 *
 */
public class AppHttpSessionAttributeListener implements HttpSessionAttributeListener {

	private static final Logger LOGGER = Logger.getLogger(AppHttpSessionAttributeListener.class);

	public void attributeAdded(final HttpSessionBindingEvent event) {
		LOGGER.info("Adding new attribute [" + event.getName() + ":" + event.getValue() + "] to SESSION");
	}

	public void attributeReplaced(final HttpSessionBindingEvent event) {
		LOGGER.info("Replacing attribute [" + event.getName() + ":" + event.getValue() + "] in SESSION");
	}

	public void attributeRemoved(final HttpSessionBindingEvent event) {
		LOGGER.info("Removing attribute [" + event.getName() + ":" + event.getValue() + "] from SESSION");
	}

}
