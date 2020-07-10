package RealPage.CodeTest.RPNCalc.input;

import java.util.stream.Stream;

import RealPage.CodeTest.RPNCalc.processor.CalcProcessor;

public class CliInputInterface implements InputInterface, Runnable {

	CalcProcessor processor = null;
	@Override
	public Object waitInput() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void pushOutput(Object op) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setProcessor(CalcProcessor proc) {
		processor = proc;
	}

	@Override
	public void run() {
			if (processor == null) return;
			do {
		        // Using Console to input data from user 
		        String inputLine = System.console().readLine();
		        if ((inputLine.length() <= 1) && (inputLine.charAt(0) == 'q' || inputLine.charAt(0) == 'Q')) 
		        {
		        	// user request to quit
		        	return;
		        }
		        
		        Stream<String> res = processor.inputReceived(inputLine);

		        res.forEach(System.out::println);
		        
			} while (true) ;

	}
	
	
	

}
