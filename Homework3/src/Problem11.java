import java.util.Scanner;

public class Problem11 {
	
//	�� �� ������� ��������, ����� ������� �� ������������ 7 ���� �����
//	� ��������� �����
//	���������� �� ������ ������ ����� ������ �� 5, �� �� ������ �� 5.
//	������: -23, -55, 17, 75, 56, 105, 134
//	�����: 75,105 2 �����
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("�������� 7-�� �����: ");
		int[] array= new int[7];
		for (int i = 0; i < array.length; i++) {
			array[i]=scan.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if(array[i]%5==0 && array[i]>5){
				System.out.print(array[i]+" ");
			}
		}System.out.print(" ������� ������ �� 5, �� ��-������ �� 5.");
	}

}
