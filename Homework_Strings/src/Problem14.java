import java.util.Scanner;

public class Problem14 {

//	�� �� ������� �����, ����� ������ �� �������� ����� N � �����
//	���������� �� N! (N ���������).

	static long factorial(int n){
		long nthFactorial=1;
		if(n<0){
			System.out.println("������� ������ �� � ����������� ��� ����.");
			return 0 ;
		}
		if(n==0){
			nthFactorial=1;
		}else{
			for (int i = 1; i <= n; i++) {
				nthFactorial*=i;
			}
		}
		return nthFactorial;
	}
	
	public static void main(String[] args) {
		System.out.print("�������� ����� ��-������ ��� ���� �� 0: ");
		Scanner scan= new Scanner(System.in);
		int number=scan.nextInt();
		System.out.println(number+" ��������� = "+factorial(number));

	}

}
