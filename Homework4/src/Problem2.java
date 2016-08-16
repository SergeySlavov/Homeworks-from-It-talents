import java.util.Scanner;

public class Problem2 {
	
//	Имате квадратен двумерен масив от естествени числа, чийто стойности
//	се въвеждат. Да се отпечатат диагоналите на масива.
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Въведете разметите на квадратния двумерен масив: ");
		int squareLength= scan.nextInt();
		float[][] array= new float[squareLength][squareLength];
		int rowDiag=0;
		int colDiag=0;
		
		System.out.println("Въведете елементите на масива:");
		for (int row = 0; row < array.length; row++) {
			for(int col=0; col<array[row].length;col++){
				array[row][col]= scan.nextFloat();
			}
		}
		System.out.println("Диагоналите на масива са:");
		while(rowDiag<array.length){
			System.out.print(array[rowDiag][colDiag]+" ");
			rowDiag++;
			colDiag++;
		}
		System.out.println();
		rowDiag=0;
		colDiag=array.length-1;
		while(rowDiag<array.length){
			System.out.print(array[rowDiag][colDiag]+" ");
			rowDiag++;
			colDiag--;
		}
	}

}
