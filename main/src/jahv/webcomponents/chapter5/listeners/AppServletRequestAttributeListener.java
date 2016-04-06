package jahv.webcomponents.chapter5.listeners;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

import org.apache.log4j.Logger;

/**
 * class for ServletRequestAttributeListener
 * @author jahv
 *
 */
public class AppServletRequestAttributeListener implements ServletRequestAttributeListener {

	private static final Logger LOGGER = Logger.getLogger(AppServletRequestAttributeListener.class);

	public void attributeAdded(final ServletRequestAttributeEvent event) {
		LOGGER.info("Adding new attribute [" + event.getName() + ":" + event.getValue() + "] to REQUEST");
	}

	public void attributeReplaced(final ServletRequestAttributeEvent event) {
		LOGGER.info("Replacing attribute [" + event.getName() + ":" + event.getValue() + "] in REQUEST");
	}

	public void attributeRemoved(final ServletRequestAttributeEvent event) {
		LOGGER.info("Removing attribute [" + event.getName() + ":" + event.getValue() + "] from REQUEST");
	}
}
