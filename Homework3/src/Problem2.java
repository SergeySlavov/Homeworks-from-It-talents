import java.util.Scanner;

public class Problem2 {

//	Нека по въведен масив да се конструира нов, като половината му
//	елементи са точно като на оригиналния, а другите да са тези
//	елементи, но в обратен ред. Последно, да се изведе новия масив
//	на екрана.
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Въведете дължината на масива: ");
		int Length= scan.nextInt();
		int[]array= new int[Length];
		int[] secondArray= new int[Length];
		int index=((Length-1)/2)+1;
		
		if (Length<0 || Length%2!=0) {
			System.out.println("Въведете положително, четно число!");
			return;
		}else {
			System.out.print("Въведете елементите на масива: ");
			for (int i = 0; i < array.length; i++) {
				array[i]=scan.nextInt();
			}
			for (int i = 0; i < array.length/2; i++) {
				secondArray[i]=array[i];
			}
			for (int i = array.length-1; i >= array.length/2; i--) {
				secondArray[index]= array[i];
				index++;
			}
			for (int i = 0; i < secondArray.length; i++) {
				System.out.print(secondArray[i]+" ");
			}
	}
}
}
