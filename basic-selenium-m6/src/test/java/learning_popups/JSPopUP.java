package learning_popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JSPopUP {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.automationwithpiyush.com/popups.html");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.alertIsPresent());

		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().sendKeys("Guddu");
//		driver.switchTo().alert().accept();		
		driver.switchTo().alert().dismiss();

		Thread.sleep(3000);
		driver.quit();
	}
}
