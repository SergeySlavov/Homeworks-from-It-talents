import java.util.Scanner;

public class Problem10 {

//	Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и
//	3 литра и ги ползвате едновременно.
//	Да се състави програма, която по даден обем извежда как ще прелеете
//	течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
//	кофите. Кофите не могат да се ползват с частично количество вода.
//	Входни данни: естествено число от интервала [10..9999].

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print ("Въведете обема на цистерната:  ");
		int volume = scan.nextInt();
		System.out.println();
		
		int numberTwoLiterBuckets=1;
		int numberThreeLiterBuckets=1;
		int bucketTwoLiter=2;
		int bucketThreeLiter=3;
		
		if(volume<10 || volume>9999)
		{
			System.out.println("Обемът трябва да е между 10 и 9999л.");
		}
		else
		{
			int wholePart= volume / (bucketTwoLiter + bucketThreeLiter);
			numberTwoLiterBuckets=wholePart;
			numberThreeLiterBuckets= wholePart;
			
			if(volume % 5==1)
			{
				numberThreeLiterBuckets++;
				numberTwoLiterBuckets--;
			}
			else if(volume % 5== 2)
			{
				numberTwoLiterBuckets++;
			}
			else if(volume % 5== 3)
			{
				numberThreeLiterBuckets++;
			}
			else if(volume % 5== 4)
			{
				numberThreeLiterBuckets+=2;
				numberTwoLiterBuckets--;
			}
		}
		System.out.println("Ще ти трябват " + numberThreeLiterBuckets+ " x 3 литрови +"
				+ " "+numberTwoLiterBuckets+ " x 2 литрови кофи за да се напълни " + volume+ " литров контейнер.");
	}

}
