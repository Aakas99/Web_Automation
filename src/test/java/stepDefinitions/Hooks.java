package stepDefinitions;

import Launchcode.Driversetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	private static Driversetup driverSetup = new Driversetup();
	
	@Before
	public void beforeScenario() {
		String url = System.getProperty("test.url");
		String browser = System.getProperty("test.browser");
		
		driverSetup.driverstart(url, browser);
		
	}
	
	public static Driversetup getDriverSetup() {
		 return driverSetup;
	}
	@After
	public void Afterscenario() {
		
	}

}
