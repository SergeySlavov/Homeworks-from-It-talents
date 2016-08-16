import java.util.Scanner;

public class Problem6 {
	
//	Да се състави програма, чрез която се въвежда изречение с отделни
//	думи.
//	Като резултат на екрана да се извежда същия текст, но всяка отделна
//	дума да започва с главна буква, а следващите я букви да са малки.
	
	public static void main(String[] args) {
		System.out.print("Въведете изречението: ");
		Scanner scan = new Scanner(System.in);
		String text= scan.nextLine();
		text=text.toLowerCase();
		String[]array= text.split(" ");
		char capital=' ';
		
		
		for (int i = 0; i < array.length; i++) {
			capital=Character.toUpperCase(array[i].charAt(0));
			array[i]=capital+array[i].substring(1, array[i].length());
			System.out.print(array[i]+" ");
		}
		
		
	}

}
