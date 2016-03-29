package jahv.webcomponents.chapter3;

import java.util.ArrayList;
import java.util.List;

/**
 * Model
 * 
 * @author jahv
 *
 */
public class BeerModel {

	/**
	 * Get brands based on color
	 * 
	 * @param color
	 * @return
	 */
	public List<String> getBrands(final String color) {
		final List<String> brands = new ArrayList<String>();

		if (color.equals("amber")) {
			brands.add("Jack Amber");
			brands.add("Red Moose");
		} else {
			brands.add("Jail Pale Ale");
			brands.add("Gout Stout");
		}
		return brands;
	}

}
