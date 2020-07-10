package RealPage.CodeTest.RPNCalc.processor.calculate;


import java.util.Stack;
import java.util.function.BiFunction;
import java.lang.Integer;

public class RPNSimpleCalculatorInteger<integer> extends RPNSimpleCalculator<Integer> {
	
	
    
	public RPNSimpleCalculatorInteger() {
	}


	@Override
	public BiFunction<Integer, Integer, Integer> operatorFunction(String operator) {
		switch (operator) {
		case "+": 
				return ( (a, b) -> a + b);
		case "-":
				return ( (a, b) -> a - b );
		case "*":
			return ( (a, b) -> a * b );
		case "/": 
			return ( (a, b) -> a / b ) ;
		}
		return (null);
	}	

	@Override
	protected Integer getValueOf(String strVal) {
		return Integer.valueOf(strVal);
	}


	
}


