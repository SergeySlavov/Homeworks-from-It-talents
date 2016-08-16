import java.util.Scanner;

public class Problem9 
{
//	Да се прочетат 2 числа от клавиатурата А и В.
//	Да се изведат всички числа от А до В на степен 2(разделени с
//	запетая).Ако някое число е кратно на 3, да се изведе съобщение че
//	числото се пропуска „skip 3“.Ако сумата от всички изведени числа (без
//пропуснатите) стане по-голяма от 200, да се прекрати извеждането.


	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Въведете първото число: ");
		int A= scan.nextInt();
		System.out.println();
		System.out.print("Въведете второто число: ");
		int B=scan.nextInt();
		System.out.println();
		
		int sum=0;
		
		if(A<B)
		{
			for (double i = Math.pow(A, 2) ;i <=Math.pow(B, 2); i++)
			{
				if(i % 3 ==0)
				{
					System.out.println("skip "+i);
					continue;
				}
				else
				{
					sum+=i;
					if(sum<=200)
					{
						System.out.println(i+ ", ");
					}
					if(sum>200)
					{
						break;
					}
				}
			}
			
		}
		else
		{
			if(A>B)
			{
				for (double j = Math.pow(A, 2) ;j >=Math.pow(B, 2); j--)
				{
					if(j % 3 ==0)
					{
						System.out.println("skip "+j);
						continue;
					}
					else
					{
						sum+=j;
						if(sum<=200)
						{
							System.out.println(j+ ", ");
						}
						if(sum>200)
						{
							break;
						}
					}
				}
			}
		}
		
	}

}
