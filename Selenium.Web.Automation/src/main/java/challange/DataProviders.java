package challange;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	
	@Test(dataProvider="getData")
	public void login(String x1, String x2)
	{
		
		System.out.println(x1);
		System.out.println(x2);
	}
	
	@DataProvider(name="getData")
	public Object getData()
	{
		Object [][]ob= new Object[3][2];
		
		ob[0][0]="Aman";
		ob[0][1]="Password";
		
		ob[1][0]="Rohit";
		ob[1][1]="Password";
		
		ob[2][0]="Abhy";
		ob[2][1]="Password";
		
		
		
		return ob;
	}

}
