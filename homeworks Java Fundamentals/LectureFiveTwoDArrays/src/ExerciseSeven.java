
public class ExerciseSeven {

	/*
	 * ����� ������������� �������� ��������� �� ���������� �����, �������� �
	 * ��������� ������� � ������� 6 ���� � 6 ������. �� �� ������� �������� ,
	 * ���� ����� �� ������ ������ �� ������ ��������, ����� ���� �� ������� ��
	 * ��� � ������ � ����� �����. ���������� �� ������� ����������� ���� ��
	 * ����� ������� ��� �� ����������� �������, ����� � ������ ���� �� ����
	 * ��������. �� �� �������� ���� ���� �����.
	 */

	public static void main(String[] args) {

		int[][] array = { { 11, 12, 13, 14, 15, 16 }, 
				          { 21, 22, 23, 24, 25, 26 }, 
				          { 31, 32, 33, 34, 35, 36 },
				          { 41, 42, 43, 44, 45, 46 }, 
				          { 51, 52, 53, 54, 55, 56 }, 
				          { 61, 62, 63, 64, 65, 66 }};

		int count = 0;
		int sum = 0;
		int fullSum = 0;
		for (int i = 0; i < array.length * array.length; i++) {
			if (((i / array.length) + (i % array.length)) % 2 == 0) {
				System.out.print(array[i / array.length][i % array.length] + " ");
				sum += array[i / array.length][i % array.length];

			}
			count++;

			if (count % array.length == 0) {
				fullSum += sum;
				System.out.print(" sum is: " + sum);
				sum = 0;
				System.out.println();
			}

		}
		System.out.println();
		System.out.println("The full sum is: " + fullSum);

	}

}
