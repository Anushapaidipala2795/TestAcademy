package Aparna;

import java.awt.Window;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;


public class RahulShetty {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANUSHA\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
// driver.switchTo().alert().dismiss();
 
// WebElement calender1= driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']/div/div"));
// calender1.click();
// WebElement month= driver.findElement(By.xpath("//div[contains(@data-testid,'undefined-month')]/div/div"));
// while(year==2024)
// {
// if(month.getText().equalsIgnoreCase("October 2024"))
// {
//	driver.findElement(By.xpath("//*[@class='css-76zvg2 r-ubezar r-16dba41' and text()='3']")).click(); 
// }
// else
// {
//	 driver.findElement(By.xpath("//div[contains(@class,'css-1dbjc4n r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-eafdt9 r-1i6wzkk r-lrvibr r-184en5c')]")).click();
// }
// }
	 
// Select s=new Select(dd);
// s.selectByIndex(2);
//driver.close();
// Actions a=new Actions(driver);
//a.moveToElement(driver.findElement(By.id(""))).keyDown(Keys.SHIFT).click().build().perform();
//Set<String> set=driver.getWindowHandles();


//Map<String, Integer> hm=new HashMap<String, Integer>();
//hm.put("Ajay", 10);
//hm.put("Vijay", 40);
//hm.put("sanjay", 20);
//hm.put("Sravan", 90);
//hm.put("Sai", 50);
//
////System.out.println(s2);
//for(Map.Entry<String, Integer> ab:hm.entrySet())
//{
//	String s1=(ab.getKey());
//	char[] s3= s1.toCharArray();
//	
//
//	System.out.println(s3);
//	
//}

//driver.findElement(By.partialLinkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
//Set<String> set=driver.getWindowHandles();
//Iterator<String> it=set.iterator();
//String parentID=it.next();
//String childdID=it.next();
 
 
 



 
	}

}
