package Batcheselenium.Elevenbatch;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropdown {

	public static void main(String[] args) throws InterruptedException   {
		/*dropdown handling--1.select class Dropdown 2.bootstrap dropdown
		//1..select class Dropdown
		//  syntax:
		 * Select object=new select(WebElementaddress); 
		 * we can select class by three options 1.selectByIndex 2.SelectByvalue 3.SelectByvisibletext                    */
		/*WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.cssSelector("a[href=\"/r.php?locale=en_GB&display=page\"]")).click();
		WebElement day=driver.findElement(By.id("day"));
		Select s1=new Select(day);
		s1.selectByIndex(21);
		Select s2=new Select(driver.findElement(By.id("month")));
		s2.selectByValue("4");
		Select s3=new Select(driver.findElement(By.id("year")));
		s3.selectByVisibleText("2021");*/
		
		//2.bootstrap dropn down
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
        WebDriverWait wait=new  WebDriverWait (driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(clickable));

        	  List<WebElement> options =driver.findElements(By.xpath("//ul[@class=\"dropdown2 dropdown-menu\"]/li"));
        	  
        	  /*for(int i=0;i<options.size();i++)
        	  {
        		  System.out.println(options.get(i).getText());
        		  if(options.get(i).getText().equals("FASTag"));
        		  
        		  {
        			 options.get(i).click();
        			
        		  }*/
        		 
        	  
        	  for (WebElement opt:options)
              {
              	System.out.println(opt.getText());
        		  if(opt.getText().equalsIgnoreCase("FASTag"));
        		  
        		  {
        			  opt.click();
        		  }
        	  }
	}      
}
	


