package org.DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1HotelBooking {
	Select select;

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://adactinhotelapp.com/");
			
	//Page 1	
			 WebElement  txtUsername  = driver.findElement(By.id("username"));
			txtUsername.sendKeys("Greens8767");
			WebElement txtPassword  = driver.findElement(By.id("password"));
			txtPassword .sendKeys("QN8V3A");
			WebElement btnlogin= driver.findElement(By.id("login"));
			btnlogin.click();
	// Page 2
			WebElement dDnlocation= driver.findElement(By.id("location"));
			Select select = new Select(dDnlocation);
			select.selectByIndex(5);
			
			WebElement dDnhotels= driver.findElement(By.id("hotels"));
			Select select1 = new Select(dDnhotels);
			select1.selectByIndex(3);
			
			WebElement bDnroom_type = driver.findElement(By.id("room_type"));
			bDnroom_type.sendKeys("Deluxe");
			
			WebElement btnSearch= driver.findElement(By.id("Submit"));
			btnSearch.click();
 // Page 3			
			WebElement rbHotelSelection = driver.findElement(By.xpath("//*[@id='radiobutton_0']"));
			rbHotelSelection.click();
			
			WebElement btnContinue = driver.findElement(By.id("continue"));
			btnContinue.click();
//	Page 4		
			WebElement txtFirstName= driver.findElement(By.xpath("//*[@id='first_name']"));
			txtFirstName.sendKeys("Manoj");
			
			WebElement txtlastName= driver.findElement(By.xpath("//*[@id='last_name']"));
			txtlastName.sendKeys("Kumar");
			
			WebElement txtAddress= driver.findElement(By.xpath("//*[@id='address']"));
			txtAddress.sendKeys("Navalur,Chennai-19");
			
			WebElement txtCCNum= driver.findElement(By.xpath("//*[@id='cc_num']"));
			txtCCNum.sendKeys("1234567891234567");
			
			WebElement dDbCCtype= driver.findElement(By.xpath("//*[@id='cc_type']"));
			dDbCCtype.sendKeys("VISA");
			
			WebElement bDnMonth = driver.findElement(By.xpath("//*[@id='cc_exp_month']"));
			bDnMonth.sendKeys("May");
			
			WebElement bDnYear = driver.findElement(By.xpath("//*[@id='cc_exp_year']"));
			bDnYear.sendKeys("2022");
			
			WebElement bDnCVV= driver.findElement(By.xpath("//*[@id='cc_cvv']"));
			bDnCVV.sendKeys("345");
// Page Last			
			
			WebElement btnBook= driver.findElement(By.xpath("//*[@id='book_now']"));
			btnBook.click();
			
			Thread.sleep(5000);
			WebElement txtOrderId= driver.findElement(By.xpath("//input[@id='order_no']"));
			String id =txtOrderId.getAttribute("value");
					
			System.out.println(id);
	}

}
