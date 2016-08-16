import java.util.Scanner;

public class Problem6
{
	// Да се прочете число от екрана(конзолата) и да се
	//изведе сбора на всички числа между 1 и въведеното число.
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Въведете  число: ");
		int number= scan.nextInt();
		System.out.println();
		
		int sum=0;
		
		for (int i = 1; i <= number; i++) 
		{
			sum+=i;
		}
		System.out.println("Сумата на числата от 1 до  "+ number + " e "+ sum);
	}
}
