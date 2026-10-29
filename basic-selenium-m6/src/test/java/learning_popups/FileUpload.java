package learning_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");

		driver.findElement(By.cssSelector("[src='//static.naukimg.com/s/7/104/assets/images/briefcase.bdc5fadf.svg']")).click();
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\User\\git\\m6-basic\\basic-selenium-m6\\Methods.pdf");
		
		Thread.sleep(3000);
		driver.quit();
	}
}
