import java.util.Scanner;

public class Problem5 {

//	Да се състави програма, чрез която се въвеждат 2 редици от знаци
//	(думи).
//	Ако в двете редици участва един и същи знак, да се изведе на екрана
//	първата редица хоризонтално, а втората вертикално, така че да се
//	пресичат в общия си знак.
//	Ако редиците нямат общ знак да се изведе само уведомително
//	съобщение.
	
	public static void main(String[] args) {
		System.out.print("Въведете първата редица от символи: ");
		Scanner scan = new Scanner(System.in);
		String firstText= scan.next();
		System.out.print("Въведете втората редица от символи: ");
		String secondText= scan.next();
		int currentCol=0;
		int bestCol=0;
		String emptySpace=" ";
		int bestRow=0;
		
		for (int i = 0; i < secondText.length(); i++) {
			for (int j = 0; j < firstText.length(); j++) {
				if(secondText.charAt(i)==firstText.charAt(j)){
					currentCol=j;
					if(currentCol>bestCol){
						bestCol=currentCol;
						bestRow=i;
					}
				}
			}
		}
		for (int i = 0; i < secondText.length(); i++) {
			if(i!=bestRow){
				for (int j = 0; j <= bestCol; j++) {
					if(j!=bestCol){
						System.out.print(emptySpace);
					}else{
						System.out.print(secondText.charAt(i) );
					}	
				}System.out.println();	
			}else{
				System.out.println(firstText);
			}
		}
		
		
			
		

		
//		for (int i = 0; i < secondText.length(); i++) {
//			if(secondText.charAt(i)==firstText.charAt(0)){
//				System.out.println(firstText);
//				a=true;
//			}else{
//				System.out.println(secondText.charAt(i));
//			}
//		}
//		if(a==false){
//			System.out.println("Първита редица няма начален символ като символ от втората редица");
//		}
	}

}
