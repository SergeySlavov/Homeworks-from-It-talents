import java.util.Scanner;

public class Problem14 
{
	//�� �� ������� ��������, ����� �� ��������
	//���������� ����� N �� ��������� [10..200] ������� � �������
	//��� ������ �����, ����� �� ������ �� 7 � �� ��-����� �� N.

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("��������  ����� � ��������� [10..200]: ");
		int number= scan.nextInt();
		
		
		if(number<10 || number>200)
		{
			System.out.println("���������� ����� � ����� ��������� [10..200].");
		}
		else
		{
			for (int i = number-1; i > 0; i--) 
			{
				if(i % 7==0)
				{
					System.out.println(i);
				}
			}
		}

	}

}
