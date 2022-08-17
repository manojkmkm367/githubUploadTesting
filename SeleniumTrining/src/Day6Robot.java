import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6Robot {
 public static	WebDriver driver;
 public static Robot robot;
	
	public static void main(String[] args) throws AWTException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\SeleniumTrining\\drivers\\chromedriver.exe");
		 driver= new ChromeDriver();
			driver.get("http://adactinhotelapp.com/");
			 robot = new Robot();
			 enterTab(3);
			 robot.keyPress(KeyEvent.VK_N);
			 robot.keyRelease(KeyEvent.VK_N);
			 robot.keyPress(KeyEvent.VK_A);
			 robot.keyRelease(KeyEvent.VK_A);
			 robot.keyPress(KeyEvent.VK_M);
			 robot.keyRelease(KeyEvent.VK_M);
			 robot.keyPress(KeyEvent.VK_E);
			 robot.keyRelease(KeyEvent.VK_E);
		
			 enterTab(1);
			 robot.keyPress(KeyEvent.VK_P);
			 robot.keyRelease(KeyEvent.VK_P);
			 robot.keyPress(KeyEvent.VK_A);
			 robot.keyRelease(KeyEvent.VK_A);
			 robot.keyPress(KeyEvent.VK_S);
			 robot.keyRelease(KeyEvent.VK_S);
			 robot.keyPress(KeyEvent.VK_S);
			 robot.keyRelease(KeyEvent.VK_S);
			 
			 enterTab(2);
			 
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
	}
	private static void enterTab(int count) {		
		for (int i=0;i<count;i++)		{
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);			
		}	}
	

}
