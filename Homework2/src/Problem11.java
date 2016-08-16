import java.util.Scanner;

public class Problem11 
{

	//Въведете число N чрез конзолата и изкарайте като
	//резултат следния триъгълник с височина N:
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Въведете число: ");
		int number = scan.nextInt();
		System.out.println();
		int decrement=number;
		int decrement2=number;
		
		for (int i = 1; i <=number ; i++) 
		{
			for (int k = 1; k < decrement; k++) 
			{
				System.out.print(" ");
				
			}
			decrement--;
			for(int j=1;j<=(2*i)-1; j++)
			{
				System.out.print("*");
			}			
			System.out.println();
		}
		
		for (int p = 1; p <=number ; p++) 
		{
			for (int l = 1; l < decrement2; l++) 
			{
				System.out.print(" ");
				
			}
			decrement2--;
			
			for(int m=1;m<=(2*p)-1; m++)
			{
				if(((m==1) || (m==(2*p)-1)) && (p!=number))
				{
					System.out.print("*");
				}
				else
				{
					if(p==number)
					{
						System.out.print("*");
					}
					else
					{
					System.out.print(" ");
					}
				}
			}			
			System.out.println();
		}
		
	}

}
