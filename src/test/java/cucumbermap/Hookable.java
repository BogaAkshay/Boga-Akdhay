package cucumbermap;

import java.net.UnknownHostException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import methods.HTMLReportGenerator;

public class Hookable 
{
	@Before
	public void before(Scenario scenario) throws UnknownHostException
	{
		
		HTMLReportGenerator.TestSuiteStart("D:\\Akshay Files\\ExtentReport\\flipkart.html", "FlipkartProject");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
		
		
		
		System.out.println("------------------------------Scenario Starts--------------------------------");
	}
	
	
	@After
	public void after(Scenario scenario)
	{
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
		
		
		System.out.println("--------------------------------Scenario Ends----------------------------------");
		
		
	}
	
	
	
	
	
	
	
	

}
