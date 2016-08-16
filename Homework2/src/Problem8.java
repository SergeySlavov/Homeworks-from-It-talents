import java.util.Scanner;

public class Problem8 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Въведете  число: ");
		int number= scan.nextInt();
		System.out.println();
		int counter=1;
		int num=number-1;
		
		for (int i = 1; i <= number; i++) 
		{		
			while(counter<=number)
			{
				System.out.print(num);
				counter++;
			}
			System.out.println();
			counter=1;
			num+=2;
		
		}
	}

}
		