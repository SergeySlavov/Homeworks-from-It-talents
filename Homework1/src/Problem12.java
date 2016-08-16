import java.util.Scanner;

public class Problem12 
{
//	��������� ������ �� ������ ������ ������ �� 4 � ����������
//	����������, �� ��� �������� ������ �� 400, �.�. 1900 �� � ���������,
//	�� 1600 � 2000 �� ���������.
//	��������� ��������, ����� �� ������ ���, �����, ������ ���������
//	���������� ����.
//	������ �����: ��� ����� �� ���, �����, ������.
		
		public static void main(String[] args) {
			
			Scanner scan= new Scanner(System.in);
			System.out.print("�������� ���, �����, ������: ");
			int day=scan.nextInt();
			int month= scan.nextInt();
			int year= scan.nextInt();
			int numDays=0;
			
			switch(month)
			{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: numDays=31;
			break;
			case 4: 
			case 6:
			case 9:
			case 11: numDays=30;
			break;
			case 2: 
				if((year%4==0) && (year%100!=0) || (year%400==0))
				{
					numDays=29;
				}
				else
				{
					numDays=28;
				}
				break;
			}
			
			if(day<numDays )
			{
				day++;
				System.out.println("���������� ��� �:"+day+ " "+month+" "+year);
			}else
			{
				if(day==numDays && month!=12)
				{
					month++;
					day=1;
					System.out.println("���������� ��� �:"+day+ " "+month+" "+year);
				}
				if(day==numDays &&month==12)
				{
					day=1;
					month=1;
					year++;
					System.out.println("���������� ��� �:"+day+ " "+month+" "+year);
				}
			}
		}
}
