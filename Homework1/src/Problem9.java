import java.util.Scanner;

public class Problem9 
{
//	Да се състави програма, която чете от конзолата 2 естествени
//	двуцифрени числа a,b.
//	Програмата да изведе в конзолата дали последната цифра от
//	произведението на двете числа е четна, както и самата цифра. 
//	Входни данни: a,b - естествени числа от интервала [10..99].
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print ("Въведете първото естествено, двуцифрено число:  ");
		int firstNum = scan.nextInt();
		System.out.println();
		
		System.out.print ("Въведете второто естествено, двуцифрено число:  ");
		int secondNum = scan.nextInt();
		System.out.println();
		
		int product=1;
		
		if((firstNum>99 || firstNum<10) || (secondNum>99 || secondNum<10))
		{
			System.out.println("Числата не отговарят са двуцифрени или естествени!");
		}
		else
		{
			product=firstNum*secondNum;
			int lastDigit= product % 10;
			System.out.print("Последната цифра на произведението между  "+ firstNum+ "  и  "+ secondNum + "  e " + lastDigit );
			
			System.out.println();
			if(lastDigit % 2==0)
			{
				System.out.println(lastDigit+ " e четна");
			}
			else
			{
				System.out.println(lastDigit+ " e нечетна");
			}
		}
	}

}
