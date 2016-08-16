import java.util.Scanner;

public class ExerciseTwentyFour {

	/*
	 * ���� ����� X � ���������, a�� �� ���� ������� ������ ����� � �����
	 * ������. �� �� ������� ��������, ����� ��������� ���� �������� ����� �
	 * ���������. ������ �����: N - ���������� ����� �� ��������� [10 .. 30000].
	 * ����������� ����� do-while.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int num = input.nextInt();

		while (num < 10 || num > 30000) {
			System.out.println("Invalid input!!!");
			System.out.print("Enter number between 10 and 30000: ");
			num = input.nextInt();

		}
		int checkNum = num;
		int temp = 0;
		int palindrome = 0;
		boolean isPalindrome = false;

		do {
			temp = num % 10;
			palindrome = palindrome * 10;
			palindrome = palindrome + temp;

			num /= 10;

		} while (num != 0);

		if (palindrome == checkNum) {
			isPalindrome = true;
		}


		if (isPalindrome) {
			System.out.println("The number is palindrome!");
		}
		else {
			System.out.println("The number isn't palindorme!");
		}

	}

}
