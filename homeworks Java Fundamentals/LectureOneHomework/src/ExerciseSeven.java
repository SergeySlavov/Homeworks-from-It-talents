import java.util.Scanner;

public class ExerciseSeven {
	
	/*
	 * �������� 3 ���������� �� ������������ � ��� (���������� ���), ����
     * ���� (����� � ������� �������), ���� ��� ����� � ����� ���.
     * ��������� ��������, ����� ����� ������� �� ������ �� ���� ����� ��
     * ������� �����:
     * - ��� ��� �����, ���� �� �������
     * - ��� ���� ����, �� �� ���� ���������
     * - ��� ����� � �� ���� ����� � �� ��� ���
     * - ��� ��� �����, �� ����� �� ���� � ��������
     * - ��� ���� ��-����� �� 10 ��, �� ����� �� ����.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter integer between 0 and 23: ");
		int hour = input.nextInt();
		System.out.print("Enter your money: ");
		float money = input.nextFloat();
		System.out.print("Are you healthy? Enter true or false: ");
		boolean amIHealthy = input.hasNext();
		
		if(amIHealthy == true && money <= 10) {
		
				System.out.println("I go to cafe.");
	
		}
		else if(amIHealthy == true && money > 10) {
			
			System.out.println("I go to the movies with friends");
		}
		
		else if(amIHealthy == false ) {
			System.out.println("Stay at home!");
	
		}
		else if(amIHealthy == false && money == 0) {
			System.out.println("I'll stay home and drink tea!");
		}
		else {
			System.out.println("I will buy drugs.");
		}
		}

	}


