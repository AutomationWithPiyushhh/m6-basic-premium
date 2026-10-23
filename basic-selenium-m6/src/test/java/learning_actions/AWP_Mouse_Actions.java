package learning_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AWP_Mouse_Actions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.automationwithpiyush.com/actions.html");

		Thread.sleep(1000);
//		-> create the object for actions class
		Actions act = new Actions(driver);

//		hover
		WebElement hoverEle = driver.findElement(By.cssSelector("[onmouseenter='handleHover()']"));
		act.moveToElement(hoverEle).build().perform();

		Thread.sleep(1000);

//		left click
		WebElement lc = driver.findElement(By.id("click-box"));
//		act.moveToElement(lc).build().perform();
//		act.click().build().perform();
		act.moveToElement(lc).click().build().perform();

//		right click

//		double click

//		click and hold => wait for 3 seconds => release
		WebElement clickHold = driver.findElement(By.id("click-hold"));
		
		act.clickAndHold(clickHold)
			.pause(Duration.ofSeconds(3))
			.release()
			.build().perform();

//		scrolling
		Thread.sleep(1000);
		WebElement source = driver.findElement(By.id("prod-laptop"));
		WebElement destination = driver.findElement(By.id("cart-zone"));

//		act.scrollToElement(destination).build().perform();
//
//		Thread.sleep(1000);
//
		act.scrollByAmount(0, 300).build().perform();
//
////		drag and drop
//
//		act.dragAndDrop(source, destination).build().perform();
		
//		scroll + draganddrop
		act.scrollToElement(destination)
			.pause(Duration.ofSeconds(1))
			.scrollByAmount(0, 300)
			.pause(Duration.ofSeconds(1))
			.dragAndDrop(source, destination)
//			.dragAndDropBy(source, 250,50)
			.build().perform();

		Thread.sleep(3000);
		driver.quit();
	}
}
