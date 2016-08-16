import java.util.Scanner;

public class ExerciseEight {

	/*
	 * �� �� ������� ��������, ���� ����� �� ������� ��� �� ������� (������, ���). 
	 * ���������� �� ������ �� ������ ���� ��������� ������ � ���������,
	 * �.�. ���� ����� ������-������� � �������-������ � ���� � ���.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = input.next();
		
		
		if (palindrome(word)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		

	}

	public static boolean palindrome(String word) {
		
		boolean isPalindrome = true;
		
		for (int i = 0; i < word.length()/2; i++) {
			if(word.charAt(i) != word.charAt(word.length() - i - 1)) {
				isPalindrome = false;
			}
		}
		
		
		
		return isPalindrome;
	}

}
