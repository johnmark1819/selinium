package Batcheselenium.Elevenbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		//css selector--casacaded sheet selector
		
		/*a)id --it is denoted by #--syntax:#ID_attributes value
		input#twotabsearchtextbox*/
		
		/*b).class attribute
		 * --it is denoted by:dot(.)
		 * .nav-left*
		 * div.nav-left*/
		
		/*c).other attribute
		 * tagname[attribute name='attributevalue']
		 * img[class="_bXVsd_image_1pfbQ"]
		   */
		/*d)contains
		 * --it is denoted by *
		 * syntax:tagname[attribute name*='attribute value']
		 * img[alt*="Liberty Warrior Jungle King Boots for Men, Army Military Boot, Black &amp; Olive, Sizes 5UK-12UK"]
		 * 
		 * e)starts with
		 * ---it is denoted by symbol'^"
		 * syntax:tagname[attribute name^='attribute value']
		 * 
		 * f)ends with
		 * ---symbol'$'
		 * syntax:tagname[attribute name$='attribute value']
		 * img[alt$=" Army Military Boot, Black &amp; Olive, Sizes 5UK-12UK"] 
		 * 
		 * g)And--[][]
		 * syntax:[tagname[attributename='attributevalue][attributename='attributevalue]
		 * input[id="twotabsearchtextbox"][placeholder="Search Amazon.in"]
		 * 
		 * e)or[],[]
		 * syntax:[tagname[attributename='attributevalue],[attributename='attributevalue]
		 * input[id="twotabsearchtextbox"][placeholder="Search Amazon.in"]
		 * 
		 * concurent node
		 * symbol--->
		 * #nav-iss-attach>div--not finding
		   */
		
				
		}

}
