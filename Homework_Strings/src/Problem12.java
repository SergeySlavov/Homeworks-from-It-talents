import java.util.Scanner;

public class Problem12 {

//	�� �� ������� �����, ����� ������ �� ������ ����� ����� N �
//	����� ����� �� ����� � ������� N, ����� ������� ������ �����
//	�� 1 �� N.
	
	static int[] arrayToN(int n){
		if(n<=0){
			System.out.println("������ ��� ����������� �����.");
			return null ;
		}
		else{
			int[]array= new int[n];
			for (int i = 0; i < array.length; i++) {
				System.out.print((i+1)+" ");
			}
			return array;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�������� ����������� �����, ��-������ �� 0. ");
		int number= scan.nextInt();
		arrayToN(number);
	}

}
