import java.util.Scanner;

public class Problem6 {

//	�������� ��������, ����� ����� ���� 2 ������ � ����� �������
//	��������� ���� �� �������, � ���� �� � ������� ������.
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("�������� ��������� �� ������ �����: ");
		int lengthFirst= scan.nextInt();
		int[]arrayFirst= new int[lengthFirst];
		
		if(lengthFirst<0){
			System.out.println("�������� ����������� �����!");
			return;
		}
		else{
			for (int i = 0; i < arrayFirst.length; i++) {
				arrayFirst[i]=scan.nextInt();
			}
		}
		System.out.print("�������� ��������� �� ������ �����: ");
		int lengthSecond= scan.nextInt();
		int[]arraySecond= new int[lengthSecond];
		
		if(lengthSecond<0){
			System.out.println("�������� ����������� �����!");
			return;
		}
		else{
			for (int i = 0; i < arraySecond.length; i++) {
				arraySecond[i]=scan.nextInt();
			}
		}
		if(lengthFirst==lengthSecond)
		{
			for (int i = 0; i < arraySecond.length; i++) {
				
				if(arrayFirst[i]!=arraySecond[i]){
					System.out.println("�������� �� �� �������.");
					break;
				}else{
					if(i==arraySecond.length-1 && arrayFirst[i]== arraySecond[i])
					System.out.println("�������� �� �������.");
				}
			}
		}else
		{
			System.out.println("�������� �� � �������� �������.");
		}
	}

}
