import java.util.Scanner;

public class Problem13 {
	
//	�� �� ������� ��������, ���� ����� �� ������� ����� � �� ���������
//	���� ����� � ������� ������ �������.
//	����������, ���� �����, �� ��������� �������������� ������ �����
//	�� ���������� ���������� ����� � 2-���� ������ �������.

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("�������� �����:");
		int number=scan.nextInt();
		int binaryDigit=0;
		int binary=0;
		int power=1;
		boolean negative=false;
		if(number<0){
			negative=true;
			number=number*(-1);
		}
		while(number>0){
		binaryDigit=number%2;
		binary= binaryDigit * power+ binary;
		power*=10;
		number=number/2;
		}
		if(negative==false){
		System.out.println("������� � ������� ������� � "+binary);
		}
		else{
			System.out.println("������� � ������� ������� � -"+binary);
		}
	}

}
