package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1Amazon {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement txtSearchTextbox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		txtSearchTextbox.sendKeys("iphone");
		
		WebElement btnSerch = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		btnSerch.click();
		
		
		
		

	}

}
