import java.util.Scanner;

public class ExerciseOne {

	/*
	 * �� �� ������� ��������� ��� ����������� � �� �� �������� 2 ����� ��
	 * ������������ A � B (���� �� �� � ������� ������� � double).
     * ����� �� �� ������� 3-�� ����� C � �� �� ������� ���� �� � �/� A � B.
     * �� �� ������ ��������� ��������� �� ���� ���� C � ����� A � B.
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter A number: ");
		double a = input.nextDouble();
		System.out.print("Enter B number: ");
		double b = input.nextDouble();
		System.out.print("Enter C number: ");
		double c = input.nextDouble();
		
		if((a < c && c < b) || (a > c && c > b)) {
			System.out.println("Number \"c\" is between number \"a\" and number \"b\".");
		}
		else {
			System.out.println("Number \"c\" is not between number \"a\" and number \"b\".");
		}

	}

}
