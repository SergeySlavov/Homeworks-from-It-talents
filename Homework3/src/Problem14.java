import java.util.Scanner;

public class Problem14 {
	
//	Имате предварително въведен едномерен масив, съдържащ реални
//	числа.
//	Да се състави програма, чрез която се избират само елементи със
//	стойности от интервала [-2.99..2.99] и новата редица се извежда на
//	екрана.
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Въведете дължината на масива: ");
		int length = scan.nextInt();
	
		float lowerLimit=-2.99f;
		float upperLimit= 2.99f;
		
		if(length<0){
			System.out.println("Въведете положително,цяло число.");
			return;
		}
		float[] array= new float[length];
		System.out.print("Въведете елементите от масива:");
		for (int i = 0; i < array.length; i++) {
			array[i]= scan.nextFloat();	
		}
		System.out.println("Стойности от интервала [-2.99..2.99] са:");
		for (int i = 0; i < array.length; i++) {		
			if(array[i]>=lowerLimit && array[i]<=upperLimit ){
				System.out.print(array[i]+" ");
			}
		}
	}

}
