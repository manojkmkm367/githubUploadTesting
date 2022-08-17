package org.locatersSendKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2RedBus {
	public static void main(String[] args) {		 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
	WebElement txtFromLocation =	driver.findElement(By.className("db"));
	txtFromLocation.sendKeys("chennai");
	WebElement txtToLocation = driver.findElement(By.id("dest"));
	txtToLocation.sendKeys("Coimbatore");
	//driver.quit();

	}

}
