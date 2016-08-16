import java.util.Scanner;

public class ExerciseThree {

	/*
	 * �� �� ������� ��������, ���� ����� �� �������� �������������� ��� ������
	 * �� ������� ��� ���������. ���������� �� ������� ��������� �� ��������� ��
	 * ����������� �� �� �������. ������: ���������, ��������� 
	 * �����:
	 * ����� ���� �� � ����� �������.
	 * ������� �� �������: 
	 * 8 �-�
	 * 9 �-�
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first word: ");
		String wordOne = input.next();
		System.out.print("Enter second word: ");
		String wordTwo = input.next();

		if (areTheyEquals(wordOne, wordTwo)) {
			System.out.println("The words are equals!");
		} else {
			stringDiference(wordOne, wordTwo);
		}

	}

	public static boolean areTheyEquals(String wordOne, String wordTwo) {
		boolean flag = false;
		if (wordOne.equals(wordTwo)) {
			flag = true;
		}
		return flag;
	}

	public static void stringDiference(String wordOne, String wordTwo) {

		if (wordOne.length() == wordTwo.length()) {
			System.out.println("The words have the same lengths");
			System.out.println("Position diference: ");
			for (int i = 0; i < wordOne.length(); i++) {
				if (wordOne.charAt(i) != wordTwo.charAt(i)) {
					System.out.println("Position: " + i + " chars: " + wordOne.charAt(i) + " - " + wordTwo.charAt(i));
				}
			}

		} else {
			if (wordOne.length() > wordTwo.length()) {
				System.out.println("The first word has biggest length.");
				System.out.println("Position diference: ");
				for (int i = 0; i < wordOne.length(); i++) {
					if (i < wordTwo.length() && wordOne.charAt(i) != wordTwo.charAt(i)) {
						System.out
								.println("Position: " + i + " chars: " + wordOne.charAt(i) + " - " + wordTwo.charAt(i));
					} else {
						if (i >= wordTwo.length()) {
							System.out.println("Position: " + i + " chars: " + wordOne.charAt(i) + " - ");
						}
					}

				}
			} else {
				if (wordOne.length() < wordTwo.length()) {
					System.out.println("The second word has biggest length.");
					System.out.println("Position diference: ");
					for (int i = 0; i < wordTwo.length(); i++) {
						if (i < wordOne.length() && wordOne.charAt(i) != wordTwo.charAt(i)) {
							System.out.println(
									"Position: " + i + " chars: " + wordOne.charAt(i) + " - " + wordTwo.charAt(i));
						} else {
							if (i >= wordOne.length()) {
								System.out.println("Position: " + i + " chars: " + " " + " - " + wordTwo.charAt(i));
							}

						}
					}
				}
			}
		}
	}
}
