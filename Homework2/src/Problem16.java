import java.util.Scanner;

public class Problem16 
{
//	�� �� ������� ��������, ���� ����� �� �������� 2 ����������
//	����� N, M �� ��������� [10..5555].
//	����������, ���� ����� for, �� ������� ������ ����� ��
//	���������, ����� �� ������ �� 50 � �������� ���.
	
	public static void main(String[] args) 
	{		
		Scanner scan = new Scanner(System.in);
		System.out.print("��������  ����o � ��������� [10..5555] : ");
		int N= scan.nextInt();
		System.out.println();
		System.out.print("��������  ����o � ��������� [10..5555]: ");
		int M= scan.nextInt();
		System.out.println();
		
		if((N<10 || N>5555) ||(M<10 || M>5555))
		{
			System.out.println("������� �� ����� ���������.");
			return;
		}
		else
		{
			if(N<M)
			{
				for (int i = M; i >= N; i--) 
				{
					if(i% 50==0)
					{
						System.out.println(i);
					}
				}
			}
			if(N>M)
			{
				for (int i = N; i >=M; i--) 
				{
					if(i% 50==0)
					{
						System.out.println(i);
					}
				}
			}
		}
		
	}

}
