import java.util.Scanner;

public class Problem8 {
//	Да се състави програма, чрез която се въвежда ред от символи
//	(стринг, низ).
//	Програмата да изведе на екрана дали въведения стринг е палиндром,
//	т.е. дали четен отляво-надясно и отдясно-наляво е един и същ.

	public static void main(String[] args) {
		System.out.print("Въведете низ от символи: ");
		Scanner scan = new Scanner(System.in);
		String text= scan.nextLine();
		char[]array= text.toCharArray();
		boolean isSymetric=false;
		int indexFirst=0;
		int indexLast= array.length-1;
		
		while(indexFirst<=array.length/2){
			if(array[indexFirst]==array[indexLast]){
				isSymetric=true;
			}else{
				isSymetric=false;
				break;
			}
			indexFirst++;
			indexLast--;
		}
		if(isSymetric==true){
			System.out.println("Низът е симетричен");
		}else{
			System.out.println("Низът не е симетричен.");
		}
	}
}
