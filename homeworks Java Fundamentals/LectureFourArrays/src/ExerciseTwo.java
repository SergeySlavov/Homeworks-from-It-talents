import java.util.Scanner;

public class ExerciseTwo {

	/*
	 * ���� �� ������� ����� �� �� ���������� ���, ���� ���������� �� ��������
	 * �� ����� ���� �� �����������, � ������� �� �� ���� ��������, �� � �������
	 * ���. ��������, �� �� ������ ����� ����� �� ������.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number for array lenght: ");
		int num = input.nextInt();

		int[] arrayOne = new int[num];

		for (int i = 0; i < arrayOne.length; i++) {
			System.out.print("Enter number: ");
			arrayOne[i] = input.nextInt();
		}
		
		int[] arrayTwo = new int[arrayOne.length*2];
		
		for (int i = 0, j = arrayTwo.length-1; i < arrayOne.length; i++, j--) {
			arrayTwo[i] = arrayOne[i];
			arrayTwo[j] = arrayOne[i];
		}
		
		

		for (int i = 0; i < arrayTwo.length; i++) {
			System.out.print(arrayTwo[i] + " ");
		}

	}

}
