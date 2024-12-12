package LetCodeButton;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LetCodeButtonOptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("home")).click();
		driver.navigate().back();
		
		WebElement location = driver.findElement(By.id("position"));
		location.click();
		Point point = location.getLocation();
		System.out.println(point.getX());
		System.out.println(point.getY());
		
		Rectangle rect = location.getRect();
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		
		WebElement color = driver.findElement(By.id("color"));
		color.click();
		String colorname = color.getCssValue("background-color");
		System.out.println(colorname);
		
		WebElement wh = driver.findElement(By.id("property"));
		Dimension size = wh.getSize();
		System.out.println(size.height);
		System.out.println(size.width);
		
		WebElement disabled = driver.findElement(By.id("isDisabled"));
		boolean status = disabled.isEnabled();
		System.out.println(status);
		
		WebElement button = driver.findElement(By.xpath("(//button[@id=\"isDisabled\"])[2]"));
		Actions action = new Actions(driver);
		action.clickAndHold(button).perform();
		Thread.sleep(5000);
		action.release().perform();
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		

	}

}
