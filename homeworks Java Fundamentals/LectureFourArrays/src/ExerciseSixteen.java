
public class ExerciseSixteen {
	
	/*
	 *  �� �� ������� ��������, ���� ����� ������������� �������� 10
     *  ������ ����� �� ��������� �� ���������� �� ������� �����:
     *  1. ������� �������������� �����.
     *  2. ������ �������� ��� �������� ��-����� �� -0.231 �� ������� ���
     *  ������ �� �������� �� ������� �� + ������� 41.25, � ������ ��������
     *  �������� �� ������� � �������������� ����� ����� ������� �
     *  �������� ������� �����
     *  3. �� �� ������� ���������� �� �������� � ��������������� �����.
     *  4. �� �� ������� �������� �������� �� ������ �������� �� ������
     *  ������, ����� �� �������� �� 0.
	 */

	public static void main(String[] args) {
		
		double[] array = {-1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4};
		System.out.print("Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "; ");
		}
		System.out.println();
		
		double[] arrayTwo = new double[array.length];
		
		for (int i = 0; i < arrayTwo.length; i++) {
			if (array[i] < -0.231) {
				arrayTwo[i] = ((i + 1) * (i + 1)) + 41.25;
				
			}
			else {
				arrayTwo[i] = array[i] * (i + 1);
			}
		}
		
	
		System.out.println();
		System.out.print("Array two: ");
		for (int i = 0; i < arrayTwo.length; i++) {
			System.out.print(arrayTwo[i] + "; ");
			
		}
		
		System.out.println();
		
		double sum = 0;
		int count = 0;
		for (int i = 0; i < arrayTwo.length; i++) {
			if(arrayTwo[i] != 0) {
				count++;
				sum = sum + arrayTwo[i];
			}
		}
		
		double average = sum / count;
		System.out.println("Average: " + average);
		
	}

}
