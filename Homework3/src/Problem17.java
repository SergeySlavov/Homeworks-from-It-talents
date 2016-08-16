import java.util.Scanner;

public class Problem17 {

//	Една редица от естествени числа ще наричаме зигзагообразна нагоре,
//	ако за елементите и са изпълняват условията:
//	N1 < N2 > N3 < N4 > N5 <..
//	Съставете програма, която проверява дали въведени в едномерен
//	масив редица от числа изпълняват горните изисквания.
//	Пример: 1 3 2 4 3 7
//	Изход: изпълнява изискванията за зигзагообразна нагоре редица
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Въведете дължината на масива: ");
		int length = scan.nextInt();
		boolean isZigZag=true;
		
		if(length<0){
			System.out.println("Въведете положително,цяло число.");
			return;
			} 
			int[] array= new int[length];
			System.out.print("Въведете елементите от масива:");
			for (int i = 0; i < array.length; i++) {
				array[i]= scan.nextInt();	
			}
			for (int i = 1; i <= array.length-2; i+=2) {
				if(array[i]> array[i-1] && array[i]>array[i+1]){
					isZigZag=true;
				}
				else{
					isZigZag=false;
					break;
				}
			}if(isZigZag==true){
				System.out.println("Поредицата е зигзагообразна нагоре.");
			}else{
				System.out.println("Поредицата не е зигзагообразна нагоре.");
			}
	}
}

