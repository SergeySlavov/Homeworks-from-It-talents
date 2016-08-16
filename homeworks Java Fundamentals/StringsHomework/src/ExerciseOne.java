import java.util.Scanner;

public class ExerciseOne {

	/*
	 * �� �� ������� ��������, ���� ����� �� �������� ��� ���� ��������� �� 40
	 * ������ � ����� �����. ���� �������� �� ������ �� �� �������� ��������
	 * ���� � ������ � ���� � ����� �����. ������: Abcd Efgh 
	 * �����: ABCD abcd
	 *        EFGH efgh
	 */

	public static void bigAndSmallLetters(String letters) {

		System.out.println(letters.toUpperCase());
		System.out.println(letters.toLowerCase());

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String lettersOne = "";
		String lettersTwo = "";
		do {
			System.out.print("Enter first string < 40 letters: ");
			lettersOne = input.nextLine();
		} while (lettersOne.length() > 40);

		do {
			System.out.print("Enter second string < 40 letters: ");
			lettersTwo = input.nextLine();
		} while (lettersTwo.length() > 40);

		bigAndSmallLetters(lettersOne);
		System.out.println();
		bigAndSmallLetters(lettersTwo);

	}

}
