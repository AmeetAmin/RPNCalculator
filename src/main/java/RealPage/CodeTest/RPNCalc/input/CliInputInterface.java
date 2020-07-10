package RealPage.CodeTest.RPNCalc.input;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

import RealPage.CodeTest.RPNCalc.app.config.AppConfigProps;
import RealPage.CodeTest.RPNCalc.processor.BasicCalcProcessor;
import RealPage.CodeTest.RPNCalc.processor.CalcProcessor;

public class CliInputInterface extends InputInterface {

	CalcProcessor processor = null;
	@Override
	public Object waitInput() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setProcessor(CalcProcessor proc) {
		processor = proc;
	}

	@Override
	public void run() {
			if (processor == null) return;
			System.out.println("Welcome to RPN Calculator, please enter your input ");
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    String inputLine = null;
			do {
		        // Using Console to input data from user 
		        System.out.print(" > ");				
				try {
					inputLine = br.readLine(); 
				} catch (Exception e) {
					return;
				}
		        if ((inputLine == null) || 
		        		(inputLine.length() >= 1) && (inputLine.charAt(0) == 'q' || inputLine.charAt(0) == 'Q'))
		        {	
		        	// user request to quit
		        	return;
		        }
		        if ((inputLine.length() == 0))	// inadvertant ENTER, just ignore
					continue;

		        processInput(inputLine);
		        

		        
			} while (true) ;

	}
	
	private void processInput(String inputLine) {

		Stream<String> res = processor.inputReceived(inputLine);

        res.forEach(System.out::println);		
	}

	
	public void testInput(String inputLine) {

		System.out.println("Input: " + inputLine + " -> ");
		Stream<String> res = processor.inputReceived(inputLine);

        res.forEach(System.out::println);		
	}
	

	@Override
	public void pushOutput(Object op) {
		// Do nothing right now, maybe for asynchronous output operations
		
	}

}
