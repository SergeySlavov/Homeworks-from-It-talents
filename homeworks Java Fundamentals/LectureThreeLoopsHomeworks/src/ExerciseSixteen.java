import java.util.Scanner;

public class ExerciseSixteen {
	
	/*
	 *  �� �� ������� ��������, ���� ����� �� �������� 2 ����������
     *  ����� N, M �� ��������� [10..5555].
     *  ����������, ���� ����� for, �� ������� ������ ����� ��
     *  ���������, ����� �� ������ �� 50 � �������� ���.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number N between 10 and 5555: ");
		int n = input.nextInt();
		while (n < 10 || n > 5555) {
			System.out.println("Invalid input!!!");
			System.out.print("Enter number N between 10 and 5555: ");
			n = input.nextInt();
			
		}
		
		System.out.print("Enter number M between 10 and 5555: ");
		int m = input.nextInt();
		while (m < 10 || m > 5555) {
			System.out.println("Invalid input!!!");
			System.out.print("Enter number M between 10 and 5555: ");
			m = input.nextInt();
			
		}
		
		if(n <= m) {
			for (int i = m; i >=  n; i--) {
				if(i % 50 == 0) {
					System.out.print(i);
					if(i == 50 || n == m){
						break;
					}
					System.out.print(",");
				}
			}
		}
		else {
			for (int i = n; i >=  m; i--) {
				if(i % 50 == 0) {
					System.out.print(i);
					if(i == 50 || n == m){
						break;
					}
					System.out.print(",");
				}
			}
		}
		
		
		

	}

}
