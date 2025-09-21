package Launchcode;
import java.io.File;
import java.io.IOException;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Parameters;
import org.openqa.selenium.TakesScreenshot;
//import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driversetup {

	//public WebDriver driver;
	
	// @BeforeTest
	// @Parameters({"url", "browser"})
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	public void driverstart(String url, String browser) {
		if ("chrome".equalsIgnoreCase(browser)) {
			WebDriverManager.chromedriver().setup();
			driver.set(new ChromeDriver());
		} else if ("edge".equalsIgnoreCase(browser)) {
			WebDriverManager.edgedriver().setup();
			driver.set(new EdgeDriver());
		}
		driver.get().get(url);
		driver.get().manage().window().maximize();
	}
	
	public WebDriver getDriver() { return driver.get(); }

	//@AfterTest
	public void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
        
        
	    
	
}
}
