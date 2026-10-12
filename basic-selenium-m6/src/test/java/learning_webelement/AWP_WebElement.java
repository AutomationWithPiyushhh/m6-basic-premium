package learning_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_WebElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.automationwithpiyush.com/locatorsSignin.html");
		
//		actions
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("admin");
		Thread.sleep(1000);
		username.clear();
		Thread.sleep(1000);
		username.sendKeys("automationwithpiyush");
		
		WebElement regLink = driver.findElement(By.linkText("Register"));
		System.out.println(regLink.getText());
		regLink.click();
		
		WebElement maleRadio = driver.findElement(By.cssSelector("input[value='2']"));
		
//		getters
		System.out.println(maleRadio.getTagName());
		System.out.println(maleRadio.getAttribute("type"));
		System.out.println(maleRadio.getCssValue("box-sizing"));
		
		System.out.println(maleRadio.getSize());
		System.out.println(maleRadio.getLocation());
		
		System.out.println(maleRadio.getRect().getDimension());
		System.out.println(maleRadio.getRect().getWidth());
		System.out.println(maleRadio.getRect().getHeight());
		
		System.out.println(maleRadio.getRect().getPoint());
		System.out.println(maleRadio.getRect().getX());
		System.out.println(maleRadio.getRect().getY());
		
//		boolean
		if (maleRadio.isDisplayed() && maleRadio.isEnabled()) {
			maleRadio.click();
		}
		
		if (maleRadio.isSelected()) {
			System.out.println("radio button got selected");
		}
		
//		click on submit
//		WebElement loginBtn = driver.findElement(By.cssSelector("[type='submit']"));
//		loginBtn.submit();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
