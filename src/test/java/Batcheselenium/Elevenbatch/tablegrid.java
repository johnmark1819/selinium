package Batcheselenium.Elevenbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablegrid {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement tdatas = driver.findElement(By.xpath("//table[@id='customers']/tbody"));
		System.out.println(tdatas.getText());
		List<WebElement> theadings = driver.findElements(By.xpath("//table[@id='customers']//th"));
		for (WebElement th:theadings) {
			System.out.println(th.getText());
		}
		List<WebElement> trow3= driver.findElements(By.xpath("//table[@id='customers']//td[text()='Francisco Chang']/parent::tr/td"));
		for(WebElement tr:trow3) {
			System.out.println(tr.getText());
		}*/
		driver.get("https://www.tnstc.in/home.html");
		//WebElement table=driver.findElement(By.xpath("//td[@background=\'images/td_bg.jpg']/table/tbody"));
		//System.out.println(table.getText());
		List<WebElement> tdatas = driver.findElements(By.xpath("//td[@background='images/td_bg.jpg']//tbody//td[4]//li"));
		for(WebElement td:tdatas) {
			if(td.getText().startsWith("Tirupathi"))
			{
			System.out.println(td.getText());
			}
		}
	}

}
