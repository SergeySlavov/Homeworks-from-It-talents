import java.util.Scanner;

public class ExerciseTen {

	/*
	 *  ������ �� �� ������� �������� � ����. ����� 2 ���� � ���������� 2 �
     *  3 ����� � �� �������� ������������.
     *  �� �� ������� ��������, ����� �� ����� ���� ������� ��� �� ��������
     *  ��������� � ���� ����, �.�. ��-����� ���� �� �� ����� ����� ��
     *  ������. ������ �� ����� �� �� ������� � �������� ���������� ����.
     *  ������ �����: ���������� ����� �� ��������� [10..9999].
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter litters between 10 and 9999: ");
		int litters = input.nextInt();
		
		while (litters < 10 || litters > 9999) {
			System.out.println("Wrong number try again!!!");
			System.out.print("Enter litters between 10 and 9999: ");
			litters = input.nextInt();
		}
		
	
		int countBuckets2 = 0;
		int countBuckets3 = 0;
		int temp = 0;
		if(litters % 5 != 0) {
			temp = litters % 10;
			if(temp > 6) {
				temp -=5;
			}
			
		}
		litters -= temp;
		while(litters >= 5) {
			litters -=5;
			
			countBuckets2++;
			countBuckets3++;
		}
		
		switch (temp) {
		case 0:
			System.out.printf("%d times 2 liters and %d liters 3 times", countBuckets2, countBuckets3);
			break;
		case 2:
			temp = 1;
			System.out.printf("%d times 2 liters and %d liters 3 times and %d bucket from 2 litters", countBuckets2, countBuckets3, temp);
			break;
		case 3:
			temp = 1;
			System.out.printf("%d times 2 liters and %d liters 3 times and %d bucket from 3 litters", countBuckets2, countBuckets3, temp);
			break;
		case 4:
			temp = 2;
			System.out.printf("%d times 2 liters and %d liters 3 times and %d bucket from 2 litters", countBuckets2, countBuckets3, temp);
			break;
		case 6:
			temp = 2;
			System.out.printf("%d times 2 liters and %d liters 3 times and %d bucket from 3 litters", countBuckets2, countBuckets3, temp);
			break;
			
		default:
			break;
		}
	

	}

}
