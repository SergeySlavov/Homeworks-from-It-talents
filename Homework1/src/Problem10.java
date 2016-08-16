import java.util.Scanner;

public class Problem10 {

//	������ �� �� ������� �������� � ����. ����� 2 ���� � ���������� 2 �
//	3 ����� � �� �������� ������������.
//	�� �� ������� ��������, ����� �� ����� ���� ������� ��� �� ��������
//	��������� � ���� ����, �.�. ��-����� ���� �� �� ����� ����� ��
//	������. ������ �� ����� �� �� ������� � �������� ���������� ����.
//	������ �����: ���������� ����� �� ��������� [10..9999].

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print ("�������� ����� �� ����������:  ");
		int volume = scan.nextInt();
		System.out.println();
		
		int numberTwoLiterBuckets=1;
		int numberThreeLiterBuckets=1;
		int bucketTwoLiter=2;
		int bucketThreeLiter=3;
		
		if(volume<10 || volume>9999)
		{
			System.out.println("������ ������ �� � ����� 10 � 9999�.");
		}
		else
		{
			int wholePart= volume / (bucketTwoLiter + bucketThreeLiter);
			numberTwoLiterBuckets=wholePart;
			numberThreeLiterBuckets= wholePart;
			
			if(volume % 5==1)
			{
				numberThreeLiterBuckets++;
				numberTwoLiterBuckets--;
			}
			else if(volume % 5== 2)
			{
				numberTwoLiterBuckets++;
			}
			else if(volume % 5== 3)
			{
				numberThreeLiterBuckets++;
			}
			else if(volume % 5== 4)
			{
				numberThreeLiterBuckets+=2;
				numberTwoLiterBuckets--;
			}
		}
		System.out.println("�� �� ������� " + numberThreeLiterBuckets+ " x 3 ������� +"
				+ " "+numberTwoLiterBuckets+ " x 2 ������� ���� �� �� �� ������� " + volume+ " ������ ���������.");
	}

}
