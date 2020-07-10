package RealPage.CodeTest.RPNCalc.processor;

public interface CalcProcessor<T extends Number> {
	
	public boolean inputReceived(T ip); 
	
	// public String getResult(); 
	
	default String getSeparatorsRegEx() {
		return new String("[\\s+-*/]");
	}
}
