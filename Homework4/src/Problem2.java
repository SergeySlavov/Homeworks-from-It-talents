import java.util.Scanner;

public class Problem2 {
	
//	����� ��������� �������� ����� �� ���������� �����, ����� ���������
//	�� ��������. �� �� ��������� ����������� �� ������.
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("�������� ��������� �� ���������� �������� �����: ");
		int squareLength= scan.nextInt();
		float[][] array= new float[squareLength][squareLength];
		int rowDiag=0;
		int colDiag=0;
		
		System.out.println("�������� ���������� �� ������:");
		for (int row = 0; row < array.length; row++) {
			for(int col=0; col<array[row].length;col++){
				array[row][col]= scan.nextFloat();
			}
		}
		System.out.println("����������� �� ������ ��:");
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
