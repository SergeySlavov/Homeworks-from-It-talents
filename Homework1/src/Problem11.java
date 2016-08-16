import java.util.Scanner;

public class Problem11
{
//	Съставете програма, която по дадено трицифренo число проверява
//	дали числото се дели на всяка своя цифра. Във въведеното число да
//	няма цифра 0.

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print ("Въведете трицифрено число:  ");
		int number = scan.nextInt();
		System.out.println();
		int[] digits= new int[3];
		int index=0;
		
		if(number<100 || number>999)
		{
			System.out.println("Въведеното число не е в зададените граници [100 - 999]");
		}
		else
		{
			for(int i=number; i>0; i/=10)
			{
				digits[index]= i %10;
				
				if(digits[index]==0)
				{
					System.out.println("Числото съдържа цифрата 0!");
					return;
				}
				index++;
			}
					for(int j=0;j<digits.length;j++)
					{
						if(number % digits[j]==0)
						{
							System.out.println("Числото "+ number+ " се дели без остатък на "+ digits[j]); 
						}
						else if(number % digits[j]!=0)
						{
							System.out.println("Числото "+ number+ " не се дели без остатък на "+ digits[j]);
						}
					}
				}
	}

}
