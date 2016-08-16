import java.util.Scanner;

public class Problem16 
{
//	Да се състави програма, чрез която се въвеждат 2 естествени
//	числа N, M от интервала [10..5555].
//	Програмата, чрез цикъл for, да извежда всички числа от
//	интервала, които са кратни на 50 в низходящ ред.
	
	public static void main(String[] args) 
	{		
		Scanner scan = new Scanner(System.in);
		System.out.print("Въведете  числo в интервала [10..5555] : ");
		int N= scan.nextInt();
		System.out.println();
		System.out.print("Въведете  числo в интервала [10..5555]: ");
		int M= scan.nextInt();
		System.out.println();
		
		if((N<10 || N>5555) ||(M<10 || M>5555))
		{
			System.out.println("Числата са извън интервала.");
			return;
		}
		else
		{
			if(N<M)
			{
				for (int i = M; i >= N; i--) 
				{
					if(i% 50==0)
					{
						System.out.println(i);
					}
				}
			}
			if(N>M)
			{
				for (int i = N; i >=M; i--) 
				{
					if(i% 50==0)
					{
						System.out.println(i);
					}
				}
			}
		}
		
	}

}
