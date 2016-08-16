import java.util.Scanner;

public class ExerciseFive {

	/*
	 * �� �� ������� ��������, ���� ����� �� �������� 2 ������ �� ����� (����).
	 * ��� � ����� ������ ������� ���� � ���� ����, �� �� ������ �� ������
	 * ������� ������ ������������, � ������� ����������, ���� �� �� �� ��������
	 * � ����� �� ����. ��� �������� ����� ��� ���� �� �� ������ ����
	 * ������������ ���������.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first word: ");
		String firstWord = input.next();
		System.out.print("Enter secon word: ");
		String secondWord = input.next();

		machCrossWords(firstWord, secondWord);

	}

	public static void machCrossWords(String firstWord, String secondWord) {

		int verticalIndex = 0;
		int horizontalIndex = 0;
		boolean flag = false;

		for (int i = 0; i < firstWord.length(); i++) {
			for (int j = 0; j < secondWord.length(); j++) {
				if (firstWord.charAt(i) == secondWord.charAt(j)) {
					verticalIndex = i;
					horizontalIndex = j;
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		
		if (flag == false) {
			System.out.println("Words have no common point!!!");
			System.exit(0);
		}
		
		
		// System.out.println(verticalIndex + " " + horizontalIndex);

		boolean drawWordOnce = true;
		boolean skipChar = false;

		for (int i = 0; i < firstWord.length(); i++) {
			skipChar = false;
			for (int j = 0; j < secondWord.length(); j++) {
				if (firstWord.charAt(i) == secondWord.charAt(j) && drawWordOnce) {
					System.out.print(secondWord);
					drawWordOnce = false;
					skipChar = true;
				}
				if (j < horizontalIndex && i != verticalIndex) {
					System.out.print(" ");
				}

			}
			if (!skipChar) {
				System.out.println(firstWord.charAt(i));
			} else {
				System.out.println();
			}
		}

	}

}
