import java.util.Scanner;

public class Problem1
{
//	�� �� ������� ��������� ��� ����������� � �� �� �������� 2 ����� ��
//	������������ A � B (���� �� �� � ������� ������� � double).
//	����� �� �� ������� 3-�� ����� C � �� �� ������� ���� �� � �/� A � B.
//	�� �� ������ ��������� ��������� �� ���� ���� C � ����� A � B.

	public static void main(String[] args)
	{
		System.out.print("������ ����� �: ");
		Scanner scan= new Scanner(System.in);
		double A = scan.nextDouble();
		
		 System.out.println();
		System.out.print("������ ����� B: ");		
		double B = scan.nextDouble();
		
		 System.out.println();
			System.out.print("������ ����� C: ");		
			double C = scan.nextDouble();
		
			if((C>A && C<B) ||(C>B && C<A))
			{
				System.out.println( C +" e ����� " +A+ " � "+B);
			}
			else
			{
				System.out.println( C +" �� � ����� " +A+ " � "+B);
			}

	}

}
