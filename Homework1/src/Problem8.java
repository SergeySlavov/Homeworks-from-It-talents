import java.util.Scanner;

public class Problem8
{
//	Да се състави програма, която чете от конзолата 4-цифренo
//	естествено число от интервала [1000.. 9999]. От това число се
//	формират 2 нови 2-цифрени числа. Първото число се формира от 1-та
//	и 4-та цифра на въведеното число. Второто число се формира от 2-рa -
//	3-та цифра на въведеното число. Като резултат да се изведе дали 1-то
//	ново число e по-малко <, равно = или по-голямо от 2-то число.

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print ("Въведете число в интервала [1000 - 9999]:  ");
		int number = scan.nextInt();
		int[]digits = new int[4];
		int index=0;
		
		if(number>9999 | number<1000)
		{
			System.out.println("Въвели сте число извън интервала [1000 - 9999]");
		}
		else
		{
			for(int i=number; i>0; i/=10)
			{
				
				digits[index]=i%10;
				index++;
			}
		}
		
		int[] firstNewNum={digits[3], digits[0]};
		int num1= 0;
		double powerFirst=1;
		for(int i=0; i<firstNewNum.length;i ++)
		{
			
			num1+=firstNewNum[i]*(Math.pow(10, powerFirst));
			powerFirst--;
		}
		
		int[] secondNewNum= {digits[2],digits[1]};
		int num2=0;
		double powerSecond=1;
		for(int j=0; j<secondNewNum.length;j++)
		{
			
			num2+=secondNewNum[j]*(Math.pow(10, powerSecond));
			powerSecond--;
		}
		
		if(num1> num2)
		{
			System.out.println(num1 + " > "+ num2);
		}
		else if(num2> num1)
		{
			System.out.println(num1 + " < "+ num2);
		}
		else
		{
			System.out.println(num1+ " = "+ num2);
		}
	}

}
