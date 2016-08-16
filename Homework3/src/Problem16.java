import java.util.Scanner;

public class Problem16 {

//	�� �� ������� ��������, ���� ����� ������������� �������� 10
//	������ ����� �� ��������� �� ���������� �� ������� �����:
//	1. ������� �������������� �����.
//	2. ������ �������� ��� �������� ��-����� �� -0.231 �� ������� ���
//	������ �� �������� �� ������� �� + ������� 41.25, � ������ ��������
//	�������� �� ������� � �������������� ����� ����� ������� �
//	�������� ������� �����
//	3. �� �� ������� ���������� �� �������� � ��������������� �����.
//	4. �� �� ������� �������� �������� �� ������ �������� �� ������
//	������, ����� �� �������� �� 0.
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("�������� ��������� �� ������: ");
		int length = scan.nextInt();
		float limit=-0.231f;
		float number=41.25f;
		float mean=0;
		float sum=0;
		int counter=0;
		
		if(length<0){
			System.out.println("�������� �����������,���� �����.");
			return;
		}float[] array= new float[length];
		float[] arraySecond= new float[length];
		
		System.out.println("�������� ���������� �� ������:");
		for (int i = 0; i < array.length; i++) {
			array[i]= scan.nextFloat();	
		}
		for (int i = 0; i < arraySecond.length; i++) {
			if(array[i]<limit){
				arraySecond[i]=(float)Math.pow(i, 2) +number; 
			}else{
				arraySecond[i]=array[i]*i;
			}
		}
		for (int i = 0; i < arraySecond.length; i++) {
			System.out.print(arraySecond[i]+" ");
			if(arraySecond[i]!=0)
			{
				sum+=arraySecond[i];
				counter++;
			}
		}mean=sum/counter;
		System.out.println();
		System.out.println("�������� �������� �� ������ �������� "
				+ "�� ������	������, ����� �� �������� �� 0 � "+mean);
	}

}
