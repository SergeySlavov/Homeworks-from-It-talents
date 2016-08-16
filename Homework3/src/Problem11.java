import java.util.Scanner;

public class Problem11 {
	
//	Да се състави програма, която въвежда от клавиатурата 7 цели числа
//	в едномерен масив
//	Програмата да изведе всички числа кратни на 5, но по големи от 5.
//	Пример: -23, -55, 17, 75, 56, 105, 134
//	Изход: 75,105 2 числа
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Въведете 7-те числа: ");
		int[] array= new int[7];
		for (int i = 0; i < array.length; i++) {
			array[i]=scan.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if(array[i]%5==0 && array[i]>5){
				System.out.print(array[i]+" ");
			}
		}System.out.print(" числата кратни на 5, но по-големи от 5.");
	}

}
