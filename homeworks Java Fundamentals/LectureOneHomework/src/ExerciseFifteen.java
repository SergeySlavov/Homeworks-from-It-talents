import java.util.Scanner;

public class ExerciseFifteen {
	
	/*
	 *  �� �� ������� ��������, ����� ������� ���������� ����� �� ��������� [0..24].
     *  ���������� �� ������ ������������� ��������� ��������� ��������� ���.
     *  ��������� ��:
     *  [18..4] - ����� �����;
     *  [4..9] - ����� ����;
     *  [9..18] - ����� ���
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number between 0 and 24: ");
		int num = input.nextInt();
		
		while (num < 0 || num > 24) {
			System.out.println("Wrong number try again!");
			System.out.print("Enter number between 0 and 24: ");
			num = input.nextInt();
		}
		
		if(num >= 18 || num <= 4 ) {
			System.out.println("Good evening!");
		}
		else if(num <= 9) {
			System.out.println("Good morning!");
		}
		else {
			System.out.println("Good day!");
		}
	}

}
