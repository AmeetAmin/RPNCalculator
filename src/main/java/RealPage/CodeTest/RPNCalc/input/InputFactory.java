package RealPage.CodeTest.RPNCalc.input;

import RealPage.CodeTest.RPNCalc.app.config.AppConfigProps.InputInterfaceType;

public class InputFactory {
	// Singleton class to create the input factory 
	
	private static InputFactory  instance = null;  	

	public static InputFactory getInstance() {
		if (instance == null ) {
			synchronized(instance) {
				if (instance == null ) {
					instance = new InputFactory(); 
				}
			}
		}
		return instance;
	}

	public InputInterface create(InputInterfaceType io_Src) {
		// only returning command line for now ... can be expanded in future
		return new CliInputInterface();
	}
	
}
