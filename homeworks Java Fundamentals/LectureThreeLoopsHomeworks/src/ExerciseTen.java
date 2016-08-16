import java.util.Scanner;

public class ExerciseTen {

	/*
	 * �������� ����� �� ������������ � ���������� ���� � ������. ������ ����� �
	 * ���� ����� �� ���� ���� �� 1 � �� ���� ��.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int num = input.nextInt();

		while (num < 0) {
			System.out.println("Invalid input!");
			System.out.print("Enter positive number: ");
			num = input.nextInt();

		}

		boolean isPrime = true;
		
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;

			}

		}

		if (isPrime) {
			System.out.println("The number is prime!");
			
		}
		else {
			System.out.println("The number is not prime!");
		}

	}

}
