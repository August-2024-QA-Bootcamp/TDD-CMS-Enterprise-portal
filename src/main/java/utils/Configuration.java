package utils;

import constants.IResource;

import java.io.IOException;
import java.util.Properties;

public class Configuration {

	String DEFAULT_CONFIG = IResource.DEFAULT_CONFIG;

	// The Properties class represents a persistent set of properties.
	// private access modifier help us to restrict it's property in the same class
	private Properties properties = new Properties();
	
	// This is a default Constructor
	// Why I am putting loadProperty () method inside constructor
	// because when Configuration class is instantiated (means when it will create object)
	// then default Constructor will be initialized, the method loadproperty() present inside the Constructor will also be initialized, 
	// and help to load the config.properties file
	public Configuration() {
		loadProperty();
	}

	public Configuration(String configFileName)
	{
		DEFAULT_CONFIG = configFileName;
		loadProperty();
	}

	private void loadProperty() {
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream(DEFAULT_CONFIG));
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

//	public void setDefaultConfig(String config)
//	{
//		DEFAULT_CONFIG = config;
//	}

	// Individual return type parameterized method created
	public String getProperties(String KEY) {	
		return properties.getProperty(KEY);
	}

}
