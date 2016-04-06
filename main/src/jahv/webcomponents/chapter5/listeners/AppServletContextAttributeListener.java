package jahv.webcomponents.chapter5.listeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

import org.apache.log4j.Logger;

/**
 * Class for ServletContextAttributeListener
 * 
 * @author jahv
 *
 */
public class AppServletContextAttributeListener implements ServletContextAttributeListener {

	private static final Logger LOGGER = Logger.getLogger(AppServletContextAttributeListener.class);

	public void attributeAdded(final ServletContextAttributeEvent event) {
		LOGGER.info("Adding new attribute [" + event.getName() + ":" + event.getValue() + "] to CONTEXT");
	}

	public void attributeRemoved(final ServletContextAttributeEvent event) {
		LOGGER.info("Removing attribute [" + event.getName() + ":" + event.getValue() + "] from CONTEXT");
	}

	public void attributeReplaced(final ServletContextAttributeEvent event) {
		LOGGER.info("Replacing attribute [" + event.getName() + ":" + event.getValue() + "] in CONTEXT");
	}

}