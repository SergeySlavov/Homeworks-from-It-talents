import java.util.Scanner;

public class Problem4 
{
//	�������� 2 �������� ����� �� ��������� � �� ������������ �
//	��������� ���.

	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("�������� ������� �����: ");
		int firstNum= scan.nextInt();
		System.out.println();
		
		System.out.print("�������� ������� �����: ");
		int secondNum= scan.nextInt();
		System.out.println();
		
		if(firstNum>secondNum)
		{
			System.out.println(secondNum +"  ,  "+ firstNum);
		}
		else
		{
			System.out.println(firstNum +"  ,  "+ secondNum);
		}
	}

}
