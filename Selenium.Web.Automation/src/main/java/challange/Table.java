package challange;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Table extends BaseClass {

	@Test(enabled=false)
	public void countROWSCOLUMNSTable()
	{
		driver.get("http://demo.guru99.com/test/web-table-element.php");

		List<WebElement> col;
		col=driver.findElements(By.xpath("//table[@class=\"dataTable\"]/thead/tr/th"));
		System.out.println("Total number of column in table ="+col.size());

		List<WebElement>  row;
		row=driver.findElements(By.xpath("//tbody/tr"));
		System.out.println("Total number of rows in table ="+row.size());

	}
	@Test(enabled=false)
	public void getValueDynamicTable() throws InterruptedException
	{
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(2000);
		WebElement table=driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody"));

		List<WebElement> row_table=table.findElements(By.tagName("tr"));

		int totalRows=row_table.size();
		for(int row=0;row<totalRows;row++)
		{
			List<WebElement> col_table=row_table.get(row).findElements(By.tagName("td"));
			int col_count=col_table.size();

			for(int col=0;col<col_count;col++)
			{
				String celText=col_table.get(col).getText();
				System.out.println(celText);

			}

		}

	}

	@Test(enabled=true)
	public void clickValueFromDynamicTable() throws InterruptedException
	{
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(2000);

		WebElement table=driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody"));


		List<WebElement> totalRow=table.findElements(By.tagName("tr"));

		for(int row=1;row<totalRow.size();row++)

		{
			List<WebElement> totalColEachRow=totalRow.get(row).findElements(By.tagName("td"));

			for(int col=1;col<totalColEachRow.size();col++)
			{

				//System.out.println("Cell No["+row+"]["+col+"]");
				WebElement particulrCell=driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody/tr["+row+"]/td["+col+"]"));
				String val=particulrCell.getText();

				if(val.equalsIgnoreCase("Asian Paints Ltd.") || val.equalsIgnoreCase("IDFC Bank") 
						|| val.equalsIgnoreCase("Capital First"))
				{
					Thread.sleep(1000);

					particulrCell.click();
					break;
				}

				System.out.println(val);


			}

		}



	}

}
