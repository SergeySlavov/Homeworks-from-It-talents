import java.util.Scanner;

public class Problem8
{
//	�� �� ������� ��������, ����� ���� �� ��������� 4-������o
//	���������� ����� �� ��������� [1000.. 9999]. �� ���� ����� ��
//	�������� 2 ���� 2-������� �����. ������� ����� �� ������� �� 1-��
//	� 4-�� ����� �� ���������� �����. ������� ����� �� ������� �� 2-�a -
//	3-�� ����� �� ���������� �����. ���� �������� �� �� ������ ���� 1-��
//	���� ����� e ��-����� <, ����� = ��� ��-������ �� 2-�� �����.

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print ("�������� ����� � ��������� [1000 - 9999]:  ");
		int number = scan.nextInt();
		int[]digits = new int[4];
		int index=0;
		
		if(number>9999 | number<1000)
		{
			System.out.println("������ ��� ����� ����� ��������� [1000 - 9999]");
		}
		else
		{
			for(int i=number; i>0; i/=10)
			{
				
				digits[index]=i%10;
				index++;
			}
		}
		
		int[] firstNewNum={digits[3], digits[0]};
		int num1= 0;
		double powerFirst=1;
		for(int i=0; i<firstNewNum.length;i ++)
		{
			
			num1+=firstNewNum[i]*(Math.pow(10, powerFirst));
			powerFirst--;
		}
		
		int[] secondNewNum= {digits[2],digits[1]};
		int num2=0;
		double powerSecond=1;
		for(int j=0; j<secondNewNum.length;j++)
		{
			
			num2+=secondNewNum[j]*(Math.pow(10, powerSecond));
			powerSecond--;
		}
		
		if(num1> num2)
		{
			System.out.println(num1 + " > "+ num2);
		}
		else if(num2> num1)
		{
			System.out.println(num1 + " < "+ num2);
		}
		else
		{
			System.out.println(num1+ " = "+ num2);
		}
	}

}
