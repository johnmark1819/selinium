package Batcheselenium.Elevenbatch;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollupanddown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-3000)");
		WebElement footele = driver.findElement(By.linkText("Sell on Amazon"));
		js.executeScript("arguments[0].scrollIntoView(true)", footele);
		
	}

}
