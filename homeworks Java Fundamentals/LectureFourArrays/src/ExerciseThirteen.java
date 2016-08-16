import java.util.Scanner;

public class ExerciseThirteen {

	/*
	 * �� �� ������� ��������, ���� ����� �� ������� ����� � �� ��������� ����
	 * ����� � ������� ������ �������. ����������, ���� �����, �� ���������
	 * �������������� ������ ����� �� ���������� ���������� ����� � 2-����
	 * ������ �������. 
	 * ������: 99 
	 * �����: 1100011
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int num = input.nextInt();
		while (num < 0) {
			System.out.println("Invalid input!!!");
			System.out.print("Enter positive number: ");
			num = input.nextInt();
			
		}

		int count = 0;
		int temp = 0;
		int tempNum = num;

		while (tempNum > 0) {

			temp = tempNum % 2;
			count++;
			tempNum = tempNum / 2;

		}

		int[] array = new int[count];
		for (int i = 0; i < array.length; i++) {
			temp = num % 2;
			array[array.length - i - 1] = temp;
			num = num / 2;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}

}
