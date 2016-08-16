import java.util.Scanner;

public class Problem7 {
//	Да се състави програма, която чете набор от думи разделени с
//	интервал.
//	Като резултат да се извеждат броя на въведените думи, както и броя
//	знаци в най-дългата дума.
	
	public static void main(String[] args) {
		System.out.print("Въведете набор от думи: ");
		Scanner scan = new Scanner(System.in);
		String text= scan.nextLine();
		String[] array= text.split(" ");
		int count= array.length;
		String longest=array[0];
		
		for (int i = 0; i < array.length-1; i++) {
			if(array[i].length()<array[i+1].length()){
				longest=array[i+1];
			}
		}
		System.out.println("Броят въведени думи е "+ count);
		System.out.println("Най-дългата дума е "+longest);
		System.out.println("Дължината на най-дългата дума е "+longest.length()+" символа");
 	}

}
