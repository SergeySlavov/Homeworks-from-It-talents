import java.util.Scanner;

public class Problem6
{
	// �� �� ������� ����� �� ������(���������) � �� ��
	//������ ����� �� ������ ����� ����� 1 � ���������� �����.
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("��������  �����: ");
		int number= scan.nextInt();
		System.out.println();
		
		int sum=0;
		
		for (int i = 1; i <= number; i++) 
		{
			sum+=i;
		}
		System.out.println("������ �� ������� �� 1 ��  "+ number + " e "+ sum);
	}
}
