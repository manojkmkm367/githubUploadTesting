package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5GreenInterviewQus {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(" http://greenstech.in/selenium-course-content.html");
	WebElement txtInterviewQus =	driver.findElement(By.xpath("//i[@class='fas fa-plus']"));
	txtInterviewQus.click();
// unable to click Text
	
	

	}

}
