import java.util.Scanner;

public class Problem9 {

//	�������� ��������, � ����� ����������� ������� �����, ���� �����
//	���������� �� ������ �� ������� � ������� ��� (����� �� � ������ ��
//	�� �������� � ������� ���, ��� ����� �� �� ������, ���� ����� �� ��
//	�������� � �������� ���). ��������� �� ������ �������� ����� � ����
//	������������ ����� � ����� ��� �� ���������� ���� �����.
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("�������� ��������� �� �����a: ");
		int length= scan.nextInt();
		
		int holder=0;
		int lastIndex= length-1;
		
		if(length<=0){			
			System.out.println("�������� ����������� �����!");
			return;
		}
			int[]array= new int[length];
			System.out.print("�������� ����������� �� ������: ");
			for (int i = 0; i < array.length; i++) {
				array[i]=scan.nextInt();
			}
			
			for (int i = 0; i <=array.length/2; i++) {
				
				if(length%2!=0)
				{	if(i==array.length/2){
					break;
				}else{
					holder=array[i];
					array[i]=array[lastIndex];
					array[lastIndex]=holder;
					lastIndex--;
					}
				}
				else{
					holder=array[i];
					array[i]=array[lastIndex];
					array[lastIndex]=holder;
					lastIndex--;
					}
				}
			System.out.println("����������� �� ������ � ������� ��� �:");
			
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]+" ");
			}
		}
}

