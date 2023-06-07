package Batcheselenium.Elevenbatch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserlaunch {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver();
		
		//WebDriverManager.edgedriver().setup();
		//EdgeDriver driver1=new EdgeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver= new FirefoxDriver();
		
		//SafariDriver diver3=new SafariDriver();
		/*ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");*/
		
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/chennai");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://www.olacabs.com/");
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.close();
		driver.quit();
		

	}

}
