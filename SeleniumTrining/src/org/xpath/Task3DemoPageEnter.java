package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3DemoPageEnter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement txtFirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtFirstName.sendKeys("manoj");
		WebElement txtLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtLastName.sendKeys("kumar");
		
		WebElement txtAddress = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		txtAddress.sendKeys("CBE");
		
		WebElement txtEmail=driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		txtEmail.sendKeys("abcd@gmail.com");
		
		WebElement txtPhoneNo = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		txtPhoneNo.sendKeys("7502760449");
		
		WebElement btnMale = driver.findElement(By.xpath("//input[@value='Male']"));
		btnMale.click();
		
		WebElement hobbiesBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		WebElement hobbiesBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		hobbiesBox1.click();
		hobbiesBox2.click();
		
		WebElement txtLanguage= driver.findElement(By.xpath("//*[@id='msdd']"));
		txtLanguage.sendKeys("English");
	// UNABLE TO SEND ELEMENT TO DROPDOWN CHOOSE 

	}

}
