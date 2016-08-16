import java.util.Scanner;

public class Problem6
{
//	Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите
//	им така, че а1 да има стойността на а2, а2 да има стойността на а3, а
//	а3 да има старата стойност на а1.
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Въведете първото число: ");
		int firstNum= scan.nextInt();
		System.out.println();
		
		System.out.print("Въведете второто число: ");
		int secondNum= scan.nextInt();
		System.out.println();
		
		System.out.print("Въведете третото число: ");
		int thirdNum= scan.nextInt();
		System.out.println();
		
		int firstHolder= firstNum;
		int secondHolder = secondNum;
		int thirdHolder= thirdNum;
		
		firstNum= secondHolder;
		secondNum= thirdHolder;
		thirdNum= firstHolder;
		
		System.out.print("Първото приема стойност:  "+ firstNum);
		System.out.println();
		System.out.print("Второто приема стойност:  "+ secondNum);
		System.out.println();
		System.out.print("Третото приема стойност:  "+ thirdNum);
	}

}
