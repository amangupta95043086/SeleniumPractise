
public class AA {

	public static void main(String[] args) {
		String a="try";
		String b="yrt";

		char a1[]=a.toCharArray();
		char b1[]=b.toCharArray();
		int counta=0;
		int countb=b1.length;

		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a1.length;j++)
			{
				if(a1[i]==b1[j])
				{
					counta++;
				}
			}
		}


		if(counta==countb)
		{
			System.out.println("String is match");
		}
		else
		{
			System.out.println("String is  not  match");	
		}
	}
}
