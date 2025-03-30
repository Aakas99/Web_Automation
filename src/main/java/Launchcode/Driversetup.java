package Launchcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driversetup {

	public WebDriver driver;
	
	@Test
	@Parameters({"url", "browser"})
	public void driverstart(String url, String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Page Title " + driver.getTitle() );
	}
	
	
}
