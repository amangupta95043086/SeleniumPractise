package challange;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorTypes extends BaseClass {


	//	The contain feature has an ability to find the element with partial text as shown
	//in the below example. In this example, we tried to identify the element by just using 
	//partial text value of the attribute. In the below XPath expression, partial value 'Name' is used.
	//	Complete value of 'id' is 'FirstName' but using only partial value 'Name.'

	@Test(enabled=false)
	public void xpathContain() throws InterruptedException
	{
	
		driver.get("https://www.makemytrip.com/flights/domestic-flight-offer.html?ef_id=CjwKCAjw4qCKBhAVEiwAkTYsPP7W63CB0N6WpcI9VTxiU1Jx2HU92_aWvlzJ0QF06MeSkY7RNz3xHhoCBXsQAvD_BwE:G:s&cmp=SEM|D|DF|G|DSA|DSA_New_DF|DF_All|Expanded|546467244184&gclid=CjwKCAjw4qCKBhAVEiwAkTYsPP7W63CB0N6WpcI9VTxiU1Jx2HU92_aWvlzJ0QF06MeSkY7RNz3xHhoCBXsQAvD_BwE");
		Thread.sleep(5000);
		// click on search button
		driver.findElement(By.xpath("//*[contains(@id,'searchBut')]")).click();
		
	}
	
	@Test(enabled=true)
	public void xpathStarsWith() throws InterruptedException
	{
		driver.get("http://demo.guru99.com/test/guru99home/");
		Thread.sleep(5000);
		// click on search button
		driver.findElement(By.xpath("//*[contains(@id,'searchBut')]")).click();
		
		
	}
}
