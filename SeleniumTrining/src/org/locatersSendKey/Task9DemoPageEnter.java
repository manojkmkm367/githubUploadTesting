package org.locatersSendKey;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9DemoPageEnter {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Register.html");
			
			WebElement txtFirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
			txtFirstName.sendKeys("manoj");
			WebElement txtLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
			txtLastName.sendKeys("kumar");
// unale to use fine by name 
			

	}

}
