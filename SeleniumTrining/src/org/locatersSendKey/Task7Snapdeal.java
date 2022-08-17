package org.locatersSendKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7Snapdeal {
	public static void main(String[] args) {			
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.snapdeal.com/login");
		WebElement txtMobNo = driver.findElement(By.id("userName"));
					txtMobNo.sendKeys("7502760449");
					
					
					
					
					
					
					
					
					
					
					
					
	}

}
