package Day5Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1Guru99DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\ztestF\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement listAmt5000 = driver.findElement(By.xpath("//div[@id='products']/div[1]/ul/li[2]"));
		WebElement listBank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement listSales = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		
		WebElement boxDebitAccount = driver.findElement(By.xpath("//ol[@id='bank']"));
		WebElement boxCreditAccount=driver.findElement(By.xpath("//ol[@id='loan']/li"));
		WebElement  boxDebitAmt =		driver.findElement(By.xpath("//ol[@id='amt7']"));
		WebElement  boxCreditAmt =	driver.findElement(By.xpath("//ol[@id='amt8']"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(listBank, boxDebitAccount).perform();
		actions.dragAndDrop(listAmt5000, boxDebitAmt).perform();
		actions.dragAndDrop(listSales, boxCreditAccount).perform();
		actions.dragAndDrop(listAmt5000, boxCreditAmt).perform();

		WebElement txtHiddenResult= driver.findElement(By.xpath("//div[@id='equal']/a"));
		String result = txtHiddenResult.getText();
		System.out.println("Hidden Text : "+result);
		driver.quit();
		
	}

}
