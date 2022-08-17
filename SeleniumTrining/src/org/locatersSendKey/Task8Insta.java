package org.locatersSendKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8Insta {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.instagram.com/accounts/login/?hl=en");
			
			WebElement enterUserName = driver.findElement(By.name("username"));
			enterUserName.sendKeys("UserName");
	}

}
