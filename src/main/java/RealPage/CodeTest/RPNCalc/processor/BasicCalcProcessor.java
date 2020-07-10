package RealPage.CodeTest.RPNCalc.processor;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

import RealPage.CodeTest.RPNCalc.app.config.AppConfigProps;
import RealPage.CodeTest.RPNCalc.app.config.AppConfigProps.TargetDataTypeEnum;
import RealPage.CodeTest.RPNCalc.processor.calculate.Calculator;
import RealPage.CodeTest.RPNCalc.processor.calculate.RPNSimpleCalculator;
import RealPage.CodeTest.RPNCalc.processor.calculate.RPNSimpleCalculatorFloat;
import RealPage.CodeTest.RPNCalc.processor.calculate.RPNSimpleCalculatorInteger;

public class BasicCalcProcessor implements CalcProcessor {
	
	private final String separatorRegEx;	//get all user input separators
	private Stack inputStack;
	private Calculator calculator;
	
	BasicCalcProcessor (AppConfigProps config) {
		separatorRegEx = getSeparatorsRegEx();

		if (config.dataType() == TargetDataTypeEnum.TYPEFLT) {
			calculator = new RPNSimpleCalculatorFloat();
			inputStack = new Stack<Float>();		
		}
		if (config.dataType() == TargetDataTypeEnum.TYPEINT) {
			calculator = new RPNSimpleCalculatorInteger();
			inputStack = new Stack<Integer>();		
		}
	}
	
	public Stream inputReceived(String ipt) {
		String[] components = ipt.split(separatorRegEx) ; 
		List<String> componentList = Arrays.asList(components);
		Stream output = componentList.stream().map(a -> this.calculateOn(a));
		return output;
	}
	
	
	String calculateOn(String input) {
		inputStack.push(input);
		if (calculator.isOperator(input)) 
			return calculator.calculate(inputStack);
		else 
			return input;
	}
	

	@Override
	public boolean inputReceived(Number ip) {
		// TODO Auto-generated method stub
		return false;
	}


}
