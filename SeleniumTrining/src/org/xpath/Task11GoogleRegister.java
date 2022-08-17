package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11GoogleRegister {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(" https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		
	WebElement btnfirstName= driver.findElement(By.xpath("//input[@id='firstName']"));
	btnfirstName.sendKeys("manoj");

	WebElement btnlastName= driver.findElement(By.xpath("//input[@id='lastName']"));
	btnlastName.sendKeys("kumar");
	
	WebElement btnusername= driver.findElement(By.xpath("//input[@id='username']"));
	btnusername.sendKeys("manojkumar555");
	
	WebElement btnPassword= driver.findElement(By.xpath("//input[@name='Passwd']"));
	btnPassword.sendKeys("manojkumar@555");
	
	WebElement btnConfirmPasswd= driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
	btnConfirmPasswd.sendKeys("manojkumar@555");
	
	WebElement btnNext = driver.findElement(By.xpath("//*[text() = 'Next']"));
	// btnNext.click();
	
	}
}
