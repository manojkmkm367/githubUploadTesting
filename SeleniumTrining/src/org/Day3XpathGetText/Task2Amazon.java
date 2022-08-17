package org.Day3XpathGetText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement txtAmazon = driver.findElement(By.xpath("//a[contains(text(),'Conditions of Use & Sale')]"));
		System.out.println(txtAmazon.getText());
		driver.quit();
		
	}

}
