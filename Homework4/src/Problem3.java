import java.util.Scanner;

public class Problem3 {

//	����� �������� ����� �� �����, ����� ��������� �� ��������
//	�������������. �� �� ��������� ������ �� ���������� �� ������,
//	����� � ������������������� �� ���� �����.
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("�������� ���� ������ �� �������� �����: ");
		int rowLength= scan.nextInt();
		System.out.print("�������� ���� ������ �� �������� �����: ");
		int colLength= scan.nextInt();
		int[][] array= new int[rowLength][colLength];
		int sum=0;
		int numElements= rowLength*colLength;
		float average=0;
		
		System.out.println("�������� ���������� �� ������:");
		for (int row = 0; row < array.length; row++) {
			for(int col=0; col<array[row].length;col++){
				array[row][col]= scan.nextInt();
				sum+=array[row][col];
			}
		}
		average= sum/numElements;
		System.out.println("����� �� ������� � ������ � "+sum);
		System.out.println("������������������� �� ������� � "+ average);
	}

}
