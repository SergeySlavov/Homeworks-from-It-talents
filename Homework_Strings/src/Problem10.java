import java.util.Scanner;

public class Problem10 {

//	Да се състави програма, която по даден низ връща друг,
//	символите, на който са получени като към всеки код на символ
//	от ASCII таблицата е добавеното числото 5 и е записан
//	новополучения символ.

	public static void main(String[] args) {
		System.out.print("Въведете низ от символи: ");
		Scanner scan = new Scanner(System.in);
		String text= scan.nextLine();
		int a=0;
		char b=' ';
		for (int i = 0; i < text.length(); i++) {
			a=text.charAt(i)+5;
			b=(char)a;
			System.out.print(b);
		}
		

	}

}
