import java.util.Scanner;

public class Problem2 {

//	���� �� ������� ����� �� �� ���������� ���, ���� ���������� ��
//	�������� �� ����� ���� �� �����������, � ������� �� �� ����
//	��������, �� � ������� ���. ��������, �� �� ������ ����� �����
//	�� ������.
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("�������� ��������� �� ������: ");
		int Length= scan.nextInt();
		int[]array= new int[Length];
		int[] secondArray= new int[Length];
		int index=((Length-1)/2)+1;
		
		if (Length<0 || Length%2!=0) {
			System.out.println("�������� �����������, ����� �����!");
			return;
		}else {
			System.out.print("�������� ���������� �� ������: ");
			for (int i = 0; i < array.length; i++) {
				array[i]=scan.nextInt();
			}
			for (int i = 0; i < array.length/2; i++) {
				secondArray[i]=array[i];
			}
			for (int i = array.length-1; i >= array.length/2; i--) {
				secondArray[index]= array[i];
				index++;
			}
			for (int i = 0; i < secondArray.length; i++) {
				System.out.print(secondArray[i]+" ");
			}
	}
}
}
