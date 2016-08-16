import java.util.Scanner;

public class Problem3 {

//	Имате двумерен масив от числа, чийто стойности са въведени
//	предварително. Да се отпечатат сумата на елементите на масива,
//	както и средноаритметичното на тези числа.
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Въведете броя редове на двумерен масив: ");
		int rowLength= scan.nextInt();
		System.out.print("Въведете броя колони на двумерен масив: ");
		int colLength= scan.nextInt();
		int[][] array= new int[rowLength][colLength];
		int sum=0;
		int numElements= rowLength*colLength;
		float average=0;
		
		System.out.println("Въведете елементите на масива:");
		for (int row = 0; row < array.length; row++) {
			for(int col=0; col<array[row].length;col++){
				array[row][col]= scan.nextInt();
				sum+=array[row][col];
			}
		}
		average= sum/numElements;
		System.out.println("Сбора на числата в масива е "+sum);
		System.out.println("Средноаритметичното на числата е "+ average);
	}

}
