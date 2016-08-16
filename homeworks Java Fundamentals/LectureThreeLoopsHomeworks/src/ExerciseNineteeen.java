import java.util.Scanner;

public class ExerciseNineteeen {
	
	/*
	 *  �� �� ������� ��������, ���� ����� �� ��������
     *  ���������� ����� �� ��������� [10..99] �� ������� ��������
     *  �����, ��� �������� �� �������� ����������:
     *  1) ��� ����������� ����� � ����� �� ������� 0.5*�������;
     *  2) ��� ����������� ����� � ������� �� ������� 3*������� +1.
     *  ����������� ���������� ������ �� �� ������ �������� 1.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number between 10 and 99: ");
		int num = input.nextInt();
		while (num < 10 || num > 99) {
			System.out.println("Invalid input!!!");
			System.out.print("Enter number between 10 and 99: ");
			num = input.nextInt();
			
		}
		
		while (num != 1) {
			if(num % 2 == 0) {
				num /= 2;
				System.out.print(num + " ");
			}
			else {
				num = (num * 3) + 1;
				System.out.print(num + " ");
			}
			
		}

	}

}
