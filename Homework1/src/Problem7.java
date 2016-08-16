import java.util.Scanner;

public class Problem7 
{
//	Въведете 3 променливи от клавиатурата – час (целочислен тип), сума
//	пари (число с плаваща запетая), дали съм здрав – булев тип.
//	Съставете програма, която взема решения на базата на тези данни по
//	следния начин:
//	 - ако съм болен, няма да излизам
//	 - ако имам пари, ще си купя лекарства
//	 - ако нямам – ще стоя вкъщи и ще пия чай
//	 - ако съм здрав, ще отида на кино с приятели
//	 - ако имам по-малко от 10 лв, ще отида на кафе.
	 
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Болен ли си?  ");
		boolean sick= scan.nextBoolean();
		System.out.print("Колко пари имаш?   ");
		float money = scan.nextFloat();
		
		if(sick==true)
		{
			System.out.println("Няма да излизам!");
			
			if(money> 0)
			{
				System.out.println("Ще си купя лекарства.");
			}
			else if(money==0)
			{
				System.out.println("Ще стоя вкъщи и ще пия чай.");
			}			
		}else
		{
			if(money>=10)
			{
				System.out.println("Ще отида на кино с приятели.");
			}			
			else if(money<10)
			{
				System.out.println("Ще отида на кафе.");
			}
		}
	}

}
