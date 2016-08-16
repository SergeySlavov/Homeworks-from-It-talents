import java.util.Scanner;

public class Problem2 
{
//	Въведете 2 различни целочислени числа от конзолата. Запишете
//	тяхната сума, разлика, произведение, остатък от деление и
//	целочислено деление в отделни променливи и разпечатайте тези
//	резултати в конзолата. Опитайте същото с числа с плаваща запетая.
//	
	public static void main(String[] args)
	{
		System.out.print("Въведете пъвото цяло число: ");
		Scanner scan = new Scanner(System.in);		
		int firstNum= scan.nextInt();
		System.out.println();
		
		System.out.print("Въведете второто цяло число: ");
		int secondNum= scan.nextInt();
		System.out.println();
		
		int sum= firstNum+ secondNum; 
		System.out.println("Сумата от  "+ firstNum + " и " + secondNum + " е "+sum);
		int difference= firstNum-secondNum;
		System.out.println("Разликата между "+ firstNum + " и " + secondNum + " е "+difference);
		int product = firstNum * secondNum;
		System.out.println("Произведението на "+ firstNum + " и " + secondNum + " е "+product);
		int divisionWholePart= firstNum/ secondNum;
		System.out.println("Целочилсената част от делението на "+ firstNum + " и " + secondNum + " е "+divisionWholePart);
		int remainder= firstNum % secondNum;
		System.out.println("Остатъка от делението между "+ firstNum + " и " + secondNum + " е "+remainder);
		
		System.out.println();
		System.out.print("Въведете първото нецяло число: ");
		
		float firstFloat= scan.nextFloat();
		System.out.println();
		
		System.out.print("Въведете второто нецяло число: ");
		float secondFloat= scan.nextFloat();
		System.out.println();
		
		float sumFloats= firstFloat+ secondFloat; 
		System.out.println("Сумата на "+ firstFloat + " и " + secondFloat + " е "+sumFloats);
		float differenceFloat= firstFloat- secondFloat;
		System.out.println("Разликата между "+ firstFloat + " и " + secondFloat + " е "+differenceFloat);
		float productFloat = firstFloat * secondFloat;
		System.out.println("Произведението на "+ firstFloat + " и " + secondFloat + " е "+productFloat);
		float divisionWholePartFloat= firstFloat/ secondFloat;
		System.out.println("Целочилсената част от делението на "+firstFloat + " и " + secondFloat + " е "+divisionWholePartFloat);
		float remainderFloat= firstFloat % secondFloat;
		System.out.println("Остатъка от делението между "+ firstFloat + " и " + secondFloat + " е "+remainderFloat);

	}

}
