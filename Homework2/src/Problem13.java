import java.util.Scanner;

public class Problem13 
{

	// �� �� ������� ��������, ����� ������� ������
	// ���������� ���������� �����, ����� ���� ���� �� ������� �����
	// �� ������ �����.
	//������ : sum, ������ 2>=sum<=27.
	 
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("��������  ����� � ��������� 2-27: ");
		int sum= scan.nextInt();
		System.out.println();

		if(sum<2 || sum> 27)
		{
			System.out.println("���������� ����� � ����� ��������� 2-27.");
		}
		else
		{
			int[] digits = new int[3];
			int index=0;
			
			for (int i = 101; i <= 999; i++) 
			{
				for(int j=i;j>0;j/=10)
				{
				digits[index]=j%10;
				index++;
				}
				index=0;
				
				if(sum==digits[0]+digits[1]+digits[2])
				{
					System.out.println(i);
				}
				else
				{
					continue;
				}
			}
		}
	}

}
