import java.util.Scanner;

public class Problem6
{
//	�������� 3 ����� �� ������������ �1, �2 � �3. ��������� �����������
//	�� ����, �� �1 �� ��� ���������� �� �2, �2 �� ��� ���������� �� �3, �
//	�3 �� ��� ������� �������� �� �1.
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�������� ������� �����: ");
		int firstNum= scan.nextInt();
		System.out.println();
		
		System.out.print("�������� ������� �����: ");
		int secondNum= scan.nextInt();
		System.out.println();
		
		System.out.print("�������� ������� �����: ");
		int thirdNum= scan.nextInt();
		System.out.println();
		
		int firstHolder= firstNum;
		int secondHolder = secondNum;
		int thirdHolder= thirdNum;
		
		firstNum= secondHolder;
		secondNum= thirdHolder;
		thirdNum= firstHolder;
		
		System.out.print("������� ������ ��������:  "+ firstNum);
		System.out.println();
		System.out.print("������� ������ ��������:  "+ secondNum);
		System.out.println();
		System.out.print("������� ������ ��������:  "+ thirdNum);
	}

}
