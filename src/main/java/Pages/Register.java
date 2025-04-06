package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CustomCode.ReadExcel;
import CustomCode.textfilereader;
import Launchcode.Driversetup;

public class Register extends Driversetup {
	ReadExcel excel = new ReadExcel();
	textfilereader textfile = new textfilereader();
	WebDriver driver= null;
	
	@Test
	public void register() {
		
		
		driver = getDriver();
		driver.findElement(By.xpath(textfile.textreader("Register"))).click();
		
	}
}
