import java.util.Scanner;

public class Problem2 {
	
//	�� �� ������� ��������, ���� ����� �� ������������ �� ��������
//	�������������� ��� ���� � ������� 10-20 �����.
//	���������� �� ������� ������� �� 5 ����� � �� ������ ��������� ��
//	��-�������, ����� � ������ �� ����������.
	
	public static void main(String[] args) {
		System.out.print("�������� ������� ����: ");
		Scanner scan = new Scanner(System.in);
		String firstText= scan.next();
		System.out.print("�������� ������� ����: ");
		String secondText= scan.next();
		
		if((firstText.length()<10 ||firstText.length()>20) || (secondText.length()<10 ||secondText.length()>20)){
			System.out.print("���������� ���� �� �� ��������� �� ���������.");
			return;
		}
		String holderSecond="";
		String holderFirst="";
		holderFirst=firstText.substring(0,5);
		holderSecond=secondText.substring(0, 5);
		firstText=firstText.replace(firstText.substring(0,5), holderSecond);
		secondText=secondText.replace(secondText.substring(0,5), holderFirst);
		
		if(firstText.length()>=secondText.length()){
			System.out.print(firstText.length()+" "+firstText);
		}else{
			System.out.print(secondText.length()+" "+secondText);
		}
		
	}

}
