import java.util.Scanner;

public class Problem3 
{
//	Въведете 2 различни числа от конзолата и разменете стойността им.
//	Разпечатайте новите стойности

	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("Въведете първото число: ");
		int firstNum= scan.nextInt();
		System.out.println();
		
		System.out.print("Въведете второто число: ");
		int secondNum= scan.nextInt();
		System.out.println();
		
		int tempHolder= 0;
		tempHolder= firstNum;
		firstNum=secondNum;
		secondNum=tempHolder;
		
		System.out.println("Първото число приема стойността  "+firstNum+ "  ,а второто приема стойността "+ secondNum);

	}

}
