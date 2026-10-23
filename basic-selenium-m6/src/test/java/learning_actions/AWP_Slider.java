package learning_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AWP_Slider {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.automationwithpiyush.com/actions.html");

		Thread.sleep(1000);
		Actions act = new Actions(driver);

//		seekbar => hover + move + click
		WebElement slider = driver.findElement(By.id("pulse-slider"));
		act.moveToElement(slider).moveByOffset(100, 0).click().build().perform();
		
//		act.clickAndHold(slider).moveByOffset(100, 0).release().build().perform();
//		
//		act.dragAndDropBy(slider, 100, 0).build().perform();
		

		Thread.sleep(3000);
		driver.quit();
	}
}
