import java.util.Scanner;

public class ExerciseThree {
	
	/*
	 *  �� �� ������ �����, ���� ����� �� �� ������� ����� � 10
     *  �������� �� ������� �����:
     *  ������� 2 �������� �� ������ �� ���������� �����.
     *  ����� ������� ������� �� ������ � ����� �� ����� ��
     *  ���������� 2 �������� � ������.
     *  ���� ���� �������� ������ .
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		int [] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			if(i < 2) {
				array[i] = num;
			}
			else {
				array[i] = array[i-2] + array[i-1];
				
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
