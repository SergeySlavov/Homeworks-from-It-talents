import java.util.Scanner;

public class ExerciseNine {
	
	/*
	 * �������� ��������, � ����� ����������� ������� �����, ���� �����
     * ���������� �� ������ �� ������� � ������� ��� (����� �� � ������ ��
     * �� �������� � ������� ���, ��� ����� �� �� ������, ���� ����� �� ��
     * �������� � �������� ���). ��������� �� ������ �������� ����� � ����
     * ������������ ����� � ����� ��� �� ���������� ���� �����.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter array lenght: ");
		int one = input.nextInt();

		int[] arrOne = new int[one];

		for (int i = 0; i < arrOne.length; i++) {
			System.out.print("Enter a number: ");
			arrOne[i] = input.nextInt();
		}
		
		//�������� �� ����� ���� ��������� ����
		
//		int[] arrTwo = new int[arrOne.length];
//		
//		
//		for (int i = 0; i < arrOne.length; i++) {
//			arrTwo[i] = arrOne[arrOne.length - i - 1];
//		}
//		
//		for (int i = 0; i < arrTwo.length; i++) {
//			arrOne[i] = arrTwo[i];
//					
//		}
//
//		for (int i = 0; i < arrTwo.length; i++) {
//			System.out.print(arrOne[i] + " ");
//		}
		
		
		
		//�������� �� ����� ��� �� ��������� ���� �����
		
		int temp = 0;
		for (int i = 0; i < arrOne.length/2; i++) {
			temp = arrOne[i];
			arrOne[i] = arrOne[arrOne.length - i - 1];
			arrOne[arrOne.length - i - 1] = temp;
			
		}
		
		for (int i = 0; i < arrOne.length; i++) {
			System.out.print(arrOne[i] + " ");
			
		}
	}

}
