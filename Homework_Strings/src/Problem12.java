import java.util.Scanner;

public class Problem12 {

//	Да се създаде метод, който приема за входни данни число N и
//	връща масив от числа с дължина N, който съдържа всички числа
//	от 1 до N.
	
	static int[] arrayToN(int n){
		if(n<=0){
			System.out.println("Въвели сте отрицателно число.");
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
		System.out.print("Въведете положително число, по-голямо от 0. ");
		int number= scan.nextInt();
		arrayToN(number);
	}

}
