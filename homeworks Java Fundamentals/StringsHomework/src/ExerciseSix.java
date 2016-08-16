import java.util.Scanner;

import javax.xml.bind.ValidationEvent;

public class ExerciseSix {

	/*
	 * �� �� ������� ��������, ���� ����� �� ������� ��������� � ������� ����.
	 * ���� �������� �� ������ �� �� ������� ����� �����, �� ����� ������� ����
	 * �� ������� � ������ �����, � ���������� � ����� �� �� �����. 
	 * ������:
	 * ����� ����� ������ 
	 * �����: 
	 * ����� ����� ������
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter sentence: ");
		String sentence = input.nextLine();

		System.out.println(upperLetters(sentence));
		System.out.println(upperLettersTwo(sentence));
		

	}
	
	//������ �� ����������� ������. �� ����������� if ������������� ������ �� �� ������� �� � �� � �� �
	
	public static String upperLetters(String sentence) {

		sentence = sentence.toLowerCase();
		
		char[] array = new char[sentence.length()];
		


		for (int i = 0; i < array.length; i++) {

			array[i] = sentence.charAt(i);
		}

		for (int i = 0; i < array.length; i++) {
			if (i == 0 && array[i] != ' ') {
				array[i] -= 32;
			}
			if (array[i] == ' ' && array[i + 1] >= 'a' && array[i + 1] <= 'z') {
				array[i + 1] -= 32;
			}
		}

		String newSentence = "";
		
		for (int i = 0; i < array.length; i++) {
			newSentence += array[i];
		}
		return newSentence;
		
	}
	
	
	//���� ������ �� ������ ����� (�� ������ �������� �������
	public static String upperLettersTwo(String sentence) {
		String[] array = sentence.split(" ");

		String newSentence = "";
		
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i].toLowerCase();
			array[i] = array[i].replace(array[i].substring(0, 1), array[i].substring(0, 1).toUpperCase());
			newSentence += array[i];
			newSentence += " ";
		}
		return newSentence;
	}

}
