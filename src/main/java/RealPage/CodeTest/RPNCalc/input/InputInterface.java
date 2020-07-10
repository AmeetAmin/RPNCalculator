package RealPage.CodeTest.RPNCalc.input;

import RealPage.CodeTest.RPNCalc.processor.CalcProcessor;

abstract public class InputInterface<T> extends Thread {
	
	abstract public T waitInput();
	
	abstract public void pushOutput(T op) ;

	abstract public void setProcessor(CalcProcessor proc);


}
