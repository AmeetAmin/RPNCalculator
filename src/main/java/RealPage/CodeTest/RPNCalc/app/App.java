package RealPage.CodeTest.RPNCalc.app;

import RealPage.CodeTest.RPNCalc.app.config.AppConfigProps;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        new RpnCalcMainApp(new AppConfigProps(args)).start();
        
    }
}
