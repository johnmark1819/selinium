package Batcheselenium.Elevenbatch;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowshandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//button[ @class='btn btn-info']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Set<String> windows=driver.getWindowHandles();
		for(String window:windows) {
			if(parentwindow!=window)
				driver.switchTo().window(window);
		}
		driver.findElement(By.linkText("Downloads")).click();
		Thread.sleep(3000);
		driver.switchTo().window(parentwindow);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='Index.html']")).click();
		driver.quit();
	}

}
