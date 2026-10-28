package p_backup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.automationwithpiyush.com/");

//		1> get the home address / parent window session id
		String PID = driver.getWindowHandle();

//		2> perform the task which opens new windows or tabs
		WebElement element = driver.findElement(By.cssSelector("[onclick=\"openSocialChannels()\"]"));
		element.click();

//		3> get all the child window session ids
		Set<String> CIDs = driver.getWindowHandles();

//		4> iterate through each session id or tab or window 
		for (String i : CIDs) {
//			4.1> break the loop wherever condition meets
			driver.switchTo().window(i);
			if (driver.getTitle().contains("LinkedIn")) {
				break;
			}
		}

//		5> perform the task on your desired window ]
		Thread.sleep(3000);
		driver.close();

//		6> get back home
		driver.switchTo().window(PID);
		Thread.sleep(3000);
		driver.quit();

	}
}
