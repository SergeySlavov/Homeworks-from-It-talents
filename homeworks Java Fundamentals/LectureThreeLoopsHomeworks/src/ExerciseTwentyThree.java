
public class ExerciseTwentyThree {
	
	/*
	 *  �� �� ������� ��������, ����� ���� ����� while �������
     *  ��������� �� ���������, �� ��� ����������.
     *  �.�. ��� � �������� 4*5 �� �� ������� 5*4.
	 */

	public static void main(String[] args) {
		
		int multiplier1 = 1;
		int multiplier2 = 1;
		
		
		while (multiplier1 <= 9 && multiplier2 <= 9) {
			
			System.out.print( multiplier1 + "*" + multiplier2 + "; ");
			multiplier2++;
			
			if(multiplier2 == 10) {
				System.out.println();
				
				multiplier1++;
				multiplier2 = multiplier1;
			}
			
		}

	}

}
