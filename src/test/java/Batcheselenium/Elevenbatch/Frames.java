package Batcheselenium.Elevenbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// frame is nothing but webpage inside another page
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.automationtesting.in/Frames.html");
		// WebElement frameAddress =driver.findElement(By.xpath("//iframe[@id='singleframe']"));

		 
		driver.switchTo().frame("SingleFrame");
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("hello");
		Thread.sleep(3000);
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		driver.findElement(By.cssSelector("a[href='#Multiple']")).click();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']")));
		
		Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("mission sucess");
		
	}

}
