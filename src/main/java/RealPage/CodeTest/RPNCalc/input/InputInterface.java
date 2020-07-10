package RealPage.CodeTest.RPNCalc.input;

import RealPage.CodeTest.RPNCalc.processor.CalcProcessor;

public interface InputInterface<T> {
	
	public T waitInput();
	
	public void pushOutput(T op) ;


}
