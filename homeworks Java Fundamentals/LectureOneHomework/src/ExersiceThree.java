import java.util.Scanner;

public class ExersiceThree {
	
	/*
	 * �������� 2 �������� ����� �� ��������� � ��������� ���������� ��.
     * ������������ ������ ���������
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		double firstNum = input.nextDouble();
		System.out.print("Enter second number: ");
		double secondNum = input.nextDouble();
		
		double temp = firstNum;
		firstNum = secondNum;
		secondNum = temp;
		
		System.out.println("First num is: " + firstNum);
		System.out.println("Second num is: " + secondNum);

	}

}
