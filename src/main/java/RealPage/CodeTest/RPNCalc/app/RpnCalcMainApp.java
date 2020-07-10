package RealPage.CodeTest.RPNCalc.app;


import RealPage.CodeTest.RPNCalc.app.config.AppConfigProps;
import RealPage.CodeTest.RPNCalc.input.InputFactory;
import RealPage.CodeTest.RPNCalc.input.InputInterface;

public class RpnCalcMainApp {


	final AppConfigProps  appConfig;
	
	public RpnCalcMainApp(AppConfigProps appConfigProps) {
		appConfig = appConfigProps;
	}

	public void start() {
		// determine the type of app based on config, and instantiate the processor
		AppConfigProps.InputInterfaceType io_Src = appConfig.inputType();  
		AppConfigProps.TargetDataTypeEnum data_type = appConfig.dataType();
		InputInterface ioIntf = InputFactory.getInstance().create(io_Src);
		
		
		
	}


}
