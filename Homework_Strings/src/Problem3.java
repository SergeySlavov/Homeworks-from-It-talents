import java.util.Scanner;

public class Problem3 {
	
//	Да се състави програма, чрез която се въвеждат последователно две
//	редици от символи без интервали.
//	Програмата да извежда съобщение за резултата от сравнението им по
//	позиции.

	public static void main(String[] args) {
		System.out.print("Въведете първата редица от символи: ");
		Scanner scan = new Scanner(System.in);
		String firstText= scan.next();
		System.out.print("Въведете втората редица от символи: ");
		String secondText= scan.next();
		
		if(firstText.length()>secondText.length()){
			System.out.println("Дължината на първата редица е по-голяма от втората редица.");
			
			for (int i = 0; i < secondText.length(); i++) {
				if(firstText.charAt(i)==secondText.charAt(i)){
					System.out.println("Символите на индекс "+i+ " са еднакви.");
				}else{
					System.out.println(i+"->"+ firstText.charAt(i)+" "+secondText.charAt(i));
				}
			}
		}else{
			if(firstText.length()<secondText.length()){
			System.out.println("Дължината на втората редица е по-голяма от първата редица.");
			
			for (int i = 0; i < firstText.length(); i++) {
				if(firstText.charAt(i)==secondText.charAt(i)){
					System.out.println("Символите на индекс "+i+ " са еднакви.");
				}else{
					System.out.println("Различни символи на позиция "+i+"->"+ firstText.charAt(i)+" - "+secondText.charAt(i));
				}
			}
		}
			else{
				System.out.println("Редиците са с еднаква дължина.");
				for (int i = 0; i < firstText.length(); i++) {
					if(firstText.charAt(i)==secondText.charAt(i)){
						System.out.println("Символите на индекс "+i+ " са еднакви.");
					}else{
						System.out.println("Различни символи на позиция "+i+"->"+ firstText.charAt(i)+" - "+secondText.charAt(i));
					}
				}
			}
		}
	}
}
