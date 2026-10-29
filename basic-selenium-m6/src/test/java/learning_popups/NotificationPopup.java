package learning_popups;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class NotificationPopup {
	public static void main(String[] args) throws InterruptedException, AWTException {
//		change the browser setting before opening browser
		ChromeOptions setting = new ChromeOptions();
		setting.addArguments("--disable-notifications");
		setting.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(setting);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.easemytrip.com/");

		Thread.sleep(8000);
		
//		press escape
//		Actions act = new Actions(driver);
//		act.keyDown(Keys.ESCAPE).perform();
//		act.keyUp(Keys.ESCAPE).perform();
		
//		Robot <<C>>
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		robot.keyRelease(KeyEvent.VK_ESCAPE);
		
		Thread.sleep(2000);
		driver.quit();
	}
}
