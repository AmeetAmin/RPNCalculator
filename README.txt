Retrieve and Build project:

Clone source from Git Repository https://github.com/AmeetAmin/RPNCalculator.git :  

  $ git clone https://github.com/AmeetAmin/RPNCalculator.git
  $ ls
  RPNCalculator/

Change directory to local Folder:
  $ cd RPNCalculator
  $ ls
  pom.xml  README.txt  src/

 
 This will be considered <Your local project> in instrcutions below. 





Compile instrcutions:
----------------------

Unix build instructions

Please make sure your JAVA_HOME environment is set to Java8 version


Using Mavan, please using install option to build

  $ cd <Your local project>
  $ mvn clean install 
  $ ls
  pom.xml  README.txt  src/  target/

  

In the target folder, you will see the compiled files including the JAR file to execute (RPNCalc-1.0.jar)
$ ls target
classes/  generated-sources/  generated-test-sources/  maven-archiver/  maven-status/  RPNCalc-1.0.jar  surefire-reports/  test-classes/


Run instructions:

Please make sure your JAVA_HOME environment is set to Java8 version
java -cp <RPNPATH>/RPNCalc-1.0.jar RealPage/CodeTest/RPNCalc/app/App 

$ java -cp target/RPNCalc-1.0.jar RealPage/CodeTest/RPNCalc/app/App
Welcome to RPN Calculator, please enter your input
 >




Usage instructions:

This is a simple RPN calculator, which only supports operators "+", "-", "*", "-"

You can enter a series of floating point or integer values or any of the above operators, either in space separated single line, or individually, followed by <Enter>
Once any of the above operators are detected, a calculation will be performed and the result output. 

To quit application, enter "q"  <ENTER>


Example Usage: 

  Welcome to RPN Calculator, please enter your input
   > 5 4 +
  5
  4
  9.0
   > 5
  5
   > 4
  4
   > +
  9.0
   > 18 -
  18
  -9.0
   > 3
  3
   > 3
  3
   > +
  6.0
   > q


===============================================================

Solution outline:

This is a very simple RPN calculator, which acts on two operands at a time.  The general solution is relatively simple.  This is a Java 1.8 based application, so there is a entry point into the application "App.main()".  

To enable future refinement and enhancements, the solution has provided a set of interfaces to define a framework, that can be used to extend the capablity.  There is a configration object (RealPage/CodeTest/RPNCalc/app/config/AppConfigProps), which is very hollow and returns defaults for this basic solution, but can be extended in the future. 
The actual calculation logic for RPN and the user input are abstracted from each other, to allow for future growth beyond CLI interfaces.  Given a typical user driven application, a user input will be a triggering event.  Therefore in this solution, the driver is the "RealPage/CodeTest/RPNCalc/input/CliInputInterface", which upon detecting a user event, will process the entry using a registered processor for the data defined by Interface "RealPage/CodeTest/RPNCalc/processor/CalcProcessor". The core application simply registers the processor with the Interface.  

There is use of Factory, Proxy and Singleton patterns to enable some level of abstraction, but nothing significant in terms of the complexity. 


