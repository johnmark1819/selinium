package Batcheselenium.Elevenbatch;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bootstrapdropdown {
public static void main(String[] args)  {
	WebDriver driver;
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
    driver.navigate().to("https://www.hdfcbank.com/");
    driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
    List<WebElement> products = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
    System.out.println("no of products:"+products.size());
    for (WebElement prod:products)
    {
    	System.out.println(prod.getText());
    	if(prod.getText().equalsIgnoreCase("Cards"))
    	{
    		        		prod.click();
    	}
    	}
    WebElement clickable=driver.findElement(By.xpath("//a[text()='Select Product']"));
    clickable.click();
  
    List<WebElement> options =driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
    /*for (WebElement opt:options)
    {
    	System.out.println(opt.getText());
    	
		  if(opt.getText().equalsIgnoreCase("Credit Cards"));
		  {
			  opt.click();
		  }
	  }*/
    for(int i=0;i<options.size();i++)
	  {
		  System.out.println(options.get(i).getText());
		  if(options.get(i).getText().equals("FASTag"));
		  
		  {
			 options.get(i).click();
			
		  }

    }
}
}
