package AppUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BlissProperties {
	private static final Properties properties = new Properties();
	
	public BlissProperties () {
		try {
			properties.load(new FileInputStream("build.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Returns specified property
	 * @param property property to be returned
	 * @return requested property, otherwise null
	 */
	public String getProperty (String property) {
		if (property == null || property.length() <= 0) {
			return null;
		}
		String requestedProperty = (String) properties.get(property);
		
		return requestedProperty;
	}
}
