import java.util.Scanner;

public class Problem19 
{
//	Да се състави програма, чрез която по въведено
//	естествено число от интервала [10..99] се извежда поредица
//	числа, при спазване на следните изисквания:
//	1) ако предходното число е четно се извежда 0.5*числото;
//	2) ако предходното число е нечетно се извежда 3*числото +1.
//	Извеждането продължава докато не се получи стойност 1.
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Въведете  число в интервала [10..99]: ");
		int number= scan.nextInt();
		System.out.println();
		
		if(number<10 || number>99)
		{
			System.out.println("Въведеното число не е в дадения интервал");
			return;
		}
		else
		{
			while(number>1)
			{
				if(number%2==0)
				{
					number=number/2;
				}
				else
				{
					number=3*number+1;
				}
				System.out.print(number+" ");
			}
		}
	}

}
