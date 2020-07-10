package RealPage.CodeTest.RPNCalc.processor;

import java.util.stream.Stream;

import org.junit.Test;

import RealPage.CodeTest.RPNCalc.app.config.AppConfigProps;

public class ProcessorTest {

	@Test
	public void runTest() {
		System.out.println("************* " + this.getClass().getName() + ":" + "runTest  ******************************");
		BasicCalcProcessor process = new BasicCalcProcessor(new AppConfigProps(null));

		String inputStr; 
		Stream<String> result;
		result = process.inputReceived(inputStr = new String("1.0")); 
		System.out.println("Output: " + inputStr + " -> "); result.forEach(s-> System.out.println(s)); 
		result = process.inputReceived(inputStr = new String("2.0")); 
		System.out.println("Output: " + inputStr + " -> ");  result.forEach(s-> System.out.println(s));
		result = process.inputReceived(inputStr = new String("+")); 
		System.out.println("Output: " + inputStr + " -> "); result.forEach(s-> System.out.println(s));
		result = process.inputReceived(inputStr = new String("5")); 
		System.out.println("Output: " + inputStr + " -> "); result.forEach(s-> System.out.println(s));
		result = process.inputReceived(inputStr = new String("-"));
		System.out.println("Output: " + inputStr + " -> ");  result.forEach(s-> System.out.println(s));
		result = process.inputReceived(inputStr = new String("3.2"));
		System.out.println("Output: " + inputStr + " -> ");  result.forEach(s-> System.out.println(s));
		result = process.inputReceived(inputStr = new String("2.5"));
		System.out.println("Output: " + inputStr + " -> ");	result.forEach(s-> System.out.println(s));
		result = process.inputReceived(inputStr = new String("*"));
		System.out.println("Output: " + inputStr + " -> ");  result.forEach(s-> System.out.println(s));
		result = process.inputReceived(inputStr = new String("-4"));
		System.out.println("Output: " + inputStr + " -> ");  result.forEach(s-> System.out.println(s));
		result = process.inputReceived(inputStr = new String("/"));
		System.out.println("Output: " + inputStr + " -> "); result.forEach(s-> System.out.println(s));
	
	}
	
	@Test
	public void runTest2() {
		System.out.println("************* " + this.getClass().getName() + ":" + "runTest2  ******************************");
		BasicCalcProcessor process = new BasicCalcProcessor(new AppConfigProps(null));

		String inputStr; 
		Stream<String> result;
		result = process.inputReceived(inputStr = new String("1.0")); 
		System.out.println("Input: " + inputStr + " -> "); result.filter(a -> a != null).forEach(s-> System.out.println(s)); 
		result = process.inputReceived(inputStr = new String("2.0")); 
		System.out.println("Input: " + inputStr + " -> ");  result.filter(a -> a != null).forEach(s-> System.out.println(s));
		result = process.inputReceived(inputStr = new String("+")); 
		System.out.println("Input: " + inputStr + " -> "); result.filter(a -> a != null).forEach(s-> System.out.println(s));
		result = process.inputReceived(inputStr = new String("5")); 
		System.out.println("Input: " + inputStr + " -> "); result.filter(a -> a != null).forEach(s-> System.out.println(s));
		result = process.inputReceived(inputStr = new String("-"));
		System.out.println("Input: " + inputStr + " -> ");  result.filter(a -> a != null).forEach(s-> System.out.println(s));
		result = process.inputReceived(inputStr = new String("+"));
		System.out.println("Input: " + inputStr + " -> ");  result.filter(a -> a != null).forEach(s-> System.out.println(s));
		result = process.inputReceived(inputStr = new String("3.2"));
		System.out.println("Input: " + inputStr + " -> ");  result.filter(a -> a != null).forEach(s-> System.out.println(s));
		result = process.inputReceived(inputStr = new String("2.5"));
		System.out.println("Input: " + inputStr + " -> ");	result.filter(a -> a != null).forEach(s-> System.out.println(s));
		result = process.inputReceived(inputStr = new String("+"));
		System.out.println("Input: " + inputStr + " -> ");  result.filter(a -> a != null).forEach(s-> System.out.println(s));
	
	}	
}
