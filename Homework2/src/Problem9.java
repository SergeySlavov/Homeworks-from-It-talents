import java.util.Scanner;

public class Problem9 
{
//	�� �� �������� 2 ����� �� ������������ � � �.
//	�� �� ������� ������ ����� �� � �� � �� ������ 2(��������� �
//	�������).��� ����� ����� � ������ �� 3, �� �� ������ ��������� ��
//	������� �� �������� �skip 3�.��� ������ �� ������ �������� ����� (���
//������������) ����� ��-������ �� 200, �� �� �������� �����������.


	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("�������� ������� �����: ");
		int A= scan.nextInt();
		System.out.println();
		System.out.print("�������� ������� �����: ");
		int B=scan.nextInt();
		System.out.println();
		
		int sum=0;
		
		if(A<B)
		{
			for (double i = Math.pow(A, 2) ;i <=Math.pow(B, 2); i++)
			{
				if(i % 3 ==0)
				{
					System.out.println("skip "+i);
					continue;
				}
				else
				{
					sum+=i;
					if(sum<=200)
					{
						System.out.println(i+ ", ");
					}
					if(sum>200)
					{
						break;
					}
				}
			}
			
		}
		else
		{
			if(A>B)
			{
				for (double j = Math.pow(A, 2) ;j >=Math.pow(B, 2); j--)
				{
					if(j % 3 ==0)
					{
						System.out.println("skip "+j);
						continue;
					}
					else
					{
						sum+=j;
						if(sum<=200)
						{
							System.out.println(j+ ", ");
						}
						if(sum>200)
						{
							break;
						}
					}
				}
			}
		}
		
	}

}
