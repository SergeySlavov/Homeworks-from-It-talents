import java.util.Scanner;

public class Problem18 
{
//	Да се състави програма, чрез която се въвежда две числа от
//	интервала [1..9].
//	Програмата да извежда таблицата за умножение.
//	Максималната стойност на множителите е определена от 2-те
//	числа.
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Въведете  първото число в интервала [1..9]: ");
		int firstNum= scan.nextInt();
		System.out.println();
		System.out.print("Въведете  второто число в интервала [1..9]: ");
		int secondNum= scan.nextInt();
		
		if((firstNum<1 || firstNum>9) || (secondNum<1 || secondNum>9))
		{
			System.out.println("Въведеното число не е в посочения интервал.");
		}
		else
		{
			for (int i = 1; i <= firstNum; i++) 
			{
				for (int j = 1; j <= secondNum; j++) 
				{	
					int product= i*j;
					System.out.print(i+" * "+j+" = "+ product);
					System.out.println();
				}	
			}
		}

	}

}
