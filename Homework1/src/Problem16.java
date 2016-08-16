import java.util.Scanner;

public class Problem16 
{
//	Въведено е трицифрено естествено число от вида abc.
//	Трябва да се провери дали:
//	ако a = b = c - Изход: цифрите са равни;
//	ако a>b>c - Изход: цифрите са във възходящ ред;
//	ако a<b<c цифрите са в низходящ ред;
//	и изход: цифрите са ненаредени, за неописаните случаи.
//	Да се състави програма, която извежда резултата от проверката за
//	наредба на цифрите в числото.

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Въведете трицифрено число: ");
		int number= scan.nextInt();
		int[] digits= new int[3];
		int index=0;
		
		if(number<100 || number>999)
		{
			System.out.println("Числото не е трицифрено!");
			return;
		}
		else
		{
			for(int i= number; i>0; i/=10)
			{
				digits[index]=i%10;
				index++;
			}
		}
		if((digits[0]==digits[1])&&(digits[1]==digits[2]))
		{
			System.out.println("Цифрите са еднакви.");
		}
		else if((digits[0]>digits[1]) && (digits[1]>digits[2]))
		{
			System.out.println("Цифрите са във възходяш ред.");
		}
		else if((digits[0]<digits[1]) && (digits[1]<digits[2]))
		{
			System.out.println("Цифрите са във низходящ ред.");
		}
		else
		{
			System.out.println("Цифрите са ненаредени.");
		}
	}

}
