import java.util.Scanner;

public class Problem14 {

//	Да се състави метод, който приема за стойност число N и връща
//	стойността на N! (N факториел).

	static long factorial(int n){
		long nthFactorial=1;
		if(n<0){
			System.out.println("Числото трябва да е положително или нула.");
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
		System.out.print("Въведете число по-голямо или рано на 0: ");
		Scanner scan= new Scanner(System.in);
		int number=scan.nextInt();
		System.out.println(number+" факториел = "+factorial(number));

	}

}
