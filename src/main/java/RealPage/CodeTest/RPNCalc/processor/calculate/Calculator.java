package RealPage.CodeTest.RPNCalc.processor.calculate;

import java.util.Stack;

public interface Calculator<T> {
	public String calculate(Stack<String> input);
	
	public boolean isOperator(String input);	

}
