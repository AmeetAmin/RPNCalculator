package RealPage.CodeTest.RPNCalc.processor;

import RealPage.CodeTest.RPNCalc.app.config.AppConfigProps;

public class ProcessorFactory {
	
	// Singleton class to create the input factory 
	
	private static ProcessorFactory  instance = null;  	

	public static ProcessorFactory getInstance() {
		if (instance == null ) {
			synchronized(ProcessorFactory.class) {
				if (instance == null ) {
					instance = new ProcessorFactory(); 
				}
			}
		}
		return instance;
	}

	public CalcProcessor create(AppConfigProps config) {
		// only returning command line for now ... can be expanded in future
		return new BasicCalcProcessor(config);
	}	

}
