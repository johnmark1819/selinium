package Batcheselenium.Elevenbatch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		/*Alerts---1.ok,2.ok/cancel3.prompt alert
		 * problems faced while locating an alert--1.we cant locate an alert
		 *                                         2.alert will make the webpage and dom structured freezed
		 */
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		String title=driver.getTitle();
		System.out.println("title of the page:"+title);
		String url=driver.getCurrentUrl();
		System.out.println("current url:"+url);
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
        driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
        driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
        Thread.sleep(3000);
        alert.dismiss();
        driver.findElement(By.xpath("//a[@href=\'#Textbox\']")).click();
        driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
        String promptmsg=driver.switchTo().alert().getText();
        System.out.println("prompt message:"+promptmsg);
        alert.sendKeys("hi john");
        alert.accept();
	}

}
