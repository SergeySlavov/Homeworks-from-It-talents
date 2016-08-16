import java.util.Scanner;

public class Problem4 
{
//	Въведете 2 различни числа от конзолата и ги разпечатайте в
//	нарастващ ред.

	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("Въведете първото число: ");
		int firstNum= scan.nextInt();
		System.out.println();
		
		System.out.print("Въведете второто число: ");
		int secondNum= scan.nextInt();
		System.out.println();
		
		if(firstNum>secondNum)
		{
			System.out.println(secondNum +"  ,  "+ firstNum);
		}
		else
		{
			System.out.println(firstNum +"  ,  "+ secondNum);
		}
	}

}
