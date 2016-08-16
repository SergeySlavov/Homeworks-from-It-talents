import java.util.Scanner;

public class ExerciseEight {
	
	/*
	 *  �� �� ������� ��������, ����� ���� �� ��������� 4-������o
     *  ���������� ����� �� ��������� [1000.. 9999]. �� ���� ����� ��
     *  �������� 2 ���� 2-������� �����. ������� ����� �� ������� �� 1-��
     *  � 4-�� ����� �� ���������� �����. ������� ����� �� ������� �� 2-�a -
     *  3-�� ����� �� ���������� �����. ���� �������� �� �� ������ ���� 1-��
     *  ���� ����� e ��-����� <, ����� = ��� ��-������ �� 2-�� �����.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number between 1000 and 9999: ");
		int number = input.nextInt();
		
		while (number < 1000 || number > 9999) {
			System.out.println("Wrong number try again!!!");
			System.out.print("Enter number between 1000 and 9999: ");
			number = input.nextInt();
		}
		
		
		int firstDigit = number / 1000;
		int secondDigit = (number / 100) % 10;
		int thirdDigit = (number / 10) % 10;
		int fourDigit = number % 10;
		
		
		String numOne = firstDigit + "" + fourDigit;
		String numTwo = secondDigit + "" + thirdDigit;
		
		int firstNum = Integer.parseInt(numOne);
		int secondNum = Integer.parseInt(numTwo);
		
		if(firstNum > secondNum) {
			System.out.printf("%d > %d", firstNum, secondNum);
		}
		else if(firstNum == secondNum) {
			System.out.printf("%d = %d", firstNum, secondNum);
		}
		else if(firstNum < secondNum) {
			System.out.printf("%d < %d", firstNum, secondNum);
		}

	}

}
