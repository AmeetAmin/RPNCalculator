package RealPage.CodeTest.RPNCalc.processor.calculate;

import java.util.Arrays;
import java.util.Optional;
import java.util.Stack;
import java.util.function.BiFunction;
import java.util.function.Function;

//import org.junit.Test;

public class RPNSimpleCalculatorFloat extends RPNSimpleCalculator<Float> {

	
	public RPNSimpleCalculatorFloat() {
	}
		
	@Override
	protected BiFunction<Float, Float, Float> operatorFunction(String operator) {
		switch (operator) {
		case "+": 
				return ( (a, b) -> a+b );
		case "-":
				return ( (a, b) -> a-b );
		case "*":
			return ( (a, b) -> a*b );
		case "/": 
			return ( (a, b) -> a/b ) ;
		}
		return (null);
	}
	
	@Override
	protected Float getValueOf(String strVal) {
		return Float.valueOf(strVal);
	}
	


	//@Test
	public void test1_0() {
		
		System.out.println("test1_0");
		Stack myInputStack = new Stack();
		myInputStack.addAll(Arrays.asList("1.0", "2.0", "+"));

		System.out.println("Input: " + myInputStack.toString());		
		String result = calculate(myInputStack);
		assert(result.equals("3.0"));
		System.out.println("Output: " + myInputStack.toString() + " -> " + result);
	}


	//@Test
	public void test1_1() {
		
		System.out.println("test1_1");
		Stack myInputStack = new Stack();
		myInputStack.addAll(Arrays.asList("1.0", "2.0", "-"));

		System.out.println("Input: " + myInputStack.toString());		
		String result = calculate(myInputStack);
		assert(result.equals("-1.0"));
		System.out.println("Output: " + myInputStack.toString() + " -> " + result);
	}

	//@Test
	public void test1_2() {
		
		System.out.println("test1_2");
		Stack myInputStack = new Stack();
		myInputStack.addAll(Arrays.asList("3.0", "2.0", "*"));

		System.out.println("Input: " + myInputStack.toString());		
		String result = calculate(myInputStack);
		assert(result.equals("6.0"));
		System.out.println("Output: " + myInputStack.toString() + " -> " + result);
	}

	
	//@Test
	public void test1_3() {
		
		System.out.println("test1_3");
		Stack myInputStack = new Stack();
		myInputStack.addAll(Arrays.asList("3.0", "2.0", "/"));

		System.out.println("Input: " + myInputStack.toString());		
		String result = calculate(myInputStack);
		assert(result.equals("6.0"));
		System.out.println("Output: " + myInputStack.toString() + " -> " + result);
	}
	
	
	
	//@Test
	public void test2() {
		
		System.out.println("************************** test2 ***************************************");

		Stack myInputStack = new Stack();
		myInputStack.addAll(Arrays.asList("1.0", "2.0", "7.5", "+"));

		System.out.println("Input: " + myInputStack.toString());		
		String result = calculate(myInputStack);
		assert(result.equals("10.5"));
		System.out.println("Output: " + myInputStack.toString() + " -> " + result);
	}
	
	
	//@Test
	public void test3() {
		
		System.out.println("************************** test3 ***************************************");

		Stack myInputStack = new Stack();
		myInputStack.addAll(Arrays.asList("1.0", "2.0"));
		System.out.println("Input: " + myInputStack.toString());		
		String result = calculate(myInputStack);
		System.out.println("Output: " + myInputStack.toString() + " -> " + result);
		myInputStack.push("+");
		System.out.println("Input: " + myInputStack.toString());		
		result = calculate(myInputStack);
		assert(result.equals("3.0"));
		System.out.println("Output: " + myInputStack.toString() + " -> " + result);
	}
	
	
	//@Test
	public void test4() {
		
		System.out.println("************************** test4 ***************************************");
		Stack myInputStack = new Stack();
		myInputStack.addAll(Arrays.asList("1.0", "2.0", "+"));
		System.out.println("Input: " + myInputStack.toString());		
		String result = calculate(myInputStack);
		System.out.println("Output: " + myInputStack.toString() + " -> " + result);
		myInputStack.push("5");
		System.out.println("Input: " + myInputStack.toString());		
		result = calculate(myInputStack);
		System.out.println("Output: " + myInputStack.toString() + " -> " + result);
		myInputStack.push("-");
		System.out.println("Input: " + myInputStack.toString());		
		result = calculate(myInputStack);
		assert(result.equals("-2.0"));
		System.out.println("Output: " + myInputStack.toString() + " -> " + result);
	}
		
	
	//@Test
	public void test5() {
		
		System.out.println("************************** test5 ***************************************");
		Stack<String> myInputStack = new Stack<String>();
		myInputStack.push("1.0"); 
		System.out.println("Input: " + myInputStack.toString());		
		String result = calculate(myInputStack);
		System.out.println("Output: " + myInputStack.toString() + " -> " + result);
		myInputStack.push("2.0"); 
		System.out.println("Input: " + myInputStack.toString());		
		result = calculate(myInputStack);
		System.out.println("Output: " + myInputStack.toString() + " -> " + result);
		myInputStack.push("+"); 
		System.out.println("Input: " + myInputStack.toString());		
		result = calculate(myInputStack);
		System.out.println("Output: " + myInputStack.toString() + " -> " + result);
		myInputStack.push("5"); 
		System.out.println("Input: " + myInputStack.toString());		
		result = calculate(myInputStack);
		System.out.println("Output: " + myInputStack.toString() + " -> " + result);
		myInputStack.push("-");
		System.out.println("Input: " + myInputStack.toString());		
		result = calculate(myInputStack);
		System.out.println("Output: " + myInputStack.toString() + " -> " + result);
		myInputStack.push("3.2");
		System.out.println("Input: " + myInputStack.toString());		
		result = calculate(myInputStack);
		System.out.println("Output: " + myInputStack.toString() + " -> " + result);
		myInputStack.push("2.5");
		System.out.println("Input: " + myInputStack.toString());		
		result = calculate(myInputStack);
		System.out.println("Output: " + myInputStack.toString() + " -> " + result);
		myInputStack.push("*");
		System.out.println("Input: " + myInputStack.toString());		
		result = calculate(myInputStack);
		System.out.println("Output: " + myInputStack.toString() + " -> " + result);
		myInputStack.push("-4");
		System.out.println("Input: " + myInputStack.toString());		
		result = calculate(myInputStack);
		System.out.println("Output: " + myInputStack.toString() + " -> " + result);
		myInputStack.push("/");
		System.out.println("Input: " + myInputStack.toString());		
		result = calculate(myInputStack);
		System.out.println("Output: " + myInputStack.toString() + " -> " + result);
		assert(result.equals("4.0"));
	}


}
	
