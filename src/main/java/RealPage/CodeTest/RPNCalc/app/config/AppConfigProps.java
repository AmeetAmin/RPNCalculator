package RealPage.CodeTest.RPNCalc.app.config;

public class AppConfigProps {

	
	public enum InputInterfaceType {
		cli;
	}
	
	public enum TargetDataTypeEnum {
		TYPEINT,
		TYPEFLT;
	};

	public AppConfigProps(String[] args) {
		// This can read external config files or passed in arguments to determine 
		// how the app will function
	}


	public InputInterfaceType inputType() {
		return InputInterfaceType.cli;
	}

	
	public TargetDataTypeEnum dataType() {
		return TargetDataTypeEnum.TYPEFLT;
	}
	
}
