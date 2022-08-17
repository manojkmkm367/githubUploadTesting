package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
	
		Dimension dimension = new Dimension(1300, 900);
			
		driver.manage().window().setSize(dimension);
		
		
		
		
		
		WebElement btnLogin=driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		btnLogin.click();
		
// Unable to Pass control to new window

	}

}
