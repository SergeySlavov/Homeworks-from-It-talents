import java.util.Scanner;

public class Problem10 
{

	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("�������� �����: ");
		int number= scan.nextInt();
		boolean isPrime= true;
		
		for(int i=2; i<number; i++)
		{
			if(number % i==0)
			{
				isPrime=false;
				break;
			}
		}
		System.out.println("������� � ������: "+ isPrime);
	}

}
