package LetCode_RadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/radio");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("yes")).click();
		
		WebElement yesRadio = driver.findElement(By.id("one"));
		WebElement noRadio = driver.findElement(By.id("two"));
		yesRadio.click();
		boolean yesstatus = yesRadio.isSelected();
		boolean nostatus = noRadio.isSelected();
		if(yesstatus)
		{
			if(nostatus)
			{
				System.out.println("Failed");
			}
		}
		
		noRadio.click();
		yesstatus = yesRadio.isSelected();
		nostatus = noRadio.isSelected();
		if(nostatus)
		{
			if(yesstatus)
			{
				System.out.println("Failed");
			}
		}
		
		WebElement yesbug = driver.findElement(By.id("nobug"));
		yesbug.click();
		WebElement nobug = driver.findElement(By.id("bug"));
		nobug.click();
		
		if(yesbug.isSelected() && nobug.isSelected())
		{
			System.out.println("Bug found");
		}
		
		WebElement foo = driver.findElement(By.id("foo"));
		WebElement bar = driver.findElement(By.id("notfoo"));
		
		if(foo.isSelected())
		{
			System.out.println("Foo is selected");
		}
		else
		{
			System.out.println("Bar is selected");
		}
		
		WebElement maybeRadio = driver.findElement(By.id("maybe"));
		if(maybeRadio.isEnabled())
		{
			System.out.println("Maybe option is enabled");
		}
		else
		{
			System.out.println("Maybe option is disabled");
		}
		
		WebElement check = driver.findElement(By.xpath("//label[contains(text(),'Remember me')]/input"));
		if(check.isSelected())
		{
			System.out.println("Checkbox selected");
		}
		else
		{
			System.out.println("Checkbox not selected");
		}
		
		WebElement TC = driver.findElement(By.xpath("//label[contains(text(),'I agree to the')]/input"));
		TC.click();
		
		driver.quit();
	}

}
