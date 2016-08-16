import java.util.Scanner;

public class Problem17 
{
//	Да се състави програма, която извежда квадрат, чийто страни са
//	оформени със знака *, а вътрешността е запълнена със въведен
//	знак.
//	Входни данни b - дължина на страната число от интервала
//	[3..20], c - желан знак.
//	Програмата да използва цикъл for. 
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Въведете  числo в интервала [3..20] и желания знак : ");
		int length= scan.nextInt();
		String symbol= scan.nextLine();
		System.out.println();
		
		if(length<3 || length>20)
		{
			System.out.println("Дължината не е в дадения интервал.");
			return;
		}
		else
		{
			for (int i = 1; i <= length; i++) 
			{
				for (int j = 1; j <= length; j++) 
				{
					if(i==1 || i==length)
					{
					 System.out.print("*");
					}
					else
					{
						if(j==1 || j==length)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(symbol);
						}
					}
				}System.out.println();
			}
		}
		
	}

}
