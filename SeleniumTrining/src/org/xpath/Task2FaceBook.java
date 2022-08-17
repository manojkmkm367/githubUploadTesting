package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task2FaceBook {
	public static WebElement email;
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		email.sendKeys("manojkmkm367");
		
//	WebElement txtLoginBox =	driver.findElement(By.xpath("//input[@id='email']"));
//	txtLoginBox.sendKeys("manojkmkm367");
//	
//	WebElement txtPassword = driver.findElement(By.xpath("//input[@id='pass']"));
//	txtPassword.sendKeys("Password@123");
//	
//	WebElement btnLogin = driver.findElement(By.xpath("//button[@name='login']"));
//	btnLogin.click();
	//driver.quit();
		

		
	
	
	
	
	
	}

}
