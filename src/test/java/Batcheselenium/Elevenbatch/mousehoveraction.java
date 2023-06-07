package Batcheselenium.Elevenbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehoveraction {

	public static void main(String[] args) {
		//syntax:Actions object=new Actions(Webdriver object);
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://demoqa.com/droppable/");
		Actions a=new Actions(driver);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		//a.clickAndHold(drag).moveToElement(drop).perform();
		a.dragAndDrop(drag, drop).perform();

		}

}
