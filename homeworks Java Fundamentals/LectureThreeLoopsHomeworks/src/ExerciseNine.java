import java.util.Scanner;

public class ExerciseNine {

	/*
	 * �� �� �������� 2 ����� �� ������������ � � �. �� �� ������� ������ �����
	 * �� � �� � �� ������ 2(��������� � �������).��� ����� ����� � ������ �� 3,
	 * �� �� ������ ��������� �� ������� �� �������� �skip 3�.��� ������ ��
	 * ������ �������� ����� (��� ������������) ����� ��-������ �� 200, �� ��
	 * �������� �����������.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number a: ");
		int a = input.nextInt();
		System.out.print("Enter number b: ");
		int b = input.nextInt();

		int sum = 0;
		
		if(a < b) {
		for (int i = a; i <= b; i++) {
			int prod = i;

			if (i % 3 == 0) {
				System.out.println("skip 3");

				continue;

			}
			prod *= 2;
		
			System.out.print(prod);
			sum += prod;
//			System.out.println(sum);
			if (sum > 200) {
				System.out.println(" Game over!");
				break;
			}
			System.out.print(", ");

		}
		}
		else {
			for (int i = b; i <= a; i++) {
				int prod = i;

				if (i % 3 == 0) {
					System.out.println("skip 3");

					continue;

				}
				prod *= 2;
			
				System.out.print(prod);
				sum += prod;
//				System.out.println(sum);
				if (sum > 200) {
					System.out.println(" Game over!");
					break;
				}
				System.out.print(", ");

			}
			
		}
	}

}
