package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import CustomCode.textfilereader;
import Launchcode.Driversetup;


public class Login_page  {
	textfilereader text = new textfilereader();
	WebDriver driver;
	
	public Login_page(WebDriver driversetup) {
		this.driver= driversetup;
	}
	
	public WebElement username() {
		WebElement UserName = driver.findElement(By.xpath(text.textreader("Username")));
		return UserName;
		
	}
	public WebElement Password() {
		WebElement Password = driver.findElement(By.xpath(text.textreader("Password")));
		return Password;
		
		
	}
	public WebElement LoginBT() {
		WebElement LoginBT = driver.findElement(By.xpath(text.textreader("LoginBT")));
		return LoginBT;
		
	}

}
