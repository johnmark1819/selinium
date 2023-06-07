package Batcheselenium.Elevenbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		// absolute xpath
		/*WebElement searchbox=driver.findElement(By.xpath("/html/body/div/header/div/div/div[2]/div/form/div[2]/div/input"));
		searchbox.sendKeys("shoes",Keys.ENTER);*/
		
		//relative xpath
		//1.using attribute--//tagname[@attributename='attributesvalue']
		/*WebElement searchtext=driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		searchtext.sendKeys("shoes",Keys.ENTER);*/
		
	/*	// 2 .using text--//tagnme[text()='innertext']
		driver.findElement(By.xpath("//a[text()='Customer Service']")).click();
		
		//3.using contains with attribute--//tagname[contains(@attributename,'attributevalue')]
		//driver.findElement(By.xpath("//div[contains(@class,'a-box-inner')]")).click();
		
		//4.using contain with text--//tagnme[contains(text(),'innertext')]
		//driver.findElement(By.xpath("//h3[contains(text(),' Your Orders')]")).click();
		
		
		//5.using with index--(//tagname[xpath])[7]
		//driver.findElement(By.xpath("(//div[contains(@class,'a-box-inner')])[6]")).click();
		
		//6.using with position--(//tagname[xpath])[position=postion number]
		//driver.findElement(By.xpath("((//div[contains(@class,'a-box-inner')])[position()>=5]")).click();--not find doubt
		
		//7.finding last--(//tagname[xpath])[last()]
		driver.findElement(By.xpath("(//div[contains(@class,'a-box-inner')])[last()]")).click();
		
		//8.starts with--//tagname[starts -with@attributename,'attributes value']
		driver.findElement(By.xpath("//input[starts-with(@name,'help')]")).click();
		
		//9.stars with text--//tagname[starts- with(text(),'innertext')]
		driver.findElement(By.xpath("//input[starts-with(]")).click();
		
		//10.And--//tagname[@attributename='attributesvalue'and@attributename='attributesvalue']
		driver.findElement(By.xpath("//a[@data-csa-c-content-id=\"nav_cs_mobiles\" and @tabindex=\"0\"]"));
		
		//11.or--//tagname[@attributename='attributesvalue'or@attributename='attributesvalue']*/
		 
		//axes method---traverse(travel--reverse and forward)
		//1--parent
		driver.findElement(By.xpath("//a[text()='Best Sellers'and@data-csa-c-content-id='nav_cs_bestsellers']/parent::div")).click();
		//2--child--//div[@id="nav-xshop"]/child::a[5]
		//3.preceeding--//a[text()='Customer Service']/preceding::a
		//4.following--//a[text()='Customer Service']/following::a
		//5.preceding-sibiling--//a[text()='Customer Service']/preceding-sibiling::a
		//6.following -sibiling--//a[text()='Customer Service']/following-sibilng::a
		//7.ancesstor--//a[text()='Customer Service']/ancestor::div[@id="a-page"]
		
		
		
		
		
	}

}
