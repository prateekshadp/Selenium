package LedCode;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LedcodeProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");
		
		//1. Enter Name
		driver.findElement(By.xpath("//input[@id=\"fullName\"]")).sendKeys("Prateeksha");
		
		//2. Append Text
		driver.findElement(By.xpath("//input[@id=\"join\"]")).sendKeys("Software Tester");
		driver.findElement(By.xpath("//input[@id=\"join\"]")).sendKeys(Keys.TAB);
		
		//3. Identify text
		String getValue = driver.findElement(By.xpath("//input[@id=\"getMe\"]")).getAttribute("value");
		System.out.println(getValue);
		
		//4. Clear text
		driver.findElement(By.xpath("//input[@id=\"clearMe\"]")).clear();
		
		//5. Identify Disabled field
		boolean Enabledstatus = driver.findElement(By.xpath("//input[@id=\"noEdit\"]")).isEnabled();
		if(Enabledstatus)
		{
			System.out.println("It is Enabled");
		}
		else
		{
			System.out.println("It is Disabled");
		}
		
		
		//6. Confirm readonly
		String Readonlystatus = driver.findElement(By.xpath("//input[@id=\"dontwrite\"]")).getAttribute("readonly");
		System.out.println(Readonlystatus);
		if(Readonlystatus.equals("true"))
		{
			System.out.println("It is Read only");
		}
		else
		{
			System.out.println("It is not Read only");
		}
		
		driver.quit();
	}

}
