import java.util.Scanner;

public class Problem25 {
	
//	�� �� ������� ��������, ����� �� ������ ����� N, �� ���������
//	N!, �.�. 1*2*3*4...*N.
//	����������� ����� do-while
	
	public static void main(String[] args) {
		System.out.print("�������� �����: ");
		Scanner scan = new Scanner(System.in); 
		long number= scan.nextLong();
		long num=number;
		System.out.println();
		int product=1;
		
		if(number<0)
		{
			System.out.println("������� � �����������.");
		}
		else
		{
			do
			{
				if(number!=0)
				{
					product*=number;
					number--;
				}
				else
				{
					product=1;
				}
			}while(number>=1);
		
			System.out.println(num+"!= "+product);
		}

	}

}
