import java.util.Scanner;

public class Problem14 {
	
//	����� ������������� ������� ��������� �����, �������� ������
//	�����.
//	�� �� ������� ��������, ���� ����� �� ������� ���� �������� ���
//	��������� �� ��������� [-2.99..2.99] � ������ ������ �� ������� ��
//	������.
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("�������� ��������� �� ������: ");
		int length = scan.nextInt();
	
		float lowerLimit=-2.99f;
		float upperLimit= 2.99f;
		
		if(length<0){
			System.out.println("�������� �����������,���� �����.");
			return;
		}
		float[] array= new float[length];
		System.out.print("�������� ���������� �� ������:");
		for (int i = 0; i < array.length; i++) {
			array[i]= scan.nextFloat();	
		}
		System.out.println("��������� �� ��������� [-2.99..2.99] ��:");
		for (int i = 0; i < array.length; i++) {		
			if(array[i]>=lowerLimit && array[i]<=upperLimit ){
				System.out.print(array[i]+" ");
			}
		}
	}

}
