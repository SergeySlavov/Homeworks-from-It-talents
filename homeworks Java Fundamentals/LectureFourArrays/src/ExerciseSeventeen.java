import java.util.Scanner;

public class ExerciseSeventeen {
	
	/*
	 *  ���� ������ �� ���������� ����� �� �������� �������������� ������,
     *  ��� �� ���������� � �� ���������� ���������:
     *  N1 < N2 > N3 < N4 > N5 <..
     *  ��������� ��������, ����� ��������� ���� �������� � ���������
     *  ����� ������ �� ����� ���������� ������� ����������.
     *  ������: 1 3 2 4 3 7
     *  �����: ��������� ������������ �� �������������� ������ ������
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter array length: ");
		int num = input.nextInt();
		while (num < 1) {
			System.out.println("Invalid input!!!");
			System.out.print("Enter array length: ");
			num = input.nextInt();

		}

		int[] array = new int[num];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter array values: ");
			array[i] = input.nextInt();

		}
		
		boolean flag = true;
		
		for (int i = 1; i < array.length - 1; i+=2) {
			if (!(array[i] > array[i - 1] && array[i] > array[i + 1])) {
				flag = false;
				break;
			}
		}
		
		if (flag) {
			System.out.println("It is zig-zag up-line!");
		}
		else {
			System.out.println("It isn't zig-zag up-line!!!");
		}
	}

}
