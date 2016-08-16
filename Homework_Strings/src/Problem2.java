import java.util.Scanner;

public class Problem2 {
	
//	Да се състави програма, чрез която от клавиатурата се въвеждат
//	последователно две думи с дължина 10-20 знака.
//	Програмата да размени първите им 5 знака и да изведе дължината на
//	по-дългата, както и новото им съдържание.
	
	public static void main(String[] args) {
		System.out.print("Въведете първата дума: ");
		Scanner scan = new Scanner(System.in);
		String firstText= scan.next();
		System.out.print("Въведете втората дума: ");
		String secondText= scan.next();
		
		if((firstText.length()<10 ||firstText.length()>20) || (secondText.length()<10 ||secondText.length()>20)){
			System.out.print("Въведените думи са не отговярят на условията.");
			return;
		}
		String holderSecond="";
		String holderFirst="";
		holderFirst=firstText.substring(0,5);
		holderSecond=secondText.substring(0, 5);
		firstText=firstText.replace(firstText.substring(0,5), holderSecond);
		secondText=secondText.replace(secondText.substring(0,5), holderFirst);
		
		if(firstText.length()>=secondText.length()){
			System.out.print(firstText.length()+" "+firstText);
		}else{
			System.out.print(secondText.length()+" "+secondText);
		}
		
	}

}
