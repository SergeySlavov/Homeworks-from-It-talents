import java.util.Scanner;

public class Problem7 
{

	public static void main(String[] args) 
	{
		 //	Започвайки от 3, да се изведат на екрана първите n
		 //	числа които се делят на 3. Числата да са разделени със запетая.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Въведете  число: ");
		int number= scan.nextInt();
		System.out.println();
		
		for (int i = 3; i <= number*3; i++) 
		{
			if(i % 3 == 0)
			{
				if(i<=(number-1)*3)
				{
					System.out.print(i+", ");	
				}
				else
				{
					System.out.print(i);
				}
				
			}
			
		}
	}

}
