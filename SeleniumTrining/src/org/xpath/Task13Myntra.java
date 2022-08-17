package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task13Myntra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");

		WebElement txtMobNo = driver.findElement(By.xpath("//input[@type = 'tel']"));
		txtMobNo.sendKeys("7502760449");
		
		WebElement btnContinue = driver.findElement(By.xpath("//*[@class= 'submitBottomOption']"));
		btnContinue.click();
		
	}

}
