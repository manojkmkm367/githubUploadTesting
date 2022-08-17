package org.xpath;

import java.awt.Toolkit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class Task10WindowSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
//		FirefoxOptions firefoxOptions = new FirefoxOptions();
//		firefoxOptions.addArguments("--start-maximized");
		
	
		WebDriver driver= new ChromeDriver(chromeOptions);
		driver.get("https://www.amazon.in/");
		
		// driver.manage().window().maximize();
		
		Dimension dimension = new Dimension(1100, 600); // avilable in selenium
		
		// Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // avilabe in java 
		
		driver.manage().window().setSize(dimension);
		
		Thread.sleep(500);
		
		driver.quit();
	}

}
