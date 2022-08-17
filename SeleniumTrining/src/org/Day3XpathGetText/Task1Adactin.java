package org.Day3XpathGetText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1Adactin {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://adactinhotelapp.com/");
			
			WebElement txtContent = driver.findElement(By.xpath("//p[contains(text(),'Adactin Launches ')]"));
		System.out.println(	txtContent.getText());
 driver.quit();
	}

}
