package Batcheselenium.Elevenbatch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclickandkeyboard {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.google.com/");
		Actions a=new Actions(driver);
        a.contextClick(driver.findElement(By.linkText("Gmail"))).perform();
		Robot v=new Robot();
		v.keyPress(KeyEvent.VK_DOWN);
		v.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		
		v.keyPress(KeyEvent.VK_DOWN);
		v.keyRelease(KeyEvent.VK_DOWN);
	
		Thread.sleep(3000);

		v.keyPress(KeyEvent.VK_DOWN);
		v.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);

		v.keyPress(KeyEvent.VK_ENTER);
		v.keyRelease(KeyEvent.VK_ENTER);

	} 

}
