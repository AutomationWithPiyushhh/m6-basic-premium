package p_backup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotificationsPopup {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
//		ChromeOptions setting = new ChromeOptions();
//		setting.addArguments("--disable-notifications");
//		setting.addArguments("--start-maximized");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.easemytrip.com/");
		
		Thread.sleep(7000);
		
//		Robot robot = new Robot();
//		
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		robot.keyRelease(KeyEvent.VK_ESCAPE);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
