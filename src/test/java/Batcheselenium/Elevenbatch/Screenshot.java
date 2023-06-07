package Batcheselenium.Elevenbatch;

import java.io.File;

import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.instagram.com/");
     Date a=new Date();
     String data= a.toString();
     String update1=data.replaceAll(" ", "_");
      String dateandtime=update1.replaceAll(":", "_");
      System.out.println(dateandtime);
	TakesScreenshot tks= (TakesScreenshot)driver;
	File tempfile=tks.getScreenshotAs(OutputType.FILE);
	  
	File permfile=new File("C:/Users/ASUS1/eclipse-workspace/new26thAPR/Elevenbatch/proof/screenshot"+dateandtime+".png");
	FileUtils.copyFile(tempfile, permfile);
	
	}

}
