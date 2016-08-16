import java.util.Scanner;

public class Problem1
{
//	Да се изведат съобщения към потребителя и да се прочетат 2 числа от
//	клавиатурата A и B (може да са с плаваща запетая – double).
//	После да се прочете 3-то число C и да се провери дали то е м/у A и B.
//	Да се изведе подходящо съобщение за това дали C е между A и B.

	public static void main(String[] args)
	{
		System.out.print("Въведи число А: ");
		Scanner scan= new Scanner(System.in);
		double A = scan.nextDouble();
		
		 System.out.println();
		System.out.print("Въведи число B: ");		
		double B = scan.nextDouble();
		
		 System.out.println();
			System.out.print("Въведи число C: ");		
			double C = scan.nextDouble();
		
			if((C>A && C<B) ||(C>B && C<A))
			{
				System.out.println( C +" e между " +A+ " и "+B);
			}
			else
			{
				System.out.println( C +" не е между " +A+ " и "+B);
			}

	}

}
