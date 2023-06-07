package Batcheselenium.Elevenbatch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fileupload {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("myFile")).sendKeys("C:/Users/ASUS1/Downloads");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement clickable = driver.findElement(By.xpath("//a[@title='Java Tutorial']"));
		wait.until(ExpectedConditions.visibilityOf(clickable));
		
		
			}

}
