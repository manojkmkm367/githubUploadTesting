package org.JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement btnLogin = driver.findElement(By.id("email"));
		WebElement btnPass = driver.findElement(By.id("pass"));
		WebElement btnSubmit = driver.findElement(By.name("login"));
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		executor.executeScript("arguments[0].setAttribute('value','UserName:Manoj')", btnLogin);
		executor.executeScript("arguments[0].setAttribute('value','PassWord:123@')", btnPass);
		executor.executeScript("arguments[0].click()", btnSubmit);
		
		

	}

}
