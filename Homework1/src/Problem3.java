import java.util.Scanner;

public class Problem3 
{
//	�������� 2 �������� ����� �� ��������� � ��������� ���������� ��.
//	������������ ������ ���������

	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("�������� ������� �����: ");
		int firstNum= scan.nextInt();
		System.out.println();
		
		System.out.print("�������� ������� �����: ");
		int secondNum= scan.nextInt();
		System.out.println();
		
		int tempHolder= 0;
		tempHolder= firstNum;
		firstNum=secondNum;
		secondNum=tempHolder;
		
		System.out.println("������� ����� ������ ����������  "+firstNum+ "  ,� ������� ������ ���������� "+ secondNum);

	}

}
