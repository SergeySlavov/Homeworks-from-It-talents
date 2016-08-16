import java.math.BigInteger;
import java.util.Scanner;

public class Problem15 
{
	// Да се състави програма, която да изчисли сумата на
	// всички числа от 1 до въведено число N.
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Въведете  числo : ");
		long number= scan.nextLong();
		long sum=0;
		long counterPos=1;
		int counterNeg=-1;
		
		if(number>0)
		{
			do
			{
				sum+=counterPos;
				counterPos++;
				
			}while(counterPos<=number);
			
			System.out.println("Сумата на числата от 1 до "+number+ " e "+sum);
		}
		else 
		{
			if(number<0)
			{
				do 
				{
					sum+=counterNeg;
					counterNeg--;
					
				} while (counterNeg>=number);
			}
			System.out.println("Сумата на числата от -1 до "+number+ " e "+sum);
		}
		
	}

}
