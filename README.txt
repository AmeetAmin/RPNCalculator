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
  18.0
   > 18 -
  18
  0.0
   > 3 3
  3
  3
   > +
  6.0



