import java.util.Scanner;

public class ExerciseFour {
	
	/*
	 * �������� 2 �������� ����� �� ��������� � �� ������������ �
     * ��������� ���.
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number one: ");
		int numOne = input.nextInt();
		System.out.print("Enter number two: ");
		int numTwo = input.nextInt();
		
		if(numOne <= numTwo) {
			System.out.println(numOne + "\n" + numTwo);
		}
		else {
			System.out.println(numTwo + "\n" + numOne);
		}

	}

}
