import java.util.Scanner;

public class Problem22
{
//	Да се състави програма, която извежда първите 10 най-малки
//	числа, които се делят на 2, 3 или на 5 и които са по-големи от
//	въведено естествено число.
//	Числата се извеждат, заедно с техния пореден номер.
//	Входни данни: число от интервала [1..999]
	
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("Въведете число в интервала[1..999]: ");
		int number= scan.nextInt();	
		int index=0;
		int nextNumber=number+1;
		int[]array= new int[10];
		
		if(number<1 || number>999)
		{
			System.out.println("Въведеното число е извън интервала.");
			return;
		}
		else
		{
				while(index<10)
				{
					if(nextNumber%2==0 || nextNumber%3==0 || nextNumber%5==0)
					{
						array[index]=nextNumber;
						index++;
						nextNumber++;
					}
					else
					{
						index++;
						nextNumber++;
					}
				}
				for (int i = 0; i < array.length; i++) 
				{
				 System.out.println(i+1+" :"+array[i]);	
				}
		}
		
	}

}
