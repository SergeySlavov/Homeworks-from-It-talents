import java.util.Arrays;
import java.util.Scanner;

public class ExerciseSeven {

	/*
	 * �������� ��������, ����� ����� ���� ����� � ����� ������� ��� ����� ���
	 * ����� ������ �� ������� �����: ���������� �� ����� ������� �� ������
	 * ����� �� � ����� �� ����� �� ���������� � ���������� ������� ��
	 * ���������� ������� �� ������ �����. �� �� ������ ��������� �����.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter arrayOne lenght: ");
		int one = input.nextInt();

		int[] arrOne = new int[one];

		for (int i = 0; i < arrOne.length; i++) {
			System.out.print("Enter a number: ");
			arrOne[i] = input.nextInt();
		}
		
		
		int[] arrTwo = new int[arrOne.length];
		
		for (int i = 0; i < arrTwo.length; i++) {
			if(i == 0) {
				arrTwo[i] = arrOne[i +1] + arrOne[arrOne.length - 1];
			}
			else {
				if(i == arrTwo.length - 1) {
					arrTwo[i] = arrOne[i - 1] + arrOne[0];
					break;
				}
				else {
					arrTwo[i] = arrOne[i - 1] + arrOne[i + 1];
				}
			}
			
		}
		System.out.print(Arrays.toString(arrOne));
		System.out.println();
		for (int i = 0; i < arrTwo.length; i++) {
			
			System.out.print(arrTwo[i] + " ");
			
		}
	}

}
