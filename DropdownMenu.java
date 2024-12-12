package LetCode_Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMenu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		
		WebElement fruitname = driver.findElement(By.id("fruits"));
		Select select = new Select(fruitname);
		select.selectByVisibleText("Apple");
		boolean fruitstatus = select.isMultiple();
		System.out.println(fruitstatus+"\n");
		
		WebElement superheros = driver.findElement(By.id("superheros"));
		select = new Select(superheros);
		if(select.isMultiple())
		{
			select.selectByIndex(0);
			select.selectByIndex(1);
		}
		
		WebElement language = driver.findElement(By.id("lang"));
		select = new Select(language);
		List<WebElement> options = select.getOptions();
		int noOfOptions = options.size();
		int lastOptionIndex = noOfOptions - 1;
		select.selectByIndex(lastOptionIndex);
		
		for(WebElement index : options)
		{
			System.out.println(index.getText());
		}
		
		WebElement country = driver.findElement(By.id("country"));
		select = new Select(country);
		select.selectByValue("India");
		System.out.println(select.getFirstSelectedOption().getText());
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
