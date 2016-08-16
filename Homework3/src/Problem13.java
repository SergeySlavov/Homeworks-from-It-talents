import java.util.Scanner;

public class Problem13 {
	
//	Да се състави програма, чрез която се въвежда число и се представя
//	като число в двоична бройна система.
//	Програмата, чрез масив, да изчислява последователно всички цифри
//	на въведеното естествено число в 2-ична бройна система.

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Въведете число:");
		int number=scan.nextInt();
		int binaryDigit=0;
		int binary=0;
		int power=1;
		boolean negative=false;
		if(number<0){
			negative=true;
			number=number*(-1);
		}
		while(number>0){
		binaryDigit=number%2;
		binary= binaryDigit * power+ binary;
		power*=10;
		number=number/2;
		}
		if(negative==false){
		System.out.println("Числото в двоична система е "+binary);
		}
		else{
			System.out.println("Числото в двоична система е -"+binary);
		}
	}

}
