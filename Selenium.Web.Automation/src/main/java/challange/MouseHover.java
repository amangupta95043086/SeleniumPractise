package challange;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover extends BaseClass

{
	@Test(enabled=true)
	public void mouseHover1() throws InterruptedException
	{

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(4000);
		WebElement mouseH=driver.findElement(By.xpath("//div[@class=\"mouse-hover\"]"));
		WebElement val=driver.findElement(By.xpath("//div[@class=\"mouse-hover\"]/div/a[text()='Top']"));
		Actions a=new Actions(driver);
		a.moveToElement(mouseH).build();
		a.moveToElement(val).perform();
	

	}

	
	


}
