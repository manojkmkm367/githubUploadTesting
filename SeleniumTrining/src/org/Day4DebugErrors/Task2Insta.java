package org.Day4DebugErrors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2Insta {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.instagram.com/accounts/login/?hl=en");
			
			Thread.sleep(2000);
			WebElement txtUserName = driver.findElement(By.name("username"));
			txtUserName.sendKeys("UserName");
			
			WebElement txtPass = driver.findElement(By.xpath("//input[@name='password']"));
			txtPass.sendKeys("Password");
			
			WebElement btnLogin= driver.findElement(By.xpath("//button[@type='submit']"));
			btnLogin.click();
			
	}

}
