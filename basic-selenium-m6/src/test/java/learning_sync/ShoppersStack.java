package learning_sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppersStack {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://shoppersstack.com/products_page/155");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		Thread.sleep(3000);

		driver.findElement(By.id("Check Delivery")).sendKeys("201301");

//		explicit wait => condition based wait

		wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));

		driver.findElement(By.id("Check")).click(); // without exp wait => ElementClickInterceptedException

		Thread.sleep(3000);
		driver.quit();
	}
}
