import java.util.Scanner;

public class Problem15 
{
//	Да се състави програма, която въвежда естествено число от интервала
//	[0..24].
//	Програмата да изведе съответстващо съобщение съобразно въведения
//	час.
//	Периодите са:
//	[18..4] - Добър вечер;
//	[4..9] - Добро утро;
//	[9..18] - Добър ден
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print ("Въведете час в итервала [0-24]:  ");
		byte hour = scan.nextByte();
		
		if(hour>24 || hour<0)
		{
			System.out.println("Въвели сте невалиден час!");
			return;
		}
		else
		{
			if(hour>=0 && hour<9)
			{
				System.out.println("Добро утро!");
			}
			else if(hour>=9 && hour<18)
			{
				System.out.println("Добър ден!");
			}
			else if(hour>=18 && hour<=24)
			{
			System.out.println("Добър вечер!");	
			}
		}
	}

}
