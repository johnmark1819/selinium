package Batcheselenium.Elevenbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webelements {

	public static void main(String[] args) {
		
		WebDriver driver;
		String browsername="ucbrowser";
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if (browsername.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();
		}
		else
		{
			driver=new EdgeDriver();
		driver.manage().window().maximize();
			
		}
		//get title
		driver.get("https://www.instagram.com/");
		String title=driver.getTitle();
		System.out.println("title of the page:"+title);
		if(title.contains("Instagram"))
		{
			System.out.println("validsite");
		}
		else {
			System.out.println("invalidesite");
		}
		//get current url
		String Url=driver.getCurrentUrl();
		System.out.println("curretntUrl:"+Url);
		if(Url.contains("https://www.instagram.com/"))
		{
			System.out.println("validsite");
		}
		else {
			System.out.println("invalidesite");
}
		String sourcecode=driver.getPageSource();
		//System.out.println(sourcecode);
		//driver.quit();
	}
	
}
