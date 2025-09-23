package Pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
		driver.findElement(By.xpath(textfile.textreader("Download"))).click();
		//Select Drop = new Select(driver.findElement(By.xpath(textfile.textreader("Download"))));
		//Drop.selectByValue("Windows");
		
		//driver.findElement(By.xpath(textfile.textreader("Window"))).click();
		File Directory = new File("Downloads");
		System.out.println(Directory);
		
		
	}
}
