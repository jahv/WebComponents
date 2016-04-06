package jahv.webcomponents.chapter5.listeners;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

import org.apache.log4j.Logger;

/**
 * Class for HttpSessionBindingListener
 * 
 * @author jahv
 *
 */
public class AppHttpSessionBindingListener implements HttpSessionBindingListener {

	private static final Logger LOGGER = Logger.getLogger(AppHttpSessionBindingListener.class);

	private String name;

	public void valueBound(final HttpSessionBindingEvent event) {
		LOGGER.info("I was added to SESSION :" + event.getSession().getId() + ", my name: " + name);
	}

	public void valueUnbound(final HttpSessionBindingEvent event) {
		LOGGER.info("I was removed from SESSION :" + event.getSession().getId() + ", my name: " + name);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AppHttpSessionBindingListener [name=" + name + "]";
	}

}
