import java.util.Scanner;

public class ExerciseTwentyTwo {
	
	/*
	 *  �� �� ������� ��������, ����� ������� ������� 10 ���-�����
     *  �����, ����� �� ����� �� 2, 3 ��� �� 5 � ����� �� ��-������ ��
     *  �������� ���������� �����.
     *  ������� �� ��������, ������ � ������ ������� �����.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		int count = 1;
		
		while (count < 11) {
			num++;
			if(num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
				
				System.out.printf("%d:%d", count, num);
				count++;
			}
			
			if(count == 11) {
				break;
			}
			System.out.print(", ");
		}
		
	}

}
