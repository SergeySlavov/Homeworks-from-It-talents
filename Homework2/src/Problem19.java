import java.util.Scanner;

public class Problem19 
{
//	�� �� ������� ��������, ���� ����� �� ��������
//	���������� ����� �� ��������� [10..99] �� ������� ��������
//	�����, ��� �������� �� �������� ����������:
//	1) ��� ����������� ����� � ����� �� ������� 0.5*�������;
//	2) ��� ����������� ����� � ������� �� ������� 3*������� +1.
//	����������� ���������� ������ �� �� ������ �������� 1.
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("��������  ����� � ��������� [10..99]: ");
		int number= scan.nextInt();
		System.out.println();
		
		if(number<10 || number>99)
		{
			System.out.println("���������� ����� �� � � ������� ��������");
			return;
		}
		else
		{
			while(number>1)
			{
				if(number%2==0)
				{
					number=number/2;
				}
				else
				{
					number=3*number+1;
				}
				System.out.print(number+" ");
			}
		}
	}

}
