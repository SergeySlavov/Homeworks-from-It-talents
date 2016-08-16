import java.util.Scanner;

public class Problem14 
{
	//Да се състави програма, която по въведено
	//естествено число N от интервала [10..200] извежда в обратен
	//ред всички числа, които са кратни на 7 и са по-малки от N.

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Въведете  число в интервала [10..200]: ");
		int number= scan.nextInt();
		
		
		if(number<10 || number>200)
		{
			System.out.println("Въведеното число е извън интервала [10..200].");
		}
		else
		{
			for (int i = number-1; i > 0; i--) 
			{
				if(i % 7==0)
				{
					System.out.println(i);
				}
			}
		}

	}

}
