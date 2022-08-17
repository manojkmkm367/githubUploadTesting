package org.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationURL {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url ="https://admin:admin@the-internet.herokuapp.com/basic_auth";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
