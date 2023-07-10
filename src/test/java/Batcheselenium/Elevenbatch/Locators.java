package Batcheselenium.Elevenbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/login/");
		WebElement emailtxtbox =driver.findElement(By.id("email"));
		emailtxtbox .sendKeys("OraniumTech@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Google");
		driver.findElement(By.tagName("button")).click();
		//link text
		driver.findElement(By.linkText("Forgotten account?")).click();
		
			}

}
