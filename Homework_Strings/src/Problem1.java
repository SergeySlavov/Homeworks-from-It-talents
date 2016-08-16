import java.util.Scanner;

public class Problem1 {
	
//	Да се състави програма, чрез която се въвеждат два низа съдържащи
//	до 40 главни и малки букви.
//	Като резултат на екрана да се извеждат низовете само с главни и само
//	с малки букви.
//	Пример: Abcd Efgh
//	Изход: ABCD abcd EFGH efgh


	public static void main(String[] args) {
		System.out.print("Въведете първия низ (до 40 символа): ");
		Scanner scan = new Scanner(System.in);
		String firstText= scan.next();
		System.out.print("Въведете втория низ (до 40 символа): ");
		String secondText= scan.next();
		
		if(firstText.length()>40 || secondText.length()>40){
			System.out.println("Дължините на низовете са повече от 40 символа!");
			return;
		}
		String firstTextLower= firstText.toLowerCase();
		String firstTextUpper= firstText.toUpperCase();
		String secondTextLower= secondText.toLowerCase();
		String secondTextUpper= secondText.toUpperCase();
		
		System.out.print(firstTextLower+" "+ firstTextUpper+" "+secondTextLower+" "+secondTextUpper);
		
	}

}
