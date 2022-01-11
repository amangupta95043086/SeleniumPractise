package challange;

import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class MultipleWindow extends BaseClass{
	
	
	@Test(enabled=false)
	public void moveToTargetWindow()
	{
		int number=4;
		driver.get("https://www.naukri.com/");
		List<String> windowList=null;
		
		String currentWindow=driver.getWindowHandle();
		
		Set<String> allWindow=driver.getWindowHandles();
		windowList= new ArrayList<String>(allWindow);
		if(!currentWindow.equalsIgnoreCase(windowList.get(number-1)))
		{
		driver.switchTo().window(windowList.get(number-1));	
		String tittle=driver.getTitle();
		System.out.println(tittle);
		}
		
	}
	
	
	@Test(enabled=false)
	public void moveToTargetWindow1()
	{
		int number=1;
		driver.get("https://www.naukri.com/");
		String currentWindow=driver.getWindowHandle();
		Set<String> allWindow=driver.getWindowHandles();
		List<String> windowList=new ArrayList<String>(allWindow);
		
		if(!currentWindow.equalsIgnoreCase(windowList.get(number)))
		{
			driver.switchTo().window(windowList.get(number));
			String tittle=driver.getTitle();
			System.out.println(tittle);
		}
		
		
	}
	
	@Test
	public void iterateEachWindow()
	{
		driver.get("https://www.naukri.com/");
		String currentWindow=driver.getWindowHandle();
		Set<String> allWinddow=driver.getWindowHandles();
		int totalWindow=0;
		for(String eachWindow:allWinddow)
		{
			driver.switchTo().window(eachWindow);
			String tittle=driver.getTitle();
			System.out.println(tittle);
			totalWindow++;
			
		}
		System.out.println("Total Window "+totalWindow);
		
	}
	

}
