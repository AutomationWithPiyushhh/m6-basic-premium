package learning_dd;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.automationwithpiyush.com/dropdown.html");
		
//		how to handle single select dropdown
//		selectByIndex()
//		selectByValue()
//		selectByVisibleText()
//		isMultiple()
//		getOptions()
		
//		deselectByIndex()
//		deselectByValue()
//		deselectByVisibleText()
//		deselectAll()
		
//		getFirstSelectedOption()
//		getAllSelectedOptions()
		
//		get the webelement for dd
		WebElement countryDD = driver.findElement(By.id("single-select"));
		
//		create the object for Select class
		Select selCount = new Select(countryDD);

//		handle the dd accordingly
		selCount.selectByIndex(4);
		selCount.selectByValue("uk");
		selCount.selectByVisibleText("United States");

//		selCount.deselectByVisibleText("United States"); 
//		UnsupportedOperationException: You may only deselect options of a multi-select

		if (selCount.isMultiple()) {
			selCount.deselectByVisibleText("United States"); 
		}
		
//		All options belonging to this select tag
		List<WebElement> countries = selCount.getOptions();
		for (WebElement i : countries) {
			System.out.println(i.getText());
		}
		
//		deselection
//		get the webelement for dd
		WebElement skillDD = driver.findElement(By.id("multi-select"));
		
//		create the object for Select class
		Select selSkill = new Select(skillDD);

//		handle the dd accordingly
		selSkill.selectByIndex(0);
		selSkill.selectByIndex(1);
		selSkill.selectByIndex(2);
		selSkill.selectByIndex(3);

		selSkill.deselectByIndex(2);
		
//		to get the first selected element/option
		WebElement firstSelected = selSkill.getFirstSelectedOption();
		String fs = firstSelected.getText();
		System.out.println(fs);
		
//		to get all the selected elements/options
		List<WebElement> allSelected = selSkill.getAllSelectedOptions();
		for(WebElement i: allSelected) {
			System.out.println(i.getText());
		}

		
			
		Thread.sleep(3000);
		driver.quit();
	}
}
