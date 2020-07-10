package RealPage.CodeTest.RPNCalc.processor;

import java.util.stream.Stream;

import org.junit.Test;

import RealPage.CodeTest.RPNCalc.app.config.AppConfigProps;
import RealPage.CodeTest.RPNCalc.input.CliInputInterface;
import RealPage.CodeTest.RPNCalc.input.InputFactory;
import RealPage.CodeTest.RPNCalc.input.InputInterface;

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
		result = process.inputReceived(inputStr = new String("5 4 - - 3 6 +"));
		System.out.println("Input: " + inputStr + " -> ");  result.filter(a -> a != null).forEach(s-> System.out.println(s));
		result = process.inputReceived(inputStr = new String("3.2"));
		System.out.println("Input: " + inputStr + " -> ");  result.filter(a -> a != null).forEach(s-> System.out.println(s));
		result = process.inputReceived(inputStr = new String("2.5"));
		System.out.println("Input: " + inputStr + " -> ");	result.filter(a -> a != null).forEach(s-> System.out.println(s));
		result = process.inputReceived(inputStr = new String("+"));
		System.out.println("Input: " + inputStr + " -> ");  result.filter(a -> a != null).forEach(s-> System.out.println(s));
	
	}	
	
	
	
	@Test
	public void runIOTest() {
		System.out.println("************* " + this.getClass().getName() + ":" + "runIOTest  ******************************");
		AppConfigProps config = new AppConfigProps(null);
		BasicCalcProcessor process = new BasicCalcProcessor(config);
		CliInputInterface intf = new CliInputInterface();
		intf.setProcessor(process);
		
		
		String inputStr; 
		Stream<String> result;
		intf.testInput("1.0"); 
		intf.testInput("2.0"); 
		intf.testInput("+"); 
		intf.testInput("5"); 
		intf.testInput("-");
		intf.testInput("+");
		intf.testInput("5 4 - - 3 6 +");
		intf.testInput("3.2");
		intf.testInput("2.5");
		intf.testInput("+");
	
	}		
}
