package learning_sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AWP_Exp_wait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		driver.get("https://www.automationwithpiyush.com/synchronization.html");

//		1 presence 
		driver.findElement(By.cssSelector("#dynamic-content > button")).click();
		driver.findElement(By.cssSelector("[onclick=\"startProcess('stop')\"]")).click();

//		2 Clickability 
		driver.findElement(By.id("trigger-input")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("target-input")));
		driver.findElement(By.id("target-input")).sendKeys("Selenium");

//		3 Visibility 
		driver.findElement(By.id("btn-visibility")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden-box")));
		boolean status = driver.findElement(By.id("hidden-box")).isDisplayed();
		if (status) {
			System.out.println("element is visible");
		}

//		4 Text Presence
		driver.findElement(By.id("btn-text")).click();

		WebElement tp = driver.findElement(By.id("text-status"));

		wait.until(ExpectedConditions.textToBePresentInElement(tp, "DATA_LOADED_100%"));
		boolean status1 = tp.getText().contains("DATA_LOADED_100%");
		if (status1) {
			System.out.println("text is present");
		}

//		5 alert
//		id="btn-alert"
		driver.findElement(By.id("btn-alert")).click();

//		wait until the alert is present
		wait.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().accept();

//		6 Selection 
		driver.findElement(By.id("btn-selection")).click();

		WebElement checkBox = driver.findElement(By.cssSelector("[type='checkbox']"));

		wait.until(ExpectedConditions.elementToBeSelected(checkBox));
		boolean status3 = checkBox.isSelected();
		if (status3) {
			System.out.println("checkbox got selected");
		}

		Thread.sleep(3000);
		driver.quit();
	}
}
