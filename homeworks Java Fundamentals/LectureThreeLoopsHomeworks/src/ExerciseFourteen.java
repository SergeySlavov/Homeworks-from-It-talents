import java.util.Scanner;

public class ExerciseFourteen {

	/*
	 *  �� �� ������� ��������, ����� �� ��������
     *  ���������� ����� N �� ��������� [10..200] ������� � �������
     *  ��� ������ �����, ����� �� ������ �� 7 � �� ��-����� �� N.
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number between 10 and 200: ");
		int num = input.nextInt();
		
		while (num < 10 || num > 200) {
			System.out.println("Invalid input!!!");
			System.out.print("Enter number between 10 and 200: ");
		    num = input.nextInt();	
		}
		
		for(int i = num; i > 0; i--)  {
			if(i % 7 == 0) {
				System.out.println(i);
			}
			
		}
		

	}

}
