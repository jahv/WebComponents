package jahv.webcomponents.chapter4;

/**
 * Handles possible http methods
 * 
 * @author jahv
 *
 */
public enum HttpMethodsEnum {
	GET("GET"), 
	POST("POST");
	
	private String method;
	
	private HttpMethodsEnum(final String method) {
		this.setMethod(method);
	}
	
	/**
	 * @return the method
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * @param method the method to set
	 */
	public void setMethod(String method) {
		this.method = method;
	}

	/**
	 * Return {@link HttpMethodsEnum} based on method
	 * @param method
	 * @return
	 */
	public static HttpMethodsEnum getHttpMethod(final String method) {
		for(final HttpMethodsEnum entry : HttpMethodsEnum.values()) {
			if(entry.getMethod().equalsIgnoreCase(method)) {
				return entry;
			}
		}
		return null;
	}
}
