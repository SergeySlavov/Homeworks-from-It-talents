import java.io.Reader;
import java.util.Scanner;

public class ExerciseSeventeen {
	
	/*
	 *  �� �� ������� ��������, ����� ������� �������, ����� ������ ��
     *  �������� ��� ����� *, � ������������ � ��������� ��� �������
     *  ����.
     *  ������ ����� b - ������� �� �������� ����� �� ���������
     *  [3..20], c - ����� ����.
     *  ���������� �� �������� ����� for.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number b between 3 and 20: ");
		int b = input.nextInt();
		while (b < 3 || b > 20) {
			System.out.println("Invalid input!!!");
			System.out.print("Enter number b between 3 and 20: ");
			b = input.nextInt();
			
		}
		
		System.out.print("Enter char: ");
		char simbol = input.next().charAt(0);
		
		for (int i = 1; i <= b; i++) {
			for (int j = 1; j <= b; j++) {
				if(i == 1 || i == b || j == 1 || j == b ) {
					System.out.print("*");
				}
				else {
					System.out.print(simbol);
				}
				
			}
			System.out.println();
		}

	}

}
