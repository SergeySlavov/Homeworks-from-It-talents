import java.util.Arrays;

public class ExerciseEightteen {
	
	/*
	 *  ������ �� ��� ��������� ������ � ���������� �����.
     *  �� �� ������� ��������, ����� �������� ������ ����� � �������
     *  ������� �� ����� ������ � ������� � ����� �����, ��-�������� ��
     *  ����� �����.
     *  �� �� ������ ������������ � �� ����� ������
	 */

	public static void main(String[] args) {
		
		int[] arrayOne = {18,19,32,1,3, 4, 5, 6, 7, 8};
		
		int[] arrayTwo = {1, 2, 3,4,5,16,17,18,27,11};
		
		int[] arrayThree = new int[arrayOne.length];
		
		for (int i = 0; i < arrayTwo.length; i++) {
			arrayThree[i] = (arrayOne[i] >= arrayTwo[i]) ? arrayOne[i] : arrayTwo[i];
		}
//		System.out.println(Arrays.toString(arrayOne));
//		System.out.println(Arrays.toString(arrayTwo));
		System.out.print("Array one: ");
		for (int i = 0; i < arrayOne.length; i++) {
			System.out.print(arrayOne[i] + " ");
		}
		System.out.println();
		System.out.print("Array two: ");
		for (int i = 0; i < arrayTwo.length; i++) {
			System.out.print(arrayTwo[i] + " ");
		}
		System.out.println();
		System.out.print("Array three: ");
		for (int i = 0; i < arrayThree.length; i++) {
			System.out.print(arrayThree[i] + " ");
		}

	}

}
