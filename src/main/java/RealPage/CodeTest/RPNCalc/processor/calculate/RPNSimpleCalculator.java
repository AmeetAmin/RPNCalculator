package RealPage.CodeTest.RPNCalc.processor.calculate;

import java.awt.peer.SystemTrayPeer;
import java.util.Optional;
import java.util.Stack;
import java.util.function.BiFunction;
import java.util.function.Function;

abstract public class RPNSimpleCalculator<T extends Number> implements Calculator<T> {

	
	RPNSimpleCalculator() {
	}
	
	
	@Override
	public String calculate(Stack<String> myInputStack) throws InvalidSequenceException {
		// if we popped an operator then act on subsequent data on stack
		if (myInputStack == null || myInputStack.isEmpty()) return null;
		String retVal = myInputStack.peek();
		try {
			if (isOperator(retVal)) {
				String operString = myInputStack.pop();
				BiFunction<T, T, T> operFunc = operatorFunction(operString);
				String nextInput = null;
				// perform calculation on all operands ( could be > 2 )
				String firstOperand = myInputStack.pop();
				if (isOperator(firstOperand)) {
					throw new InvalidSequenceException ("Operator followed by Operator : " + operString + " preceeded by " + firstOperand );
				}
				T val1 = getValueOf(firstOperand);
				do { 
					T val2 = getValueOf(myInputStack.pop());
					val1 = operFunc.apply(val2, val1);
				}  while (!(myInputStack.isEmpty() || isOperator(myInputStack.peek())));
				myInputStack.push(val1.toString());
				retVal = val1.toString();
			}
		} catch (NumberFormatException exc) {
			System.err.println(exc.toString());
			return exc.toString();
		} 
		return retVal;
	}

	
	abstract protected T getValueOf(String str);


	public boolean isOperator(String input) {
		switch (input ) {
		case "+":
		case "-":
		case "*":
		case "/":
			return true;
		default:
			return false;
		}
	}
	
	
	abstract protected BiFunction<T, T, T> operatorFunction(String operator) ;
	
	

}
