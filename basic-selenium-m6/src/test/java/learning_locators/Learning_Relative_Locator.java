package learning_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Learning_Relative_Locator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.automationwithpiyush.com/relative.html");
		
//		Thread.sleep(2000);
//		driver.findElement(RelativeLocator
//						.with(By.tagName("button"))
//						.toLeftOf(By.id("center_monitor"))
//				).click();
		
		
		
		
		
		
		
		
//		Thread.sleep(2000);
//		driver.findElement(RelativeLocator
//						.with(By.tagName("button"))
//						.toRightOf(By.id("center_monitor"))
//				).click();
		
		Thread.sleep(2000);
		driver.findElement(RelativeLocator
						.with(By.tagName("button"))
						.toRightOf(By.id("cell_top_center"))
						.above(By.id("center_monitor"))
				).click();
		
//		Thread.sleep(2000);
//		driver.findElement(RelativeLocator
//						.with(By.tagName("button"))
//						.below(By.id("center_monitor"))
//				).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
