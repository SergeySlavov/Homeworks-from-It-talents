import java.util.Scanner;

public class ExerciseFive {
	
	/*
	 * �� �� ������� �� ����������� 2 �����. � �� ��
     * ������� �� ������ ������ ����� �� ��-������� �� ��-��������.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int firstNum = input.nextInt();
		System.out.print("Enter second number: ");
		int secondNum = input.nextInt();
		
		if(firstNum < secondNum) {
			for (int i = firstNum; i <= secondNum; i++) {
				System.out.println(i);
			}
		}
		else {
			for (int i = secondNum; i <= firstNum; i++) {
				System.out.println(i);
			}
		}

	}

}
