package org.locatersSendKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10Adactin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://adactinhotelapp.com/");
			
			WebElement txtUsername  = driver.findElement(By.id("username"));
			txtUsername .sendKeys("manojKumar");
			WebElement txtPassword  = driver.findElement(By.id("password"));
			txtPassword .sendKeys("Pass@123");

	}

}
