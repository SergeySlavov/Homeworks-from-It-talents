import java.util.Scanner;

public class ExerciseEighteen {
	
	/*
	 *  �� �� ������� ��������, ���� ����� �� ������� ��� ����� ��
     *  ��������� [1..9].
     *  ���������� �� ������� ��������� �� ���������.
     *  ������������ �������� �� ����������� � ���������� �� 2-��
     *  �����.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number one between 1 and 9: ");
		int numOne = input.nextInt();
		while (numOne < 1 || numOne > 9) {
			System.out.println("Invalid input!!!");
			System.out.print("Enter number one between 1 and 9: ");
			numOne = input.nextInt();
		}
		
		System.out.print("Enter number two between 1 and 9: ");
		int numTwo = input.nextInt();
		while (numTwo < 1 || numTwo > 9) {
			System.out.println("Invalid input!!!");
			System.out.print("Enter number two between 1 and 9: ");
			numTwo = input.nextInt();
			
		}
		int prod = 1;
		
		for (int i = 1; i <= numOne; i++) {
			for (int j = 1; j <= numTwo; j++) {
				prod = i * j;
				System.out.printf("%d * %d = %d%n", i, j, prod);
			}
			System.out.println();
		}
	}

}
