import java.util.Scanner;

public class Problem1 {

//	�� �� ������� ����� � �� �� ������ ���-������� ����� ������ ��
//	3 �� ������.

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("�������� ��������� �� ������: ");
		int Length= scan.nextInt();
		int[]array= new int[Length];
		int min=0;
		
		if (Length<0) {
			System.out.println("�������� ����������� �����!");
			return;
		}else {
			System.out.print("�������� ���������� �� ������: ");
			for (int i = 0; i < array.length; i++) {
				array[i]=scan.nextInt();
			}
			for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array.length; j++) {
						if (i==0 && array[j]%3==0) {
						min=array[j];
						}
						else{
							if(array[j]%3==0 && min>array[j] && array[j]!=0){
								min=array[j];
							}
					}
				}
			}System.out.println("���-������� ����� ������ �� ��� �� ������ � "+min);
		}
	}

}
