package learning_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.automationwithpiyush.com/locatorsSignin.html");

		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("admin");

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("12345678");
		
		WebElement checkBox = driver.findElement(By.className("custom-checkbox"));
		checkBox.click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
