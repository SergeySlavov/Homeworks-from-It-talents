import java.util.Scanner;

public class Problem8 {

//	�������� ��������, ����� ������ � ������� ���-������� ������ ��
//	������� ������� �������� � ����� �����.
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("�������� ��������� �� �����a: ");
		int length= scan.nextInt();
		
		int currentBest=0;
		int best=0;
		int count=1;
		int bestCount=1;
		
		if(length<0){
			
			System.out.println("�������� ����������� �����!");
			return;
		}
		int[]array= new int[length];

			System.out.print("�������� ����������� �� ������: ");
			for (int i = 0; i < array.length; i++) {
				array[i]=scan.nextInt();
			}
			currentBest=array[0];
			for (int i =1; i < array.length; i++) {
				
				if (array[i-1]==array[i]) {					
					count++;
					if(count>bestCount){
						bestCount=count;
						best= currentBest;
					}		
				}else
				{
					currentBest=array[i];
					count=1;
				}
			}for (int i = 0; i < bestCount; i++) {
				System.out.print(best+" ");
			}
			
	

   }
}
