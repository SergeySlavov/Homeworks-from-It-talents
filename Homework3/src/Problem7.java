import java.util.Scanner;

public class Problem7 {
	
//	�������� ��������, ����� ����� ���� ����� � ����� ������� ���
//	����� ��� ����� ������ �� ������� �����: ���������� �� �����
//	������� �� ������ ����� �� � ����� �� ����� �� ���������� �
//	���������� ������� �� ���������� ������� �� ������ �����.
//	�� �� ������ ��������� �����.

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("�������� ��������� �� �����a: ");
		int length= scan.nextInt();
		int[]arrayFirst= new int[length];
		int[] arraySecond= new int[length];
		if(length<0){
			
			System.out.println("�������� ����������� �����!");
			return;
		}
		else{
			for (int i = 0; i < arrayFirst.length; i++) {
				arrayFirst[i]=scan.nextInt();
			}
			for (int i = 0; i < arraySecond.length; i++) {
				if(i==0){
				arraySecond[i]=  arrayFirst[i+1];
				}else{
					if(i== arraySecond.length-1){
						arraySecond[i]= arrayFirst[i-1];
					}else{
						arraySecond[i]= arrayFirst[i-1]+ arrayFirst[i+1];
					}
				}System.out.print(arraySecond[i]+" ");
			}
			
		}
		
	}
}
