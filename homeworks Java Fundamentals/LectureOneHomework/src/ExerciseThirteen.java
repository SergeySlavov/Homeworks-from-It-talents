import java.util.Scanner;

public class ExerciseThirteen {
	
	/*
	 *  �� �� ������� ��������, ����� �� ������� ����� � �������/����� ��
     *  ���������� ����������� t � ������ ������.
     *  �������������� ��������� ��:
     *  ��� -20 ������ �������;
     *  ����� 0 � -20 - �������;
     *  ����� 15 � 0 - ������;
     *  ����� 25 � 15 - �����;
     *  ��� 25 � ������.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter temperature in Celsius between -100 and 100: ");
		double temperature = input.nextDouble();
		while (temperature < -100 || temperature > 100) {
			System.out.println("Wrong number try again!");
			System.out.print("Enter temperature in Celsius between -100 and 100: ");
			temperature = input.nextDouble();
		}
		
		
		if(temperature < -20) {
			System.out.println("Ice cold!");
		}
		else if(temperature < 0) {
			System.out.println("Cold!");
		}
		else if(temperature <= 15) {
			System.out.println("Chilly!");
		}
		else if ( temperature <= 25) {
			System.out.println("Warm!");
		}
		else {
			System.out.println("Hot!");
		}

	}

}
