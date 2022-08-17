package org.locatersSendKey;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task1FaceBook {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	WebElement txtLoginBox =	driver.findElement(By.id("email"));
	txtLoginBox.sendKeys("manojkmkm367");
	
	WebElement txtPassword = driver.findElement(By.id("pass"));
	txtPassword.sendKeys("Password@123");
	//driver.quit();
	}

}
