package RealPage.CodeTest.RPNCalc.processor;

import java.util.stream.Stream;

public interface CalcProcessor<T extends Number> {
	
	public Stream<String> inputReceived(String ip); 
	
	// public String getResult(); 
	
	default String getSeparatorsRegEx() {
		return new String("\\s+");
	}
}
