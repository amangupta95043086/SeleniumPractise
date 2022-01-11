package core.java.challange;

public class Pattren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//rectanglePrint();
		p1();
		System.out.println("Aman");		
	}

	public static void  p1()
	{

		int j;

		for(int i=0;i<5;i++)
		{
			//System.out.print("*");
			for( j=4;j<0;j--)
			{
				System.out.print(" ");


			}
			for(int k=5;k<j;k--)
			{
				System.out.print("* ");
			}



			System.out.println();
		}
	}


	public static void  rectanglePrint()
	{
		System.out.println("Pattern Print:=>> Rectangle  ");

		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{

				if(i==1 || i==2 || i==3 )
				{
					if(j==1 || j==2 || j==3 )
					{
						System.out.print(" ");	
					}
				}

				if(i==0 || i==4)
				{
					System.out.print("*");
				}

				if(i==1 && (j==0 || j==4))
				{
					System.out.print("*");

				}
				if(i==2 && (j==0 || j==4))
				{
					System.out.print("*");

				}
				if(i==3 && (j==0 || j==4))
				{
					System.out.print("*");

				}

			}
			System.out.println();
		}
	}

}
